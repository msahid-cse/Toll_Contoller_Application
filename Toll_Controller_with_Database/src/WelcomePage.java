import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WelcomePage extends JFrame implements ActionListener{

    WelcomePage(){

        //creat frame
        JFrame f=new JFrame("Toll Controller");
        f.setLayout(null);
       // f.getContentPane().setBackground(new Color(208, 189, 244));
        f.getContentPane().setBackground(new Color(136, 196, 245));
        f.setSize(1000, 600);
        f.setLocation(200, 60);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //heading 01
        JLabel heading = new JLabel("Toll Controller");
        f.add(heading);
        heading.setBounds(260, 100, 1200, 60);
        heading.setFont(new Font("serif", Font.BOLD, 70));
       // heading.setForeground(new Color( 244	, 236	, 189));
        heading.setForeground(new Color(47,79,79));

        // heading 02
        JLabel welcome = new JLabel("Welcome");
        f.add(welcome);
        welcome.setBounds(370, 180, 1200, 80);
        welcome.setFont(new Font("serif", Font.BOLD, 50));
        welcome.setForeground(new Color(0,139,139));
      // welcome.setForeground(new Color( 244	, 236	, 189));




        //click here to login button
        JButton b=new JButton("Login to Click Here");
        b.setFont(new Font("Arial", Font.BOLD, 20));
        b.setBounds(370, 350, 230, 50);
        b.setBackground(new Color(65,105,225));
        b.setForeground(new Color(255,255,255));
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new SelectionPage();
                f.setVisible(false);
            }
        });
        f.add(b);

        //bgColor button
        JButton c=new JButton("<color>");
        c.setBounds(0, 0, 100, 25);
        c.setBackground(new Color(65,105,225));
        c.setForeground(Color.white);
        c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Color cc= JColorChooser.showDialog(null,"choose a color",Color.green);
                f.getContentPane().setBackground(cc);
            }
        });
        f.add(c);

        //developer info button
        JButton developerInfo=new JButton("Developer Info");
        developerInfo.setBounds(880, 0, 120, 25);
        developerInfo.setBackground(new Color(65,105,225));
        developerInfo.setForeground(Color.white);
        developerInfo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new DeveloperInformation();
                f.setVisible(false);


            }
        });
        f.add(developerInfo);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public static void main(String[] args) {
        new WelcomePage();
    }
}