//import org.w3c.dom.ls.LSOutput;
//
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.io.*;
//import java.net.*;
//
//public class SocServer {
//    public static void main(String[] args) throws Exception {
//        int port = 9999;
//
//        System.out.println("Server has been started!");
//
//        ServerSocket ss = new ServerSocket(port);
//        System.out.println("Server is waiting for client request!");
//
//        Socket s = ss.accept(); //Waits here
//        System.out.println("Client Connected!");
//
//        //Reads the data from the client
//        //Wraps it in an InputStreamReader and then a Buffered Reader to read text lines easily
//        BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
//
//        String message;
//        while ((message = reader.readLine()) != null) {
//            System.out.println("Received: " + message);
//        }
//        //The loop continues until the client closes the output stream (or socket), causing the readLine() to return Null
//
//        s.close();
//        ss.close();
//        //Closes the client socket and the server socket, releasing the sources and ending the program
//        System.out.println("Connection Closed!");
//    }
//}

import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;

public class SocServer {
    public static void main(String[] args) {
        int port = 9999;
        System.out.println("Server has been started!");
        ServerSocket ss = new ServerSocket(port);
        System.out.println("WAITING FOR THE CLIENT REQUEST!");

        Socket s = ss.accept();
        System.out.println("CONNECTION WITH CLIENT ESTABLISHED!");

        BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String message;
        while (message = reader.readLine() != null) {
            System.out.println("MESSAGE: " + message);
        }
        s.close();
        ss.close();
    }
}





































