import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame
{

    public static GameFrame[] currentGame = new GameFrame[1];

    public static final int GAMEHEIGHT = 800;
    public static final int GAMEWIDTH = 1200;

    private ContentPanel contentPanel;

    public GameFrame()
    {
        super("Platformer"); //title
        currentGame[0] = this;

        contentPanel = new MenuPanel();
        add(contentPanel);
        getContentPane().setPreferredSize(new Dimension(GAMEWIDTH, GAMEHEIGHT));
        pack();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setContent(ContentPanel cp)
    {
        remove(contentPanel);
        contentPanel = cp;
        add(contentPanel);
        revalidate();
        repaint();
    }

}
