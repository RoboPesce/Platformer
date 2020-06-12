import java.awt.*;

public class AmmoPack implements Grabbable, Drawable
{

    private int x;
    private int y;

    private int ammoCapacity;
    private Image image;

    public AmmoPack(int ac)
    {
        Drawable.drawables.add(this);
        Grabbable.grabbables.add(this);
        ammoCapacity = ac;
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
