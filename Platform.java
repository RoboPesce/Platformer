import sun.security.util.Length;

import java.awt.*;
import java.util.ArrayList;

public class Platform implements Drawable {

    public static ArrayList<Platform> platforms = new ArrayList<Platform>();

    private int x;
    private int y;
    private int width;
    private int height;
    private Image image;

    public Platform()
    {
        Drawable.drawables.add(this);
        platforms.add(this);
    }

    public Image getImage() { return image; }

    public int getX() { return x; }

    public int getY() { return y; }

    public int getWidth() { return width; }

    public int getHeight() { return height; }

}
