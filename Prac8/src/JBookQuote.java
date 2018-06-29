import javax.swing.*;
import java.awt.*;

public class JBookQuote extends JFrame
{
    FlowLayout flow = new FlowLayout();
    JLabel message1 = new JLabel("The opening sentence of my favorite book is: ");
    JLabel message2 = new JLabel("Whether I shall turn out to be the hero of my own life, or whether that station will be held by anybody else, these pages must show.");

    public JBookQuote()
    {
        super("Book Quote");
        setSize(250, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(message1);
        add(message2);
    }
    public static void main(String[] args)
    {
        JBookQuote frame = new JBookQuote();
    }
}
