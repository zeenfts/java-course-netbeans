package Controller;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ItemHandler implements ActionListener {
    private View.Menu mn;
    
    public ItemHandler(View.Menu mn) {
        this.mn = mn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < mn.colorItems.length; i++) {
                if (mn.colorItems[i].isSelected()) {
                    mn.display.setForeground((mn.warna[i]));
                }
            }
            for (int i = 0; i < mn.fonts.length; i++) {
                if (e.getSource() == mn.fonts[i]) {
                    mn.display.setFont(new Font(mn.fonts[i].getText(), mn.style, 50));
                }
            }
            
            if(e.getSource().equals(mn.aboutItem)){
                JOptionPane.showMessageDialog(mn, "Aplikasi ini adalah contoh penggunaan JMenus", "About", JOptionPane.PLAIN_MESSAGE);
            }
            else if(e.getSource().equals(mn.exitItem)){
                System.exit(0);
            }
        for (int i = 0; i < mn.items.length; i++) {
                if (e.getSource() == mn.items[i]) {
                    mn.getContentPane().setBackground(mn.colorValues[i]);
                    mn.repaint();
                }
            }
    }
    
}
