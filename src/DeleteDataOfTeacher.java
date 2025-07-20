
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDataOfTeacher {

    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/student_db";
        String user = "root";
        String password = "001906";

        // SQL delete query
        String query = "DELETE FROM employees WHERE id = 2";

        try {
            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            // Execute update
            int rowsAffected = stmt.executeUpdate(query); //insert,update, delete

            // Check results
            if (rowsAffected > 0) {
                System.out.println("Delete Successful. Rows affected: " + rowsAffected);
            } else {
                System.out.println("No matching record found. Delete skipped.");
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