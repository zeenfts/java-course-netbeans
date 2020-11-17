/*
By
Muhammad Difagama Ivanka
1202184310
SI-42-08
*/
package simulasiabsensi;
import java.awt.Color;
import java.sql.*;
import java.text.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class IdcardMhsw extends javax.swing.JFrame {
  Border bdr = BorderFactory.createLoweredSoftBevelBorder();  
  Border bdr1 = BorderFactory.createRaisedSoftBevelBorder(); 
  Format dateFormat = new SimpleDateFormat ("EEEEEEEEE, dd/MM/yyyy ");
  String tbt = dateFormat.format(new java.util.Date());
        
    public IdcardMhsw(String fn) {
        initComponents();
        fnShowpres.setText(fn);
        tapStudenLbl.setVisible(false);
         dateinMhsw.setText(tbt);
         startCombo();
        new Thread()
        {
        @Override
        public void run()
        {
            int timerun = 0;
         while (timerun == 0)
                {
                 Calendar cal = new GregorianCalendar();
                 int jam = cal.get(Calendar.HOUR_OF_DAY);
                 int mnt = cal.get(Calendar.MINUTE);
                 long dtk = cal.get(Calendar.SECOND);
                 
                 String time = jam+"."+mnt+"."+dtk+" WIB";
                 timeinMhsw.setText(time);
                }
    }
    }.start();   
    }
 
       public final void startCombo()
{
  PreparedStatement pst, pst1, pst2;
  ResultSet rst, rst1, rst2;
       
  String query = "SELECT * FROM `datamahasiswa` Where "
          + "`Nama Mahasiswa` ='"+fnShowpres.getText()+"'";
        String query1 = "SELECT * FROM `rfidcard` Where `Tanggal Tap` ='"+
                dateinMhsw.getText()+"' AND `Status` = 'Dosen'";
        String query2 = "SELECT * FROM `rfidreader`";

        try {
            pst = ConnecttoSQL.getConnection().prepareStatement(query);
            rst = pst.executeQuery();
            pst1 = ConnecttoSQL.getConnection().prepareStatement(query1);
            rst1 = pst1.executeQuery();
            pst2 = ConnecttoSQL.getConnection().prepareStatement(query2);
            rst2 = pst2.executeQuery();
            
            while(rst.next())
        nimSHCombo.addItem(rst.getString("NIM"));
            
            while(rst1.next())
        matkulSHCombo.addItem(rst1.getString("Mata Kuliah"));
            
              while(rst2.next())
        rfidSHCombo.addItem(rst2.getString("Serial"));
               
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timeinMhsw = new javax.swing.JLabel();
        dateinMhsw = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nimSHCombo = new javax.swing.JComboBox<>();
        matkulSHCombo = new javax.swing.JComboBox<>();
        rfidSHCombo = new javax.swing.JComboBox<>();
        tapStudenLbl = new javax.swing.JLabel();
        backStudenhome = new javax.swing.JLabel();
        fnShowpres = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        getContentPane().setLayout(null);

        timeinMhsw.setForeground(new java.awt.Color(255, 255, 255));
        timeinMhsw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeinMhsw.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(timeinMhsw);
        timeinMhsw.setBounds(510, 10, 120, 21);

        dateinMhsw.setForeground(new java.awt.Color(255, 255, 255));
        dateinMhsw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateinMhsw.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(dateinMhsw);
        dateinMhsw.setBounds(640, 10, 140, 21);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/images.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 340, 230, 270);

        nimSHCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "       <NIM>" }));
        getContentPane().add(nimSHCombo);
        nimSHCombo.setBounds(630, 360, 100, 20);

        matkulSHCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                 <Mata Kuliah>" }));
        getContentPane().add(matkulSHCombo);
        matkulSHCombo.setBounds(630, 440, 200, 20);

        rfidSHCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Tipe RFID Reader>" }));
        rfidSHCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfidSHComboActionPerformed(evt);
            }
        });
        getContentPane().add(rfidSHCombo);
        rfidSHCombo.setBounds(630, 400, 160, 20);

        tapStudenLbl.setBackground(java.awt.Color.pink);
        tapStudenLbl.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        tapStudenLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tapStudenLbl.setText("Tapping");
        tapStudenLbl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tapStudenLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tapStudenLbl.setOpaque(true);
        tapStudenLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tapStudenLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tapStudenLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tapStudenLblMouseExited(evt);
            }
        });
        getContentPane().add(tapStudenLbl);
        tapStudenLbl.setBounds(640, 550, 130, 40);

        backStudenhome.setForeground(new java.awt.Color(255, 255, 255));
        backStudenhome.setText("<< Back");
        backStudenhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backStudenhomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backStudenhomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backStudenhomeMouseExited(evt);
            }
        });
        getContentPane().add(backStudenhome);
        backStudenhome.setBounds(400, 10, 60, 14);

        fnShowpres.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        fnShowpres.setForeground(new java.awt.Color(255, 255, 255));
        fnShowpres.setText("Fullname User");
        getContentPane().add(fnShowpres);
        fnShowpres.setBounds(380, 320, 200, 17);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/zenit_retro_camera_photos_map_107245_1280x720.jpg"))); // NOI18N
        jLabel1.setDoubleBuffered(true);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tapStudenLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tapStudenLblMouseClicked
     String readerType  = String.valueOf(rfidSHCombo.getSelectedItem());
 String nimnya = String.valueOf(nimSHCombo.getSelectedItem());
 String mtklMhsw = String.valueOf(matkulSHCombo.getSelectedItem());
 
        PreparedStatement pst, pst1, pst2, pst3;
        ResultSet rst1, rst2, rst3;
      String query1 = "SELECT * FROM `datamahasiswa` where `NIM` ='"+nimnya+"'";
      String query2 = "SELECT * FROM `datamatakuliah` where `Mata Kuliah` ='"
                 +mtklMhsw+"'";
        String query3 = "SELECT * FROM `rfidcard` where `Rfid Reader No` ='"
                 +readerType+"' and `Mata Kuliah` ='" +mtklMhsw+"'";
   String query = "INSERT INTO `rfidcard`(`Rfid Reader No`, `Status`, `Id No.`"
            + ", `Name`, `Mata Kuliah`, `Tanggal Tap`,`Waktu Tap`, `Ruangan`, "
           + "`Kehadiran`)"
            + "VALUES (?,?,?,?,?,?,?,?,?)";
    
        try {
             pst = ConnecttoSQL.getConnection().prepareStatement(query);
              pst1 = ConnecttoSQL.getConnection().prepareStatement(query1);
             rst1 = pst1.executeQuery();
             pst2 = ConnecttoSQL.getConnection().prepareStatement(query2);
             rst2 = pst2.executeQuery();
             pst3 = ConnecttoSQL.getConnection().prepareStatement(query3);
             rst3 = pst3.executeQuery();
             
             while(rst1.next() && rst2.next() && rst3.next()){
 
             pst.setString(1, readerType);
             pst.setString(2, rst1.getString("Status"));
             pst.setString(3, rst1.getString("NIM"));
             pst.setString(4, rst1.getString("Nama Mahasiswa"));
             pst.setString(5, mtklMhsw);
             pst.setString(6, dateinMhsw.getText());
             pst.setString(7, timeinMhsw.getText());
             pst.setString(8, rst2.getString("Ruangan"));
             pst.setString(9, "");
                 
              if(pst.executeUpdate() >0)
                JOptionPane.showMessageDialog(null, "Kehadiran tercatat :)");
             }
             
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }                                      
    }//GEN-LAST:event_tapStudenLblMouseClicked

    private void backStudenhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backStudenhomeMouseClicked
      this.dispose();
    }//GEN-LAST:event_backStudenhomeMouseClicked

    private void rfidSHComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfidSHComboActionPerformed
      String stts = "Dosen"; 
    String rfidrd = String.valueOf(rfidSHCombo.getSelectedItem());
       
       PreparedStatement stt;
       ResultSet rtt;
       
       String query = "SELECT * FROM `rfidcard` WHERE `Tanggal Tap` ='"
               +dateinMhsw.getText()+"' AND `Status` ='"+stts+"'";
       
        try {
            stt = ConnecttoSQL.getConnection().prepareStatement(query);
            rtt = stt.executeQuery();
         
            
           while(rtt.next()){
           if(rtt.getString("Rfid Reader No").equals(rfidrd)){
           tapStudenLbl.setVisible(true);
           }   
        }   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_rfidSHComboActionPerformed

    private void backStudenhomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backStudenhomeMouseEntered
       backStudenhome.setForeground(Color.red);
    }//GEN-LAST:event_backStudenhomeMouseEntered

    private void backStudenhomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backStudenhomeMouseExited
      backStudenhome.setForeground(Color.white);
    }//GEN-LAST:event_backStudenhomeMouseExited

    private void tapStudenLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tapStudenLblMouseEntered
       tapStudenLbl.setBorder(bdr);
       tapStudenLbl.setForeground(Color.gray);
    }//GEN-LAST:event_tapStudenLblMouseEntered

    private void tapStudenLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tapStudenLblMouseExited
      tapStudenLbl.setBorder(bdr1);
      tapStudenLbl.setForeground(Color.black);
    }//GEN-LAST:event_tapStudenLblMouseExited

   
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
                | IllegalAccessException 
                | javax.swing.UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    
        java.awt.EventQueue.invokeLater(() -> {
            new IdcardMhsw(null).setVisible(true);
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backStudenhome;
    private javax.swing.JLabel dateinMhsw;
    private javax.swing.JLabel fnShowpres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> matkulSHCombo;
    private javax.swing.JComboBox<String> nimSHCombo;
    private javax.swing.JComboBox<String> rfidSHCombo;
    private javax.swing.JLabel tapStudenLbl;
    private javax.swing.JLabel timeinMhsw;
    // End of variables declaration//GEN-END:variables
}
