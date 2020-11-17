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

public class DosenHome extends javax.swing.JFrame {
Border bdr = BorderFactory.createLoweredSoftBevelBorder();  
  Border bdr1 = BorderFactory.createRaisedSoftBevelBorder(); 
  Format dateFormat = new SimpleDateFormat ("EEEEEEEEE, dd/MM/yyyy ");
  String tbt = dateFormat.format(new java.util.Date());
  
    public DosenHome(String un) {
        initComponents();
        unShowdsn.setText(un);
        unShowdsn.setVisible(false);
        showStatus();
        showName();
    }
    
    public String showName()
    {
        String usrn = unShowdsn.getText();
        PreparedStatement pst;
        ResultSet rst;
        
        String query = "SELECT * FROM `logindb`,`datadosen` where `Username` ='"+
             usrn+"' AND `logindb`.`Id No.`=`datadosen`.`NIDN`";
        
        try
        {
         pst = ConnecttoSQL.getConnection().prepareStatement(query);
         rst = pst.executeQuery();
         
         while(rst.next())
         {
              fnShowdsn.setText(rst.getString("Nama"));     
         }
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    public String showStatus()
    {
        String usrn = unShowdsn.getText();
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
              tanggalandosen.setText(tbt+" --- "+rst.getString("Status"));     
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

        dmhswDsn = new javax.swing.JLabel();
        dPresensiDSn = new javax.swing.JLabel();
        presensiDosen = new javax.swing.JLabel();
        tanggalandosen = new javax.swing.JLabel();
        logoutStudent = new javax.swing.JLabel();
        unShowdsn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fnShowdsn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        dmhswDsn.setBackground(new java.awt.Color(0, 153, 153));
        dmhswDsn.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        dmhswDsn.setForeground(new java.awt.Color(255, 255, 255));
        dmhswDsn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dmhswDsn.setText("Data Mahasiswa");
        dmhswDsn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dmhswDsn.setOpaque(true);
        dmhswDsn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dmhswDsnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dmhswDsnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dmhswDsnMouseExited(evt);
            }
        });
        getContentPane().add(dmhswDsn);
        dmhswDsn.setBounds(670, 290, 150, 70);

        dPresensiDSn.setBackground(new java.awt.Color(153, 153, 153));
        dPresensiDSn.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        dPresensiDSn.setForeground(new java.awt.Color(255, 255, 255));
        dPresensiDSn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dPresensiDSn.setText("Data Presensi");
        dPresensiDSn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dPresensiDSn.setDoubleBuffered(true);
        dPresensiDSn.setOpaque(true);
        dPresensiDSn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dPresensiDSnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dPresensiDSnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dPresensiDSnMouseExited(evt);
            }
        });
        getContentPane().add(dPresensiDSn);
        dPresensiDSn.setBounds(670, 370, 150, 70);

        presensiDosen.setBackground(new java.awt.Color(255, 153, 153));
        presensiDosen.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        presensiDosen.setForeground(new java.awt.Color(255, 255, 255));
        presensiDosen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        presensiDosen.setText("Presensi");
        presensiDosen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        presensiDosen.setOpaque(true);
        presensiDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                presensiDosenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                presensiDosenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                presensiDosenMouseExited(evt);
            }
        });
        getContentPane().add(presensiDosen);
        presensiDosen.setBounds(470, 290, 190, 150);

        tanggalandosen.setForeground(new java.awt.Color(255, 255, 255));
        tanggalandosen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanggalandosen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(tanggalandosen);
        tanggalandosen.setBounds(470, 250, 350, 20);

        logoutStudent.setForeground(java.awt.Color.red);
        logoutStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit.png"))); // NOI18N
        logoutStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutStudentMouseClicked(evt);
            }
        });
        getContentPane().add(logoutStudent);
        logoutStudent.setBounds(1200, 640, 70, 64);

        unShowdsn.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        unShowdsn.setForeground(new java.awt.Color(255, 255, 255));
        unShowdsn.setText("Username User");
        getContentPane().add(unShowdsn);
        unShowdsn.setBounds(610, 10, 200, 17);

        jLabel6.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hi,");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 20, 20, 17);

        fnShowdsn.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        fnShowdsn.setForeground(new java.awt.Color(255, 255, 255));
        fnShowdsn.setText("Fullname User");
        getContentPane().add(fnShowdsn);
        fnShowdsn.setBounds(40, 20, 250, 17);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/london_united_kingdom_night_city_skyscrapers_120055_1280x720.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dmhswDsnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dmhswDsnMouseClicked
       new Mahasiswa_Data().show();
    }//GEN-LAST:event_dmhswDsnMouseClicked

    private void presensiDosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presensiDosenMouseClicked
     new IdcardDosen(fnShowdsn.getText()).show();
    }//GEN-LAST:event_presensiDosenMouseClicked

    private void logoutStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutStudentMouseClicked
        new LoginPage().show();
        this.dispose();
    }//GEN-LAST:event_logoutStudentMouseClicked

    private void dPresensiDSnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dPresensiDSnMouseClicked
new Presensi_DataDosen(fnShowdsn.getText()).show();
    }//GEN-LAST:event_dPresensiDSnMouseClicked

    private void presensiDosenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presensiDosenMouseEntered
     presensiDosen.setBorder(bdr);
     presensiDosen.setForeground(Color.darkGray);
    }//GEN-LAST:event_presensiDosenMouseEntered

    private void presensiDosenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presensiDosenMouseExited
      presensiDosen.setBorder(bdr1);
     presensiDosen.setForeground(Color.white);
    }//GEN-LAST:event_presensiDosenMouseExited

    private void dmhswDsnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dmhswDsnMouseEntered
       dmhswDsn.setBorder(bdr);
     dmhswDsn.setForeground(Color.darkGray);
    }//GEN-LAST:event_dmhswDsnMouseEntered

    private void dmhswDsnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dmhswDsnMouseExited
       dmhswDsn.setBorder(bdr1);
     dmhswDsn.setForeground(Color.white);
    }//GEN-LAST:event_dmhswDsnMouseExited

    private void dPresensiDSnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dPresensiDSnMouseEntered
      dPresensiDSn.setBorder(bdr);
     dPresensiDSn.setForeground(Color.darkGray);
    }//GEN-LAST:event_dPresensiDSnMouseEntered

    private void dPresensiDSnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dPresensiDSnMouseExited
       dPresensiDSn.setBorder(bdr1);
     dPresensiDSn.setForeground(Color.white);
    }//GEN-LAST:event_dPresensiDSnMouseExited

    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : 
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException 
                | InstantiationException 
                | IllegalAccessException ex) {
           JOptionPane.showMessageDialog(null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           JOptionPane.showMessageDialog(null, ex);

        java.awt.EventQueue.invokeLater(() -> {
            new DosenHome(null).setVisible(true);
            });
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dPresensiDSn;
    private javax.swing.JLabel dmhswDsn;
    private javax.swing.JLabel fnShowdsn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel logoutStudent;
    private javax.swing.JLabel presensiDosen;
    private javax.swing.JLabel tanggalandosen;
    private javax.swing.JLabel unShowdsn;
    // End of variables declaration//GEN-END:variables
}
