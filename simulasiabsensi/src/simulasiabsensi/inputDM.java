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

public class inputDM extends javax.swing.JFrame {
Border bdr = BorderFactory.createLoweredSoftBevelBorder();  
Border bdr1 = BorderFactory.createRaisedSoftBevelBorder();  

private Connection con;
  private PreparedStatement pst;
     private Statement st;
    private ResultSet rs;

    public inputDM() {
        initComponents();
        connection();
        showStuden();
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
    tableDataMhswbsberubah.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        column = tableDataMhswbsberubah.getColumnModel().getColumn(0);
        column.setPreferredWidth(10);
        column = tableDataMhswbsberubah.getColumnModel().getColumn(1);
        column.setPreferredWidth(80);
        column = tableDataMhswbsberubah.getColumnModel().getColumn(2);
        column.setPreferredWidth(100);
        column = tableDataMhswbsberubah.getColumnModel().getColumn(3);
        column.setPreferredWidth(70);
        column = tableDataMhswbsberubah.getColumnModel().getColumn(4);
        column.setPreferredWidth(60);
        column = tableDataMhswbsberubah.getColumnModel().getColumn(5);
        column.setPreferredWidth(80);
        column = tableDataMhswbsberubah.getColumnModel().getColumn(6);
        column.setPreferredWidth(80);
        column = tableDataMhswbsberubah.getColumnModel().getColumn(7);
        column.setPreferredWidth(100);
//        column = tablePresensi.getColumnModel().getColumn(8);
//        column.setPreferredWidth(70);
//        column = tablePresensi.getColumnModel().getColumn(9);
//        column.setPreferredWidth(50);
    }

    public void showStuden() {
        DefaultTableModel kolom = new DefaultTableModel();
        kolom.addColumn("No");
        kolom.addColumn("NIM");
        kolom.addColumn("Nama Mahasiswa");
        kolom.addColumn("Kelas");
        kolom.addColumn("Status");
        kolom.addColumn("Jenis Kelamin");
        kolom.addColumn("Jurusan");
        kolom.addColumn("Fakultas");
      
        String querry = "SELECT * FROM `datamahasiswa`";
         
        try {
            int i = 1;
            pst = con.prepareStatement(querry);
            rs = pst.executeQuery();
            while (rs.next()) {
                kolom.addRow(new Object[]{
                    ("" + i++),
                    rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6),
                        rs.getString(7)
                });
                tableDataMhswbsberubah.setModel(kolom);
                //BtnTambah.requestFocus();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
             
    }
    
    private void UpdateTabelll() {
        try {
            String sql = "SELECT * FROM `datamahasiswa`";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            tableDataMhswbsberubah.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void clearFieldd() 
    {
     nimnya.setText("NIM");
     namanya.setText("Nama Mahasiswa");
     kelasnya.setText("Kelas");
     statusnya.setText("Status");
     jnsnya.setText("Jenis Kelamin");
     jurnya.setText("Jurusan");
     fcltnya.setText("Fakultas");
     nimnya.setForeground(Color.gray);
     namanya.setForeground(Color.gray);
     kelasnya.setForeground(Color.gray);
     statusnya.setForeground(Color.gray);
     jnsnya.setForeground(Color.gray);
     jurnya.setForeground(Color.gray);
     fcltnya.setForeground(Color.gray);
           }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nimnya = new javax.swing.JTextField();
        namanya = new javax.swing.JTextField();
        kelasnya = new javax.swing.JTextField();
        statusnya = new javax.swing.JTextField();
        jnsnya = new javax.swing.JTextField();
        jurnya = new javax.swing.JTextField();
        fcltnya = new javax.swing.JTextField();
        backInputdm = new javax.swing.JLabel();
        addDM = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDataMhswbsberubah = new javax.swing.JTable();
        updateDM = new javax.swing.JLabel();
        hapusDM = new javax.swing.JLabel();
        resetDM = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        nimnya.setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.background"));
        nimnya.setForeground(java.awt.Color.gray);
        nimnya.setText("NIM");
        nimnya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nimnyaMouseClicked(evt);
            }
        });
        getContentPane().add(nimnya);
        nimnya.setBounds(870, 260, 234, 20);

