import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel
{
    private JPanel panel;
    private JPanel label;
    private JButton button;
    private JButton button2;
    private JButton button3;
    
    public ControlPanel(DrawingPanel canvas)
    {
        //this.panel = new JPanel();
        
        this.button = new JButton("Pick Color");
       // this.ControlPanel.add(this.button);
        
        this.button2 = new JButton("Add Circle");
        this.panel.add(this.button2);
        
        this.button3 = new JButton("Add Square");
        this.panel.add(this.button3);
        
        
        ClickListener listener = new ClickListener();
        this.button.addActionListener(listener);
        this.button2.addActionListener(listener);
        this.button3.addActionListener(listener);
    }
    
    public static void main(String[] args)
    {
        ControlPanel view = new ControlPanel();
    }

    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("Button "+ event.getActionCommand() +" was clicked!");
        }
    }
}
