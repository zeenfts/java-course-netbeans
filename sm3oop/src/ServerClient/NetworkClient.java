package ServerClient;

import java.net.*;
import java.io.*;

public class NetworkClient {

    private Socket socket = null;
    private PrintWriter out = null;
    private BufferedReader in = null;
    private BufferedReader stdIn = null;
    private String userInput;
    private BufferedReader responseReader = null;

    public static void main(String[] args) {
        NetworkClient client = new NetworkClient();
    }

    public NetworkClient() {
        try {
            doAll();
        }
        catch (UnknownHostException e) {
            e.getMessage();
            e.printStackTrace();
        }
        catch (IOException e2) {
            e2.getMessage();
            e2.printStackTrace();
        }
    }

    private void createConnection() throws IOException, UnknownHostException {
        socket = new Socket("167.205.66.5", 4444, InetAddress.getByName("167.205.66.4"), 3333);
        System.out.println("Membangun Koneksi : ");
        System.out.println("Local Address : " + socket.getLocalAddress());
        System.out.println("Local Port Number : " + socket.getLocalPort());
        System.out.println("Remote Address " + socket.getInetAddress().getHostAddress());
        System.out.println("Remote Port Number " + socket.getPort());
        System.out.println("========================\n");
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        stdIn = new BufferedReader(new InputStreamReader(System.in));
    }

    public void doAll() throws IOException, UnknownHostException {
        createConnection();
        System.out.print("Masukkan Input / Request : ");
        while ((userInput = stdIn.readLine()) != null) {
            out.println(userInput);
            receive();
            createConnection();
        }
    }

    public void receive() throws IOException {
        String nextLine = in.readLine();
        System.out.println("\n\nMenerima Respons dari : ");
        System.out.println("Remote Address " + socket.getInetAddress().getHostAddress());
        System.out.println("Remote Port Number " + socket.getPort());
        System.out.print("Isi Respons : ");
        System.out.println(nextLine);
        System.out.println("=====================\n");
        socket.close();
    }
}
