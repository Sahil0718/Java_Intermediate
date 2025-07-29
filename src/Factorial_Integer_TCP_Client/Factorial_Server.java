package Factorial_Integer_TCP_Client;

import java.io.*;
import java.net.*;

public class Factorial_Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Server started. Waiting for client...");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected!");

        // Setup input/output streams
        BufferedReader clientInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter serverOutput = new PrintWriter(socket.getOutputStream(), true);

        // Receive two integers from the client
        int num1 = Integer.parseInt(clientInput.readLine());


        System.out.println("Received numbers: " + num1);

        // Find the factorial of a  number
        long factorial = 1;
        for(int i = 2; i<= num1; i++){
            factorial *= i;
        }

        // Send a result back to a client
        serverOutput.println(factorial);

        socket.close();
        serverSocket.close();
    }
}
