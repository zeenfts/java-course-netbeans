package BukuPraktikum7;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import javax.swing.JOptionPane;

public class ChatClientHandler implements MouseListener, ActionListener {

    private ChatClient ccl;
    private ChatClientOutput cloo;
    private Runnable rClient;
    protected String inputLine;
    private BufferedReader brClient = null;
    private PrintStream psClient = null;
    private Socket clientSocket = null;

    public ChatClientHandler(ChatClient cl) {
        ccl = cl;
        try {
            cloo = new ChatClientOutput();
            cloo.setVisible(true);
            koneksiClient();
//            RemoteReader rr = new RemoteReader();
//            Thread t1 = new Thread(rr);
//            t1.start();
        }
        catch (IOException ex) {
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(ccl.btnKirim)) {
            if (ccl.cbUser1.isSelected()) {
                psClient.println("User: " + ccl.cbUser1.getText());
                cloo.tfOutRoom.setText(cloo.outputLine);
            }
            else if (ccl.cbUser2.isSelected()) {
                cloo.tfOutRoom.setText("User: " + ccl.cbUser2.getText());
            }

            if (ccl.taChRoom != null) {
                if (ccl.tfChRoom != null) {
                    cloo.taOutRoom.setText(ccl.tfChRoom.getText() + "\n\n"
                            + ccl.taChRoom.getText());
                }
                else {
                    cloo.taOutRoom.setText(ccl.taChRoom.getText());
                }
            }
            else {
                if (ccl.tfChRoom != null) {
                    cloo.taOutRoom.setText(ccl.tfChRoom.getText());
                }
                else {
                }
            }
        }
        else if (ae.getSource().equals(ccl.btnKeluar)) {
            System.exit(0);
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getSource().equals(ccl.jmQuit)) {
            System.exit(0);
        }
        else if (me.getSource().equals(ccl.miVersion)) {
            JOptionPane.showMessageDialog(cloo, "Aplikasi Chat terhubung ke Server versi 1.0");
        }
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
    }

    private void koneksiClient() throws IOException {
        clientSocket = new Socket("localhost", 6666);
        psClient = new PrintStream(clientSocket.getOutputStream());
//        brClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//        inputLine = brClient.readLine();
    }

}

class RemoteReader implements Runnable {

    @Override
    public void run() {
        try {

            Thread.sleep(100);
        }
        catch (InterruptedException ex) {
        }
    }

}
