
import javax.swing.JFrame;

public class TriangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    
    private TriangleComponent scene;

    public TriangleFrame()
    {
        scene = new TriangleComponent();
        add(scene);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Triangle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args)
    {
        //JFrame frame = new
    }
}
