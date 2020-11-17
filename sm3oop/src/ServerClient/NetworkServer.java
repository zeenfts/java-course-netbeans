package ServerClient;

import java.net.*;
import java.io.*;

public class NetworkServer {

    private String inputLine;
    private String outputLine;
    private BufferedReader in;
    private ServerSocket serverSocket = null;
    private Socket clientSocket = null;
    private PrintWriter out = null;

    public static void main(String[] args) {
        NetworkServer server = new NetworkServer();
    }

    public NetworkServer() {
        try {
            doAll();
            in.close();
        }
        catch (IOException e) {
        }
    }

    public void doAll() throws IOException {
        serverSocket = new ServerSocket(4444);
        System.out.println("Server Socket Diinstanstiasi port " + serverSocket.getLocalPort());
        createConnection();
        readStream();
    }

    public void createConnection() throws IOException {
        clientSocket = serverSocket.accept();
        System.out.println("Request Diterima dari : " + clientSocket.getInetAddress().getHostName());
        System.out.println("Port client : " + clientSocket.getPort());
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public void readStream() throws IOException {
        while (true) {
            try {
                while ((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                    sendResponse(inputLine);
                }
            }
            catch (IOException e) {
                createConnection();
            }
        }
    }

    public void sendResponse(String input) throws IOException {
        String words = "Anda mengirim pesan " + input;
        out.println(words);
        clientSocket.close();
    }
}
