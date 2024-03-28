package ShriNik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShriNik extends JFrame implements ActionListener {
    JFrame f = new JFrame("ShriNik");
    JButton b1, b2, b3;
    JLabel l;

    ShriNik() {
        f.setDefaultCloseOperation(3);
        f.getContentPane().setBackground(Color.lightGray);
        f.setSize(1000, 600);

        b1 = new JButton("Common People");
        b2 = new JButton("Administer");
        b3 = new JButton("Employee");

        l = new JLabel("ShriNik");
        l.setBounds(100, 50, 250, 50);
        l.setFont(new Font("Algerian", 2, 40));
        l.setLocation(380, 52);

        b1.setBounds(100, 60, 150, 50);
        b1.setLocation(300, 200);
        b2.setBounds(100, 60, 150, 130);
        b2.setLocation(480, 200);
        b3.setBounds(100, 60, 150, 50);
        b3.setLocation(300, 280);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        f.add(this.b1);
        f.add(this.b2);
        f.add(this.b3);
        f.add(this.l);

        f.setLocationRelativeTo((Component)null);
        f.setLayout((LayoutManager)null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.b1) {       //common people
            new CommonPeople();
            this.setVisible(false);
        }

        if (e.getSource() == this.b2) {      //Administer
            new LoginAdminister();
            this.setVisible(false);
        }
//
        if (e.getSource() == this.b3) {        //Employee
            new LoginEmployee();
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new ShriNik();
    }
}
