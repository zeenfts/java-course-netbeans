/*
By
Muhammad Difagama Ivanka
1202184310
SI-42-08
*/
package simulasiabsensi;

import java.awt.Color;
import java.sql.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class StudentHome extends javax.swing.JFrame {
 Border bdr = BorderFactory.createLoweredSoftBevelBorder();  
  Border bdr1 = BorderFactory.createRaisedSoftBevelBorder();
Format dateFormat = new SimpleDateFormat ("EEEEEEEEE, dd/MM/yyyy ");  
String tbt = dateFormat.format(new java.util.Date());

    public StudentHome(String un) {
        initComponents();
        unShow.setText(un);
        showStatus();
        showName();
        unShow.setVisible(false);
    }
    
    public String showName()
    {
        String usrn = unShow.getText();
        PreparedStatement pst, pst1;
        ResultSet rst, rst1;
        
  String query = "SELECT * FROM `logindb`,`datamahasiswa` where `Username` ='"+
             usrn+"' AND `logindb`.`Id No.`=`datamahasiswa`.`NIM`";
        
        try
        {
         pst = ConnecttoSQL.getConnection().prepareStatement(query);
         rst = pst.executeQuery();
         
         while(rst.next())
         {
           
              fnShow.setText(rst.getString("Nama Mahasiswa"));   
             
            
         }
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
     public String showStatus()
    {
        String usrn = unShow.getText();
        PreparedStatement pst;
        ResultSet rst;
        
        String query = "SELECT * FROM `logindb` where `Username` ='"+
             usrn+"'";
        
        try
        {
         pst = ConnecttoSQL.getConnection().prepareStatement(query);
         rst = pst.executeQuery();
         
         while(rst.next())
         {
              tanggalanstudent.setText(tbt+" --- "+rst.getString("Status"));     
         }
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdwlMk = new javax.swing.JLabel();
        prsstuden = new javax.swing.JLabel();
        logoutStudent = new javax.swing.JLabel();
        tanggalanstudent = new javax.swing.JLabel();
        unShow = new javax.swing.JLabel();
        dtprsstuden = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fnShow = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jdwlMk.setBackground(new java.awt.Color(255, 204, 204));
        jdwlMk.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jdwlMk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jdwlMk.setText("Jadwal Mata Kuliah");
        jdwlMk.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jdwlMk.setOpaque(true);
        jdwlMk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdwlMkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jdwlMkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jdwlMkMouseExited(evt);
            }
        });
        getContentPane().add(jdwlMk);
        jdwlMk.setBounds(610, 300, 190, 160);

        prsstuden.setBackground(new java.awt.Color(204, 204, 255));
        prsstuden.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        prsstuden.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prsstuden.setText("Presensi");
        prsstuden.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        prsstuden.setOpaque(true);
        prsstuden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prsstudenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prsstudenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prsstudenMouseExited(evt);
            }
        });
        getContentPane().add(prsstuden);
        prsstuden.setBounds(480, 390, 110, 70);

        logoutStudent.setForeground(java.awt.Color.red);
        logoutStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit.png"))); // NOI18N
        logoutStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutStudentMouseClicked(evt);
            }
        });
        getContentPane().add(logoutStudent);
        logoutStudent.setBounds(1200, 650, 70, 64);

        tanggalanstudent.setForeground(new java.awt.Color(255, 255, 255));
        tanggalanstudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanggalanstudent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(tanggalanstudent);
        tanggalanstudent.setBounds(480, 260, 320, 20);

        unShow.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        unShow.setForeground(new java.awt.Color(255, 255, 255));
        unShow.setText("Username User");
        getContentPane().add(unShow);
        unShow.setBounds(610, 10, 200, 17);

        dtprsstuden.setBackground(new java.awt.Color(255, 204, 255));
        dtprsstuden.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        dtprsstuden.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dtprsstuden.setText("Data Presensi");
        dtprsstuden.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dtprsstuden.setOpaque(true);
        dtprsstuden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dtprsstudenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dtprsstudenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dtprsstudenMouseExited(evt);
            }
        });
        getContentPane().add(dtprsstuden);
        dtprsstuden.setBounds(480, 300, 110, 70);

        jLabel6.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hi,");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 20, 20, 17);

        fnShow.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        fnShow.setForeground(new java.awt.Color(255, 255, 255));
        fnShow.setText("Fullname User");
        getContentPane().add(fnShow);
        fnShow.setBounds(40, 20, 250, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/city_moscow_night_lights_bridge_reflection_river_59092_1280x720.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1320, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jdwlMkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdwlMkMouseClicked
     new JadwalMatKul_Data().show();
    }//GEN-LAST:event_jdwlMkMouseClicked

    private void prsstudenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prsstudenMouseClicked
       new IdcardMhsw(fnShow.getText()).show();
    }//GEN-LAST:event_prsstudenMouseClicked

    private void dtprsstudenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dtprsstudenMouseClicked
        new Presensi_Data(fnShow.getText()).show();
    }//GEN-LAST:event_dtprsstudenMouseClicked

    private void logoutStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutStudentMouseClicked
        new LoginPage().show();
        this.dispose();
    }//GEN-LAST:event_logoutStudentMouseClicked

    private void dtprsstudenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dtprsstudenMouseEntered
dtprsstuden.setBorder(bdr);
    dtprsstuden.setForeground(Color.gray);
    }//GEN-LAST:event_dtprsstudenMouseEntered

    private void dtprsstudenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dtprsstudenMouseExited
 dtprsstuden.setBorder(bdr1);
    dtprsstuden.setForeground(Color.black);
    }//GEN-LAST:event_dtprsstudenMouseExited

    private void prsstudenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prsstudenMouseEntered
   prsstuden.setBorder(bdr);
    prsstuden.setForeground(Color.gray);
    }//GEN-LAST:event_prsstudenMouseEntered

    private void prsstudenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prsstudenMouseExited
   prsstuden.setBorder(bdr1);
    prsstuden.setForeground(Color.black);
    }//GEN-LAST:event_prsstudenMouseExited

    private void jdwlMkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdwlMkMouseEntered
    jdwlMk.setBorder(bdr);
    jdwlMk.setForeground(Color.gray);
    }//GEN-LAST:event_jdwlMkMouseEntered

    private void jdwlMkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdwlMkMouseExited
      jdwlMk.setBorder(bdr1);
    jdwlMk.setForeground(Color.black);
    }//GEN-LAST:event_jdwlMkMouseExited

    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | 
                InstantiationException |
                IllegalAccessException | 
                javax.swing.UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
     
        java.awt.EventQueue.invokeLater(() -> {
            new StudentHome(null).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dtprsstuden;
    private javax.swing.JLabel fnShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jdwlMk;
    private javax.swing.JLabel logoutStudent;
    private javax.swing.JLabel prsstuden;
    private javax.swing.JLabel tanggalanstudent;
    private javax.swing.JLabel unShow;
    // End of variables declaration//GEN-END:variables
}
