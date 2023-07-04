import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.sql.ResultSet;

public class DATABASE extends JFrame {
    JTable table;
    JLabel label;
    DATABASE(){

        getContentPane().setBackground(Color.white);
        table=new JTable();
        table.setBounds(0,100,250,50);

        setSize(700,700);
        setLocation(300,100);
        setTitle("CAR INFORMATION");
        setVisible(true);
        label=new JLabel("ALL INFORMATION");
        label.setBounds(300,50,250,50);
//        add(label);
        try
        {
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from info2");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception ee){
            ee.printStackTrace();
        }
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(400,100,500,500);
        add(jsp);
    }
    public static void main(String[] args) {
        new income();
    }
}
