import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TollRate extends JFrame implements ActionListener {

    TollRate(){
        JFrame frame= new JFrame("Toll Controller");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setBounds(200,60,1000,600);
        frame.getContentPane().setBackground(new Color(208, 189, 244));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //add back button
        JButton back= new JButton("Back");
        frame.add(back);
        back.setBounds(150,460,100,40);
        back.setVisible(true);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UserRegistration();
                frame.setVisible(false);
            }
        });


        JTextArea tollrate= new JTextArea();
        frame.add(tollrate);
        tollrate.setBounds(50,50,400,400);
        tollrate.setVisible(true);
        tollrate.setFont(new Font("serif", Font.BOLD, 20));
        tollrate.setBackground(new Color(208, 189, 244));
        tollrate.setText("Padma Bridge Toll Rate\n"+
                "Motorcycle - Tk100\n" +
                "Car/Jeep - Tk750\n" +
                "Pickup - Tk1,200\n" +
                "Microbus - Tk1,300\n" +
                "Minibus - Tk1,400\n" +
                "Medium bus - Tk2,000\n" +
                "Big bus - Tk2,400\n" +
                "Truck (upto 5 tonnes) - Tk1,600\n" +
                "Truck (5-8 tonnes) - Tk2,100\n" +
                "Truck (3 axle) - Tk5,500\n" +
                "Trailer (4 axle) - Tk6,000\n" +
                "Tailer (above 4 axle) - Tk6,000+");

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String args[]){
        new TollRate();
    }


}
