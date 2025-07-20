

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDataOfTeacherExample {

    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306";
        String user = "root";
        String password = "001906";

        // SQL Update query
        String query = "UPDATE employees SET salary = 30000 WHERE id = 1";

        try {
            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("DBConnection successful!");
            Statement stmt = conn.createStatement();

            // Execute update
            int rowsAffected = stmt.executeUpdate(query);

            // Check result
            if (rowsAffected > 0) {
                System.out.println("Update Successful. Rows affected: " + rowsAffected);
            } else {
                System.out.println("Update Failed or no rows matched.");
            }

            // Close resources
            stmt.close();
            conn.close();
            System.out.println("DBConnection closed successfully.");

        } catch (SQLException e) {
            System.out.println("SQL Exception occurred.");
            e.printStackTrace();
        }
    }
}