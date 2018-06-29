import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameDisableButton extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JButton button = new JButton("Disable");

    public JFrameDisableButton()
    {
        super("Disable Button");
        setSize(250,100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent a)
    {
        button.setEnabled(false);
    }

    public static void main(String[] args)
    {
        JFrameDisableButton frame = new JFrameDisableButton();
    }
}
