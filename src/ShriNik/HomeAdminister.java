
package ShriNik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeAdminister extends JFrame implements ActionListener {
    JFrame f = new JFrame("Home Page");
    JButton b1, b2;
    JLabel l;
    JLabel l1;

    HomeAdminister() {
        f.setDefaultCloseOperation(3);
        f.getContentPane().setBackground(Color.lightGray);
        f.setSize(1000, 600);

        b1 = new JButton("Criminal Data");
        b1.setBounds(100, 60, 130, 50);
        b1.setLocation(280, 200);
        b1.addActionListener(this);

        b2 = new JButton("Employee Data");
        b2.setBounds(100, 60, 130, 50);
        b2.setLocation(500, 200);
        b2.addActionListener(this);

        l = new JLabel("ShriNik");
        l.setBounds(100, 50, 250, 50);
        l.setFont(new Font("Algerian", 2, 40));
        l.setLocation(380, 52);

        l1 = new JLabel("OR");
        l1.setBounds(100, 50, 250, 50);
        l1.setFont(new Font("TimeNewRoman", 2, 25));
        l1.setLocation(433, 200);

        f.add(this.b1);
        f.add(this.b2);
        f.add(this.l);
        f.add(this.l1);
        f.setLocationRelativeTo((Component)null);
        f.setLayout((LayoutManager)null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.b1) {
            new Criminal();
            this.setVisible(false);
        }

        if (e.getSource() == this.b2) {
            new Employee();
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new HomeAdminister();
    }
}
