import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;

public class ControlPanel extends JPanel
{
    private JPanel label;
    private JPanel colorPanel;
    private JButton button;
    private JButton button2;
    private JButton button3;
    private DrawingPanel canvas;
    
    public ControlPanel(DrawingPanel canv)
    {
        canvas = canv;
        button = new JButton("Pick Color");
        add(button);
        
        colorPanel = new JPanel();
        colorPanel.setBackground(canvas.getColor());
        add(colorPanel);
        
        button2 = new JButton("Add Circle");
        add(button2);
        
        button3 = new JButton("Add Square");
        add(button3);
        
        ClickListener listener = new ClickListener();
        button.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        
        setVisible(true);
    }

    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if (event.getSource() == button)
            {
                //pick color button
                canvas.pickColor();
            }
            else if (event.getSource() == button2)
            {
               //add circle button
               //canvas.addCircle();
            }
            else
            {
                //add aquare button
                //canvas.addSquare();
            }
        }
    }
}
