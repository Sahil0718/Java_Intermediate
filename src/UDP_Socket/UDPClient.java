package UDP_Socket;

//import java.net.*;
//import java.util.Scanner;
//
//public class UDPClient {
//    public static void main(String[] args) {
//        try {
//            DatagramSocket socket = new DatagramSocket();
//            InetAddress serverAddress = InetAddress.getByName("localhost");
//            Scanner sc = new Scanner(System.in);
//
//            byte[] sendData;
//            byte[] receiveData = new byte[1024];
//
//            while (true) {
//                System.out.print("Client: ");
//                String msg = sc.nextLine();
//                sendData = msg.getBytes();
//
//                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 9876);
//                socket.send(sendPacket); // Send message to server
//
//                if (msg.equalsIgnoreCase("exit")) {
//                    break;
//                }
//
//                // Receive server response
//                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
//                socket.receive(receivePacket);
//                String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
//                System.out.println("Server: " + response);
//            }
//
//            socket.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}


import java.io.*;
import java.util.Scanner;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");
            Scanner sc = new Scanner(System.in);

            byte[] sendData;
            byte[] receiveData = new byte[1024];

            while (true) {
                System.out.println("CLIENT:");
                String message = sc.nextLine();
                sendData = message.getBytes();

                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 9999);
                socket.send(sendPacket);

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }

                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);
                String serverMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("SERVER MESSAGE: " + serverMessage);
            }

        } catch (Exception e) {
            System.out.println("ERROR : " + e.getMessage());
        }
    }
}


































