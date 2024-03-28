package ShriNik;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginAdminister extends JFrame implements ActionListener {
    JFrame f;
    JLabel ls,l,l1,l2;
    JTextField t1;
    JButton b1,b2;
    JPasswordField t2;

    LoginAdminister() {
        f = new JFrame("Login Page");

        ls = new JLabel("ShriNik");
        ls.setBounds(100, 50, 250, 50);
        ls.setFont(new Font("Algerian", 2, 40));
        ls.setLocation(380, 10);

        l = new JLabel("You are in Login page ");
        l.setBounds(100, 50, 250, 50);
        l.setFont(new Font("TimeNewRoman", 2, 22));
        l.setLocation(350, 50);

        t1 = new JTextField();
        t1.setBounds(180, 150, 150, 25);

        t2 = new JPasswordField();
        t2.setBounds(180, 200, 150, 25);

        l1 = new JLabel("User Id : ");
        l1.setFont(new Font("TimeNewRoman", 1, 20));
        l1.setBounds(50, 150, 100, 30);

        l2 = new JLabel("Password : ");
        l2.setBounds(50, 200, 120, 20);
        l2.setFont(new Font("TimeNewRoman", 1, 20));

        b1 = new JButton("Login");
        b1.setBounds(100, 60, 150, 50);
        b1.setLocation(400, 300);
        b1.addActionListener(this);

        b2 = new JButton("Cancel");
        b2.setBounds(100, 60, 150, 50);
        b2.setLocation(180, 300);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                f.dispose();
            }
        });

        f.add(l);f.add(ls);f.add(l1);f.add(l2);f.add(t1);f.add(t2);f.add(b1);f.add(b2);

        f.setDefaultCloseOperation(3);
        f.getContentPane().setBackground(Color.lightGray);
        f.setSize(1000, 600);
        f.setLocationRelativeTo((Component)null);
        f.setLayout((LayoutManager)null);
        f.setVisible(true);


    }

    boolean validation(){
        String userName = this.t1.getText();
        String passWord = this.t2.getText();
        if(userName.equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter User Name");
            return false;
        }
        if(passWord.equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter Password");
            return false;
        }


        return true;
    }

    private void b1ActionPerformed(ActionEvent evt){}

    public void actionPerformed(ActionEvent e) {
        if (validation()){
            String adminUserid="ankit@123";
            String adminPassword="ankit@123";
            String userName = this.t1.getText();
            String passWord = this.t2.getText();
            if (e.getSource() == this.b1) {
                if (userName.equals(adminUserid) && passWord.equals(adminPassword)) {
                    JOptionPane.showMessageDialog((Component)null, "Login Successfully");
                    new HomeAdminister();
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Invalid User Id OR Password");
                    this.setVisible(true);
                }
            }
        }
    }

    public static void main(String[] args) {

        new LoginAdminister();
    }
}
