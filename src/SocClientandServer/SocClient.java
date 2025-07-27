//package SocClientandServer;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.net.Socket;
//
//public class SocClient {
//    public static void main(String[] args) {
//        try {
//            Socket s = new Socket("localhost", 9999);
//            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
//            //This is the stream you write to in order id to send data from client to server.
//            //The second argument, true, means an auto flush is enabled. This is important in network programming, so your
//            //message is seen
//            out.println("Sahil Bhattarai");
//            out.println("Hello Server!");
//            out.println("This is a one way message");
//            out.println("BYE BYE!");
//            s.shutdownOutput(); //Tell server that we are done
//            //I'm done sending data - no more bytes will be sent to the server
//            s.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
package SocClientandServer;

import java.io.*;
import java.net.*;

public class SocClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 9999);

            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

            out.println("HELLO MY NAME IS SAHIL!");
            out.println("K CHA SERVER HALKHABAR ?");

            s.shutdownOutput();
            s.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}




































