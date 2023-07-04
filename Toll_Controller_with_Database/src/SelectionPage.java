import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SelectionPage extends JFrame implements ActionListener {

    public SelectionPage() {
        //creat new frame
        JFrame frame2 = new JFrame("Toll Controller");
        frame2.setLayout(null);
        frame2.getContentPane().setBackground(new Color(136, 196, 245));
        frame2.setSize(1000, 600);
        frame2.setLocation(200, 60);
        frame2.setVisible(true);
        frame2.setResizable(false);
        frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //heading
        JLabel heading = new JLabel("LOGIN");
        frame2.add(heading);
        heading.setBounds(350, 70, 1200, 150);
        heading.setFont(new Font("Arial", Font.BOLD, 100));
        heading.setForeground(Color.BLACK);


        //add back button
        JButton Back = new JButton("< Back");
        Back.setFont(new Font("Arial", Font.BOLD, 20));
        Back.setBounds(0, 0, 100, 25);
        Back.setBackground(new Color(65,105,225));
        Back.setForeground(Color.white);
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new WelcomePage();
                frame2.setVisible(false);

            }
        });
        frame2.add(Back);

        //selection Button
        // for admin
        JButton adminLogin = new JButton("As Admin");
        adminLogin.setBounds(400, 250, 200, 50);
        frame2.add(adminLogin);
        adminLogin.setFont(new Font("serif", Font.BOLD, 20));
       // adminLogin.setBackground(new Color(0,128,128));
        adminLogin.setBackground(new Color(0,139,139));

        adminLogin.setForeground(Color.white);
        adminLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //LoginFrame loginFrame =
                 new LoginFrame();
               // loginFrame.setVisible(true);
                frame2.setVisible(false);

            }
        });

        //for User Login
        JButton UserLogin = new JButton("As Normal User");
        UserLogin.setBounds(400, 310, 200, 50);
        frame2.add(UserLogin);
        UserLogin.setFont(new Font("serif", Font.BOLD, 20));
      //  UserLogin.setBackground(new Color(0,139,139));
        UserLogin.setBackground(new Color(159,126	,219));
        UserLogin.setForeground(Color.white);
        UserLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // UserSelectionPage userSelectionPage=
                new UserSelectionPage();
                //userSelectionPage.setVisible(true);
                frame2.setVisible(false);
            }
        });

        //color button
        JButton c = new JButton("<BG color>");
        c.setBounds(900, 0, 100, 25);
        //new Color(0,139,139)
        c.setBackground(new Color(65,105,225));
        c.setForeground(Color.white);
        c.setFont(new Font("Arial", Font.BOLD, 12));

        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color cc = JColorChooser.showDialog(null, "choose a color", Color.green);
                frame2.getContentPane().setBackground(cc);


            }
        });
        frame2.add(c);
    }

    public static void main(String[] args) {
        new SelectionPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}