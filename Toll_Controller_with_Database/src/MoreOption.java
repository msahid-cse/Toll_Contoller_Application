import com.sun.jdi.Field;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static java.lang.System.exit;

public class MoreOption extends JFrame implements ActionListener {
//   private JPanel jp;
   private JTable table;
    JButton online_payment, cashPayment;
    MoreOption() {
        table=new JTable();
        table.setBounds(0,10,200,200);
        JFrame frame5 = new JFrame("Toll Controller");
        frame5.setLayout(null);
        frame5.setSize(1000, 600);
        frame5.setLocation(200, 60);
        frame5.getContentPane().setBackground(Color.cyan);
        frame5.setVisible(true);
        frame5.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame5.setResizable(false);

//    jp=new JPanel();
//    jp.setSize(300,500);
//    jp.setBounds(500,100,300,400);
//    frame5.add(jp);
        //color
        JButton c = new JButton("<BG color>");
        c.setBounds(900, 0, 100, 25);
        c.setFont(new Font("Arial", Font.BOLD, 12));
        c.setBackground(new Color(0,139,139));
        c.setForeground(Color.white);
        c.addActionListener(e -> {
            Color cc = JColorChooser.showDialog(null, "choose a color", Color.green);
            frame5.getContentPane().setBackground(cc);
        });
        frame5.add(c);

        //heading 01
        JLabel heading = new JLabel("----->Admin Panel<-----");
        frame5.add(heading);
        heading.setBounds(300, 10, 400, 60);
        heading.setFont(new Font("Arial", Font.BOLD, 30));
        heading.setForeground(Color.BLACK);

        //back
        JButton Back = new JButton("< Back");
        Back.setFont(new Font("serif", Font.BOLD, 20));
        Back.setBounds(0, 0, 100, 25);
        Back.setBackground(new Color(0,139,139));
        Back.setForeground(Color.white);
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AdminPanel();
                //new WelcomePage();
                frame5.setVisible(false);
            }
        });
        frame5.add(Back);

        //Total Income
        JButton TotalIincome = new JButton("Total Income");
        TotalIincome.setFont(new Font("serif", Font.BOLD, 20));
        TotalIincome.setBounds(50, 152, 230, 50);
        TotalIincome.setBackground(new Color(0,139,139));
        TotalIincome.setForeground(Color.white);
        TotalIincome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                       // new income();
                JOptionPane.showMessageDialog(null,"Work in Progress\n Because, for this section need Relational Database Management System (RDMS)","Warning",0);

            }
        });
        frame5.add(TotalIincome);

        //Total Vehicel
        JButton TotalVehicle = new JButton("Total Vehicle");
        TotalVehicle.setFont(new Font("serif", Font.BOLD, 20));
        TotalVehicle.setBounds(50, 101, 230, 50);
        TotalVehicle.setBackground(new Color(0,139,139));
        TotalVehicle.setForeground(Color.white);
        TotalVehicle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                       // new totalcar();
                JOptionPane.showMessageDialog(null,"Work in Progress\n Because, for this section need Relational Database Management System (RDMS)","Warning",0);

            }
        });
        frame5.add(TotalVehicle);


        JButton ONLINE = new JButton("Online User Record");
        ONLINE.setVisible(false);
        ONLINE.setFont(new Font("serif", Font.BOLD, 20));
        ONLINE.setBounds(300, 254, 230, 50);
        ONLINE.setBackground(new Color(0,139,139));
        ONLINE.setForeground(Color.white);
        frame5.add(ONLINE);
        ONLINE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DatabaseOFOnlineUserRecord databaseOFOnlineUserRecord = new DatabaseOFOnlineUserRecord();
                databaseOFOnlineUserRecord.setVisible(true);
                frame5.setVisible(false);

            }
        });



        JButton OFFLINE = new JButton("Toll Collection Record");
        OFFLINE.setFont(new Font("serif", Font.BOLD, 20));
        OFFLINE.setBounds(550, 254, 230, 50);
        OFFLINE.setBackground(new Color(0,139,139));
        OFFLINE.setForeground(Color.white);
        frame5.add(OFFLINE);
        OFFLINE.setVisible(false);
        OFFLINE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FindOfflinePaymentData dd=new FindOfflinePaymentData();
                dd.setVisible(true);
                frame5.setVisible(false);

            }
        });

        JButton SearchByTimeAndDate = new JButton("SearchByTimeAndDate");
        SearchByTimeAndDate.setVisible(false);
        SearchByTimeAndDate.setFont(new Font("serif", Font.BOLD, 15));
        SearchByTimeAndDate.setBounds(300, 203, 230, 50);
        SearchByTimeAndDate.setBackground(new Color(0,139,139));
        SearchByTimeAndDate.setForeground(Color.white);
        frame5.add(SearchByTimeAndDate);
        SearchByTimeAndDate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SearchByDateAndTime timeAndDate= new SearchByDateAndTime();
             timeAndDate.setVisible(true);
                frame5.setVisible(false);

            }
        });



        JButton SearchByLicenseNumber = new JButton("SearchByLicenseNumber");
        SearchByLicenseNumber.setFont(new Font("serif", Font.BOLD, 15));
        SearchByLicenseNumber.setBounds(550, 203, 230, 50);
        SearchByLicenseNumber.setBackground(new Color(0,139,139));
        SearchByLicenseNumber.setForeground(Color.white);
        frame5.add(SearchByLicenseNumber);
        SearchByLicenseNumber.setVisible(false);
        SearchByLicenseNumber.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SearchByLicenseNumber searchByLicenseNumber= new SearchByLicenseNumber();
                searchByLicenseNumber.setVisible(true);
                frame5.setVisible(false);

            }
        });




        //Search
        JButton Search = new JButton("Search");
        Search.setFont(new Font("serif", Font.BOLD, 20));
        Search.setBounds(50, 203, 230, 50);
        Search.setBackground(new Color(0,139,139));
        Search.setForeground(Color.white);
        Search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        //     FindOfflinePaymentData findOnlinePaymentData =new FindOfflinePaymentData();
          //   findOnlinePaymentData.setVisible(true);
           //     frame5.setVisible(false);
                SearchByTimeAndDate.setVisible(true);
                SearchByLicenseNumber.setVisible(true);
                ONLINE.setVisible(false);
                OFFLINE.setVisible(false);
                online_payment.setVisible(false);
               cashPayment.setVisible(false);

            }
        });
        frame5.add(Search);

        //database
        JButton Database = new JButton("Database");
        Database.setFont(new Font("serif", Font.BOLD, 20));
        Database.setBounds(50, 254, 230, 50);
        Database.setBackground(new Color(0,139,139));
        Database.setForeground(Color.white);
        Database.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //  new OfflinePayment();
                //new WelcomePage();
                ONLINE.setVisible(true);
                OFFLINE.setVisible(true);
                SearchByTimeAndDate.setVisible(false);
                SearchByLicenseNumber.setVisible(false);
                online_payment.setVisible(false);
                cashPayment.setVisible(false);

