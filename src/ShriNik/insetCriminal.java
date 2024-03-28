package ShriNik;

import javax.swing.*;
import java.awt.*;

public class insetCriminal {
    JFrame f;
    JLabel ls,l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JButton b1,b2,b3;
    JToolBar tb1, tb2;
    JRadioButton rb1,rb2;
    JTextField t1,t2,t5,t7,t8,t9,t10;
    JComboBox date, month, year;
    String dates[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    String months[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12" };
    String years[]
            = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };
    insetCriminal(){
        f = new JFrame("Add new Criminal");

        ls = new JLabel("ShriNik");
        ls.setBounds(100,50,250,50);
        ls.setFont(new Font("Algerian",Font.ITALIC,40));
        ls.setLocation(380,10);

        l = new JLabel("Add New Criminal");
        l.setBounds(100,50,300,50);
        l.setFont(new Font("TimeNewRoman",Font.ITALIC,22));
        l.setLocation(370,40);

        l1=new JLabel("First Name:");
        l1.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        l1.setBounds(50,100, 120,30);

        l2=new JLabel("Last Name:");
        l2.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        l2.setBounds(50,150, 120,30);

        l3=new JLabel("Gender:");
        l3.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        l3.setBounds(50,200, 120,30);

        l4=new JLabel("DOB:");
        l4.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        l4.setBounds(50,250, 120,30);

        l5=new JLabel("Age:");
        l5.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        l5.setBounds(50,300, 120,30);

        l6=new JLabel("Arrest:");
        l6.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        l6.setBounds(50,350, 120,30);

        l7=new JLabel("Criminal City:");
        l7.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        l7.setBounds(500,100, 150,30);

        l8=new JLabel("Criminal State: ");
        l8.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        l8.setBounds(500,150, 150,30);

        l9=new JLabel("Criminal Country:");
        l9.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        l9.setBounds(500,200, 170,30);

        l10=new JLabel("Criminal Id:");
        l10.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        l10.setBounds(500,250, 170,30);

        l11=new JLabel("Crime involve in:");
        l11.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        l11.setBounds(500,300, 170,30);

        l12=new JLabel("Criminal Image:");
        l12.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        l12.setBounds(500,350, 170,30);

        t1 = new JTextField();
        t1.setBounds(190,100,165,25);

        t2 = new JTextField();
        t2.setBounds(190,150,165,25);

        t5 = new JTextField();
        t5.setBounds(190,300,165,25);

        t7 = new JTextField();
        t7.setBounds(670,100,150,25);

        t8 = new JTextField();
        t8.setBounds(670,150,150,25);

        t9 = new JTextField();
        t9.setBounds(670,200,150,25);

        t10 = new JTextField();
        t10.setBounds(670,250,150,25);

        rb1= new JRadioButton("Male");
        rb1.setBounds(190,200,75,25);
        rb2= new JRadioButton("Female");
        rb2.setBounds(280,200,75,25);
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setBounds(190,250,45,25);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setBounds(240,250,50,25);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setBounds(295,250,60,25);

        tb1 =new JToolBar();
        tb1.setBounds(190,350,165,25);
        tb1.add(new JComboBox(new String[] { "Choose","Arrested","Not Arrested" }));

        tb2 =new JToolBar();
        tb2.setBounds(670,300,150,25);
        tb2.add(new JComboBox(new String[] { "Choose","Murderer","Theif","Terrorist","international Terrorist" }));

        f.add(ls);f.add(l);f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);f.add(l8);f.add(l9);
        f.add(l10);f.add(l11);f.add(l12);
        f.add(t1);f.add(t2);f.add(t5);f.add(t7);f.add(t8);f.add(t9);f.add(t10);
        f.add(rb1);f.add(rb2);
        f.add(date);f.add(month);f.add(year);
        f.add(tb1);f.add(tb2);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.lightGray);
        f.setSize(1000, 600);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new insetCriminal();
    }
}
