import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameDisableButton2 extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JButton button = new JButton("Disable");
    JLabel msg = new JLabel("That's enough!");
    int count = 0;

    public JFrameDisableButton2()
    {
        super("Disable Button");
        setSize(250,100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(button);
        add(msg);
        button.addActionListener(this);
        msg.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent a)
    {
        ++count;
        if (count == 8)
        {
            button.setEnabled(false);
            msg.setVisible(true);
        }
    }

    public static void main(String[] args)
    {
        JFrameDisableButton2 frame = new JFrameDisableButton2();
    }
}
