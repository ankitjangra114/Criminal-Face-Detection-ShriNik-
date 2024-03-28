
package ShriNik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Employee extends JFrame implements ActionListener {
    JFrame f = new JFrame("Employee Page");
    JLabel l,ls;
    JButton b1, b2, b3, b4, b5, b6;

    Employee() {
        f.setSize(1000, 600);
        f.setDefaultCloseOperation(3);
        f.getContentPane().setBackground(Color.lightGray);

        ls = new JLabel("ShriNik");
        ls.setBounds(100, 50, 250, 50);
        ls.setFont(new Font("Algerian", 2, 40));
        ls.setLocation(380, 10);

        l = new JLabel("You are the pride of the country");
        l.setBounds(100, 50, 400, 50);
        l.setFont(new Font("TimeNewRoman", 2, 22));
        l.setLocation(300, 50);

        b1 = new JButton("Delete Employee Data");
        b2 = new JButton("Insert Employee Data");
        b3 = new JButton("Modify Employee Data");
        b4 = new JButton("Employee Login Id");
        b5 = new JButton("Employee List");

        b1.setBounds(100, 60, 180, 50);
        b1.setLocation(250, 170);
        b2.setBounds(100, 60, 180, 50);
        b2.setLocation(250, 250);
        b3.setBounds(100, 60, 180, 50);
        b3.setLocation(250, 330);
        b4.setBounds(100, 60, 180, 130);
        b4.setLocation(480, 170);
        b5.setBounds(100, 60, 180, 50);
        b5.setLocation(480, 330);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        f.add(this.l);
        f.add(this.ls);
        f.add(this.b1);
        f.add(this.b2);
        f.add(this.b3);
        f.add(this.b4);
        f.add(this.b5);

        f.setLocationRelativeTo((Component)null);
        f.setLayout((LayoutManager)null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.b1) {
//            new HomeEmployee();
            this.setVisible(false);
        } else if (e.getSource() == this.b2) {
            System.out.println("About us");
            this.setVisible(false);
        } else if (e.getSource() == this.b3) {
//            new Profile();
            this.setVisible(false);
        }


    }

    public static void main(String[] args) {
        new Employee();
    }
}
