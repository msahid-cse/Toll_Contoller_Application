import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UserSelectionPage extends JFrame implements ActionListener {

    public UserSelectionPage() {
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
        JLabel heading = new JLabel("User Panel");
        frame2.add(heading);
        heading.setBounds(350, 70, 1200, 150);
        heading.setFont(new Font("Arial", Font.BOLD, 60));
        heading.setForeground(Color.BLACK);


        //add back button
        JButton Back = new JButton("< Back");
        Back.setFont(new Font("Arial", Font.BOLD, 20));
        Back.setBounds(0, 0, 100, 25);
        Back.setBackground(new Color(159,126	,219));
        Back.setForeground(Color.white);
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new WelcomePage();
                //new WelcomePage();
                new SelectionPage();
                frame2.setVisible(false);

            }
        });
        frame2.add(Back);

        //selection Button
        // UserLogin
        JButton UserLogin = new JButton("LOGIN");
        UserLogin.setBounds(400, 250, 200, 50);
        frame2.add(UserLogin);
        UserLogin.setFont(new Font("serif", Font.BOLD, 20));
        UserLogin.setBackground(new Color(159,126	,219));
        UserLogin.setForeground(Color.white);
        UserLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // UserLogin userLogin =
                        new UserLogin();
                //userLogin.setVisible(true);
                frame2.setVisible(false);

            }
        });

        //User Registration
        JButton UserRegistration = new JButton("REGISTRATION");
        UserRegistration.setBounds(400, 310, 200, 50);
        frame2.add(UserRegistration);
        UserRegistration.setFont(new Font("serif", Font.BOLD, 20));
        UserRegistration.setBackground(new Color(159,126	,219));
        UserRegistration.setForeground(Color.white);
        UserRegistration.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // UserRegistration userRegistration=
                 new UserRegistration();
              //  userRegistration.setVisible(true);
                frame2.setVisible(false);
            }
        });

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
    }

    public static void main(String[] args) {
        new UserSelectionPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}