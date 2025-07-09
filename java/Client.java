// File: ChatClient.java
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        System.out.println(" Connected to server!");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String messageFromServer, messageToServer;

        while (true) {
            System.out.print("Client: ");
            messageToServer = console.readLine();
            out.println(messageToServer);

            if (messageToServer.equalsIgnoreCase("exit")) {
                break;
            }

            messageFromServer = in.readLine();
            if (messageFromServer == null) break;

            System.out.println("Server: " + messageFromServer);
        }

        socket.close();
    }
}
