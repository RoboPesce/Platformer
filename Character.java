import java.awt.*;

public class Character implements Drawable
{
    //NOTE: Since y coordinates start from the top this looks inverted. greater y values are further down.
    public final int MAX_FALL_VELOCITY = 10;
    public final int JUMP_VELOCITY = -12;
    public final int FALL_ACCELERATION = 2;

    //NOTE: CURRENT WIDTH/HEIGHT SHOULD BE 30x40
    public final int CHAR_WIDTH = 30;
    public final int CHAR_HEIGHT = 40;

    private int x;
    private int y;

    private Image image;

    private boolean leftMove;
    private boolean rightMove;
    private int leftVelocity;
    private int rightVelocity;
    private int vertVelocity;

    private boolean crouched;

    private boolean onPlatform;

    public Character()
    {
        Drawable.drawables.add(this);
        leftMove = false;
        rightMove = false;
        leftVelocity = 0;
        rightVelocity = 0;
        vertVelocity = 0;

        crouched = false;
        onPlatform = false;
    }

    public void updateMovement()
    {
        vertVelocity = platformIsBeneath();
    }

    public int platformIsBeneath() //return distance to closest platform if it's lower than the falling distance, else just
    {                              //return the falling distance
        int min = vertVelocity;
        if(min + FALL_ACCELERATION >= MAX_FALL_VELOCITY) min += FALL_ACCELERATION;

        for(Platform p : Platform.platforms)
        {
            if(!(x >= p.getX() && x <= p.getX() + p.getWidth()) && !(x + CHAR_WIDTH - 1 >= p.getX() && x + CHAR_WIDTH - 1 <= p.getX() + p.getWidth()))
                break;
            if(y + CHAR_HEIGHT - 1 >= p.getY()) break;

            int dist = p.getY() - y - CHAR_HEIGHT + 1;
            if(dist < min) min = dist;
        }
        if (min == 0 && vertVelocity == 0) onPlatform = true;
        else onPlatform = false;
        return min;
    }

    public Image getImage()
    {
        return image;
    } //TODO: Return different images based on movement, falling, attacking, etc

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setLeftMove(boolean b)
    {
        leftMove = b;
    }
    public boolean getLeftMove()
    {
        return leftMove;
    }
    public void setRightMove(boolean b)
    {
        rightMove = b;
    }
    public boolean getRightMove()
    {
        return rightMove;
    }

    public boolean isOnPlatform() { return onPlatform; }

    public void setVertVelocity(int i) { vertVelocity = i; }
}
