//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package ShriNik;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ViewPage extends JFrame {
    JFrame f = new JFrame("View Page");
    JLabel l = new JLabel("View Criminal Data ");


    JButton b1 = new JButton("View");
    JButton b2 = new JButton("View");
    JToolBar toolbar = new JToolBar();
    JRadioButton radioButton1 = new JRadioButton("Male");
    JRadioButton radioButton2 = new JRadioButton("Female");
    JLabel ls;
    JLabel l1;
    JLabel l2;
    JLabel l3 = new JLabel("View Through Crime");
    JLabel l4;
    JLabel l5 = new JLabel("View Through Gender");
    JLabel l6;
    JTextField t1;
    JTextField t2;


    ViewPage() {
        this.b1.setBounds(100, 60, 150, 50);
        this.b1.setLocation(420, 110);
        this.l.setBounds(100, 50, 300, 50);
        this.l.setFont(new Font("TimeNewRoman", 2, 22));
        this.l.setLocation(50, 50);
        this.t1 = new JTextField();
        this.t1.setBounds(220, 100, 150, 25);
        this.t2 = new JTextField();
        this.t2.setBounds(220, 150, 150, 25);


        this.ls = new JLabel("ShriNik");
        this.ls.setBounds(100, 50, 250, 50);
        this.ls.setFont(new Font("Algerian", 2, 40));
        this.ls.setLocation(380, 10);
        this.l1 = new JLabel("Criminal Id :");
        this.l1.setFont(new Font("TimeNewRoman", 1, 20));
        this.l1.setBounds(50, 100, 160, 30);
        this.l2 = new JLabel("Criminal Name :");
        this.l2.setFont(new Font("TimeNewRoman", 1, 20));
        this.l2.setBounds(50, 150, 160, 30);
        this.l3.setBounds(100, 50, 300, 50);
        this.l3.setFont(new Font("TimeNewRoman", 2, 22));
        this.l3.setLocation(50, 200);
        this.l4 = new JLabel("Crime Involved :");
        this.l4.setFont(new Font("TimeNewRoman", 1, 20));
        this.l4.setBounds(50, 250, 160, 30);
        this.toolbar.setBounds(100, 60, 150, 25);
        this.toolbar.setLocation(220, 250);
        toolbar.add(new JComboBox(new String[] { "Choose","Accident", "Murder", "Thief", "Rape" }));
        this.b2.setBounds(100, 60, 150, 25);
        this.b2.setLocation(420, 250);
        this.l5.setBounds(100, 50, 300, 50);
        this.l5.setFont(new Font("TimeNewRoman", 2, 22));
        this.l5.setLocation(50, 300);
        this.l6 = new JLabel("Gender :");
        this.l6.setFont(new Font("TimeNewRoman", 1, 20));
        this.l6.setBounds(50, 350, 160, 30);
        this.radioButton1.setBounds(100, 60, 150, 25);
        this.radioButton1.setLocation(220, 350);
        this.radioButton2.setBounds(100, 60, 150, 25);
        this.radioButton2.setLocation(420, 350);
        ButtonGroup bg=new ButtonGroup();
        bg.add(radioButton1);
        bg.add(radioButton2);

        this.f.add(this.ls);
        this.f.add(this.l);
        this.f.add(this.b1);
        this.f.add(this.l1);
        this.f.add(this.l2);
        this.f.add(this.l3);
        this.f.add(this.t1);
        this.f.add(this.t2);
        this.f.add(this.l4);
        this.f.add(this.toolbar);
        this.f.add(this.b2);
        this.f.add(this.l5);
        this.f.add(this.l6);
        this.f.add(this.radioButton1);
        this.f.add(this.radioButton2);

        this.f.setDefaultCloseOperation(3);
        this.f.getContentPane().setBackground(Color.lightGray);
        this.f.setSize(1000, 600);
        this.f.setLocationRelativeTo((Component)null);
        this.f.setLayout((LayoutManager)null);
        this.f.setVisible(true);

    }

    public static void main(String[] args) {
        new ViewPage();
    }

}
