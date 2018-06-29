import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote2 extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JLabel message1 = new JLabel("The opening sentence of my favorite book is: ");
    JLabel message2 = new JLabel("Whether I shall turn out to be the hero of my own life, or whether that station will be held by anybody else, these pages must show.");
    JButton display = new JButton("Display Book");
    JLabel message3 = new JLabel("David Copperfield");

    public JBookQuote2()
    {
        super("Book Quote");
        setSize(250, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(message1);
        add(message2);
        add(display);
        display.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent a)
    {
        add(message3);
        validate();
        repaint();
    }
    public static void main(String[] args)
    {
        JBookQuote2 frame = new JBookQuote2();
    }
}
