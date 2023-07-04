
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
import net.proteanit.sql.DbUtils;


public class DatabaseOfCollectedTollRecord extends JFrame implements ActionListener {

    JScrollPane ScrollPanel;
    Choice LicenseNumber;
    JButton SearchButton, TablePrintButton, UpdateButton, backButton;
    JTable DataTable; //table


    public DatabaseOfCollectedTollRecord() {
        getContentPane().setBackground(Color.gray);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        //heading
        JLabel heading = new JLabel("COLLECTED TOLL RECORD DATABASE");
        add(heading);
        heading.setBounds(500, 10, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 20));
        heading.setForeground(Color.BLACK);


        DataTable = new JTable();
        try {
            Conn ccc = new Conn();
            ResultSet AllEmployeeData = ccc.s.executeQuery("select * from info2");
            DataTable.setModel(DbUtils.resultSetToTableModel(AllEmployeeData));
        } catch (Exception e) {
            e.printStackTrace();
        }


        //Search
       /* JLabel EmployeeSearch = new JLabel("Search by License Number:");
        EmployeeSearch.setBounds(20, 75, 250, 35);
        EmployeeSearch.setFont(new Font("serif", Font.BOLD, 20));
        add(EmployeeSearch);


        LicenseNumber = new Choice();
        LicenseNumber.setBounds(300, 83, 150, 60);
        add(LicenseNumber);

        try {
            Conn ccc = new Conn();
            ResultSet AllEmployeeData = ccc.s.executeQuery("select * from info2");
            while(AllEmployeeData.next()){
                LicenseNumber.add(AllEmployeeData.getString("License_no")); //find by
            }


        } catch (Exception e) {
            e.printStackTrace();
        }*/


        //ScrollPanel
        ScrollPanel = new JScrollPane(DataTable);
        ScrollPanel.setBounds(10, 125, 1370, 600);
        add(ScrollPanel);


        //search
        /*SearchButton = new JButton(" Search ");
        SearchButton.setBounds(460, 80, 150, 25);
        add(SearchButton);
        SearchButton.setFont(new Font("serif", Font.BOLD, 15));
        SearchButton.setBackground(Color.BLACK);
        SearchButton.setForeground(Color.WHITE);
        SearchButton.addActionListener(this);         */         // action


        //Print
        TablePrintButton = new JButton(" Print ");
        TablePrintButton.setBounds(570, 80, 150, 25);
        add(TablePrintButton);
        TablePrintButton.setFont(new Font("serif", Font.BOLD, 15));
        TablePrintButton.setBackground(Color.BLACK);
        TablePrintButton.setForeground(Color.WHITE);
        TablePrintButton.addActionListener(this);                  // action



        //Back
        backButton = new JButton(" Back ");
        backButton.setBounds(750, 80, 150, 25);
        add(backButton);
        backButton.setFont(new Font("serif", Font.BOLD, 15));
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(this);                  // action


        //fream
        setSize(1350, 600);
        setLocation(0, 60);
        setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent ae) {

      /*  if(ae.getSource() == SearchButton){
            //setVisible(false);
            String EmployeeSearchQuary = " select * from info2 where License_no = '"+ LicenseNumber.getSelectedItem()+"'";

            try {
                Conn ccc = new Conn();
                ResultSet EmployeeData = ccc.s.executeQuery(EmployeeSearchQuary);
                DataTable.setModel(DbUtils.resultSetToTableModel(EmployeeData));


            } catch (Exception e) {
                e.printStackTrace();
            }

        }*/
        if (ae.getSource() == TablePrintButton) {

            try {
                DataTable.print();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        else if (ae.getSource() == backButton) {
            setVisible(false);
            new MoreOption();
          //  moreOption.setVisible(true);
        }
    }


    public static void main(String[] args){
        new DatabaseOfCollectedTollRecord();
    }
}


