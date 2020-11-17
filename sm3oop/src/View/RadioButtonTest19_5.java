package View;
import Controller.RadioButtonHandler19_5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonTest19_5 extends JFrame {
    public JTextField t;
    public Font plainFont, boldFont;
    public Font italicFont, boldItalicFont;
    public JRadioButton plain, bold, italic, boldItalic;
    public ButtonGroup radioGroup;

    public RadioButtonTest19_5() {
        super("Uji Coba RadioButton");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        t = new JTextField("Perhatikan perubahan jenis huruf", 30);
        c.add(t);
        plain = new JRadioButton("Plain", true);
        c.add(plain);
        bold = new JRadioButton("Bold", false);
        c.add(bold);
        italic = new JRadioButton("Italic", false);
        c.add(italic);
        boldItalic = new JRadioButton("Bold-Italic", false);
        c.add(boldItalic);
        RadioButtonHandler19_5 handler = new RadioButtonHandler19_5(this);
        plain.addItemListener(handler);
        bold.addItemListener(handler);
        italic.addItemListener(handler);
        boldItalic.addItemListener(handler);
        radioGroup = new ButtonGroup();
        radioGroup.add(plain);
        radioGroup.add(bold);
        radioGroup.add(italic);
        radioGroup.add(boldItalic);
        plainFont = new Font("TimesRoman", Font.PLAIN, 16);
        boldFont = new Font("TimesRoman", Font.BOLD, 16);
        italicFont = new Font("TimesRoman", Font.ITALIC, 16);
        boldItalicFont = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 16);
        t.setFont(plainFont);
        setSize(300, 500);
        setVisible(true);
    }

    public static void main(String args[]) {
        RadioButtonTest19_5 app = new RadioButtonTest19_5();
        app.addWindowListener(new WindowAdapter() {
            public void windowsClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}
