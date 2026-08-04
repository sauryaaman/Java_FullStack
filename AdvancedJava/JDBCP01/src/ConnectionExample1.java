import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample1 {
    static final String url= "jdbc:mysql://localhost:3306/spark6";
    static final String username= "root";
    static final String pass= "Aman@2004";

    public static void main(String[] args) {
     try
     {
        Connection con= DriverManager.getConnection(url,username,pass);
         System.out.println("conected db succesfully");
     } catch (Exception e) {
         System.out.println(e.getMessage());
     }
    }
}
