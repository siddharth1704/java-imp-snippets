package tech.codingclub;
import java.awt.*;
import javax.swing.*;
public class GUI extends JFrame{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3;
    GUI(){
        super("Test GUI");
        JPanel p1= new JPanel();
        p1.setLayout(new GridLayout(4,2));
        FlowLayout layout=new FlowLayout();
        JPanel p2 =new JPanel();
        p2.setLayout(layout);
        l1=new JLabel("NAME");
        t1=new JTextField(20);
        l2=new JLabel("CODE");
        t2=new JTextField(20);
        l3=new JLabel("DESIGNATION");
        t3=new JTextField(20);
        l4=new JLabel("SALARY");
        t4=new JTextField(20);
        b1=new JButton("SUBMIT");
        b2=new JButton("RESET");
        b3=new JButton("EXIT");
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(l4);
        p1.add(t4);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        add(p1,"North");
        add(p2,"South");
        setVisible(true);
        this.setSize(400,180);
    }

    public static void main(String[] args) {
        new GUI();
    }
}
