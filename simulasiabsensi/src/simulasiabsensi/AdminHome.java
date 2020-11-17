/*
By
Muhammad Difagama Ivanka
1202184310
SI-42-08
*/
package simulasiabsensi;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class AdminHome extends javax.swing.JFrame {
    Border bdr = BorderFactory.createLoweredSoftBevelBorder();  
Border bdr1 = BorderFactory.createRaisedSoftBevelBorder();  

    public AdminHome(String adm) {
        initComponents();
        admN.setText(adm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dmAH = new javax.swing.JLabel();
        ddAH = new javax.swing.JLabel();
        dmkAH = new javax.swing.JLabel();
        logoutAdmin = new javax.swing.JLabel();
        admN = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        dmAH.setBackground(new java.awt.Color(0, 204, 204));
        dmAH.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        dmAH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dmAH.setText("Data Mahasiswa");
        dmAH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dmAH.setOpaque(true);
        dmAH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dmAHMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dmAHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dmAHMouseExited(evt);
            }
        });
        getContentPane().add(dmAH);
        dmAH.setBounds(570, 340, 150, 40);

        ddAH.setBackground(new java.awt.Color(204, 0, 153));
        ddAH.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        ddAH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ddAH.setText("Data Dosen");
        ddAH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ddAH.setOpaque(true);
        ddAH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ddAHMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ddAHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ddAHMouseExited(evt);
            }
        });
        getContentPane().add(ddAH);
        ddAH.setBounds(570, 400, 150, 40);

        dmkAH.setBackground(new java.awt.Color(255, 102, 51));
        dmkAH.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        dmkAH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dmkAH.setText("Data Mata Kuliah");
        dmkAH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dmkAH.setOpaque(true);
        dmkAH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dmkAHMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dmkAHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dmkAHMouseExited(evt);
            }
        });
        getContentPane().add(dmkAH);
        dmkAH.setBounds(570, 460, 150, 40);

        logoutAdmin.setForeground(java.awt.Color.red);
        logoutAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit.png"))); // NOI18N
        logoutAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutAdminMouseClicked(evt);
            }
        });
        getContentPane().add(logoutAdmin);
        logoutAdmin.setBounds(1200, 650, 70, 64);

        admN.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        admN.setForeground(new java.awt.Color(255, 255, 255));
        admN.setText("Name of Admin");
        getContentPane().add(admN);
        admN.setBounds(40, 20, 130, 17);

        jLabel4.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hi,");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 20, 20, 17);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuit_paths_chips_black_pin_26298_1920x1080.jpg"))); // NOI18N
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-210, -200, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dmAHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dmAHMouseClicked
     new inputDM().show();
    }//GEN-LAST:event_dmAHMouseClicked

    private void ddAHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ddAHMouseClicked
     new inputDD().show();
    }//GEN-LAST:event_ddAHMouseClicked

    private void dmkAHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dmkAHMouseClicked
     new inputDMK().show();
    }//GEN-LAST:event_dmkAHMouseClicked

    private void logoutAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutAdminMouseClicked
        new LoginPage().show();
        this.dispose();
    }//GEN-LAST:event_logoutAdminMouseClicked

    private void dmAHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dmAHMouseEntered
      dmAH.setBorder(bdr);
      dmAH.setForeground(Color.gray);
    }//GEN-LAST:event_dmAHMouseEntered

    private void dmAHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dmAHMouseExited
    dmAH.setBorder(bdr1);
      dmAH.setForeground(Color.black);
    }//GEN-LAST:event_dmAHMouseExited

    private void ddAHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ddAHMouseEntered
      ddAH.setBorder(bdr);
      ddAH.setForeground(Color.gray);
    }//GEN-LAST:event_ddAHMouseEntered

    private void ddAHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ddAHMouseExited
       ddAH.setBorder(bdr1);
      ddAH.setForeground(Color.black);
    }//GEN-LAST:event_ddAHMouseExited

    private void dmkAHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dmkAHMouseEntered
     dmkAH.setBorder(bdr);
      dmkAH.setForeground(Color.gray);
    }//GEN-LAST:event_dmkAHMouseEntered

    private void dmkAHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dmkAHMouseExited
      dmkAH.setBorder(bdr1);
      dmkAH.setForeground(Color.black);
    }//GEN-LAST:event_dmkAHMouseExited

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
            new AdminHome(null).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admN;
    private javax.swing.JLabel ddAH;
    private javax.swing.JLabel dmAH;
    private javax.swing.JLabel dmkAH;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel logoutAdmin;
    // End of variables declaration//GEN-END:variables
}
