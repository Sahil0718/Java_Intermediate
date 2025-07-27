package TCP_Socket;

import java.io.*;
import java.net.*;
//
/// /Two-Way Socket Programming in Java (Communication is bi-directional.)
//public class SocServer_TCP {
//    public static void main(String[] args) throws Exception {
//        ServerSocket serverSocket = new ServerSocket(9999);
//        System.out.println("Server started. Waiting for client...");
//
//        Socket socket = serverSocket.accept();
//        System.out.println("Client connected!");
//
//        // Setup input and output streams
//        BufferedReader clientInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        //to read incoming messages from the client through the socket's input stream.
//        PrintWriter serverOutput = new PrintWriter(socket.getOutputStream(), true);
////to the client via the socket's output stream.
//
//        // To send from server (keyboard input)
//        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

////Wraps InputStreamReader inside BufferedReader for efficient reading, especially useful for reading lines of text.
//        String clientMsg, serverMsg;
//
//        while (true) {
//            // Receive from client
//            clientMsg = clientInput.readLine(); // Wait to receive a message from the client
//            if (clientMsg.equalsIgnoreCase("exit")) {
//                System.out.println("Client ended the chat.");
//                break;
//            }
//            System.out.println("Client: " + clientMsg);
//
//            // Send to client
//            System.out.print("Server: ");
//            serverMsg = keyboard.readLine(); //Prompt the server user to type a reply
//            serverOutput.println(serverMsg);
//
//            if (serverMsg.equalsIgnoreCase("exit")) {
//                break;
//            }
//        }
//
//        socket.close();
//        serverSocket.close();
//    }
//}


public class SocServer_TCP {
    public static void main(String[] args) throws Exception {
        int port = 9999;
        ServerSocket ss = new ServerSocket(port);

        System.out.println("SERVER CONNECTION HAS BEEN ESTABLISHED!");

        Socket s = ss.accept();//waits here
        System.out.println("SERVER IS WAITING FOR THE CLIENT REQUEST!");

        //setting up input and output streams
        BufferedReader clientInput = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter serverOutput = new PrintWriter(s.getOutputStream(),true);

        //send the keyboard input to client
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        String clientMsg, serverMsg;
        //Receiving from the client
        while (true) {
            clientMsg = clientInput.readLine();
            if (clientMsg.equalsIgnoreCase("exit")) {
                System.out.println("CLIENT HAS EXITED THE CHAT!");
                break;
            }
            System.out.println("CLIENT: " + clientMsg);

            //Sending to the client
            System.out.println("SERVER:");
            serverMsg = keyboard.readLine();
            serverOutput.println(serverMsg);

            if (serverMsg.equalsIgnoreCase("exit")) {
                break;
            }
        }
        s.close();
        ss.close();

    }
}
























