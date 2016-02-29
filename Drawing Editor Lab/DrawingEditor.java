import java.awt.BorderLayout;
import javax.swing.JFrame;

public class DrawingEditor extends JFrame
{
    public DrawingEditor()
    {
        setTitle("Drawing Editor");
        setSize(800, 800);   
        
        DrawingPanel canvas = new DrawingPanel();
        add(canvas, BorderLayout.CENTER);
        
        ControlPanel controls = new ControlPanel(canvas);
        add(controls, BorderLayout.PAGE_END);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args)
    {
        DrawingEditor frame = new DrawingEditor();
    }
}
