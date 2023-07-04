import com.sun.jdi.PathSearchingVirtualMachine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UserLogin extends JFrame {

    private JLabel userLabel,passLabel,adminLogin;
    private JTextField tf;
    private JPasswordField pf;
    private JButton loningButton, clearButton, backButton, bgColor;

    private Container c;
    private Font f;

    UserLogin(){
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(200,60,1000,600);
        this.setTitle("toll controller");

        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(208, 189, 244));

        f= new Font("Arial",Font.BOLD,15);

        //ADMIN LOGIN LABEL
        adminLogin =new JLabel("----->User Login<-----");
        adminLogin.setBounds(350, 50, 400, 60);
        adminLogin.setFont(new Font("Arial",Font.BOLD,30));
        c.add(adminLogin);

        //USERNAME LABEL
        userLabel =new JLabel("License Number: ");
        userLabel.setBounds(270,140,150,50);
        userLabel.setFont(f);
        c.add(userLabel);

        //USERNAME TEXT FIELD
        tf=new JTextField();
        tf.setBounds(400,150,240,30);
        tf.setFont(f);
        c.add(tf);

        //PASSWORD LABEL
        passLabel =new JLabel("Password:");
        passLabel.setBounds(270,190,150,50);
        passLabel.setFont(f);
        c.add(passLabel);

        //PASSWORD TEXT FIELD
        pf=new JPasswordField();
        pf.setBounds(400,200,240,30);
        pf.setFont(f);
        pf.setEchoChar('1');
        c.add(pf);

        //LOGIN BUTTON
        loningButton= new JButton("Login");
        loningButton.setBounds(400,250,90,50);
        loningButton.setForeground(Color.white);
        loningButton.setBackground(new Color(159,126	,219));
        loningButton.setFont(f);
        c.add(loningButton);

        //CLEAR BUTTON
        clearButton= new JButton("Clear");
        clearButton.setBounds(550,250,90,50);
        clearButton.setFont(f);
        clearButton.setBackground(new Color(159,126	,219));
        clearButton.setForeground(Color.white);
        c.add(clearButton);

        //add back button
        backButton= new JButton("< Back");
        backButton.setBounds(0,0,100,25);
        backButton.setFont(new Font("Arial",Font.BOLD,15));
        backButton.setBackground(new Color(159,126	,219));
        backButton.setForeground(Color.white);
        c.add(backButton);

        //add back button action
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              //  dispose();
             //   UserSelectionPage userselectionPage=
                        new UserSelectionPage();
                // userselectionPage.setVisible(true);
                setVisible(false);
            }
        });

        //add bgColor button
        bgColor =new JButton("<BG color>");
        bgColor.setBounds(900,0,100,25);
        bgColor.setFont(new Font("Arial",Font.BOLD,12));
        bgColor.setBackground(new Color(159,126	,219));
        bgColor.setForeground(Color.white);
        c.add(bgColor);

        //add bgColor action
        bgColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color cc= JColorChooser.showDialog(null,"choose a color",Color.green);
                c.setBackground(cc);
            }
        });

        //add clear action
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                pf.setText("");
            }
        });


        //add login action
        loningButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String username= tf.getText();
                    String password = pf.getText();
                    UserConnection c=new UserConnection();
                    int PIN=12;
                    String query="select * from userregistration where License_Number = '"+username+"' or Pin = '"+PIN+"'   and Password = '"+password+"'";
                    ResultSet rs=c.s.executeQuery(query);
                    if(rs.next()){
                        System.out.println();
                       // UserPanel userPanel= new UserPanel();
                       // userPanel.setVisible(true);
                        //OnlinePayment onlinePayment=
                        new OnlinePayment();
                        //onlinePayment.setVisible(true);
                        setVisible(false);

                    }
                    else {
                        JOptionPane.showMessageDialog(null,"invalid username & password");
                    }
                }
                catch (Exception ee){

                }
//
//                if(username.equals("admin") && password.equals("1234")){
//                    //JOptionPane.showMessageDialog(null,"successful");
//                    //new AdminPanel();
//                    //setVisible(false);
//                    AdminPanel adminPanel= new AdminPanel();
//                    adminPanel.setVisible(true);
//                    setVisible(false);
//                }
//                else{
//                    JOptionPane.showMessageDialog(null,"Wrong Password, Try again","Warning: Wrong Password",2);
//                    //JOptionPane.showMessageDialog();
//                    // clear action
//                    tf.setText("");
//                    pf.setText("");
//
//
//                }
            }
        });
    }
    public static void main(String args[]){
      //  UserLogin Frame6 =
        new UserLogin();

       /* Frame6.setVisible(true);
        Frame6.setResizable(false);
        Frame6.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Frame6.setBounds(200,60,1000,600);
        Frame6.setTitle("toll controller");*/
    }
}