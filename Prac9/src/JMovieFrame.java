import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JMovieFrame extends JFrame implements ActionListener
{
    BorderLayout boreder = new BorderLayout();
    JButton display = new JButton();
    JLabel movie = new JLabel("");

    JButton nButton = new JButton("North region movie");
    JButton sButton = new JButton("South region movie");
    JButton wButton = new JButton("West region movie");
    JButton eButton = new JButton("East region movie");
    JButton cButton = new JButton("Center region movie");

    JLabel nor = new JLabel("   1992, James");
    JLabel sou = new JLabel("   1994, Andy");
    JLabel eas = new JLabel("   1985, Annie");
    JLabel wes = new JLabel("   1962, Allen");
    JLabel cen = new JLabel("   1944, Michael");

    public JMovieFrame()
    {
        super("Movie Frame");
        setSize(250, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(boreder);
        add(nButton, "North");
        add(sButton,"South");
        add(wButton, "West");
        add(eButton,"East");
        add(cButton,"Center");

        nButton.addActionListener(this);
        sButton.addActionListener(this);
        eButton.addActionListener(this);
        wButton.addActionListener(this);
        cButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent a)
    {
        Object o = a.getSource();
        if (o == nButton)
        {
            remove(nButton);
            add(nor, BorderLayout.NORTH);
        }
        else if (o == sButton)
        {
            remove(sButton);
            add(sou, BorderLayout.SOUTH);
        }
        else if (o == wButton)
        {
            remove(wButton);
            add(wes, BorderLayout.WEST);
        }
        else if (o == eButton)
        {
            remove(eButton);
            add(eas, BorderLayout.EAST);
        }
        else
        {
            remove(cButton);
            add(cen, BorderLayout.CENTER);
        }
        invalidate();
        validate();
    }

    public static void main(String[] args)
    {
        JMovieFrame frame = new JMovieFrame();
    }
}
