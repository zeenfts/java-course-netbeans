/*
By
Muhammad Difagama Ivanka
1202184310
SI-42-08
*/
package simulasiabsensi;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;

public class inputDMK extends javax.swing.JFrame {
Border bdr = BorderFactory.createLoweredSoftBevelBorder();  
Border bdr1 = BorderFactory.createRaisedSoftBevelBorder();  

private Connection con;
  private PreparedStatement pst;
     private Statement st;
    private ResultSet rs;

    public inputDMK() {
        initComponents();
        connection();
        showLectures();
        columnWidth();
    }
    
    public void connection() {
      String url ="jdbc:mysql://localhost:3306/dbsimulasiabsen";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }

    }

    public void columnWidth() {
        TableColumn column;
    tableMKbsberubah.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        column = tableMKbsberubah.getColumnModel().getColumn(0);
        column.setPreferredWidth(10);
        column = tableMKbsberubah.getColumnModel().getColumn(1);
        column.setPreferredWidth(90);
        column = tableMKbsberubah.getColumnModel().getColumn(2);
        column.setPreferredWidth(80);
        column = tableMKbsberubah.getColumnModel().getColumn(3);
        column.setPreferredWidth(70);
        column = tableMKbsberubah.getColumnModel().getColumn(4);
        column.setPreferredWidth(150);
        column = tableMKbsberubah.getColumnModel().getColumn(5);
        column.setPreferredWidth(70);
//        column = tablePresensi.getColumnModel().getColumn(7);
//        column.setPreferredWidth(100);
//        column = tablePresensi.getColumnModel().getColumn(8);
//        column.setPreferredWidth(70);
//        column = tablePresensi.getColumnModel().getColumn(9);
//        column.setPreferredWidth(50);
    }

    public void showLectures() {
        DefaultTableModel kolom = new DefaultTableModel();
        kolom.addColumn("No");
        kolom.addColumn("Hari");
        kolom.addColumn("Waktu");
        kolom.addColumn("Kode");
        kolom.addColumn("Mata Kuliah");
        kolom.addColumn("Ruangan");
      
        String querry = "SELECT * FROM `datamatakuliah`";
         
        try {
            int i = 1;
            pst = con.prepareStatement(querry);
            rs = pst.executeQuery();
            while (rs.next()) {
                kolom.addRow(new Object[]{
                    ("" + i++),
                    rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getString(4),
                    rs.getString(5)
                });
                tableMKbsberubah.setModel(kolom);
                //BtnTambah.requestFocus();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
             
    }
    private void UpdateTabelll() {
        try {
            String sql = "SELECT * FROM `datamatakuliah`";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tableMKbsberubah.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void clearFieldd() 
    {
     harinya.setText("Hari");
     waktunya.setText("Waktu");
     kodenya.setText("Kode");
     mknya.setText("Mata Kuliah");
     roomnya.setText("Ruangan");
     harinya.setForeground(Color.gray);
     waktunya.setForeground(Color.gray);
     kodenya.setForeground(Color.gray);
     mknya.setForeground(Color.gray);
     roomnya.setForeground(Color.gray);
           }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        harinya = new javax.swing.JTextField();
        waktunya = new javax.swing.JTextField();
        kodenya = new javax.swing.JTextField();
        mknya = new javax.swing.JTextField();
        roomnya = new javax.swing.JTextField();
        backInputdm = new javax.swing.JLabel();
        addDM = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMKbsberubah = new javax.swing.JTable();
        updateDM = new javax.swing.JLabel();
        hapusDM = new javax.swing.JLabel();
        resetDM = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        getContentPane().setLayout(null);

        harinya.setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.background"));
        harinya.setForeground(java.awt.Color.gray);
        harinya.setText("Hari");
        harinya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                harinyaMouseClicked(evt);
            }
        });
        getContentPane().add(harinya);
        harinya.setBounds(870, 320, 234, 20);

        waktunya.setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.background"));
        waktunya.setForeground(java.awt.Color.gray);
        waktunya.setText("Waktu");
        waktunya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                waktunyaMouseClicked(evt);
            }
        });
        getContentPane().add(waktunya);
        waktunya.setBounds(870, 350, 234, 20);

        kodenya.setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.background"));
        kodenya.setForeground(java.awt.Color.gray);
        kodenya.setText("Kode");
        kodenya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kodenyaMouseClicked(evt);
            }
        });
        getContentPane().add(kodenya);
        kodenya.setBounds(870, 380, 234, 20);

        mknya.setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.background"));
        mknya.setForeground(java.awt.Color.gray);
        mknya.setText("Mata Kuliah");
        mknya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mknyaMouseClicked(evt);
            }
        });
        getContentPane().add(mknya);
        mknya.setBounds(870, 410, 234, 20);

        roomnya.setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.background"));
        roomnya.setForeground(java.awt.Color.gray);
        roomnya.setText("Ruangan");
        roomnya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomnyaMouseClicked(evt);
            }
        });
        getContentPane().add(roomnya);
        roomnya.setBounds(870, 440, 234, 20);

        backInputdm.setForeground(new java.awt.Color(255, 255, 255));
        backInputdm.setText("<< Back");
        backInputdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backInputdmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backInputdmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backInputdmMouseExited(evt);
            }
        });
        getContentPane().add(backInputdm);
        backInputdm.setBounds(20, 20, 70, 14);

        addDM.setBackground(new java.awt.Color(0, 204, 204));
        addDM.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        addDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addDM.setText("Add");
        addDM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addDM.setOpaque(true);
        addDM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addDMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addDMMouseExited(evt);
            }
        });
        getContentPane().add(addDM);
        addDM.setBounds(880, 490, 50, 23);

        jScrollPane1.setName("Informasi Buku"); // NOI18N

        tableMKbsberubah.setAutoCreateRowSorter(true);
        tableMKbsberubah.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        tableMKbsberubah.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tableMKbsberubah.setFont(new java.awt.Font("Garamond", 0, 12)); // NOI18N
        tableMKbsberubah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMKbsberubah.setGridColor(new java.awt.Color(0, 0, 0));
        tableMKbsberubah.setName(""); // NOI18N
        tableMKbsberubah.setShowGrid(false);
        tableMKbsberubah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMKbsberubahMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMKbsberubah);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 110, 780, 450);

        updateDM.setBackground(new java.awt.Color(102, 204, 0));
        updateDM.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        updateDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateDM.setText("Update");
        updateDM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateDM.setOpaque(true);
        updateDM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateDMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateDMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateDMMouseExited(evt);
            }
        });
        getContentPane().add(updateDM);
        updateDM.setBounds(940, 490, 70, 23);

        hapusDM.setBackground(new java.awt.Color(255, 204, 0));
        hapusDM.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        hapusDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hapusDM.setText("Hapus");
        hapusDM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hapusDM.setOpaque(true);
        hapusDM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusDMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hapusDMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hapusDMMouseExited(evt);
            }
        });
        getContentPane().add(hapusDM);
        hapusDM.setBounds(1020, 490, 70, 23);

        resetDM.setBackground(new java.awt.Color(204, 204, 255));
        resetDM.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        resetDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resetDM.setText("Reset");
        resetDM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resetDM.setOpaque(true);
        resetDM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetDMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetDMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetDMMouseExited(evt);
            }
        });
        getContentPane().add(resetDM);
        resetDM.setBounds(880, 530, 210, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/moon_moonlight_birds_121692_1280x720.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backInputdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backInputdmMouseClicked
      this.dispose();
    }//GEN-LAST:event_backInputdmMouseClicked

    private void harinyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_harinyaMouseClicked
       harinya.setText("");
       harinya.setForeground(Color.black);
    }//GEN-LAST:event_harinyaMouseClicked

    private void waktunyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_waktunyaMouseClicked
       waktunya.setText("");
       waktunya.setForeground(Color.black);
    }//GEN-LAST:event_waktunyaMouseClicked

    private void kodenyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kodenyaMouseClicked
       kodenya.setText("");
       kodenya.setForeground(Color.black);
    }//GEN-LAST:event_kodenyaMouseClicked

    private void mknyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mknyaMouseClicked
     mknya.setText("");
       mknya.setForeground(Color.black);
    }//GEN-LAST:event_mknyaMouseClicked

    private void roomnyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomnyaMouseClicked
     roomnya.setText("");
       roomnya.setForeground(Color.black);
    }//GEN-LAST:event_roomnyaMouseClicked

    private void addDMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDMMouseClicked
   String day = harinya.getText();
   String time = waktunya.getText();
   String codee = kodenya.getText();
   String mkl = mknya.getText();
   String rmm = roomnya.getText();
   
   PreparedStatement prs;
   String query = "INSERT INTO `datamatakuliah`(`Hari`, `Waktu`, "
           + "`Kode`, `Mata Kuliah`, `Ruangan`) "
           + "VALUES (?,?,?,?,?)";
   
        try 
        {
         prs = ConnecttoSQL.getConnection().prepareStatement(query);
         
         prs.setString(1, day);
         prs.setString(2, time);
         prs.setString(3, codee);
         prs.setString(4, mkl);
         prs.setString(5, rmm);
         
         if(prs.executeUpdate()>0)
             JOptionPane.showMessageDialog(null, "New data add");
         
         UpdateTabelll();
         showLectures();
        clearFieldd();
        } 
        catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_addDMMouseClicked

    private void backInputdmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backInputdmMouseEntered
      backInputdm.setForeground(Color.red);
    }//GEN-LAST:event_backInputdmMouseEntered

    private void backInputdmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backInputdmMouseExited
       backInputdm.setForeground(Color.white);
    }//GEN-LAST:event_backInputdmMouseExited

    private void addDMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDMMouseEntered
    addDM.setForeground(Color.gray);
      addDM.setBorder(bdr);
    }//GEN-LAST:event_addDMMouseEntered

    private void addDMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDMMouseExited
       addDM.setForeground(Color.black);
      addDM.setBorder(bdr1);
    }//GEN-LAST:event_addDMMouseExited

    private void tableMKbsberubahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMKbsberubahMouseClicked
       int grhd = tableMKbsberubah.getSelectedRow();
       PreparedStatement pmn;
       ResultSet rlt;
       String qyer = "SELECT * FROM `datamatakuliah` WHERE `Kode` ='"
           +tableMKbsberubah.getValueAt(grhd, 3)+"'";
  
        try 
        {
         pmn = ConnecttoSQL.getConnection().prepareStatement(qyer);
         rlt = pmn.executeQuery();
         
         while(rlt.next())
         {
          harinya.setText(rlt.getString("Hari"));
          waktunya.setText(rlt.getString("Waktu"));
          kodenya.setText(rlt.getString("Kode"));
          mknya.setText(rlt.getString("Mata Kuliah"));
          roomnya.setText(rlt.getString("Ruangan"));
         }
         
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tableMKbsberubahMouseClicked

    private void updateDMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateDMMouseClicked
        int grhd = tableMKbsberubah.getSelectedRow();
        String day = harinya.getText();
        String time = waktunya.getText();
        String codee = kodenya.getText();
        String mkl = mknya.getText();
        String rmm = roomnya.getText();
   
        PreparedStatement pss;
        String query = "UPDATE `datamatakuliah`SET `Hari`='"+day+
                            "', `Waktu` ='"+time
                            +"', `Kode` ='"+codee+
                            "', `Mata Kuliah`='"+mkl+
                            "', `Ruangan`='"+rmm+
           "' WHERE `Kode` ='"+tableMKbsberubah.getValueAt(grhd, 3)+"'";
   
        try {
        con = DriverManager.getConnection
        ("jdbc:mysql://localhost/dbsimulasiabsen", "root", "");
         pss = con.prepareStatement(query);
         pss.executeUpdate();
         pss.close();
         UpdateTabelll();
         showLectures();
         JOptionPane.showMessageDialog(null, "Data berubah");
        clearFieldd();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_updateDMMouseClicked

    private void updateDMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateDMMouseEntered
   updateDM.setForeground(Color.gray);
      updateDM.setBorder(bdr);
    }//GEN-LAST:event_updateDMMouseEntered

    private void updateDMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateDMMouseExited
     updateDM.setForeground(Color.black);
      updateDM.setBorder(bdr1);
    }//GEN-LAST:event_updateDMMouseExited

    private void hapusDMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusDMMouseClicked
    int grhd = tableMKbsberubah.getSelectedRow();
    String sqll = "DELETE FROM `datamatakuliah` WHERE `Kode`='"+
            tableMKbsberubah.getValueAt(grhd, 3)+"'";
    PreparedStatement pps;
        try {
            pps = con.prepareStatement(sqll);
            pps.execute();
            UpdateTabelll();
         showLectures();
         clearFieldd();
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_hapusDMMouseClicked

    private void hapusDMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusDMMouseEntered
    hapusDM.setForeground(Color.gray);
      hapusDM.setBorder(bdr);
    }//GEN-LAST:event_hapusDMMouseEntered

    private void hapusDMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusDMMouseExited
      hapusDM.setForeground(Color.black);
      hapusDM.setBorder(bdr1);
    }//GEN-LAST:event_hapusDMMouseExited

    private void resetDMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetDMMouseClicked
     clearFieldd();
    }//GEN-LAST:event_resetDMMouseClicked

    private void resetDMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetDMMouseEntered
     resetDM.setForeground(Color.gray);
      resetDM.setBorder(bdr);
    }//GEN-LAST:event_resetDMMouseEntered

    private void resetDMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetDMMouseExited
      resetDM.setForeground(Color.black);
      resetDM.setBorder(bdr1);
    }//GEN-LAST:event_resetDMMouseExited


    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info 
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
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
            new inputDMK().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addDM;
    private javax.swing.JLabel backInputdm;
    private javax.swing.JLabel hapusDM;
    private javax.swing.JTextField harinya;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kodenya;
    private javax.swing.JTextField mknya;
    private javax.swing.JLabel resetDM;
    private javax.swing.JTextField roomnya;
    private javax.swing.JTable tableMKbsberubah;
    private javax.swing.JLabel updateDM;
    private javax.swing.JTextField waktunya;
    // End of variables declaration//GEN-END:variables
}
