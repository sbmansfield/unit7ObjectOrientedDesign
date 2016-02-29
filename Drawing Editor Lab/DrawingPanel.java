import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JColorChooser;
import javax.swing.colorchooser.AbstractColorChooserPanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingPanel extends JPanel
{
    private ArrayList shapes;

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
        return getBackground();
    }
    
    public Dimension getPreferredSize()
    {
        return null;
    }
    
    public void pickColor()
    {
        addChooserPanel(canvas);
        //setColor();
    }
    
    public void addCircle()
    {
        
    }
    
    public void addSquare()
    {
        
    }
    
    public void paintComponent(Graphics g)
    {
        
    }
    
    public class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event) 
        {
            
        }
        public void mouseClicked(MouseEvent event)
        {}
        public void mouseEntered(MouseEvent event)
        {}
        public void mouseExited(MouseEvent event)
        {}
        public void mouseReleased(MouseEvent event)
        {}
    }
    
    public class MouseMotionListener implements MouseListener
    {
        public void mouseDragged(MouseEvent event) 
        {
            
        }
        public void mouseMoved(MouseEvent event)
        {
            
        }
        public void mouseExited(MouseEvent event)
        {}
        public void mouseEntered(MouseEvent event)
        {}
        public void mouseReleased(MouseEvent event)
        {}
        public void mousePressed(MouseEvent event) 
        {}
        public void mouseClicked(MouseEvent event)
        {}
    }
}
