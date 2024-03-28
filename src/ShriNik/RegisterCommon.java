package ShriNik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class RegisterCommon extends JFrame implements ActionListener{
    JFrame f;
    JLabel l;
    JButton b1,b2;
    JLabel ls,l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField t1,t2,t3,t4,t5,t7;
    JPasswordField t6;
    RegisterCommon(){
        f = new JFrame("Registration Page");
        l = new JLabel("You are in Registration page ");
        b1 = new JButton("Create Account");
        b2 = new JButton("Cancel");

        b1.setBounds(100, 60, 150, 50);
        b1.setLocation(400, 450);
        b1.addActionListener(this);

        b2.setBounds(100, 60, 150, 50);
        b2.setLocation(180, 450);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                f.dispose();
            }
        });

        l.setBounds(100,50,300,50);
        l.setFont(new Font("TimeNewRoman",Font.ITALIC,22));
        l.setLocation(350,40);

        t1 = new JTextField();
        t1.setBounds(180,100,150,25);

        t7 = new JTextField();
        t7.setBounds(180,150,150,25);

        t2 = new JTextField();
        t2.setBounds(180,200,150,25);

        t3 = new JTextField();
        t3.setBounds(180,250,150,25);

        t4 = new JTextField();
        t4.setBounds(180,300,150,25);

        t5 = new JTextField();
        t5.setBounds(180,350,150,25);

        t6= new JPasswordField();
        t6.setBounds(180,400,150,25);

        ls = new JLabel("ShriNik");
        ls.setBounds(100,50,250,50);
        ls.setFont(new Font("Algerian",Font.ITALIC,40));
        ls.setLocation(380,10);

        l1=new JLabel("First Name :");
        l1.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        l1.setBounds(50,100, 120,30);

        l7=new JLabel("Last Name :");
        l7.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        l7.setBounds(50,150, 120,30);

        l2=new JLabel("Mobile No :");
        l2.setBounds(50,200, 120,20);
        l2.setFont(new Font("TimeNewRoman",Font.BOLD,20));

        l3=new JLabel("email Id : ");
        l3.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        l3.setBounds(50,250, 100,30);

        l4=new JLabel("Gender : ");
        l4.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        l4.setBounds(50,300, 100,30);

        l5=new JLabel("User Id : ");
        l5.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        l5.setBounds(50,350, 100,30);

        l6=new JLabel("Password : ");
        l6.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        l6.setBounds(50,400, 120,30);

        l8=new JLabel();
        l8.setFont(new Font("TimeNewRoman", 1, 20));
        l8.setBounds(370, 400, 400, 30);
        l8.setForeground(Color.RED);

        l9 = new JLabel();
        l9.setFont(new Font("TimeNewRoman", 1, 20));
        l9.setBounds(370, 200, 300, 30);
        l9.setForeground(Color.RED);

        f.add(ls);f.add(l);f.add(l1); f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);f.add(l8);f.add(l9);
        f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(b1);f.add(b2);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.lightGray);
        f.setSize(1000, 600);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);


    }
    boolean validation(){
        String fName = this.t1.getText();
        String lName = this.t7.getText();
        String mobNo = this.t2.getText();
        String emailId = this.t3.getText();
        String gender = this.t4.getText();
        String userId = this.t5.getText();
        String password = this.t6.getText();
        if(fName.equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter First Name");
            return false;
        }
        if(lName.equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter Last Name");
            return false;
        }
        if(mobNo.equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter Mobile no");
            return false;
        }
        if(mobNo.length()!=10){
            JOptionPane.showMessageDialog(this,"Mobile no should be 10 digit");
            return false;
        }
        else{
            l9.setText("");
        }
        if(emailId.equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter emailId Name");
            return false;
        }
        if(gender.equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter Gender");
            return false;
        }
        if(userId.equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter UserId");
            return false;
        }
        if(password.equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter Password");
            return false;
        }
        if (password.length()<8){
            JOptionPane.showMessageDialog(this,"Password should be greater than 8 digit");
            return false;
        }
        else{
            l8.setText("");
        }


        return true;
    }

    public void b1ActionPerformed(ActionEvent evt){}

    public void actionPerformed(ActionEvent e){
        if(validation()){
            String fName = t1.getText();
            String lName = t7.getText();
            String mobNo = t2.getText();
            String emailId = t3.getText();
            String gender = t4.getText();
            String userId = t5.getText();
            String password = t6.getText();

            if(e.getSource()==b1){
                try{
                    CommonSQL obj = new CommonSQL();
//                  Connection con=null;
//                  con =  CommonSQL.dbconnect();
//                  Connection con = null;
//                  PreparedStatement p = con.prepareStatement("");
                    String s = "insert into commonregistrer(First_Name,Last_Name,Mobile_no,Email_Id,Gender,User_Id,Password) values('"+fName+"','"+lName+"','"+mobNo+"','"+emailId+"','"+gender+"',+'"+userId+"','"+password+"') ";
                    int a = obj.stm.executeUpdate(s);
                    if(a==1){
                        JOptionPane.showMessageDialog(null,"Your Account Created");
                        this.setVisible(false);
                    new LoginCommon();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Some issue occurred ! Please enter your details again ");
                        this.setVisible(true);
                    }
                } catch(Exception e1){
                    e1.printStackTrace();
                }

            }
        }


    }

    public static void main(String[] args) {
        new RegisterCommon();
    }
}