
package ShriNik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommonPeople extends JFrame implements ActionListener {
    JFrame f = new JFrame("Main Page");
    JButton b1, b2;
    JLabel l,ls,l1;

    CommonPeople() {
        f.setDefaultCloseOperation(3);
        f.getContentPane().setBackground(Color.lightGray);
        f.setSize(1000, 600);

        b1 = new JButton("Login");
        b1.setBounds(100, 60, 130, 50);
        b1.setLocation(280, 200);
        b1.addActionListener(this);

        b2 = new JButton("Register");
        b2.setBounds(100, 60, 130, 50);
        b2.setLocation(500, 200);
        b2.addActionListener(this);

        ls = new JLabel("ShriNik");
        ls.setBounds(100, 50, 250, 50);
        ls.setFont(new Font("Algerian", 2, 40));
        ls.setLocation(380, 10);

        l = new JLabel("You are the pride of the country");
        l.setBounds(100, 50, 400, 50);
        l.setFont(new Font("TimeNewRoman", 2, 22));
        l.setLocation(300, 50);

        l1 = new JLabel("OR");
        l1.setBounds(100, 50, 250, 50);
        l1.setFont(new Font("TimeNewRoman", 2, 25));
        l1.setLocation(433, 200);

        f.add(this.b1);
        f.add(this.b2);
        f.add(this.l);
        f.add(this.l1);
        f.add(this.ls);
        f.setLocationRelativeTo((Component)null);
        f.setLayout((LayoutManager)null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.b1) {
            new LoginCommon();
            this.setVisible(false);
        }

        if (e.getSource() == this.b2) {
            new RegisterCommon();
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new CommonPeople();
    }
}
