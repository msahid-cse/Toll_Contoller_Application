import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.Date;
import java.util.Date;
import java.sql.ResultSet;


public class OnlinePayment extends JFrame implements ActionListener {
    JPasswordField passwordField;
    JButton OkButton, ConfirmButton,exit;
    JTextArea BalanceArea;
    int LicenseNumber;
    JLabel confirmlabel, pinlabel,success;
    Date date = new Date();
    int Balance;

    public OnlinePayment() {
        //creat new frame
        JFrame frame2 = new JFrame("Toll Controller");
        frame2.setLayout(null);
        frame2.getContentPane().setBackground(new Color(208, 189, 244));
        frame2.setSize(1000, 600);
        frame2.setLocation(200, 60);
        frame2.setVisible(true);
        frame2.setResizable(false);
        frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //heading
        confirmlabel = new JLabel("Confirm Your Payment ");
        frame2.add(confirmlabel);
        confirmlabel.setBounds(200, 150, 500, 30);
        confirmlabel.setFont(new Font("Arial", Font.BOLD, 30));
        confirmlabel.setForeground(Color.BLACK);
        // ok button
        OkButton = new JButton("OK");
        OkButton.setBounds(530, 153, 100, 30);
        frame2.add(OkButton);
        OkButton.setFont(new Font("serif", Font.BOLD, 25));
        OkButton.setBackground(new Color(159,126	,219));
        OkButton.setForeground(Color.white);
        OkButton.addActionListener(this);
        //
        //
        success = new JLabel("Your payment successful.");
        frame2.add(success);
        success.setBounds(350, 200, 500, 30);
        success.setFont(new Font("Arial", Font.BOLD, 30));
        success.setForeground(new Color(34,139,34));
        success.setVisible(false);
        // ok button
        exit = new JButton("Exit");
        exit.setBounds(350, 250, 100, 30);
        frame2.add(exit);
        exit.setFont(new Font("serif", Font.BOLD, 25));
        exit.setBackground(new Color(159,126	,219));
        exit.setForeground(Color.white);
        exit.setVisible(false);
       exit.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.exit(0);
           }
       });
        //
        //
        pinlabel = new JLabel("Enter your Account PIN: ");
        frame2.add(pinlabel);
        pinlabel.setBounds(165,200,240,30);
        pinlabel.setFont(new Font("serif", Font.BOLD, 20));
        pinlabel.setForeground(Color.BLACK);
        pinlabel.setVisible(false);
        //
        passwordField= new JPasswordField();
        frame2.add(passwordField);
        passwordField.setBounds(415,200,240,30);
        passwordField.setFont(new Font("serif", Font.BOLD, 20));
        passwordField.setEchoChar('1');
       // passwordField.setVisible(true);
        passwordField.setVisible(false);
        //  ConfirmButton
        ConfirmButton = new JButton("Confirm");
        ConfirmButton.setBounds(350, 250, 150, 50);
        frame2.add(ConfirmButton);
        ConfirmButton.setFont(new Font("serif", Font.BOLD, 25));
        ConfirmButton.setBackground(new Color(159,126	,219));
        ConfirmButton.setForeground(Color.white);
        ConfirmButton.addActionListener(this);
        ConfirmButton.setVisible(false);
        //add back button
        JButton Back = new JButton("< Back");
        Back.setFont(new Font("Arial", Font.BOLD, 20));
        Back.setBounds(0, 0, 100, 25);
        Back.setBackground(new Color(159,126	,219));
        Back.setForeground(Color.white);
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 new WelcomePage();
                //new WelcomePage();
                frame2.setVisible(false);

            }
        });
        frame2.add(Back);
        //color button
        JButton c = new JButton("<BG color>");
        c.setBounds(900, 0, 100, 25);
        c.setBackground(new Color(159,126	,219));
        c.setForeground(Color.white);
        c.setFont(new Font("Arial", Font.BOLD, 12));
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color cc = JColorChooser.showDialog(null, "choose a color", Color.green);
                frame2.getContentPane().setBackground(cc);


            }
        });
        frame2.add(c);


        //
        JLabel userInfo =new JLabel("User Info");
        frame2.add(userInfo);
        userInfo.setBounds(820,45,100,10);
        userInfo.setVisible(true);
        //
        BalanceArea= new JTextArea();
        frame2.add(BalanceArea);
        BalanceArea.setBounds(750,60,200,100);
        BalanceArea.setBackground(new Color(224,255,255));
        BalanceArea.setForeground(Color.black);
        BalanceArea.setVisible(true);
        //
        Balance=180;
         LicenseNumber = 221902057;
        BalanceArea.setText("   License Number: " + LicenseNumber+"\n" +"   Balance:" + Balance + "\n" + "    Account Name: Bkash" +"\n"+"    Vehicle Name: Motorcycle"+"\n"+"   Payment Status: Processing....");


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(Balance>=100) {
            if (e.getSource() == OkButton) {
                pinlabel.setVisible(true);
                passwordField.setVisible(true);
                ConfirmButton.setVisible(true);
            } else if (e.getSource() == ConfirmButton) {
                try {

                    int pin = Integer.parseInt(passwordField.getText());
                    UserConnection c = new UserConnection();
                    String query = "select * from userregistration where Pin = '" + pin + "'";
                    ResultSet rs = c.s.executeQuery(query);
                    if (rs.next()) {
                        Balance = Balance - 100;
                        BalanceArea.setText("   License Number: " + LicenseNumber+"\n" +"   Balance:" + Balance + "\n" + "    Account Name: Bkash" +"\n"+"    Vehicle Name: Motorcycle"+"\n"+"   Payment Status: Paid");
                        System.out.println();
                        JOptionPane.showMessageDialog(null, "Payment successfully");
                        pinlabel.setVisible(false);
                        passwordField.setVisible(false);
                        ConfirmButton.setVisible(false);
                        OkButton.setVisible(false);
                        confirmlabel.setVisible(false);
                        exit.setVisible(true);
                        success.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid PIN");
                    }
                } catch (Exception ee) {

                }
                try {
                    Conn conn = new Conn();
                    String query = "insert into info2 values( 'MotorCycle', 'Gh-123', ' " + date + " ', ' Online ', '100')";
                    conn.s.executeUpdate(query);
                } catch (Exception ee) {
                    ee.printStackTrace();
                }

            }
        }
        else{
            JOptionPane.showMessageDialog(null,"You have not sufficient balance","Warning",JOptionPane.ERROR_MESSAGE);
        }

    }
    public static void main(String[] args) {

        new OnlinePayment();
    }


}