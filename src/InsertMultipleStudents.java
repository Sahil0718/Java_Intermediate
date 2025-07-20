import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertMultipleStudents {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/studentdb";
        String user = "root";
        String password = "001906";

        String insertSQL = "INSERT INTO studentLibrary(name, age, gender, address, phone, email, enrollment) values (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

            // First student
            pstmt.setString(1, "Sahil Bhattarai");
            pstmt.setInt(2, 22);
            pstmt.setString(3, "male");
            pstmt.setString(4, "Budhanilkantha");
            pstmt.setString(5, "9867575644");
            pstmt.setString(6, "sahil.bhattarai46@gmail.com");
            pstmt.setDate(7, java.sql.Date.valueOf("2020-01-01"));
            pstmt.addBatch();

            // Second student
            pstmt.setString(1, "Pranawa K.C");
            pstmt.setInt(2, 10);
            pstmt.setString(3, "female");
            pstmt.setString(4, "Bansbari");
            pstmt.setString(5, "9841309491");
            pstmt.setString(6, "pranawakc96@gmail.com");
            pstmt.setDate(7, java.sql.Date.valueOf("2023-01-01"));
            pstmt.addBatch();

            int[] results = pstmt.executeBatch();
            System.out.println(results.length + " records inserted successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}