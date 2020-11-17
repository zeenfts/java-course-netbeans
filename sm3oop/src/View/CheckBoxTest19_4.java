package View;
import Controller.CheckBoxHandler19_4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxTest19_4 extends JFrame {
    public JTextField t;
    public JCheckBox bold;
    public JCheckBox italic;

    public CheckBoxTest19_4() {
        super("Uji Coba JCheckBox");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        t = new JTextField("Perubahan Font", 20);
        t.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        c.add(t);
        bold = new JCheckBox("Bold");
        c.add(bold);
        italic = new JCheckBox("Italic");
        c.add(italic);
        CheckBoxHandler19_4 handler = new CheckBoxHandler19_4(this);
        bold.addItemListener(handler);
        italic.addItemListener(handler);
        addWindowListener(new WindowAdapter() {
            public void windowsClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(275, 100);
        setVisible(true);
    }

    public static void main(String args[]) {
        new CheckBoxTest19_4();
    }
}
