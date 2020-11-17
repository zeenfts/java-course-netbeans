package BukuPraktikum7;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatClientOutput extends JFrame{
    protected JTextArea taOutRoom;
    private JScrollPane scrTa;
    protected JTextField tfOutRoom;
    private JPanel panelAtas,panelAtas2, panelBawah;
    protected String outputLine;
    private BufferedReader brServer = null;
    private ServerSocket serverSocket = null;
    private Socket clSocket = null;
    
    public ChatClientOutput() {
        launchOutputFrame();
        try {
            koneksiServer();
        }
        catch (IOException ex) {
        }
    }
    
    private void launchOutputFrame(){
        setTitle("Chat Room Server");
        setLayout(new BorderLayout(1, 1));
        setResizable(false);
        setLocation(260, 350);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(670, 300);
        
        panelAtas = new JPanel(new GridLayout(1, 1));
        taOutRoom = new JTextArea(10, 50);
        scrTa = new JScrollPane(taOutRoom);
        scrTa.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrTa.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panelAtas2 = new JPanel(new GridLayout(6, 1));
        panelBawah = new JPanel(new FlowLayout());
        tfOutRoom = new JTextField(50);
        tfOutRoom.setFont(new Font("Times New Roman", Font.ITALIC, 17));
        
        panelAtas.add(scrTa);
        panelBawah.add(tfOutRoom);
        add(panelAtas, BorderLayout.CENTER);
        add(panelAtas2, BorderLayout.EAST);
        add(panelBawah, BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatClientOutput().setVisible(true);
            }
        });
    }
    
    private void koneksiServer() throws IOException{
        serverSocket = new ServerSocket(6666);
        clSocket = serverSocket.accept();
        brServer = new BufferedReader(new InputStreamReader(clSocket.getInputStream()));
        outputLine = brServer.readLine();
    }

}
