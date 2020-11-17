/*
By
Muhammad Difagama Ivanka
1202184310
SI-42-08
*/
package simulasiabsensi;
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class IdcardDosen extends javax.swing.JFrame {
    Border bdr = BorderFactory.createLoweredSoftBevelBorder();  
  Border bdr1 = BorderFactory.createRaisedSoftBevelBorder();  
  Format dateFormat = new SimpleDateFormat ("EEEEEEEEE, dd/MM/yyyy ");
   String tbt = dateFormat.format(new java.util.Date());
  
String filename = null;
byte[] theircardID = null;

    public IdcardDosen(String fn) {
        initComponents();
         tanggalandsn.setText(tbt);
        fnShowpresdsn.setText(fn);
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
                 jamdndng1.setText(time);
                }
    }
    }.start();
    }
    
    public void startCombo()
{
  PreparedStatement pst, pst1, pst2;
  ResultSet rst, rst1, rst2;
       
  String query = "SELECT * FROM `datadosen` Where "
          + "`Nama` ='"+fnShowpresdsn.getText()+"'";
        String query2 = "SELECT * FROM `rfidreader`";

        try {
            pst = ConnecttoSQL.getConnection().prepareStatement(query);
            rst = pst.executeQuery();
            pst2 = ConnecttoSQL.getConnection().prepareStatement(query2);
            rst2 = pst2.executeQuery();
            
            while(rst.next())    {
        nidndosenCombo.addItem(rst.getString("NIDN"));
        matkuldosenCombo.addItem(rst.getString("Mata Kuliah diampu"));
            }
            
              while(rst2.next())
        rfiddosenCombo.addItem(rst2.getString("Serial"));
               
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ktmMhsw = new javax.swing.JLabel();
        uploadKTM = new javax.swing.JLabel();
        tappDosen = new javax.swing.JLabel();
        rfiddosenCombo = new javax.swing.JComboBox<>();
        tanggalandsn = new javax.swing.JLabel();
        jamdndng1 = new javax.swing.JLabel();
        backDsnid = new javax.swing.JLabel();
        matkuldosenCombo = new javax.swing.JComboBox<>();
        nidndosenCombo = new javax.swing.JComboBox<>();
        fnShowpresdsn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        getContentPane().setLayout(null);

        ktmMhsw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/images.png"))); // NOI18N
        getContentPane().add(ktmMhsw);
        ktmMhsw.setBounds(320, 230, 225, 260);

        uploadKTM.setText("Upload KTM");
        uploadKTM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadKTMMouseClicked(evt);
            }
        });
        getContentPane().add(uploadKTM);
        uploadKTM.setBounds(90, 300, 70, 14);

        tappDosen.setBackground(java.awt.Color.pink);
        tappDosen.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        tappDosen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tappDosen.setText("Tapping");
        tappDosen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tappDosen.setOpaque(true);
        tappDosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tappDosenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tappDosenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tappDosenMouseExited(evt);
            }
        });
        getContentPane().add(tappDosen);
        tappDosen.setBounds(590, 390, 100, 30);

        rfiddosenCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Tipe RFID Reader>" }));
        getContentPane().add(rfiddosenCombo);
        rfiddosenCombo.setBounds(580, 270, 130, 20);

        tanggalandsn.setForeground(new java.awt.Color(255, 255, 255));
        tanggalandsn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tanggalandsn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(tanggalandsn);
        tanggalandsn.setBounds(650, 10, 130, 20);

        jamdndng1.setForeground(new java.awt.Color(255, 255, 255));
        jamdndng1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jamdndng1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(jamdndng1);
        jamdndng1.setBounds(530, 10, 110, 20);

        backDsnid.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        backDsnid.setForeground(new java.awt.Color(255, 255, 255));
        backDsnid.setText("<< Back");
        backDsnid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backDsnidMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backDsnidMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backDsnidMouseExited(evt);
            }
        });
        getContentPane().add(backDsnid);
        backDsnid.setBounds(550, 40, 60, 14);

        matkuldosenCombo.setMaximumRowCount(10);
        matkuldosenCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                 <Mata Kuliah>" }));
        getContentPane().add(matkuldosenCombo);
        matkuldosenCombo.setBounds(580, 320, 200, 20);

        nidndosenCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "      <NIDN>" }));
        getContentPane().add(nidndosenCombo);
        nidndosenCombo.setBounds(580, 240, 100, 20);

        fnShowpresdsn.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        fnShowpresdsn.setText("Fullname User");
        getContentPane().add(fnShowpresdsn);
        fnShowpresdsn.setBounds(320, 210, 210, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/magic_ball_library_columns_castle_63093_1280x720.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uploadKTMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadKTMMouseClicked
   JFileChooser jfc = new JFileChooser();
   jfc.showOpenDialog(null);
   File f = jfc.getSelectedFile();
   filename = f.getAbsolutePath();
   ImageIcon imgicn = new ImageIcon(new ImageIcon (filename).getImage()
 .getScaledInstance(ktmMhsw.getWidth(), ktmMhsw.getHeight(), Image.SCALE_SMOOTH));
   ktmMhsw.setIcon(imgicn);
        try 
        {
          File image = new File(filename) ;
          FileInputStream fis = new FileInputStream(image);
          ByteArrayOutputStream bos = new ByteArrayOutputStream();
          byte[] buf = new byte[1024];
          for(int readNum; (readNum=fis.read(buf))!=-1; )
          {
              bos.write(buf,0,readNum);
              
          }
        }  
        catch (IOException e) 
        {
          JOptionPane.showMessageDialog(null, e);  
        }
    }//GEN-LAST:event_uploadKTMMouseClicked

    private void tappDosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tappDosenMouseClicked
    String readerType  = String.valueOf(rfiddosenCombo.getSelectedItem());
    String nidn = String.valueOf(nidndosenCombo.getSelectedItem());
    String mkh = String.valueOf(matkuldosenCombo.getSelectedItem());
        PreparedStatement pst, pst1, pst2;
        ResultSet rst, rst2;
        String query1 = "SELECT * FROM `datadosen` where `NIDN` ='"+
                nidn+"' and `Mata Kuliah diampu` ='"+mkh+"'";
         String query2 = "SELECT * FROM `datamatakuliah` where `Mata kuliah` "
                 + "='"+mkh+"'";
    String query = "INSERT INTO `rfidcard`(`Rfid Reader No`, `Status`, `Id No.`"
            + ", `Name`, `Mata Kuliah`, `Tanggal Tap`, `Waktu Tap`, `Ruangan`, "
            + "`Kehadiran`)"
            + "VALUES (?,?,?,?,?,?,?,?,?)";
    
        try {
             pst = ConnecttoSQL.getConnection().prepareStatement(query);
              pst1 = ConnecttoSQL.getConnection().prepareStatement(query1);
             rst = pst1.executeQuery();
             pst2 = ConnecttoSQL.getConnection().prepareStatement(query2);
             rst2 = pst2.executeQuery();
             
             while(rst.next() && rst2.next()){
               
             pst.setString(1, readerType);
             pst.setString(2, "Dosen");
             pst.setString(3, nidn);
             pst.setString(4, rst.getString("Nama"));
             pst.setString(5, mkh);
             pst.setString(6, tanggalandsn.getText());
             pst.setString(7, jamdndng1.getText());
             pst.setString(8, rst2.getString("Ruangan"));
             pst.setString(9, "Hadir");
             }
              if(pst.executeUpdate() >0)
                JOptionPane.showMessageDialog(null, "Kehadiran tercatat :)");
              
             
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tappDosenMouseClicked

    private void backDsnidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backDsnidMouseClicked
       this.dispose();
    }//GEN-LAST:event_backDsnidMouseClicked

    private void backDsnidMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backDsnidMouseExited
   backDsnid.setForeground(Color.white);
    }//GEN-LAST:event_backDsnidMouseExited

    private void backDsnidMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backDsnidMouseEntered
       backDsnid.setForeground(Color.red);
    }//GEN-LAST:event_backDsnidMouseEntered

    private void tappDosenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tappDosenMouseEntered
   tappDosen.setBorder(bdr);
   tappDosen.setForeground(Color.gray);
    }//GEN-LAST:event_tappDosenMouseEntered

    private void tappDosenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tappDosenMouseExited
      tappDosen.setBorder(bdr1);
   tappDosen.setForeground(Color.black);
    }//GEN-LAST:event_tappDosenMouseExited

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : 
                   javax.swing.UIManager.getInstalledLookAndFeels()) {
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
            new IdcardDosen(null).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backDsnid;
    private javax.swing.JLabel fnShowpresdsn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jamdndng1;
    private javax.swing.JLabel ktmMhsw;
    private javax.swing.JComboBox<String> matkuldosenCombo;
    private javax.swing.JComboBox<String> nidndosenCombo;
    private javax.swing.JComboBox<String> rfiddosenCombo;
    private javax.swing.JLabel tanggalandsn;
    private javax.swing.JLabel tappDosen;
    private javax.swing.JLabel uploadKTM;
    // End of variables declaration//GEN-END:variables
}
