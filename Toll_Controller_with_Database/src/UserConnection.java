import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UserConnection {
    Connection c;
    Statement s;
    public UserConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql:///mydb","root","SAHID@011235#sql");
            s=c.createStatement();
        }
        catch (Exception e){

        }
    }
}
