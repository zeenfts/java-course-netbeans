package Controller;
import View.MainAppTubes;
import View.NewWorkplace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.text.DefaultEditorKit.*;

public class InternalFrameHandler implements ActionListener, MouseListener{
    private NewWorkplace nwk;
    private MainAppTubes mat;
    private JFileChooser jfc;
    private PrintWriter pw;

    public InternalFrameHandler() {
    }

    public InternalFrameHandler(NewWorkplace nwk) {
        this.nwk = nwk;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(nwk.miCutt)){
            new CutAction().actionPerformed(ae);
        }
        else if(ae.getSource().equals(nwk.miCopyy)){
            new CopyAction().actionPerformed(ae);
        }
        else if(ae.getSource().equals(nwk.miPastee)){
            new PasteAction().actionPerformed(ae);
        }
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
    }

    @Override
    public void mousePressed(MouseEvent mp) {
        rightClick(mp);
    }

    @Override
    public void mouseReleased(MouseEvent mr) {
        rightClick(mr);
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
    }
    
    private void rightClick(MouseEvent e){
        if (e.isPopupTrigger()) {
                    nwk.klikKanan.show(e.getComponent(), e.getX(), e.getY());
                }
    }
    
}
