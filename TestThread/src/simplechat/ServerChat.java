package simplechat;

import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {

    private static Socket clientSocket;
    private static ServerSocket serverSocket;
    private static BufferedReader bufferedReader;
    private static BufferedWriter bufferedWriter;

    public static void main(String[] args) throws IOException {
        serverSocket = new ServerSocket(8080);
        System.out.println("Server started");

        clientSocket = serverSocket.accept();

        bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        bufferedWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

        while (true) {
            String message = bufferedReader.readLine();
            System.out.println(message);
            bufferedWriter.write("You wrote: " + message + "\n");
            bufferedWriter.flush();

        }
//        clientSocket.close();
//        bufferedReader.close();
//        bufferedWriter.close();
//        System.out.println("Server stopped");
//        serverSocket.close();
    }
}
