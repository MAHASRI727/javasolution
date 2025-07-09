// File: ChatServer.java
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println(" Server started. Waiting for client...");

        Socket socket = serverSocket.accept();
        System.out.println(" Client connected!");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String messageFromClient, messageToClient;

        while (true) {
            messageFromClient = in.readLine();
            if (messageFromClient == null || messageFromClient.equalsIgnoreCase("exit")) {
                System.out.println("Client disconnected.");
                break;
            }
            System.out.println("Client: " + messageFromClient);

            System.out.print("Server: ");
            messageToClient = console.readLine();
            out.println(messageToClient);
        }

        socket.close();
        serverSocket.close();
    }
}
