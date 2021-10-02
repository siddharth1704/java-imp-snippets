import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
public class test extends JFrame implements ActionListener
{
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b1, b2, b3;
    test()
    {
        super("Count the vowels");

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 2));
        FlowLayout layout = new FlowLayout();
        JPanel p2 = new JPanel();
        p2.setLayout(layout);

        l1 = new JLabel("Enter String");
        t1 = new JTextField(20);
        l2 = new JLabel("Result");
        t2 = new JTextField(20);

        b1 = new JButton("Count");
        b1.addActionListener(this);

        b2 = new JButton("Reset");
        b2.addActionListener(this);

        b3 = new JButton("Exit");
        b3.addActionListener(this);

        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);

        add(p1, "North");
        add(p2, "South");

        setVisible(true);
        this.setSize(400, 180);
    }

    public void actionPerformed(ActionEvent e)
    {
        String text = t1.getText();

        if(e.getSource() == b1)
        {
            int count = 0;
            for (int i = 0 ; i < text.length(); i++)
            {
                char ch = text.charAt(i);
                if(ch == '1'|| ch == '2'|| ch == '3' ||ch == '4' ||ch == '5' ||ch == '6' ||ch == '7' ||ch == '8' ||ch == '9' ||ch == '0')
                {
                    count ++;
                }
            }
            t2.setText(Integer.toString(count));
        }
        if(e.getSource() == b2)
        {
            t1.setText("");
            t2.setText("");
        }
        if(e.getSource() == b3)
        {
            this.setVisible(false);
        }
    }
    public static void main(String[] args)
    {
        new test();
    }
}