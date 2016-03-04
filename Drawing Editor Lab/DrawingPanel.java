import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JColorChooser;

import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingPanel extends JPanel
{
    private ArrayList<Shape> shapes;
    private Color initialColor;
    
    public DrawingPanel()
    {
        addMouseListener( new MousePressListener() );
        addMouseListener( new MouseMotionListener() );
        setBackground(Color.WHITE);
        initialColor = Color.BLACK;
    }

    public Color getColor()
    {
        return initialColor;
    }
    
    public Dimension getPreferredSize()
    {
        return getSize( new Dimension(1000, 1000) );
    }
    
    public void pickColor()
    {
        Color initColor = JColorChooser.showDialog(this, "Color Chooser", initialColor);
        if (initColor != null)
        {
            initialColor = initColor;
        }
    }
    
    public void addCircle()
    {
        Ellipse2D.Double newCircle = new Ellipse2D.Double(350, 350, 100, 100);
        //shapes.add(newCircle); 
        repaint();
    }
    
    public void addSquare()
    {
        
        //shapes.add();
        //repaint();
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        //g2.draw();
    }
    
    public class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event) 
        {
            //setRadius( event.getX(), event.getY() );
        }
        public void mouseClicked(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseExited(MouseEvent event){}
        public void mouseReleased(MouseEvent event){}
    }
    
    public class MouseMotionListener implements MouseListener
    {
        public void mouseDragged(MouseEvent event) 
        {
            
        }
        public void mouseExited(MouseEvent event){}
        public void mouseEntered(MouseEvent event){}
        public void mouseReleased(MouseEvent event){}
        public void mousePressed(MouseEvent event) {}
        public void mouseClicked(MouseEvent event){}
    }
}
