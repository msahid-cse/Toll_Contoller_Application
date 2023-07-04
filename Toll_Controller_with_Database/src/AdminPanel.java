import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AdminPanel extends JFrame implements ActionListener{
    AdminPanel(){

        //create new frame
        JFrame frame3=new JFrame("Toll Controller");
        frame3.setLayout(null);
        frame3.getContentPane().setBackground(Color.cyan);
        frame3.setSize(1000, 600);
        frame3.setLocation(200, 60);
        frame3.setVisible(true);
        frame3.setResizable(false);
        frame3.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //add color button
        JButton c=new JButton("<BG color>");
        c.setBounds(900, 0, 100, 20);
        c.setFont(new Font("Arial", Font.BOLD, 12));
        c.setBackground(new Color(0,139,139));
        c.setForeground(Color.white);
        c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Color cc= JColorChooser.showDialog(null,"choose a color",Color.green);
                frame3.getContentPane().setBackground(cc);
            }
        });
        frame3.add(c);

        //add back button
        JButton Back = new JButton("< Back");
        Back.setFont(new Font("Arial", Font.BOLD, 20));
        Back.setBounds(0, 0, 100, 25);
        Back.setBackground(new Color(0,139,139));
        Back.setForeground(Color.white);
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new SelectionPage();
                frame3.setVisible(false);

            }
        });
        frame3.add(Back);

        //heading 01
        JLabel heading = new JLabel("----->Admin Panel<-----");
        frame3.add(heading);
        heading.setBounds(300, 50, 400, 60);
        heading.setFont(new Font("Arial", Font.BOLD, 30));
        heading.setForeground(Color.gray);

        //collect toll button
        JButton payment=new JButton("Collect Toll");
        payment.setFont(new Font("serif", Font.BOLD, 20));
        payment.setBounds(350, 150, 230, 50);
        payment.setBackground(new Color(0,139,139));
        payment.setForeground(Color.white);
        payment.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //   new OfflinePayment();
                new CashPayment();
                //new WelcomePage();
                frame3.setVisible(false);

            }
        });
        frame3.add(payment);

        //More button

        JButton more=new JButton("More...");
        more.setFont(new Font("serif", Font.BOLD, 20));
        more.setBounds(350, 210, 230, 50);
        more.setBackground(new Color(0,139,139));
        more.setForeground(Color.white);
        more.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new MoreOption();
//                new WelcomePage();
                frame3.setVisible(false);

            }
        });
        frame3.add(more);





    }

    public static void main(String args[]){
        AdminPanel frame= new AdminPanel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}