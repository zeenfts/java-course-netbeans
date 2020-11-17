package View;
import Controller.TextFiedHandler19_2;
import javax.swing.*;
import java.awt.*;

public class TextFieldTest19_2 extends JFrame{
    public JTextField text1, text2, text3;
    public JPasswordField pfPassword;
    private JPanel panel1, panel2;
    private Container c;
    private TextFiedHandler19_2 handlerr;

    public TextFieldTest19_2() {
        komponenTF();
    }
    
    private void komponenTF(){
        setTitle("Uji Coba");
        setSize(500, 90);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        c = getContentPane();
        setLayout(new GridLayout(2, 1));
        handlerr =  new TextFiedHandler19_2(this);
        
        panel1 = new JPanel(new FlowLayout());
        text1= new JTextField(10);
        text1.addActionListener(handlerr);
        panel1.add(text1);
        text2 = new JTextField("Ketik text disini");
        text2.addActionListener(handlerr);
        panel1.add(text2);
        add(panel1);
        
        panel2 = new JPanel(new FlowLayout());
        text3 = new JTextField("Tidak bisa diedit");
        text3.addActionListener(handlerr);
        text3.setEditable(false);
        panel2.add(text3);
        pfPassword = new JPasswordField(20);
        pfPassword.addActionListener(handlerr);
        panel2.add(pfPassword);
        add(panel2);
    }
    
    public static void main(String[] args) {
        try{
            new TextFieldTest19_2().setVisible(true);
        }
        catch(Exception ec){
            System.exit(0);
        }
    }
    
}
