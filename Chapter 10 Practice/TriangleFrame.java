import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class TriangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    
    private TriangleComponent scene;
    
    class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            scene.moveRectangleTo(x, y);
        }
    }
    
    public void mouseReleased(MouseEvent event) 
    {}

    public void mouseClicked(MouseEvent event) 
    {}

    public void mouseEntered(MouseEvent event) 
    {}

    public void mouseExited(MouseEvent event) 
    {}
    
    public TriangleFrame()
    {
        scene = new RextangleComponent();
        add(scene);
        
        MouseListener listener = new MousePressListener();
        scene.addMouseListener(listener);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
}
