import javax.swing.JFrame;

public class DrawingEditor extends JFrame
{
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 800;
    
    private DrawingEditor frame;
    public DrawingEditor()
    {
        //this.frame = new JFrame("Drawing Editor");
        
        DrawingPanel canvas = new DrawingPanel();
        ControlPanel controls = new ControlPanel(canvas);
        
        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        DrawingEditor view = new DrawingEditor();
    }
}
