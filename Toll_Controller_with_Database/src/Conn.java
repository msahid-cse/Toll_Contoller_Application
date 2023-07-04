import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql:///toolcontroller","root","SAHID@011235#sql");
s=c.createStatement();
        }
        catch (Exception e){

        }
    }
}
