package View;
import Controller.InternalFrameHandler;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class NewWorkplace extends JInternalFrame {
    private InternalFrameHandler ifh;
    private Box b;
    public JTextArea t1, t2;
    public ButtonGroup rCL;
    public JRadioButtonMenuItem miCutt, miCopyy, miPastee;
    public JPopupMenu klikKanan;
    public JTable tableUserInfo;

    public NewWorkplace() {
    }

    public NewWorkplace(String nf) {
        setInFrame(nf);
        createObjIn();
        insToInFrame();
        addActInHandler();     
        setVisible(true);
    }
    
    private void setInFrame(String nf){
        setTitle(nf);
        setResizable(true);
        setMaximizable(true);
        setClosable(true);
        setIconifiable(true);
        setLayout(new BorderLayout());
        setSize(500, 500);
    }
    
    private void createObjIn(){
        b = Box.createHorizontalBox();
        ifh = new InternalFrameHandler(this);
        t1 = new JTextArea(10, 15);
        miCutt = new JRadioButtonMenuItem("Cut");
        miCopyy = new JRadioButtonMenuItem("Copy");
        miPastee = new JRadioButtonMenuItem("Paste");
        rCL = new ButtonGroup();
        klikKanan = new JPopupMenu();
    }
    
    private void insToInFrame(){
        rCL.add(miCutt);
        rCL.add(miCopyy);
        rCL.add(miPastee);
        
        klikKanan.add(miCutt);
        klikKanan.add(miCopyy);
        klikKanan.add(miPastee);
        add(new JScrollPane(t1), BorderLayout.CENTER);
    }
    
    private void addActInHandler(){
        t1.addMouseListener(ifh);
        miCutt.addActionListener(ifh);
        miCopyy.addActionListener(ifh);
        miPastee.addActionListener(ifh);
    }
    
    public void frameKontak(){
        String namaKolom[] = {"NIM", "Nama", "Kelas", "No. HP"};
        Object tableContens[][] = {{"1202183351", "Ramadhanu Tadzkier", 
            "SI-42-08", "082281119716"},{"1202184310", "Muhammad Difagama Ivanka", 
            "SI-42-08", "082157111178"}};
        JFrame kontak = new JFrame("Contact");
        kontak.setLayout(new BorderLayout());
        kontak.setSize(500, 300);
        kontak.setLocation(350, 200);
        kontak.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tableUserInfo = new JTable(tableContens, namaKolom);
        kontak.add(new JScrollPane(tableUserInfo), BorderLayout.CENTER);
        kontak.setVisible(true);
    }
}
