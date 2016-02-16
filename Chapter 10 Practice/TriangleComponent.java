import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class TriangleComponent extends JComponent
{
    
    public TriangleComponent()
    {
        //The pointer (dot) that the paintComponent method draws
        
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(box);
    }
    
    public void movePointerTo(int x, int y)
    {
        box.setLocation(x, y);
        repaint();
    }
}
