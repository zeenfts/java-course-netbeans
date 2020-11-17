package Controller;
import View.RadioButtonTest19_5;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtonHandler19_5 implements ItemListener {
    private RadioButtonTest19_5 rbt;

    public RadioButtonHandler19_5(RadioButtonTest19_5 rbt) {
        this.rbt = rbt;
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == rbt.plain) {
            rbt.t.setFont(rbt.plainFont);
        }
        else if (e.getSource() == rbt.bold) {
            rbt.t.setFont(rbt.boldFont);
        }
        else if (e.getSource() == rbt.italic) {
            rbt.t.setFont(rbt.italicFont);
        }
        else if (e.getSource() == rbt.bold) {
            rbt.t.setFont(rbt.boldItalicFont);
        }
        rbt.t.repaint();
    }
}
