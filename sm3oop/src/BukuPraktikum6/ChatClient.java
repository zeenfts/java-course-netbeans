package BukuPraktikum6;
import javax.swing.*;
import java.awt.*;

public class ChatClient extends JFrame{
    private JTextArea taChRoom;
    private JScrollPane scrTa;
    private JTextField tfChRoom;
    private JButton btnKirim, btnKeluar;
    private JPanel panelAtas,panelAtas2, panelBawah;

    public ChatClient() {
        launchFrame();
    }
    
    private void launchFrame(){
        setTitle("Chat Room");
        setLayout(new BorderLayout(1, 1));
        setResizable(false);
        setLocation(250, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(530, 300);
        
        panelAtas = new JPanel(new GridLayout(1, 1));
        taChRoom = new JTextArea(10, 50);
        scrTa = new JScrollPane(taChRoom);
        scrTa.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrTa.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panelAtas2 = new JPanel(new GridLayout(7, 1));
        btnKirim = new JButton("Send");
        btnKeluar = new JButton("Quit");
        panelBawah = new JPanel(new FlowLayout());
        tfChRoom = new JTextField(50);
        
        panelAtas.add(scrTa);
        panelAtas2.add(btnKirim);
        panelAtas2.add(btnKeluar);
        panelBawah.add(tfChRoom);
        add(panelAtas, BorderLayout.CENTER);
        add(panelAtas2, BorderLayout.EAST);
        add(panelBawah, BorderLayout.SOUTH);
    }
    
    

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatClient().setVisible(true);
            }
        });
    }
    
}
