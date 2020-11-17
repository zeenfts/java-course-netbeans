package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ButtonHandler19_3 implements ActionListener {

    public ButtonHandler19_3() {
    }

    
    @Override
    public void actionPerformed(ActionEvent av) {
        JOptionPane.showMessageDialog(null,"Anda menekan : " + av.getActionCommand());
    }
    
}
