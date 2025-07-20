public class SQLConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connection Successful!");
        } catch (ClassNotFoundException e) {
            System.out.println("Connection Failed!");
        }
    }
}
