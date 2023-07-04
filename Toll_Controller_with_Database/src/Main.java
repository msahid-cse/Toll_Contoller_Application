import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    static Statement s;
    static Connection c;
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

    }
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/oopsql","root","01641658965aA@");
            s=c.createStatement();

//            System.out.println(con);

        }
        catch (Exception e){

        }
        return null;
    }
}