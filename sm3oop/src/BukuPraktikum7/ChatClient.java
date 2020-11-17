package BukuPraktikum7;
import javax.swing.*;
import java.awt.*;

public class ChatClient extends JFrame{
    private ChatClientHandler chatHandler;
    protected JFrame outputRoom;
    private JLabel lblEmpty;
    protected JTextArea taChRoom, taOutRoom;
    private JScrollPane scrTa;
    protected JTextField tfChRoom, tfOutRoom;
    protected JButton btnKirim, btnKeluar, btnBack;
    private JPanel panelAtas,panelAtas2, panelBawah;
    protected JCheckBox cbUser1, cbUser2;
    protected ButtonGroup btnGrupUser;
    private JMenuBar mbAtas;
    protected JMenu jmFile, jmHelp, jmQuit;
    protected JMenuItem miNew, miOpen, miSave, miLicense, miVersion;
   
    public ChatClient() {
        launchFrame();
    }
    
    private void launchFrame(){
        setTitle("Chat Room Client");
        setLayout(new BorderLayout(1, 1));
        setResizable(false);
        setLocation(260, 30);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(670, 300);
        
        chatHandler = new ChatClientHandler(this);
        mbAtas = new JMenuBar();
        jmFile = new JMenu("File");
        jmHelp = new JMenu("Help");
        jmQuit = new JMenu("Quit");
        miNew = new JMenuItem("New");
        miOpen = new JMenuItem("Open");
        miSave = new JMenuItem("Save");
        miLicense = new JMenuItem("License");
        miVersion = new JMenuItem("Version");
        panelAtas = new JPanel(new GridLayout(1, 1));
        taChRoom = new JTextArea(10, 50);
        scrTa = new JScrollPane(taChRoom);
        scrTa.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrTa.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panelAtas2 = new JPanel(new GridLayout(6, 1));
        btnKirim = new JButton("Send");
        btnKirim.setBackground(Color.GREEN);
        btnKirim.setForeground(Color.WHITE);
        btnKeluar = new JButton("Quit");
        btnKeluar.setBackground(Color.RED);
        btnKeluar.setForeground(Color.WHITE);
        lblEmpty = new JLabel(" ");
        cbUser1 = new JCheckBox("Ramadhanu");
        cbUser2 = new JCheckBox("Difagama");
        btnGrupUser = new ButtonGroup();
        panelBawah = new JPanel(new FlowLayout());
        tfChRoom = new JTextField(50);
        tfChRoom.setFont(new Font("Times New Roman", Font.ITALIC, 17));
        
        btnKirim.addActionListener(chatHandler);
        btnKeluar.addActionListener(chatHandler);
        jmQuit.addMouseListener(chatHandler);
        miVersion.addMouseListener(chatHandler);
        
        jmFile.add(miNew);
        jmFile.add(miOpen);
        jmFile.add(miSave);
        jmHelp.add(miLicense);
        jmHelp.add(miVersion);
        mbAtas.add(jmFile);
        mbAtas.add(jmHelp);
        mbAtas.add(jmQuit);
        setJMenuBar(mbAtas);
        panelAtas.add(scrTa);
        panelAtas2.add(btnKirim);
        panelAtas2.add(btnKeluar);
        panelAtas2.add(lblEmpty);
        panelAtas2.add(lblEmpty);
        panelAtas2.add(cbUser1);
        panelAtas2.add(cbUser2);
        btnGrupUser.add(cbUser1);
        btnGrupUser.add(cbUser2);
        panelBawah.add(tfChRoom);
        add(panelAtas, BorderLayout.CENTER);
        add(panelAtas2, BorderLayout.EAST);
        add(panelBawah, BorderLayout.SOUTH);
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new ChatClient().setVisible(true);
        });
    }
    
}
