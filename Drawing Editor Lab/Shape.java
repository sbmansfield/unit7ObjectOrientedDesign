import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Shape
{
    private Point2D.Double center;
    private double radius;
    private Color color;
    
    public Shape(Point2D.Double center, double radius, Color color) 
    {
        center = center;
        radius = radius;
        color = color;
    }

    public Point2D.Double getCenter() 
    {
        return center;
    }
    
    public double getRadius()  
    {
        return radius;
    }
    
    public void move(double x, double y)
    {
        
    }
    
    public void setRadius(double r)
    {
        radius = r;
    }
    
    public boolean isInside(Point2D.Double point)
    {
        return true;
    }

    public void draw(Graphics2D g2, boolean filled)
    {
        if ( filled == true )
        {
            
        }
        else
        {
            
        }
    }
}
