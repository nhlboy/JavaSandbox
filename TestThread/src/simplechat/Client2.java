package simplechat;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client2 {

    private static Socket clientSocket;
    private static BufferedReader consoleReader;
    private static BufferedReader bufferedReader;
    private static BufferedWriter bufferedWriter;

    public static void main(String[] args) throws IOException {

        clientSocket = new Socket("localhost", 8080);
        consoleReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        bufferedWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        System.out.println("Type a message: ");

        while(true) {
            String message = consoleReader.readLine();
            bufferedWriter.write(message + "\n");
            bufferedWriter.flush();
            String serverMessage = bufferedReader.readLine();
            System.out.println(serverMessage);
            System.out.println("End of transmission");
        }
//        clientSocket.close();
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
