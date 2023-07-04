import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class income extends JFrame {
   JTable table;
    income(){

        getContentPane().setBackground(Color.white);
     table=new JTable();
        setSize(400,300);
        setLocation(400,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        try
        {
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from income");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception ee){
            ee.printStackTrace();
        }
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(400,100,300,500);
        add(jsp);
        //MoreOption m=new MoreOption();
       // m.setVisible(true);
    }
    public static void main(String[] args) {

        new income();
    }
}
