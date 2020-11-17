package Controller;
import View.CheckBoxTest19_4;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxHandler19_4 implements ItemListener {
    private int valBold = Font.PLAIN; 
    private int valItalic = Font.PLAIN;
    private CheckBoxTest19_4 cbt;

    public CheckBoxHandler19_4(CheckBoxTest19_4 cbt) {
        this.cbt = cbt;
    }
    
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == cbt.bold) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                valBold = Font.BOLD;
            }
            else {
                valBold = Font.PLAIN;
            }
        }
        if (e.getSource() == cbt.italic) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                valBold = Font.ITALIC;
            }
            else {
                valBold = Font.PLAIN;
            }
        }
        System.out.println(valBold + valItalic);
        cbt.t.setFont(new Font("TimesRoman", valBold + valItalic, 14));
        cbt.t.repaint();
    }

}
