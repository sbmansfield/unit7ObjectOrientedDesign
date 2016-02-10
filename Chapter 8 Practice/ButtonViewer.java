import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;
    
    private JFrame frame;
    private JButton button;
    private JButton button2;
    private JPanel panel;
    private JLabel label;
    
    public ButtonViewer()
    {
        this.frame = new JFrame();
        this.panel = new JPanel();
        
        this.button = new JButton("Click me!");
        this.panel.add(this.button);
        
        this.button2 = new JButton("Click me too!");
        this.panel.add(this.button2);
        
        this.label = new JLabel();
        this.panel.add(this.label);
        
        this.frame.add(this.panel);
        
        ClickListener listener = new ClickListener();
        this.button.addActionListener(listener);
        this.button2.addActionListener(listener);
        
        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        ButtonViewer view = new ButtonViewer();
    }
    
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            label.setText("Button "+ event.getActionCommand() +" was clicked!");
        }
    }
}
