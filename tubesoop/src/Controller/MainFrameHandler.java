package Controller;
import View.MainAppTubes;
import View.NewWorkplace;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.text.Format;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.text.DefaultEditorKit.*;

public class MainFrameHandler implements ActionListener, MouseListener, ItemListener, Runnable{
    private MainAppTubes mat;
    private NewWorkplace nwk;
    private JFileChooser jfc;
    private PrintWriter pw;
    private BufferedReader brr;
    private int STYLE_FONT = 0;
    private int SIZE_FONT = 0;
    private final String user = "Bubble", pass = "34591";
    public JTable tabelWorkplace;
    public Format dateFormat = new SimpleDateFormat ("EEEEEEEEE, dd/MM/yyyy ");
    public String tbt = dateFormat.format(new java.util.Date());

    public MainFrameHandler(MainAppTubes mat) {
        this.mat = mat;
        jfc = new JFileChooser();
    }
    
    public MainFrameHandler(NewWorkplace nwk) {
        this.nwk = nwk;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(mat.miNew) || ae.getSource().equals(mat.bNew)){
            String fileName = JOptionPane.showInputDialog(null, "File Name:", "Create New File", JOptionPane.PLAIN_MESSAGE);
            nwk = new NewWorkplace(fileName);
            mat.desktopTubes.add(nwk);
            String szf = String.valueOf(mat.fontSize.getSelectedItem());
            SIZE_FONT = Integer.valueOf(szf);
            nwk.t1.setFont(new Font(String.valueOf(mat.fontName.getSelectedItem()), STYLE_FONT, SIZE_FONT) {}); 
            
            String rowS = JOptionPane.showInputDialog(null, "Jumlah Baris:", "Buat tabel", JOptionPane.PLAIN_MESSAGE);
            String columnS = JOptionPane.showInputDialog(null, "Jumlah Kolom:", "Buat tabel", JOptionPane.PLAIN_MESSAGE);
            tabelWorkplace = new JTable(Integer.valueOf(rowS), Integer.valueOf(columnS));
            nwk.add(tabelWorkplace, BorderLayout.SOUTH);
            
            String theText = nwk.t1.getText();
            int jumlahKata = theText.split("\\s").length;
            mat.wordsCount.setText("Words: " + jumlahKata);
        }
        else if(ae.getSource().equals(mat.miOpen) || ae.getSource().equals(mat.bOpen)){
            jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            jfc.showOpenDialog(null);
            nwk = new NewWorkplace(jfc.getSelectedFile().getName());
            mat.desktopTubes.add(nwk);
            
            try {
                brr = new BufferedReader(new FileReader(jfc.getSelectedFile()));
                String read;
                while((read=brr.readLine())!=null){
                    nwk.t1.append(read+"\n");
                }
                String theText = nwk.t1.getText();
                int jumlahKata = theText.split("\\s").length;
                mat.wordsCount.setText("Words: " + jumlahKata);
            }
            catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "!! Warning !!", JOptionPane.WARNING_MESSAGE);
            }
            catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "!! Warning !!", JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(ae.getSource().equals(mat.bSave) || ae.getSource().equals(mat.miSave)){
            File s = new File("C:/Users/ASUS/Desktop/");
            jfc.setFileSelectionMode(JFileChooser.SAVE_DIALOG);
            jfc.showSaveDialog(null);
            jfc.setCurrentDirectory(s.getAbsoluteFile());
            
            try {
                pw = new PrintWriter(new FileWriter(jfc.getSelectedFile()+"/"+mat.desktopTubes.getSelectedFrame().getTitle()+".docx"));
                pw.print(nwk.t1.getText());
                pw.print("\n\n");
                for(int a=0; a<1;a++){
                    for(int b =0; b<tabelWorkplace.getColumnCount(); b++){
                        pw.print("| "+tabelWorkplace.getModel().getValueAt(a, b)+" |");
                    }
                    pw.print("\n");
                }
                for(int a=1; a<tabelWorkplace.getRowCount();a++){
                    for(int b =0; b<tabelWorkplace.getColumnCount(); b++){
                        pw.print("| "+tabelWorkplace.getModel().getValueAt(a, b)+" |");
                    }
                    pw.print("\n");
                }
//                mat.desktopTubes.getSelectedFrame();
                pw.close();
            }
            catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "!! Warning !!", JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(ae.getSource().equals(mat.miExit) || ae.getSource().equals(mat.puQuit)){
            System.exit(0);
        }
        else if(ae.getSource().equals(mat.miCut)){
            new CutAction().actionPerformed(ae);
        }
        else if(ae.getSource().equals(mat.miCopy)){
            new CopyAction().actionPerformed(ae);
        }
        else if(ae.getSource().equals(mat.miPaste)){
            new PasteAction().actionPerformed(ae);
        }
        else if(ae.getSource().equals(mat.miContact)){
            nwk = new NewWorkplace();
            nwk.frameKontak();
        }
        else if(ae.getSource().equals(mat.miAbout)){
            JOptionPane.showMessageDialog(null, "Open Word v.1.0.0\nDeveloped with java PL", "About", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(ae.getSource().equals(mat.bLogout)){
            mat.mnFile.setEnabled(false);
            mat.mnEdit.setEnabled(false);
            mat.mnHelp.setEnabled(false);
            mat.toolBar.setEnabled(false);
            mat.bNew.setEnabled(false);
            mat.bOpen.setEnabled(false);
            mat.bSave.setEnabled(false);
            mat.fontName.setEnabled(false);
            mat.fontSize.setEnabled(false);
            mat.hurufBold.setEnabled(false);
            mat.hurufItalic.setEnabled(false);
            mat.hurufUnderline.setEnabled(false);
            mat.fontColor.setEnabled(false);
            mat.textAreaColor.setEnabled(false);
            mat.bLogout.setEnabled(false);
            mat.wordsGenerate.setEnabled(false);
            mat.bInsert.setEnabled(false);
            mat.userNameField.setVisible(true);
            mat.userNameField.setText("Username");
            mat.passwordField.setVisible(true);
            mat.passwordField.setText("Password");
            mat.bLogin.setVisible(true);
            mat.seePass.setVisible(true);
            mat.lUserN.setText("Hi, username");
            mat.hurufLeft.setEnabled(false);
            mat.hurufCenter.setEnabled(false);
            mat.hurufRight.setEnabled(false);
        }
        else if(ae.getSource().equals(mat.fontName)){
            String szf = String.valueOf(mat.fontSize.getSelectedItem());
            SIZE_FONT = Integer.valueOf(szf);
            nwk.t1.setFont(new Font(String.valueOf(mat.fontName.getSelectedItem()), STYLE_FONT, SIZE_FONT) {});
            nwk.t1.repaint();
        }
        else if(ae.getSource().equals(mat.fontSize)){
            String szf = String.valueOf(mat.fontSize.getSelectedItem());
            SIZE_FONT = Integer.valueOf(szf);
            nwk.t1.setFont(new Font(String.valueOf(mat.fontName.getSelectedItem()), STYLE_FONT, SIZE_FONT) {});
            nwk.t1.repaint();
        }
        else if(ae.getSource().equals(mat.bLogin)){
            if(mat.userNameField.getText().equals(user) && new String(mat.passwordField.getPassword()).equals(pass)){
                mat.mnFile.setEnabled(true);
                mat.mnEdit.setEnabled(true);
                mat.mnHelp.setEnabled(true);
                mat.toolBar.setEnabled(true);
                mat.bNew.setEnabled(true);
                mat.bOpen.setEnabled(true);
                mat.bSave.setEnabled(true);
                mat.fontName.setEnabled(true);
                mat.fontSize.setEnabled(true);
                mat.hurufBold.setEnabled(true);
                mat.hurufItalic.setEnabled(true);
                mat.hurufUnderline.setEnabled(true);
                mat.fontColor.setEnabled(true);
                mat.textAreaColor.setEnabled(true);
                mat.wordsGenerate.setEnabled(true);
                mat.bInsert.setEnabled(true);
                mat.userNameField.setVisible(false);
                mat.passwordField.setVisible(false);
                mat.bLogin.setVisible(false);
                mat.seePass.setVisible(false);
                mat.lUserN.setText("Hi, "+user);
                mat.bLogout.setEnabled(true);
                mat.hurufLeft.setEnabled(true);
                mat.hurufCenter.setEnabled(true);
                mat.hurufRight.setEnabled(true);
            }
        } 
        else if(ae.getSource().equals(mat.bInsert)){
            nwk.t1.append(String.valueOf(mat.wordsGenerate.getSelectedValuesList()));
        } 
        else if(ae.getSource().equals(mat.hurufLeft)){
            nwk.setLocation(0, 0);
        } 
        else if(ae.getSource().equals(mat.hurufCenter)){
            nwk.setLocation(270, 0);
        } 
        else if(ae.getSource().equals(mat.hurufRight)){
            nwk.setLocation(570, 0);
        } 
        for (int i = 0; i < mat.fontColor.getItemCount(); i++) {
            if(ae.getSource().equals(mat.fontColor)){
                if(mat.COLOR_NAMES[i].equals(mat.fontColor.getSelectedItem())){
                    nwk.t1.setForeground(mat.TEXT_COLOR[i]);
                }
            }
            else if(ae.getSource().equals(mat.textAreaColor)){
                if(mat.COLOR_NAMES[i].equals(mat.textAreaColor.getSelectedItem())){
                    nwk.t1.setBackground(mat.TEXT_COLOR[i]);
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.getSource().equals(mat.userNameField)){
            mat.userNameField.setText("");
        }
        if(me.getSource().equals(mat.passwordField)){
            mat.passwordField.setText("");
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        rightClick(me);
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        rightClick(me);
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
    }
    
    private void rightClick(MouseEvent e){
        if (e.isPopupTrigger()) {
                    mat.klikKanan.show(e.getComponent(), e.getX(), e.getY());
                }
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        Map<TextAttribute, Integer> fontAttributes = null;
        mat.passwordField.setEchoChar('*');
        STYLE_FONT = Font.PLAIN;
        String szf = String.valueOf(mat.fontSize.getSelectedItem());
        SIZE_FONT = Integer.valueOf(szf);
        if(mat.seePass.isSelected()){
            mat.passwordField.setEchoChar((char)0);
        }
        if(mat.hurufBold.isSelected()){
            STYLE_FONT+=Font.BOLD;
        }
        if(mat.hurufItalic.isSelected()){
           STYLE_FONT+=Font.ITALIC;
        }
        if(mat.hurufUnderline.isSelected()){
        fontAttributes = new HashMap<>();
        fontAttributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        }
        nwk.t1.setFont(new Font(String.valueOf(mat.fontName.getSelectedItem()), STYLE_FONT, SIZE_FONT).deriveFont(fontAttributes));
        nwk.t1.repaint();
    }

    @Override
    public void run() {
        while (true) {
            Calendar cal = new GregorianCalendar();
            int jam = cal.get(Calendar.HOUR_OF_DAY);
            int mnt = cal.get(Calendar.MINUTE);
            long dtk = cal.get(Calendar.SECOND);

            String time = String.format("%02d:%02d:%02d WIB", jam, mnt, dtk);
            mat.timeShow.setText("   " + tbt + " " + time);
            mat.mouseCordinate.setText("  Line: " + MouseInfo.getPointerInfo().getLocation().getY()
                    + " Col: " + MouseInfo.getPointerInfo().getLocation().getX());
        }
    }
    
}
