import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

public class Circle extends Shape
{
    //new circle shape
    private Ellipse2D.Double newCircle;
    //x value of the coordinate of the uppermost left corner of the shape
    private double x;
    //y value of the coordinate of the uppermost left corner of the shape
    private double y;
    //value of the width of the shape
    private double width;
    //value of the height of the shape
    private double height;
    
    /**
     * Constructor for class Circle
     *
     * @param  center   center of the shape
     * @param  radius    radius of the shape   
     * @param  color    color to fill or outline the shape
     */
    public Circle(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
        
        width = 2*super.getRadius();
        height = width;
    }
    
    /**
     * Returns true if the point lies inside this shape, false otherwise
     *
     * @param  point   a point
     * @return     returns true if the point lies inside this shape, false otherwise
     */
    public boolean isInside(Point2D.Double point)
    {
        if ( newCircle.contains(point) == true )
        {
            return true;
        }
        return false;
    }
    
    /**
     * Draws this shape. Draws a filled shape if filled is true, and a hollow shape otherwise
     *
     * @param  g2   Graphics2D object
     * @param  filled    boolean that details whether the shape is filled or not
     */
    public void draw(Graphics2D g2, boolean filled)
    {
        x = super.getCenter().getX()-super.getRadius();
        y = super.getCenter().getY()-super.getRadius();
        newCircle = new Ellipse2D.Double(x, y, width, height);
                
        if ( filled == true )
        {
            g2.setPaint(shapeColor);
            g2.fill(newCircle);
        }
        else
        {
            g2.setPaint(Color.WHITE);
            g2.fill(newCircle);
            g2.setPaint(shapeColor);
            g2.draw(newCircle);
        }
    }
}
