import java.awt.*;

public class HudGraphic implements Drawable
{

    private int x;
    private int y;

    private Image image;

    public HudGraphic()
    {
        Drawable.drawables.add(this);
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
