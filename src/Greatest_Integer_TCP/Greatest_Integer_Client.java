package Greatest_Integer_TCP;

import java.io.*;
import java.net.*;

public class Greatest_Integer_Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 9999);
        System.out.println("Connected to server.");

        // Setup input/output streams
        BufferedReader serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter clientOutput = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Take two integers from user
        System.out.print("Enter first integer: ");
        int num1 = Integer.parseInt(keyboard.readLine());

        System.out.print("Enter second integer: ");
        int num2 = Integer.parseInt(keyboard.readLine());

        // Send both integers to the server
        clientOutput.println(num1);
        clientOutput.println(num2);

        // Receive the greatest number from server
        String response = serverInput.readLine();
        System.out.println("Greatest number is: " + response);

        socket.close();
    }
}



















