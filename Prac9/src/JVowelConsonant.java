import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JVowelConsonant extends JFrame implements ActionListener
{
    final int LETTERS_NUMBER = 8;
    JButton[] button = new JButton[LETTERS_NUMBER];
    final String[] ALPHABET = {"A", "B", "C", "D","E","F", "G",
            "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
            "S", "T", "U", "V", "W", "X", "Y", "Z"};
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JLabel message = new JLabel("");
    int x;
    int ran;
    int[] rans = {-1, -1, -1, -1, -1, -1, -1, -1};
    public JVowelConsonant()
    {
        setSize(250, 250);
        setVisible(true);

        for(x = 0; x < LETTERS_NUMBER; ++x)
        {
            ran = (int)(Math.random() * ALPHABET.length);
            rans[x] = ran;
        }
        setLayout(new GridLayout(2, 2));
        p1.setLayout(new GridLayout(2, 2));
        p2.setLayout(new GridLayout(2, 2));
        for(x = 0; x < LETTERS_NUMBER; ++x)
            button[x] = new JButton(ALPHABET[rans[x]]);
        for(x = 0; x < 4; ++x)
            p1.add(button[x]);
        for(; x < LETTERS_NUMBER; ++x)
            p2.add(button[x]);
        p3.add(message);
        add(p1);
        add(p2);
        add(p3);
        for(x = 0; x < LETTERS_NUMBER; ++x)
            button[x].addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        for(x = 0; x < LETTERS_NUMBER; ++x)
            if (source == button[x])
            {
                if(button[x].getText() == "A" || button[x].getText() == "E" ||
                        button[x].getText() == "I" || button[x].getText() == "O" ||
                        button[x].getText() == "U")
                    message.setText(button[x].getText() + " is a vowel");
                else
                    message.setText(button[x].getText() + " is a consonant");
                ran = (int)(Math.random() * ALPHABET.length);
                button[x].setText(ALPHABET[ran]);
                x = LETTERS_NUMBER;
            }
    }
    public static void main(String[] ags)
    {
        JVowelConsonant frame = new JVowelConsonant();
    }
}