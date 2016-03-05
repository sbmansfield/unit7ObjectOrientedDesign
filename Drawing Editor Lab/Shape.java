import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Shape
{
    private Point2D.Double center;
    private double radius;
    protected Color shapeColor;
    
    /**
     * Constructor for class Shape
     *
     * @param  center   center of the shape
     * @param  radius    radius of the shape   
     * @param  color    color to fill or outline the shape
     */
    public Shape(Point2D.Double center, double radius, Color color) 
    {
        this.center = center;
        this.radius = radius;
        shapeColor = color;
    }

    /**
     * Returns the center of the shape
     *
     * @return     the center of the shape
     */
    public Point2D.Double getCenter() 
    {
        return center;
    }
    
    /**
     * Returns the radius.    
     *
     * @return     the radius
     */
    public double getRadius()  
    {
        return radius;
    }
    
    /**
     * Displaces the center of this shape by (x, y).
     *
     */
    public void move(double x, double y)
    {
        
    }
    
    /**
     * Sets the radius of this shape to r.     
     *
     * @param  r   the new radius
     */
    public void setRadius(double r)
    {
        radius = r;
    }
    
    public abstract boolean isInside(Point2D.Double point);
    
    public abstract void draw(Graphics2D g2, boolean filled);
    
}
