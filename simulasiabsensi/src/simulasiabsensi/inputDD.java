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

public class inputDD extends javax.swing.JFrame {
Border bdr = BorderFactory.createLoweredSoftBevelBorder();  
Border bdr1 = BorderFactory.createRaisedSoftBevelBorder();  

private Connection con;
  private PreparedStatement pst;
     private Statement st;
    private ResultSet rs;

    public inputDD() {
        initComponents();
        connection();
        showLecturer();
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
    tableDataDosenBsberubah.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        column = tableDataDosenBsberubah.getColumnModel().getColumn(0);
        column.setPreferredWidth(10);
        column = tableDataDosenBsberubah.getColumnModel().getColumn(1);
        column.setPreferredWidth(80);
        column = tableDataDosenBsberubah.getColumnModel().getColumn(2);
        column.setPreferredWidth(100);
        column = tableDataDosenBsberubah.getColumnModel().getColumn(3);
        column.setPreferredWidth(70);
        column = tableDataDosenBsberubah.getColumnModel().getColumn(4);
        column.setPreferredWidth(60);
        column = tableDataDosenBsberubah.getColumnModel().getColumn(5);
        column.setPreferredWidth(80);
        column = tableDataDosenBsberubah.getColumnModel().getColumn(6);
        column.setPreferredWidth(80);
//        column = tablePresensi.getColumnModel().getColumn(7);
//        column.setPreferredWidth(100);
//        column = tablePresensi.getColumnModel().getColumn(8);
//        column.setPreferredWidth(70);
//        column = tablePresensi.getColumnModel().getColumn(9);
//        column.setPreferredWidth(50);
    }

    public void showLecturer() {
        DefaultTableModel kolom = new DefaultTableModel();
        kolom.addColumn("No");
        kolom.addColumn("NIDN");
        kolom.addColumn("Nama Dosen");
        kolom.addColumn("Status");
        kolom.addColumn("Mata Kuliah diampu");
        kolom.addColumn("Jurusan");
        kolom.addColumn("Fakultas");
      
        String querry = "SELECT * FROM `datadosen`";
         
        try {
            int i = 1;
            pst = con.prepareStatement(querry);
            rs = pst.executeQuery();
            while (rs.next()) {
                kolom.addRow(new Object[]{
                    ("" + i++),
                    rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6)
                });
                tableDataDosenBsberubah.setModel(kolom);
                //BtnTambah.requestFocus();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
             
    }
    private void UpdateTabelll() {
        try {
            String sql = "SELECT * FROM `datadosen`";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tableDataDosenBsberubah.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void clearFieldd() 
    {
     nidnnya.setText("NIDN");
     namanya.setText("Nama Dosen");
     statusnya.setText("Status");
     mkdnya.setText("Mata Kuliah diampu");
     jurnya.setText("Jurusan");
     fcltnya.setText("Fakultas");
     nidnnya.setForeground(Color.gray);
     namanya.setForeground(Color.gray);
     statusnya.setForeground(Color.gray);
     mkdnya.setForeground(Color.gray);
     jurnya.setForeground(Color.gray);
     fcltnya.setForeground(Color.gray);
           }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nidnnya = new javax.swing.JTextField();
        namanya = new javax.swing.JTextField();
        statusnya = new javax.swing.JTextField();
        mkdnya = new javax.swing.JTextField();
        jurnya = new javax.swing.JTextField();
        fcltnya = new javax.swing.JTextField();
        backInputdm = new javax.swing.JLabel();
        addDM = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDataDosenBsberubah = new javax.swing.JTable();
        updateDM = new javax.swing.JLabel();
        hapusDM = new javax.swing.JLabel();
        resetDM = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        getContentPane().setLayout(null);

        nidnnya.setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.background"));
        nidnnya.setForeground(java.awt.Color.gray);
        nidnnya.setText("NIDN");
        nidnnya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nidnnyaMouseClicked(evt);
            }
        });
        getContentPane().add(nidnnya);
        nidnnya.setBounds(870, 260, 234, 20);

