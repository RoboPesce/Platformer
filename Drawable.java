import java.awt.*;
import java.util.ArrayList;

public interface Drawable {

    public static ArrayList<Drawable> drawables = new ArrayList<Drawable>(); //list of all drawables

    public abstract Image getImage();
    public abstract int getX();
    public abstract int getY();

}
