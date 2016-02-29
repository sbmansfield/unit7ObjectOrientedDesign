import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Shape
{

    public Shape(Point2D.Double center, double radius, Color color) 
    {

    }

    public Point2D.Double getCenter() 
    {
        return null;
    }
    
    public double getRadius()  
    {
        return 0;
    }
    
    public void move(double x, double y)
    {
        
    }
    
    public void setRadius()
    {
        
    }
    
    public boolean isInside(Point2D.Double point)
    {
        return true;
    }

    public void draw(Graphics2D g2, boolean filled)
    {
        
    }
}
