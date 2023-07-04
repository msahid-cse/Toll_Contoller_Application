import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class DeveloperInformation extends JFrame implements ActionListener {

    public DeveloperInformation() {
        //creat new frame
        JFrame frame2 = new JFrame("Toll Controller");
        frame2.setLayout(null);
        frame2.getContentPane().setBackground(new Color(208, 189, 244));
        frame2.setSize(1000, 600);
        frame2.setLocation(200, 60);
        frame2.setVisible(true);
        frame2.setResizable(false);
        frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);

        /*
        l1: Developed by,
        l2: Md. Sahid
        l3: ID: 221902057
        l4: Department: Computer Science and Engineering
        l5: Green University of Bangladesh
        l6: Email: msahid.cse@gmail.com  ||  Phone: 01407531529
         */

        //developer label
        JLabel l1 = new JLabel("Developed By, ");
        frame2.add(l1);
        l1.setBounds(50, 55, 200, 25);
        l1.setFont(new Font("serif", Font.BOLD, 25));
        l1.setForeground(Color.BLACK);
        //label
        JLabel l2 = new JLabel("Md. Sahid");
        frame2.add(l2);
        l2.setBounds(50, 90, 200, 15);
        l2.setFont(new Font("serif", Font.BOLD, 20));
        l2.setForeground(Color.BLACK);
        //label
        JLabel l3 = new JLabel("ID: 221902057 ");
        frame2.add(l1);
        l3.setBounds(50, 90, 500, 20);
        l3.setFont(new Font("serif", Font.BOLD, 15));
        l3.setForeground(Color.BLACK);
        //label
        JLabel l4 = new JLabel("Department: Computer Science and Engineering");
        frame2.add(l4);
        l4.setBounds(50, 110, 500, 20);
        l4.setFont(new Font("serif", Font.BOLD, 15));
        l4.setForeground(Color.BLACK);
        //label
        JLabel l5 = new JLabel("Green University of Bangladesh ");
        frame2.add(l5);
        l5.setBounds(50, 130, 500, 20);
        l5.setFont(new Font("serif", Font.BOLD, 15));
        l5.setForeground(Color.BLACK);
        //label
        JLabel l6 = new JLabel("Email: msahid.cse@gmail.com  ||  Phone: 01407531529");
        frame2.add(l6);
        l6.setBounds(50, 150, 500, 20);
        l6.setFont(new Font("serif", Font.BOLD, 15));
        l6.setForeground(Color.BLACK);

        /*
        l7: Instructed by,
        l8: Jarin Tasnim Tonvi
        l9: Lecturer, Department of CSE
        l10: Green University of Bangladesh
        */
        //Instructor label
        JLabel l7 = new JLabel("Instructed by, ");
        frame2.add(l7);
        l7.setBounds(50, 200, 200, 25);
        l7.setFont(new Font("serif", Font.BOLD, 25));
        l7.setForeground(Color.BLACK);
        //label
        JLabel l8 = new JLabel("Jarin Tasnim Tonvi");
        frame2.add(l8);
        l8.setBounds(50, 235, 200, 20);
        l8.setFont(new Font("serif", Font.BOLD, 20));
        l8.setForeground(Color.BLACK);
        //label
        JLabel l9 = new JLabel("Lecturer, Department of CSE");
        frame2.add(l9);
        l9.setBounds(50, 260, 500, 20);
        l9.setFont(new Font("serif", Font.BOLD, 15));
        l9.setForeground(Color.BLACK);
        //label
        JLabel l10 = new JLabel("Green University of Bangladesh");
        frame2.add(l10);
        l10.setBounds(50, 280, 500, 20);
        l10.setFont(new Font("serif", Font.BOLD, 15));
        l10.setForeground(Color.BLACK);



        //add back button
        JButton Back = new JButton("< Back");
        Back.setFont(new Font("Arial", Font.BOLD, 20));
        Back.setBounds(0, 0, 100, 25);
        Back.setBackground(new Color(159,126	,219));
        Back.setForeground(Color.white);
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new WelcomePage();
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

        ////
        //USERNAME LABEL
       JLabel userLabel =new JLabel("Any Suggestion of Feedback: ");
        userLabel.setBounds(20,485,260,50);
        userLabel.setFont(new Font("serif", Font.BOLD, 20));
        frame2.add(userLabel);

        //USERNAME TEXT FIELD
        JTextField tf=new JTextField();
        tf.setBounds(280,500,480,30);
        tf.setFont(new Font("serif", Font.BOLD, 20));
        frame2.add(tf);
      //  String comment= tf.getText();
        //System.out.println(comment);

        //LOGIN BUTTON
       JButton loningButton= new JButton("Send");
        loningButton.setBounds(870,500,90,30);
        loningButton.setForeground(Color.white);
        loningButton.setBackground(new Color(159,126	,219));
        loningButton.setFont(new Font("serif", Font.BOLD, 20));
        frame2.add(loningButton);
        loningButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String comment= tf.getText();
                    //System.out.println(comment);
                    UserConnection conn2 = new UserConnection();
                    String query2 = "insert into suggestion_feedback values('"+comment+"')";
                    conn2.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null,"your Suggestion/Feedback send Successful");
                    tf.setText(" ");
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        //CLEAR BUTTON
       JButton clearButton= new JButton("Clear");
        clearButton.setBounds(770,500,90,30);
        clearButton.setFont(new Font("serif", Font.BOLD, 20));
        clearButton.setBackground(new Color(159,126	,219));
        clearButton.setForeground(Color.white);
        frame2.add(clearButton);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(" ");
            }
        });

    }

    public static void main(String[] args) {
        new DeveloperInformation();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}