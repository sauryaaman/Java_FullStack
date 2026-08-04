import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionExample {
    private static String URL ="jdbc:mysql://localhost:3306/spark6";
    private static String USERNAME="root";
    private static final String PASSWORD= "Aman@2004";
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  //1.7 se phle   but abhi sdj smart ho gya hia  srif library  install krneke  jvm automatic leleta hia  class driver ka
            Connection con= DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Database Connected Succesfully");
            con.close();
        }
        catch(ClassNotFoundException e){
            System.out.println("mysql driver not found");
            e.printStackTrace();
        }
        catch (SQLException e)
        {
            System.out.println("database coonectionn problem");
        }

    }
}
