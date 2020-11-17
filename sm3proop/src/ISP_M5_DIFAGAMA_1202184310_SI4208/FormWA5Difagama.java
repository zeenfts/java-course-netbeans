package ISP_M5_DIFAGAMA_1202184310_SI4208;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormWA5Difagama extends JFrame {
    private JFrame jfr1;
    private JPanel jpl1;
    private JLabel jlJudul, jlName, jlKlmn, jlTingkatK, jlHobby, jlFeedback, jlHasil;
    private JTextField tfName;
    private JTextArea taFeedback, taHasil;
    private JCheckBox cbHCoding, cbHNugas, cbHPrak;
    private JRadioButton rbLaki, rbPermpn, rbPriv;
    private ButtonGroup jrb = new ButtonGroup();
    private JComboBox cmbTingkatK;
    private String[] pilihCombo = {"Mudah", "Sedang", "Sulit"};
    private JButton btnSubmit;

    public FormWA5Difagama() {
        jfr1 = new JFrame("Weekly Assignment 5 OOP Difagama");
        jfr1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jfr1.setSize(1280, 720);
        
        jpl1 = new JPanel();
        jpl1.setLayout(null);
        jpl1.setBackground(Color.DARK_GRAY);
        
        jlJudul = new JLabel("FORM WA5 PRAKTIKUM OOP");
        jlJudul.setForeground(Color.WHITE);
        jlJudul.setBounds(545, 0, 200, jlJudul.getPreferredSize().height);
        
        jlName = new JLabel("Nama");
        jlName.setForeground(Color.WHITE);
        jlName.setBounds(10, 100, jlName.getPreferredSize().width, jlName.getPreferredSize().height);
        tfName = new JTextField("Masukkan Nama Anda", 25);
        tfName.setForeground(Color.GRAY);
        tfName.setBounds(150, 100, tfName.getPreferredSize().width, tfName.getPreferredSize().height);
        
        jlKlmn = new JLabel("Jenis Kelamin");
        jlKlmn.setForeground(Color.WHITE);
        jlKlmn.setBounds(10, 150, jlKlmn.getPreferredSize().width, jlKlmn.getPreferredSize().height);
        rbLaki = new JRadioButton("Pria");
        rbPermpn = new JRadioButton("Wanita");
        rbPriv = new JRadioButton("Privasi");
        jrb.add(rbLaki);
        jrb.add(rbPermpn);
        jrb.add(rbPriv);
        rbLaki.setBounds(150, 150, rbLaki.getPreferredSize().width, rbLaki.getPreferredSize().height);
        rbPermpn.setBounds(200, 150, rbPermpn.getPreferredSize().width, rbPermpn.getPreferredSize().height);
        rbPriv.setBounds(266, 150, rbPriv.getPreferredSize().width, rbPriv.getPreferredSize().height);
        
        jlTingkatK = new JLabel("Tingkat Kesulitan");
        jlTingkatK.setForeground(Color.WHITE);
        jlTingkatK.setBounds(10, 200, 200, jlTingkatK.getPreferredSize().height);
        cmbTingkatK = new JComboBox(pilihCombo);
        cmbTingkatK.setBounds(150, 200, cmbTingkatK.getPreferredSize().width, cmbTingkatK.getPreferredSize().height);
        
        jlHobby = new JLabel("Hobby");
        jlHobby.setForeground(Color.WHITE);
        jlHobby.setBounds(10, 250, jlHobby.getPreferredSize().width, jlHobby.getPreferredSize().height);
        cbHCoding = new JCheckBox("Ngoding", false);
        cbHNugas = new JCheckBox("Nugas", false);
        cbHPrak = new JCheckBox("Praktikum", false);
        cbHCoding.setBounds(150, 250, 80, cbHCoding.getPreferredSize().height);
        cbHNugas.setBounds(240, 250, cbHNugas.getPreferredSize().width, cbHNugas.getPreferredSize().height);
        cbHPrak.setBounds(310, 250, cbHPrak.getPreferredSize().width, cbHPrak.getPreferredSize().height);
        
        jlFeedback = new JLabel("Feedback Modul 5");
        jlFeedback.setForeground(Color.WHITE);
        jlFeedback.setBounds(10, 300, 150, jlFeedback.getPreferredSize().height);
        taFeedback = new JTextArea("Isi feedback anda disini!!!",15, 38);
        taFeedback.setForeground(Color.GRAY);
        taFeedback.setBounds(10, 330, taFeedback.getPreferredSize().width, taFeedback.getPreferredSize().height);
        
        jlHasil = new JLabel("Hasil");
        jlHasil.setForeground(Color.WHITE);
        jlHasil.setBounds(700, 100, jlHasil.getPreferredSize().width, jlHasil.getPreferredSize().height);
        taHasil = new JTextArea("Menampilkan hasil setelah disubmit", 21, 42);
        taHasil.setForeground(Color.GRAY);
        taHasil.setBounds(700, 130, taHasil.getPreferredSize().width, taHasil.getPreferredSize().height);
     
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(450, 400, 200, 50);
    }
    
    @Override
    public void show(){
        jpl1.add(jlJudul);
        jpl1.add(jlName);
        jpl1.add(tfName);
        jpl1.add(jlKlmn);
        jpl1.add(rbLaki);
        jpl1.add(rbPermpn);
        jpl1.add(rbPriv);
        jpl1.add(jlTingkatK);
        jpl1.add(cmbTingkatK);
        jpl1.add(jlHobby);
        jpl1.add(cbHCoding);
        jpl1.add(cbHNugas);
        jpl1.add(cbHPrak);
        jpl1.add(jlFeedback);
        jpl1.add(taFeedback);
        jpl1.add(jlHasil);
        jpl1.add(taHasil);
        jpl1.add(btnSubmit);
        
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                submit(ev);
            }
        });
        
        tfName.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent ev) {
                nameClick(ev);
            }

            @Override
            public void mousePressed(MouseEvent e) {
               
            }

            @Override
            public void mouseReleased(MouseEvent e) {
              
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        
        taFeedback.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent ev) {
                feedbackClick(ev);
            }

            @Override
            public void mousePressed(MouseEvent e) {
               
            }

            @Override
            public void mouseReleased(MouseEvent e) {
              
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        
        jfr1.add(jpl1);
        jfr1.setVisible(true);
    }
    
    private void submit(java.awt.event.ActionEvent evn){
        try{
           taHasil.setForeground(Color.BLACK);
           taHasil.setText("Nama                      : "+tfName.getText()+
                         "\nJenis Kelamin         : "+pilihanJenisKelamin()+
                         "\nTingkat Kesulitan    : "+cmbTingkatK.getSelectedItem()+
                         "\nHobby                     : "+pilihanHobby()+
                         "\nFeedback Modul 5  : \n"+taFeedback.getText());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }
    
    private void nameClick(java.awt.event.MouseEvent evn){
        try{
            tfName.setText("");
            tfName.setForeground(Color.BLACK);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }
    
    private void feedbackClick(java.awt.event.MouseEvent evn){
        try{
            taFeedback.setText("");
            taFeedback.setForeground(Color.BLACK);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }
    
    private String pilihanJenisKelamin(){
        if(rbLaki.isSelected())
            return rbLaki.getText();
        else if(rbPermpn.isSelected())
            return rbPermpn.getText();
        else if(rbPriv.isSelected())
            return rbPriv.getText();
        return null;
    }
    
    private String pilihanHobby(){
        if(cbHCoding.isSelected()){
            if(cbHNugas.isSelected()){
                if(cbHPrak.isSelected())
                    return cbHCoding.getText()+", "+cbHNugas.getText()+", "+cbHPrak.getText();
                return cbHCoding.getText()+", "+cbHNugas.getText();
            }
            else if(cbHPrak.isSelected())
                return cbHCoding.getText()+", "+cbHPrak.getText();
            return cbHCoding.getText();
        }
        if(cbHNugas.isSelected()){
            if(cbHPrak.isSelected())
                return cbHNugas.getText()+", "+cbHPrak.getText();
            return cbHNugas.getText();
        }
        if(cbHPrak.isSelected())
            return cbHPrak.getText();
        return null;
    }
    
    public static void main(String[] args) {
        FormWA5Difagama fwd = new FormWA5Difagama();
        fwd.show();
    }
    
}

