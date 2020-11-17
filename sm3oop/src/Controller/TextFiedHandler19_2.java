 package Controller;
import View.TextFieldTest19_2;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class TextFiedHandler19_2 implements ActionListener {
    private TextFieldTest19_2 frame; 

    public TextFiedHandler19_2(TextFieldTest19_2 t) {
        frame = t;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        String s = "";
        if(ev.getSource().equals(frame.text1))
            s = "text1: "+ev.getActionCommand();
        else if(ev.getSource() == frame.text2)
            s = "text2: "+ev.getActionCommand();
        else if(ev.getSource() == frame.text3)
            s = "text3: "+ev.getActionCommand();
        else if(ev.getSource() == frame.pfPassword)
            s = "password: "+new String(((JPasswordField)ev.getSource()).getPassword());
        
        JOptionPane.showMessageDialog(null, s);
    }
    
}
