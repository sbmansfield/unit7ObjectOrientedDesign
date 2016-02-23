import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class TriangleComponent extends JComponent
{
    private Point2D[] points;
    private int numPoints;
    
    private static final int MAX_POINTS = 3;
    
    public TriangleComponent()
    {
        points = new Point2D[MAX_POINTS];
        numPoints = 0;
        addMouseListener(new MouseClickListener());
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw();
    }
    
    public void setPoint(int x, int y)
    {
        if (numPoints > MAX_POINTS)
        {
            points[numPoints] = new Point2D.Double(x, y);
            numPoints++;
        }
        else
        {
            numPoints = 0;
        }
        
        repaint();
    }
    
    class MousePressListener implements MouseListener
    {
        public void mouseClicked(MouseEvent event) 
        {
            setPoint(event.getX(). event.getY());
        }
        public void mousePressed(MouseEvent event) {}
        public void mouseReleased(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
    }
}