        namanya.setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.background"));
        namanya.setForeground(java.awt.Color.gray);
        namanya.setText("Nama Mahasiswa");
        namanya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                namanyaMouseClicked(evt);
            }
        });
        getContentPane().add(namanya);
        namanya.setBounds(870, 290, 234, 20);

        kelasnya.setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.background"));
        kelasnya.setForeground(java.awt.Color.gray);
        kelasnya.setText("Kelas");
        kelasnya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kelasnyaMouseClicked(evt);
            }
        });
        getContentPane().add(kelasnya);
        kelasnya.setBounds(870, 320, 234, 20);

        statusnya.setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.background"));
        statusnya.setForeground(java.awt.Color.gray);
        statusnya.setText("Status");
        statusnya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statusnyaMouseClicked(evt);
            }
        });
        getContentPane().add(statusnya);
        statusnya.setBounds(870, 350, 234, 20);

        jnsnya.setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.background"));
        jnsnya.setForeground(java.awt.Color.gray);
        jnsnya.setText("Jenis Kelamin");
        jnsnya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jnsnyaMouseClicked(evt);
            }
        });
        getContentPane().add(jnsnya);
        jnsnya.setBounds(870, 380, 234, 20);

        jurnya.setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.background"));
        jurnya.setForeground(java.awt.Color.gray);
        jurnya.setText("Jurusan");
        jurnya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jurnyaMouseClicked(evt);
            }
        });
        getContentPane().add(jurnya);
        jurnya.setBounds(870, 410, 234, 20);

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
        fcltnya.setBounds(870, 440, 234, 20);

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

        tableDataMhswbsberubah.setAutoCreateRowSorter(true);
        tableDataMhswbsberubah.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        tableDataMhswbsberubah.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tableDataMhswbsberubah.setFont(new java.awt.Font("Garamond", 0, 12)); // NOI18N
        tableDataMhswbsberubah.setModel(new javax.swing.table.DefaultTableModel(
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
        tableDataMhswbsberubah.setGridColor(new java.awt.Color(0, 0, 0));
        tableDataMhswbsberubah.setName(""); // NOI18N
        tableDataMhswbsberubah.setShowGrid(false);
        tableDataMhswbsberubah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMhswbsberubahMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDataMhswbsberubah);

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/road_sunset_horizon_marking_118582_1280x720.jpg"))); // NOI18N
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

    private void nimnyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nimnyaMouseClicked
       nimnya.setText("");
       nimnya.setForeground(Color.black);
    }//GEN-LAST:event_nimnyaMouseClicked

    private void namanyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_namanyaMouseClicked
       namanya.setText("");
       namanya.setForeground(Color.black);
    }//GEN-LAST:event_namanyaMouseClicked

    private void kelasnyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kelasnyaMouseClicked
       kelasnya.setText("");
       kelasnya.setForeground(Color.black);
    }//GEN-LAST:event_kelasnyaMouseClicked

    private void statusnyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusnyaMouseClicked
     statusnya.setText("");
       statusnya.setForeground(Color.black);
    }//GEN-LAST:event_statusnyaMouseClicked

    private void jnsnyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jnsnyaMouseClicked
     jnsnya.setText("");
       jnsnya.setForeground(Color.black);
    }//GEN-LAST:event_jnsnyaMouseClicked

    private void jurnyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jurnyaMouseClicked
     jurnya.setText("");
      jurnya.setForeground(Color.black);
    }//GEN-LAST:event_jurnyaMouseClicked

    private void fcltnyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fcltnyaMouseClicked
      fcltnya.setText("");
       fcltnya.setForeground(Color.black);
    }//GEN-LAST:event_fcltnyaMouseClicked

    private void addDMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDMMouseClicked
   String nim = nimnya.getText();
   String name = namanya.getText();
   String classs = kelasnya.getText();
   String stts = statusnya.getText();
   String jns = jnsnya.getText();
   String jrs = jurnya.getText();
   String fkl = fcltnya.getText();
   
   PreparedStatement prs;
   String query = "INSERT INTO `datamahasiswa`(`NIM`, `Nama Mahasiswa`, "
           + "`Kelas`, `Status`, `Jenis Kelamin`, `Jurusan`, `Fakultas`) "
           + "VALUES (?,?,?,?,?,?,?)";
   
        try 
        {
         prs = ConnecttoSQL.getConnection().prepareStatement(query);
         
         prs.setString(1, nim);
         prs.setString(2, name);
         prs.setString(3, classs);
         prs.setString(4, stts);
         prs.setString(5, jns);
         prs.setString(6, jrs);
         prs.setString(7, fkl);
         
         if(prs.executeUpdate()>0)
             JOptionPane.showMessageDialog(null, "New data add");
         
         UpdateTabelll();
         showStuden();
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

    private void tableDataMhswbsberubahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMhswbsberubahMouseClicked
       int grhd = tableDataMhswbsberubah.getSelectedRow();
   PreparedStatement pmn;
   ResultSet rlt;
   String qyer = "SELECT * FROM `datamahasiswa` WHERE `NIM` ='"
           +tableDataMhswbsberubah.getValueAt(grhd, 1)+"'";
  
        try 
        {
         pmn = ConnecttoSQL.getConnection().prepareStatement(qyer);
         rlt = pmn.executeQuery();
         
         while(rlt.next())
         {
          nimnya.setText(rlt.getString("NIM"));
          namanya.setText(rlt.getString("Nama Mahasiswa"));
          kelasnya.setText(rlt.getString("Kelas"));
          statusnya.setText(rlt.getString("Status"));
          jnsnya.setText(rlt.getString("Jenis Kelamin"));
          jurnya.setText(rlt.getString("Jurusan"));
          fcltnya.setText(rlt.getString("Fakultas"));
         }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tableDataMhswbsberubahMouseClicked

    private void updateDMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateDMMouseClicked
    int grhd = tableDataMhswbsberubah.getSelectedRow();
   String nim = nimnya.getText();
   String name = namanya.getText();
   String classs = kelasnya.getText();
   String stts = statusnya.getText();
   String jns = jnsnya.getText();
   String jrs = jurnya.getText();
   String fkl = fcltnya.getText();
   
    PreparedStatement pss;
   String query = "UPDATE `datamahasiswa`SET `NIM`='"+nim+
           "', `Nama Mahasiswa` ='"+name
           +"', `Kelas` ='"+classs+
           "', `Status`='"+stts+
           "', `Jenis Kelamin`='"+jns+
           "', `Jurusan`='"+jrs+
           "', `Fakultas`='"+fkl+
           "' WHERE `NIM` ='"+tableDataMhswbsberubah.getValueAt(grhd, 1)+"'";
   
        try {
        con = DriverManager.getConnection
        ("jdbc:mysql://localhost/dbsimulasiabsen", "root", "");
         pss = con.prepareStatement(query);
         pss.executeUpdate();
         pss.close();
         UpdateTabelll();
         showStuden();
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
    int grhd = tableDataMhswbsberubah.getSelectedRow();
    String sqll = "DELETE FROM `datamahasiswa` WHERE `NIM`='"+
            tableDataMhswbsberubah.getValueAt(grhd, 1)+"'";
    PreparedStatement pps;
        try {
            pps = con.prepareStatement(sqll);
            pps.execute();
            UpdateTabelll();
         showStuden();
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
            new inputDM().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addDM;
    private javax.swing.JLabel backInputdm;
    private javax.swing.JTextField fcltnya;
    private javax.swing.JLabel hapusDM;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jnsnya;
    private javax.swing.JTextField jurnya;
    private javax.swing.JTextField kelasnya;
    private javax.swing.JTextField namanya;
    private javax.swing.JTextField nimnya;
    private javax.swing.JLabel resetDM;
    private javax.swing.JTextField statusnya;
    private javax.swing.JTable tableDataMhswbsberubah;
    private javax.swing.JLabel updateDM;
    // End of variables declaration//GEN-END:variables
}
