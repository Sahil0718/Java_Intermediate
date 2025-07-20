//import java.net.URL;
//import java.util.Scanner;
//
//public class URL_Parser {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("ENTER A URL: ");
//        String urlstring = scanner.nextLine();
//
//        try {
//            //Create a URL Object
//            URL url = new URL(urlstring);
//
//            //Display different parts of the URL
//            System.out.println("Protocol: " + url.getProtocol());
//            System.out.println("Host: " + url.getHost());
//
//            int port = url.getPort();
//            if (port == -1) {
//                System.out.println("PORT: (Default or not specified)");
//            } else {
//                System.out.println("PORT: " + port);
//            }
//            System.out.println("Path: " + url.getPath());
//            System.out.println("Authority: "+url.getAuthority());
//
//            String query = url.getQuery();
//            if (query != null) {
//                System.out.println("QUERY: " + query);
//            } else {
//                System.out.println("QUERY:(none)");
//            }
//        } catch (Exception e) {
//            System.out.println("INVALID URL! PLEASE MAKE SURE THE FORMAT IS CORRECT");
//        }
//        scanner.close();
//
//    }
//}

import java.net.URL;
import java.sql.SQLOutput;
import java.util.Scanner;

public class URL_Parser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);https://chatgpt.com/c/68767424-f468-8007-b4d3-53fa8c108a17
        try {


            System.out.println("ENTER THE URL:");
            String urlstring = scanner.nextLine();

            //Creating a URL Object
            URL url = new URL(urlstring);

            //Displaying different parts of the URL
            System.out.println("PATH: " + url.getPath());
            System.out.println("HOST:" + url.getHost());

            int urlport = url.getPort();
            if (urlport == -1) {
                System.out.println("DEFAULT OR NOT SPECIFIED!");
            } else {
                System.out.println("PORT: " + urlport);
            }
            System.out.println("AUTHORITY: " + url.getAuthority());
            String urlquery = url.getQuery();
            if (urlquery != null) {
                System.out.println("QUERY: " + urlquery);
            } else {
                System.out.println("QUERY(NONE)");
            }

        } catch (Exception e){
            System.out.println("INVALID URL!");
        }
        scanner.close();
    }
}















