package Greatest_Integer_TCP;

import java.io.*;
import java.net.*;

public class Greatest_Integer_Server {
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
        int num2 = Integer.parseInt(clientInput.readLine());

        System.out.println("Received numbers: " + num1 + " and " + num2);

        // Find the greater number
        int max = Math.max(num1, num2);

        // Send a result back to a client
        serverOutput.println(max);

        socket.close();
        serverSocket.close();
    }
}
