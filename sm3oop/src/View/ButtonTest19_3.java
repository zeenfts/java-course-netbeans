package View;
import Controller.ButtonHandler19_3;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ButtonTest19_3 extends JFrame {

    private JButton plainButton, fancyButton;

    public ButtonTest19_3() {
        super("Uji Coba Button:");
        generateGUI();
    }

    private void generateGUI() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        plainButton = new JButton("Tanpa Icon");
        c.add(plainButton);
        Icon bug1 = new ImageIcon("D:\\pict\\1518153771974.jpg");
        Icon bug2 = new ImageIcon("D:\\pict\\checklist-2077020_1920.jpg");
        fancyButton = new JButton("Ada Icon", bug1);
        fancyButton.setRolloverIcon(bug2);
        c.add(fancyButton);
        ButtonHandler19_3 handler = new ButtonHandler19_3();
        fancyButton.addActionListener(handler);
        plainButton.addActionListener(handler);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String args[]) {
        ButtonTest19_3 app = new ButtonTest19_3();
        app.addWindowListener(new WindowAdapter() {
            public void windowsClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}
