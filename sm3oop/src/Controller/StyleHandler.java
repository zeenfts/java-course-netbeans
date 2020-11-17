package Controller;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class StyleHandler implements ItemListener,MouseListener {
    private View.Menu mn;

    public StyleHandler(View.Menu mn) {
        this.mn = mn;
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        mn.style = 0;
            if (mn.styleItems[0].isSelected()) {
                mn.style += Font.BOLD;
            }
            if (mn.styleItems[1].isSelected()) {
                mn.style += Font.ITALIC;
            }
            mn.display.setFont(new Font(mn.display.getFont().getName(), mn.style, 75));
            mn.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {   
    }

    @Override
    public void mousePressed(MouseEvent e) {
        checkForTriggerEvent(e);
    }

    public void checkForTriggerEvent(MouseEvent e){
        if (e.isPopupTrigger()) {
                    mn.popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        checkForTriggerEvent(e);
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
    }
    
}
