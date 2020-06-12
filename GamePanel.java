import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GamePanel extends ContentPanel
{

    private Timer frameTimer;
    private Camera camera;

    private Character player;

    public GamePanel()
    {
        player = new Character();

        frameTimer = new Timer(30, new FrameAction(this));
        frameTimer.setInitialDelay(0);
        frameTimer.start();
    }

    @Override
    public void paintComponent(Graphics g)
    { //relate all to camera object, iterate through Drawables (consider priority later)
        for(Drawable d : Drawable.drawables)
        { //Maybe see if something is offscreen and not draw it for performance?
            g.drawImage(d.getImage(), d.getX() - camera.getX(), d.getY() - camera.getY(), null);
        }
    }

    public void setKeyStrokes()
    {
        int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;

        //TODO: Configure controls. This is just copy pasted from another project and is just a template.
        /*
        this.getInputMap(IFW).put(KeyStroke.getKeyStroke("W"), "move forwards");
        this.getInputMap(IFW).put(KeyStroke.getKeyStroke("A"), "move left");
        this.getInputMap(IFW).put(KeyStroke.getKeyStroke("S"), "move back");
        this.getInputMap(IFW).put(KeyStroke.getKeyStroke("D"), "move right");

        this.getInputMap(IFW).put(KeyStroke.getKeyStroke("released W"), "stopF");
        this.getInputMap(IFW).put(KeyStroke.getKeyStroke("released A"), "stopL");
        this.getInputMap(IFW).put(KeyStroke.getKeyStroke("released S"), "stopB");
        this.getInputMap(IFW).put(KeyStroke.getKeyStroke("released D"), "stopR");

        this.getActionMap().put("move forwards", new MovementAction(0, true));
        this.getActionMap().put("move left", new MovementAction(1, true));
        this.getActionMap().put("move back", new MovementAction(2, true));
        this.getActionMap().put("move right", new MovementAction(3, true));

        this.getActionMap().put("stopF", new MovementAction(0, false));
        this.getActionMap().put("stopL", new MovementAction(1, false));
        this.getActionMap().put("stopB", new MovementAction(2, false));
        this.getActionMap().put("stopR", new MovementAction(3, false));
        */
    }

    private class FrameAction extends AbstractAction
    {
        private GamePanel container;

        public FrameAction(GamePanel gp)
        {
            super();
            container = gp;
        }

        public void actionPerformed(ActionEvent e)
        {
            //TODO: MOVEMENT AND EVERYTHING HERE, ALL VISUALS GO IN PAINTCOMPONENT

            container.repaint();
        }
    }

    private class MovementAction extends AbstractAction
    {
        private GamePanel container;
        private String action;

        public MovementAction(GamePanel gp, String s)
        {
            container = gp;
            action = s;
        }

        public void actionPerformed(ActionEvent e)
        {
            if(action.equals("left"))
            {

            }
            else if(action.equals("right"))
            {

            }
            else if(action.equals("jump"))
            {
                if(player.isOnPlatform()) player.setVertVelocity(player.JUMP_VELOCITY);
            }
            else if(action.equals("crouch")) //crouch may be grab on item
            {

            }
        }
    }
}
