import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

public class Square extends Shape
{
    //new square shape
    private Rectangle2D.Double newSquare;
    //x value of the coordinate of the uppermost left corner of the shape
    private double x;
    //y value of the coordinate of the uppermost left corner of the shape
    private double y;
    //value of the width of the shape
    private double width;
    //value of the height of the shape
    private double height;
    
    /**
     * Constructor for class Square
     *
     * @param  center   center of the shape
     * @param  radius    radius of the shape   
     * @param  color    color to fill or outline the shape
     */
    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
        
        x = super.getCenter().getX()-super.getRadius();
        y = x;
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
        if ( newSquare.contains(point) == true )
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
        newSquare = new Rectangle2D.Double(x, y, width, height);
        g2.setPaint(shapeColor);
        
        if ( filled == true )
        {
            g2.fill(newSquare);
        }
        else
        {
            g2.draw(newSquare);
        }
    }
}