//                DATABASE d=new DATABASE();
//                d.setVisible(true);
//                frame5.setVisible(false);

            }
        });
        frame5.add(Database);

        //Find
        JButton find = new JButton("Find");
        frame5.add(find);
        find.setFont(new Font("serif", Font.BOLD, 20));
        find.setBounds(50, 305, 230, 50);
        find.setBackground(new Color(0,139,139));
        find.setForeground(Color.white);
        find.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                online_payment.setVisible(true);
                cashPayment.setVisible(true);
                ONLINE.setVisible(false);
                OFFLINE.setVisible(false);
                SearchByTimeAndDate.setVisible(false);
                SearchByLicenseNumber.setVisible(false);

            }
        });

        online_payment = new JButton("Online Payment");
        frame5.add(online_payment);
        online_payment.setVisible(false);
        online_payment.setFont(new Font("serif", Font.BOLD, 20));
        online_payment.setBounds(300, 305, 230, 50);
        online_payment.setBackground(new Color(0,139,139));
        online_payment.setForeground(Color.white);
        online_payment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new FindOnlinePaymentData();
                frame5.setVisible(false);

            }
        });



        cashPayment = new JButton("Cash Payment");
        frame5.add(cashPayment);
        cashPayment.setFont(new Font("serif", Font.BOLD, 20));
        cashPayment.setBounds(550, 305, 230, 50);
        cashPayment.setBackground(new Color(0,139,139));
        cashPayment.setForeground(Color.white);
        cashPayment.setVisible(false);
        cashPayment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               new FindOfflinePaymentData();
               // dd.setVisible(true);
                frame5.setVisible(false);

            }
        });

        //exit
        JButton exit = new JButton("Exit");
        exit.setFont(new Font("serif", Font.BOLD, 20));
        exit.setBounds(50, 356, 230, 50);
        exit.setBackground(new Color(0,139,139));
        exit.setForeground(Color.white);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //  new OfflinePayment();
                //new WelcomePage();
                System.exit(0);
                frame5.setVisible(false);

            }
        });
        frame5.add(exit);

    }
    public static void main(String args[]){

        new MoreOption();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}