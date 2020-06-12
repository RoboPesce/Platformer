import java.awt.*;

public class HealthPack implements Grabbable, Drawable
{

    private int x;
    private int y;

    private int healthCapacity;
    private Image image;

    public HealthPack(int x, int y, int hc)
    {
        Drawable.drawables.add(this);
        Grabbable.grabbables.add(this);
        healthCapacity = hc;
    }

    public Image getImage()
    {
        return image;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

}
