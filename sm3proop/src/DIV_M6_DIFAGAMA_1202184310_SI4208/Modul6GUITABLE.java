package DIV_M6_DIFAGAMA_1202184310_SI4208;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Modul6GUITABLE extends javax.swing.JFrame {
    private DefaultTableModel dft;
    private final Border bdrEnt = BorderFactory.createLoweredSoftBevelBorder();  
    private final Border bdrExt = BorderFactory.createRaisedSoftBevelBorder();  

    public Modul6GUITABLE() {
        initComponents();
        columnWidth();
        showStuden();
    }

    private void columnWidth() {
        TableColumn column;
        tblBioMhsw.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        column = tblBioMhsw.getColumnModel().getColumn(0);
        column.setPreferredWidth(30);
        column = tblBioMhsw.getColumnModel().getColumn(1);
        column.setPreferredWidth(20);
        column = tblBioMhsw.getColumnModel().getColumn(2);
        column.setPreferredWidth(50);
        column = tblBioMhsw.getColumnModel().getColumn(3);
        column.setPreferredWidth(70);
    }
    
    private void showStuden() {
        DefaultTableModel kolom = new DefaultTableModel();
        kolom.addColumn("Nama");
        kolom.addColumn("Kelas");
        kolom.addColumn("Jurusan");
        kolom.addColumn("Fakultas");
   
        tblBioMhsw.setModel(kolom);      
    }
    
    private void clearFieldd() 
    {
     tfName.setText("");
     tfClass.setText("");
     tfJurusan.setText("");
     tfFaculty.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBioMhsw = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfClass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfJurusan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfFaculty = new javax.swing.JTextField();
        lbCreate = new javax.swing.JLabel();
        lbRead = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Latihan Modul 6 GUI & Table by Difagama");
        setMaximumSize(new java.awt.Dimension(880, 420));
        setName("frmLatihanM6"); // NOI18N
        setSize(new java.awt.Dimension(880, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        tblBioMhsw.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblBioMhsw);

        jLabel3.setText("Nama");

        jLabel2.setText("Kelas");

        jLabel4.setText("Jurusan");

        jLabel1.setText("Fakultas");

        lbCreate.setBackground(new java.awt.Color(51, 204, 0));
        lbCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCreate.setText("Add");
        lbCreate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbCreate.setOpaque(true);
        lbCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCreateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbCreateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbCreateMouseExited(evt);
            }
        });

        lbRead.setBackground(new java.awt.Color(255, 0, 0));
        lbRead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRead.setText("Read");
        lbRead.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbRead.setOpaque(true);
        lbRead.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbReadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbReadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbReadMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(294, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(21, 21, 21)
                                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(23, 23, 23)
                                .addComponent(tfClass, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)
                                .addComponent(tfJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(9, 9, 9)
                                .addComponent(tfFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbRead, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tfClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tfJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tfFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCreateMouseClicked
         dft = (DefaultTableModel) tblBioMhsw.getModel();
     
        String[] datanya = new String[4];
        datanya[0] = (tfName.getText());
        datanya[1] = (tfClass.getText());
        datanya[2] = (tfJurusan.getText());
        datanya[3] = (tfFaculty.getText());
        
        dft.addRow(datanya);
        JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan:)");
        clearFieldd();
    }//GEN-LAST:event_lbCreateMouseClicked

    private void lbCreateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCreateMouseEntered
        lbCreate.setForeground(Color.GRAY);
        lbCreate.setBorder(bdrEnt);
    }//GEN-LAST:event_lbCreateMouseEntered

    private void lbCreateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCreateMouseExited
        lbCreate.setForeground(Color.BLACK);
        lbCreate.setBorder(bdrExt);
    }//GEN-LAST:event_lbCreateMouseExited

    private void lbReadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbReadMouseClicked
        dft = (DefaultTableModel) tblBioMhsw.getModel();
        int grhd = tblBioMhsw.getSelectedRow();
        
        tfName.setText(String.valueOf(dft.getValueAt(grhd, 0)));
        tfClass.setText(String.valueOf(dft.getValueAt(grhd, 1)));
        tfJurusan.setText(String.valueOf(dft.getValueAt(grhd, 2)));
        tfFaculty.setText(String.valueOf(dft.getValueAt(grhd, 3)));
        JOptionPane.showMessageDialog(null, "<< Data telah tampil!!");
        clearFieldd();
    }//GEN-LAST:event_lbReadMouseClicked

    private void lbReadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbReadMouseEntered
        lbRead.setForeground(Color.GRAY);
        lbRead.setBorder(bdrEnt);
    }//GEN-LAST:event_lbReadMouseEntered

    private void lbReadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbReadMouseExited
        lbRead.setForeground(Color.BLACK);
        lbRead.setBorder(bdrExt);
    }//GEN-LAST:event_lbReadMouseExited

    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modul6GUITABLE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Modul6GUITABLE().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCreate;
    private javax.swing.JLabel lbRead;
    private javax.swing.JTable tblBioMhsw;
    private javax.swing.JTextField tfClass;
    private javax.swing.JTextField tfFaculty;
    private javax.swing.JTextField tfJurusan;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}

