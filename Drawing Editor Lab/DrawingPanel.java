import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class DrawingPanel extends JPanel
{
    private ArrayList shapes;
    private Color initialColor;
    
    public DrawingPanel()
    {
        addMouseListener(new MouseClickListener());
        setBackground(Color.WHITE);
        initialColor = Color.BLACK;
    }

    public Color getColor()
    {
        return null;
    }
    
    public Dimension getPreferredSize()
    {
        return null;
    }
    
    public void pickColor()
    {
        
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
    
    class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event) 
        {
            
        }
        public void mouseDragged(MouseEvent event) 
        {
            
        }
        //public void keyPressed(MouseEvent event) {}
    }
}
