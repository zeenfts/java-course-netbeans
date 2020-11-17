package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelTest19_1 extends JFrame {

    private JLabel label1, label2, label3;

    public LabelTest19_1() {
        super("Testing Label");
        generateGUI();
    }

    private void generateGUI() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        label1 = new JLabel("Label dengan Text");
        label1.setToolTipText("Ini adalah Label 1");
        c.add(label1);
        Icon bug = new ImageIcon("D:\\pict\\potofgold.png");
        label2 = new JLabel("Label dengan text dan icon", SwingConstants.LEFT);
        label2.setToolTipText("Ini adalah label 2");
        c.add(label2);
        label3 = new JLabel();
        label3.setText("Label dengan icon dan text di bawahnya");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("Ini adalah label 3");
        c.add(label3);
        setSize(275, 170);
        setVisible(true);
    }

    public static void main(String args[]) {
        LabelTest19_1 app = new LabelTest19_1();
        app.addWindowListener(new WindowAdapter() {
            public void windowsClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