        namanya.setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.background"));
        namanya.setForeground(java.awt.Color.gray);
        namanya.setText("Nama Dosen");
        namanya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                namanyaMouseClicked(evt);
            }
        });
        getContentPane().add(namanya);
        namanya.setBounds(870, 290, 234, 20);

        statusnya.setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.background"));
        statusnya.setForeground(java.awt.Color.gray);
        statusnya.setText("Status");
        statusnya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statusnyaMouseClicked(evt);
            }
        });
        getContentPane().add(statusnya);
        statusnya.setBounds(870, 320, 234, 20);

        mkdnya.setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.background"));
        mkdnya.setForeground(java.awt.Color.gray);
        mkdnya.setText("Mata Kuliah diampu");
        mkdnya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mkdnyaMouseClicked(evt);
            }
        });
        getContentPane().add(mkdnya);
        mkdnya.setBounds(870, 350, 234, 20);

        jurnya.setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.background"));
        jurnya.setForeground(java.awt.Color.gray);
        jurnya.setText("Jurusan");
        jurnya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jurnyaMouseClicked(evt);
            }
        });
        getContentPane().add(jurnya);
        jurnya.setBounds(870, 380, 234, 20);

        fcltnya.setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.background"));
        fcltnya.setForeground(java.awt.Color.gray);
        fcltnya.setText("Fakultas");
        fcltnya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fcltnyaMouseClicked(evt);
            }
        });
        fcltnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcltnyaActionPerformed(evt);
            }
        });
        getContentPane().add(fcltnya);
        fcltnya.setBounds(870, 410, 234, 20);

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
        addDM.setBounds(880, 460, 50, 23);

        jScrollPane1.setName("Informasi Buku"); // NOI18N

        tableDataDosenBsberubah.setAutoCreateRowSorter(true);
        tableDataDosenBsberubah.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        tableDataDosenBsberubah.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tableDataDosenBsberubah.setFont(new java.awt.Font("Garamond", 0, 12)); // NOI18N
        tableDataDosenBsberubah.setModel(new javax.swing.table.DefaultTableModel(
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
        tableDataDosenBsberubah.setGridColor(new java.awt.Color(0, 0, 0));
        tableDataDosenBsberubah.setName(""); // NOI18N
        tableDataDosenBsberubah.setShowGrid(false);
        tableDataDosenBsberubah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataDosenBsberubahMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDataDosenBsberubah);

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
        updateDM.setBounds(940, 460, 70, 23);

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
        hapusDM.setBounds(1020, 460, 70, 23);

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
        resetDM.setBounds(880, 500, 210, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/auto_night_sky_silhouette_stars_radiance_118955_1280x720.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backInputdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backInputdmMouseClicked
      this.dispose();
    }//GEN-LAST:event_backInputdmMouseClicked

    private void fcltnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcltnyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fcltnyaActionPerformed

    private void nidnnyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nidnnyaMouseClicked
       nidnnya.setText("");
       nidnnya.setForeground(Color.black);
    }//GEN-LAST:event_nidnnyaMouseClicked

    private void namanyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_namanyaMouseClicked
       namanya.setText("");
       namanya.setForeground(Color.black);
    }//GEN-LAST:event_namanyaMouseClicked

    private void statusnyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusnyaMouseClicked
     statusnya.setText("");
       statusnya.setForeground(Color.black);
    }//GEN-LAST:event_statusnyaMouseClicked

    private void mkdnyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mkdnyaMouseClicked
     mkdnya.setText("");
       mkdnya.setForeground(Color.black);
    }//GEN-LAST:event_mkdnyaMouseClicked

    private void jurnyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jurnyaMouseClicked
     jurnya.setText("");
      jurnya.setForeground(Color.black);
    }//GEN-LAST:event_jurnyaMouseClicked

    private void fcltnyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fcltnyaMouseClicked
      fcltnya.setText("");
       fcltnya.setForeground(Color.black);
    }//GEN-LAST:event_fcltnyaMouseClicked

    private void addDMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDMMouseClicked
   String nidn = nidnnya.getText();
   String name = namanya.getText();
   String stts = statusnya.getText();
   String mkdm = mkdnya.getText();
   String jrs = jurnya.getText();
   String fkl = fcltnya.getText();
   
   PreparedStatement prs;
   String query = "INSERT INTO `datadosen`(`NIDN`, `Nama`, "
           + "`Status`, `Mata Kuliah diampu`, `Jurusan`, `Fakultas`) "
           + "VALUES (?,?,?,?,?,?)";
   
        try 
        {
         prs = ConnecttoSQL.getConnection().prepareStatement(query);
         
         prs.setString(1, nidn);
         prs.setString(2, name);
         prs.setString(3, stts);
         prs.setString(4, mkdm);
         prs.setString(5, jrs);
         prs.setString(6, fkl);
         
         if(prs.executeUpdate()>0)
             JOptionPane.showMessageDialog(null, "New data add");
         
         UpdateTabelll();
         showLecturer();
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

    private void tableDataDosenBsberubahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataDosenBsberubahMouseClicked
        int grhd = tableDataDosenBsberubah.getSelectedRow();
   PreparedStatement pmn;
   ResultSet rlt;
   String qyer = "SELECT * FROM `datadosen` WHERE `NIDN` ='"
           +tableDataDosenBsberubah.getValueAt(grhd, 1)+"'";
  
        try 
        {
         pmn = ConnecttoSQL.getConnection().prepareStatement(qyer);
         rlt = pmn.executeQuery();
         
         while(rlt.next())
         {
          nidnnya.setText(rlt.getString("NIDN"));
          namanya.setText(rlt.getString("Nama"));
          statusnya.setText(rlt.getString("Status"));
          mkdnya.setText(rlt.getString("Mata Kuliah diampu"));
          jurnya.setText(rlt.getString("Jurusan"));
          fcltnya.setText(rlt.getString("Fakultas"));
         }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tableDataDosenBsberubahMouseClicked

    private void updateDMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateDMMouseClicked
    int grhd = tableDataDosenBsberubah.getSelectedRow();
   String nidn = nidnnya.getText();
   String name = namanya.getText();
   String stts = statusnya.getText();
   String jns = mkdnya.getText();
   String jrs = jurnya.getText();
   String fkl = fcltnya.getText();
   
    PreparedStatement pss;
   String query = "UPDATE `datadosen`SET `NIDN`='"+nidn+
           "', `Nama` ='"+name+
           "', `Status`='"+stts+
           "', `Mata Kuliah diampu`='"+jns+
           "', `Jurusan`='"+jrs+
           "', `Fakultas`='"+fkl+
           "' WHERE `NIDN` ='"+tableDataDosenBsberubah.getValueAt(grhd, 1)+"'";
   
        try {
        con = DriverManager.getConnection
        ("jdbc:mysql://localhost/dbsimulasiabsen", "root", "");
         pss = con.prepareStatement(query);
         pss.executeUpdate();
         pss.close();
         UpdateTabelll();
         showLecturer();
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
    int grhd = tableDataDosenBsberubah.getSelectedRow();
    String sqll = "DELETE FROM `datadosen` WHERE `NIDN`='"+
            tableDataDosenBsberubah.getValueAt(grhd, 1)+"'";
    PreparedStatement pps;
        try {
            pps = con.prepareStatement(sqll);
            pps.execute();
            UpdateTabelll();
         showLecturer();
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
            new inputDD().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addDM;
    private javax.swing.JLabel backInputdm;
    private javax.swing.JTextField fcltnya;
    private javax.swing.JLabel hapusDM;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jurnya;
    private javax.swing.JTextField mkdnya;
    private javax.swing.JTextField namanya;
    private javax.swing.JTextField nidnnya;
    private javax.swing.JLabel resetDM;
    private javax.swing.JTextField statusnya;
    private javax.swing.JTable tableDataDosenBsberubah;
    private javax.swing.JLabel updateDM;
    // End of variables declaration//GEN-END:variables
}
