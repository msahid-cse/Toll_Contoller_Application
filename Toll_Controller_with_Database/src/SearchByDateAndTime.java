
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
import net.proteanit.sql.DbUtils;


public class SearchByDateAndTime extends JFrame implements ActionListener {

    JScrollPane ScrollPanel;
    Choice Date_Time;
    JButton SearchButton, TablePrintButton, UpdateButton, backButton;
    JTable DataTable; //table


    public SearchByDateAndTime() {
        getContentPane().setBackground(Color.gray);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        //heading
        JLabel heading = new JLabel("COLLECTED TOLL RECORD DATABASE");
        add(heading);
        heading.setBounds(450, 10, 500, 50);
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
        JLabel DateTimeSearch = new JLabel("Search by Date and Time:");
        DateTimeSearch.setBounds(50, 75, 250, 35);
        DateTimeSearch.setFont(new Font("serif", Font.BOLD, 20));
        add(DateTimeSearch);


        Date_Time = new Choice();
        Date_Time.setBounds(300, 83, 250, 60);
        add(Date_Time);

        try {
            Conn ccc = new Conn();
            ResultSet AllEmployeeData = ccc.s.executeQuery("select * from info2");
            while(AllEmployeeData.next()){
                Date_Time.add(AllEmployeeData.getString("Date_t")); //find by
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


        //ScrollPanel
        ScrollPanel = new JScrollPane(DataTable);
        ScrollPanel.setBounds(10, 125, 1370, 600);
        add(ScrollPanel);


        //search
        SearchButton = new JButton(" Search ");
        SearchButton.setBounds(550, 80, 150, 25);
        add(SearchButton);
        SearchButton.setFont(new Font("serif", Font.BOLD, 15));
        SearchButton.setBackground(Color.BLACK);
        SearchButton.setForeground(Color.WHITE);
        SearchButton.addActionListener(this);                  // action


        //Print
        TablePrintButton = new JButton(" Print ");
        TablePrintButton.setBounds(750, 80, 150, 25);
        add(TablePrintButton);
        TablePrintButton.setFont(new Font("serif", Font.BOLD, 15));
        TablePrintButton.setBackground(Color.BLACK);
        TablePrintButton.setForeground(Color.WHITE);
        TablePrintButton.addActionListener(this);                  // action



        //Back
        backButton = new JButton(" Back ");
        backButton.setBounds(900, 80, 150, 25);
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

        if(ae.getSource() == SearchButton){
            //setVisible(false);
            String EmployeeSearchQuary = " select * from info2 where Date_t = '"+ Date_Time.getSelectedItem()+"'";

            try {
                Conn ccc = new Conn();
                ResultSet EmployeeData = ccc.s.executeQuery(EmployeeSearchQuary);
                DataTable.setModel(DbUtils.resultSetToTableModel(EmployeeData));


            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        else if (ae.getSource() == TablePrintButton) {

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
        new SearchByDateAndTime();
    }
}


