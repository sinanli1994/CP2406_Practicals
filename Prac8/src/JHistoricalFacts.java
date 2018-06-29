import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JHistoricalFacts extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JLabel l1 = new JLabel("Historical fact 1");
    JLabel l2 = new JLabel("Historical fact 2");
    JLabel l3 = new JLabel("Historical fact 3");
    JLabel l4 = new JLabel("Historical fact 4");
    JLabel l5 = new JLabel("Historical fact 5");
    JLabel l6 = new JLabel("Historical fact 6");
    JButton button = new JButton("Change one fact");
    int count = 0;

    public JHistoricalFacts()
    {
        super("Historical Facts");
        setSize(250, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(button);
        add(l1);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent a)
    {
        ++count;
        switch (count)
        {
            case 1:
                remove(l1);
                add(l2);
                break;
            case 2:
                remove(l2);
                add(l3);
                break;
            case 3:
                remove(l3);
                add(l4);
                break;
            case 4:
                remove(l4);
                add(l5);
                break;
            case 5:
                count = 0;
                remove(l5);
                add(l1);
                break;
        }
        validate();
        repaint();
    }

    public static void main(String[] args)
    {
        JHistoricalFacts frame = new JHistoricalFacts();
    }
}
