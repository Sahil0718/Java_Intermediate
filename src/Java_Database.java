import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;


public class Java_Database {
    public static void main(String[] args) {
        //Database URL, username and password
        String url = "jdbc:mysql://localhost:3306/javadatabase";
        String user = "root";
        String password = "001906";

        try {
            //Load and register JDBC driver for MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Openning up a connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Successful!");
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }
    }
}
