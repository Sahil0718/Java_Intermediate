package UDP_Socket;//package UDP_Socket;
//
//import java.net.*;
//
//public class UDPServer {
//    public static void main(String[] args) {
//        try {
//            DatagramSocket socket = new DatagramSocket(9876); // Bind to port
//
//            byte[] sendData;
//            byte[] receiveData = new byte[1024];
//
//
//            System.out.println("UDP Server is running...");
//
//            while (true) {
//                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
//                socket.receive(receivePacket); // Receive incoming packet
//
//                String clientMsg = new String(receivePacket.getData(), 0, receivePacket.getLength());
//                System.out.println("Client says: " + clientMsg);
//
//                if (clientMsg.equalsIgnoreCase("exit")) {
//                    System.out.println("Client ended the chat.");
//                    break;
//                }
//
//                // Prepare reply because UDP is connectionless, so unlike TCP, the server has no ongoing session.
//                // The only way for the client to know the server got the message is if the server explicitly sends
//                // a response packet back.
//                String reply = "Server received: " + clientMsg;
//                sendData = reply.getBytes();
//
//                // Get client's IP and port
//                InetAddress clientAddress = receivePacket.getAddress();
//                int clientPort = receivePacket.getPort();
//
//                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
//                socket.send(sendPacket); // Send reply back to client
//            }
//
//            socket.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}


import java.io.*;
import java.net.*;
import java.util.Scanner;

public class UDPServer {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(9999);

            byte[] sendData;
            byte[] receiveData = new byte[1024];

            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);
                String client_msg = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("CLIENT MESSAGE: " + client_msg);

                if (client_msg.equalsIgnoreCase("exit")) {
                    System.out.println("CLIENT HAS ENDED THE CHAT!");
                    break;
                }

                //Sending the acknowledgement
                sendData = client_msg.getBytes();

                InetAddress clientAddress = receivePacket.getAddress();
                int port = receivePacket.getPort();

                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, port);
                socket.send(sendPacket);

            }
            socket.close();
        } catch (Exception e) {
            System.out.println("ERROR: "+ e.getMessage());
        }
    }
}






































