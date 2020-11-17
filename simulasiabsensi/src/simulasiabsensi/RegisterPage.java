/*
By
Muhammad Difagama Ivanka
1202184310
SI-42-08
*/
package simulasiabsensi;

import java.awt.Color;
import java.sql.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class RegisterPage extends javax.swing.JFrame {
Border bdr = BorderFactory.createLoweredSoftBevelBorder();  
Border bdr1 = BorderFactory.createRaisedSoftBevelBorder();  

    public RegisterPage() {
        initComponents();
        passReg.setEchoChar((char)0);
        repassReg.setEchoChar((char)0);
    }
    
    
    public boolean checkUserName(String username)
    {
     PreparedStatement pst;
     ResultSet rst;
     boolean checkUser = true;
 
     String query = "SELECT * FROM `logindb` WHERE `Username` =?";
        
     try 
     {
      pst = ConnecttoSQL.getConnection().prepareStatement(query);
      
      pst.setString(1, username);
      
      rst = pst.executeQuery();
            
      if(rst.next()==false)
      {
       checkUser = false;
      }
     } 
     catch (SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex);
     }
     return checkUser;
    }
    
    public boolean checkIdNo(String idn)
    {
     PreparedStatement pst;
     ResultSet rst;
     boolean checkId = true;

     String query = "SELECT * FROM `logindb` WHERE `Id No.` =?";
        
     try 
     {
      pst = ConnecttoSQL.getConnection().prepareStatement(query);
      
      pst.setString(1, idn);
      
      rst = pst.executeQuery();
            
      if(rst.next()==false)
      {
       checkId = false;
      }
     } 
     catch (SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex);
     }
     return checkId;
    }
    
    public boolean checkNIM(String nim)
    {
     PreparedStatement pst;
     ResultSet rst;
     boolean checkNim = false;
  
     String query = "SELECT * FROM `datamahasiswa` WHERE `NIM` =?";
        
     try 
     {
      pst = ConnecttoSQL.getConnection().prepareStatement(query);
      
      pst.setString(1, nim);
      
      rst = pst.executeQuery();
            
      if(rst.next()==false)
      {
       checkNim = true;
      }
     } 
     catch (SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex);
     }
     return checkNim;
    }
    
    public boolean checkNIDN(String nidn)
    {
     PreparedStatement pst;
     ResultSet rst;
     boolean checkNim = false;
  
     String query = "SELECT * FROM `datadosen` WHERE `NIDN` =?";
        
     try 
     {
      pst = ConnecttoSQL.getConnection().prepareStatement(query);
      
      pst.setString(1, nidn);
      
      rst = pst.executeQuery();
            
      if(rst.next()==false)
      {
       checkNim = true;
      }
     } 
     catch (SQLException ex)
     {
         JOptionPane.showMessageDialog(null, ex);
     }
     return checkNim;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundLP = new javax.swing.JPanel();
        fnReg = new javax.swing.JTextField();
        stsReg = new javax.swing.JComboBox<>();
        passReg = new javax.swing.JPasswordField();
        showpassReg = new javax.swing.JCheckBox();
        snReg = new javax.swing.JTextField();
        unReg = new javax.swing.JTextField();
        repassReg = new javax.swing.JPasswordField();
        showrepassReg = new javax.swing.JCheckBox();
        createAccount = new javax.swing.JLabel();
        inReg = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        miniBtn = new javax.swing.JLabel();
        backgroundSUP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        BackgroundLP.setBackground(new java.awt.Color(0, 255, 204));
        BackgroundLP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        BackgroundLP.setOpaque(false);
        BackgroundLP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BackgroundLPMouseDragged(evt);
            }
        });

        fnReg.setBackground(javax.swing.UIManager.getDefaults().getColor("Menu.background"));
        fnReg.setForeground(java.awt.Color.gray);
        fnReg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fnReg.setText("Full Name");
        fnReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fnRegMouseClicked(evt);
            }
        });

        stsReg.setBackground(java.awt.SystemColor.menu);
        stsReg.setForeground(java.awt.Color.gray);
        stsReg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dosen", "Mahasiswa", "                         *<Status>" }));
        stsReg.setSelectedIndex(2);
        stsReg.setPreferredSize(new java.awt.Dimension(77, 20));
        stsReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stsRegMouseClicked(evt);
            }
        });
        stsReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stsRegActionPerformed(evt);
            }
        });

        passReg.setBackground(java.awt.SystemColor.menu);
        passReg.setForeground(java.awt.Color.gray);
        passReg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passReg.setText("*Password");
        passReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passRegMouseClicked(evt);
            }
        });
        passReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passRegActionPerformed(evt);
            }
        });

        showpassReg.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        showpassReg.setOpaque(false);
        showpassReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassRegActionPerformed(evt);
            }
        });

        snReg.setBackground(java.awt.SystemColor.menu);
        snReg.setForeground(java.awt.Color.gray);
        snReg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        snReg.setText("Surname");
        snReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                snRegMouseClicked(evt);
            }
        });

        unReg.setBackground(java.awt.SystemColor.menu);
        unReg.setForeground(java.awt.Color.gray);
        unReg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unReg.setText("*Username");
        unReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unRegMouseClicked(evt);
            }
        });
        unReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unRegActionPerformed(evt);
            }
        });

        repassReg.setBackground(java.awt.SystemColor.menu);
        repassReg.setForeground(java.awt.Color.gray);
        repassReg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        repassReg.setText("*Re-Type Password");
        repassReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repassRegMouseClicked(evt);
            }
        });

        showrepassReg.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        showrepassReg.setOpaque(false);
        showrepassReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showrepassRegActionPerformed(evt);
            }
        });

        createAccount.setBackground(java.awt.Color.pink);
        createAccount.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        createAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createAccount.setText("Create Account");
        createAccount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createAccount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        createAccount.setOpaque(true);
        createAccount.setPreferredSize(new java.awt.Dimension(63, 23));
        createAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createAccountMouseExited(evt);
            }
        });

        inReg.setBackground(java.awt.SystemColor.menu);
        inReg.setForeground(java.awt.Color.gray);
        inReg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inReg.setText("*Id No.");
        inReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inRegMouseClicked(evt);
            }
        });
        inReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inRegActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(java.awt.Color.pink);
        cancelBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        cancelBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelBtn.setText("Cancel");
        cancelBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelBtn.setOpaque(true);
        cancelBtn.setPreferredSize(new java.awt.Dimension(63, 23));
        cancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelBtnMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SIGN UP PAGE");

        miniBtn.setBackground(java.awt.Color.lightGray);
        miniBtn.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        miniBtn.setForeground(new java.awt.Color(255, 255, 255));
        miniBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        miniBtn.setText("-");
        miniBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miniBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miniBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLPLayout = new javax.swing.GroupLayout(BackgroundLP);
        BackgroundLP.setLayout(BackgroundLPLayout);
        BackgroundLPLayout.setHorizontalGroup(
            BackgroundLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(miniBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(BackgroundLPLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(BackgroundLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLPLayout.createSequentialGroup()
                        .addGroup(BackgroundLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inReg)
                            .addComponent(stsReg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(unReg))
                        .addGap(45, 45, 45))
                    .addGroup(BackgroundLPLayout.createSequentialGroup()
                        .addGroup(BackgroundLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(repassReg)
                            .addComponent(passReg)
                            .addComponent(snReg)
                            .addComponent(fnReg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showrepassReg)
                            .addComponent(showpassReg))
                        .addGap(22, 22, 22))))
        );
        BackgroundLPLayout.setVerticalGroup(
            BackgroundLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLPLayout.createSequentialGroup()
                .addGroup(BackgroundLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(miniBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(fnReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(snReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(unReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(stsReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(inReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(BackgroundLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(BackgroundLPLayout.createSequentialGroup()
                        .addComponent(passReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(repassReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLPLayout.createSequentialGroup()
                        .addComponent(showpassReg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showrepassReg)))
                .addGap(23, 23, 23)
                .addComponent(createAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(BackgroundLP);
        BackgroundLP.setBounds(480, 170, 318, 380);

        backgroundSUP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/road_light_sky_forest_mountains_snow_118189_1920x1080.jpg"))); // NOI18N
        getContentPane().add(backgroundSUP);
        backgroundSUP.setBounds(-480, -140, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miniBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtnMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_miniBtnMouseClicked

    private void stsRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stsRegActionPerformed

    }//GEN-LAST:event_stsRegActionPerformed

    private void showpassRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassRegActionPerformed
        if(showpassReg.isSelected())
        passReg.setEchoChar((char)0);
        else
        passReg.setEchoChar('*');
    }//GEN-LAST:event_showpassRegActionPerformed

    private void showrepassRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showrepassRegActionPerformed
        if(showrepassReg.isSelected())
        repassReg.setEchoChar((char)0);
        else
        repassReg.setEchoChar('*');
    }//GEN-LAST:event_showrepassRegActionPerformed

    private void createAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountMouseClicked
        String fName = fnReg.getText();
        String sName = snReg.getText();
        String uName = unReg.getText();
        String stts  = String.valueOf(stsReg.getSelectedItem());
        String idNo  = inReg.getText();
        String pass  = String.valueOf(passReg.getPassword());
        String repass  = String.valueOf(repassReg.getPassword());

        if(uName.equals("") || stts.equals("") 
         || idNo.equals("") || pass.equals(""))
            JOptionPane.showMessageDialog(null, "*Requires Field");

        else if(!repass.equals(pass))
            JOptionPane.showMessageDialog(null, "Retype the password again");
        
        else if(checkUserName(uName))
         JOptionPane.showMessageDialog(null, "Username already exist!!!");
        
        else if(checkIdNo(idNo))
        JOptionPane.showMessageDialog(null, 
                              "Account with this Id No. already exist!!!");
        
        else if(stts.equals("Dosen")){
        if(checkNIDN(idNo))
JOptionPane.showMessageDialog(null, "This NIDN not yet registered!!!");
        }
        
        else if(stts.equals("Mahasiswa")){
        if(checkNIM(idNo))
JOptionPane.showMessageDialog(null, "This NIM not yet registered!!!");
        }
        
        else
        {
         PreparedStatement pst;
         String query = "INSERT INTO `LoginDB`"
         + "(`FullName`, `Surname`, `Username`, `Status`, `Id No.`, `Password`)"
                 + " VALUES (?,?,?,?,?,?)";

            try 
            {
                pst = ConnecttoSQL.getConnection().prepareStatement(query);
                
                 pst.setString(1, fName);
                pst.setString(2, sName);
                pst.setString(3, uName);
                pst.setString(4, stts);
                pst.setString(5, idNo);
                pst.setString(6, pass);

                if(pst.executeUpdate() >0)
                JOptionPane.showMessageDialog(null, "New User Add");
                
                this.dispose();
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, ex);
            }

        }
    }//GEN-LAST:event_createAccountMouseClicked

    private void inRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inRegActionPerformed

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        new LoginPage().show();
        this.dispose();
    }//GEN-LAST:event_cancelBtnMouseClicked

    private void cancelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseEntered
 cancelBtn.setBorder(bdr);
    cancelBtn.setForeground(Color.gray);
    }//GEN-LAST:event_cancelBtnMouseEntered

    private void BackgroundLPMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundLPMouseDragged

    }//GEN-LAST:event_BackgroundLPMouseDragged

    private void createAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountMouseEntered
  createAccount.setBorder(bdr);
    createAccount.setForeground(Color.gray);
    }//GEN-LAST:event_createAccountMouseEntered

    private void createAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountMouseExited
  createAccount.setBorder(bdr1);
    createAccount.setForeground(Color.black);
    }//GEN-LAST:event_createAccountMouseExited

    private void cancelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseExited
  cancelBtn.setBorder(bdr1);
    cancelBtn.setForeground(Color.black);
    }//GEN-LAST:event_cancelBtnMouseExited

    private void miniBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtnMouseEntered
      miniBtn.setForeground(Color.yellow);
    }//GEN-LAST:event_miniBtnMouseEntered

    private void miniBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtnMouseExited
      miniBtn.setForeground(Color.white);
    }//GEN-LAST:event_miniBtnMouseExited

    private void passRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passRegMouseClicked
   passReg.setText("");
      passReg.setEchoChar('*');
     passReg.setForeground(Color.black);
     passReg.setHorizontalAlignment(2);
    }//GEN-LAST:event_passRegMouseClicked

    private void passRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passRegActionPerformed

    private void fnRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnRegMouseClicked
      fnReg.setText("");
       fnReg.setForeground(Color.black);
       fnReg.setHorizontalAlignment(2);
    }//GEN-LAST:event_fnRegMouseClicked

    private void snRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snRegMouseClicked
      snReg.setText("");
       snReg.setForeground(Color.black);
       snReg.setHorizontalAlignment(2);
    }//GEN-LAST:event_snRegMouseClicked

    private void unRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unRegMouseClicked
     unReg.setText("");
       unReg.setForeground(Color.black);
       unReg.setHorizontalAlignment(2);
    }//GEN-LAST:event_unRegMouseClicked

    private void stsRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stsRegMouseClicked
       stsReg.setForeground(Color.black);
    }//GEN-LAST:event_stsRegMouseClicked

    private void inRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inRegMouseClicked
     inReg.setText("");
     inReg.setForeground(Color.black);
     inReg.setHorizontalAlignment(2);
    }//GEN-LAST:event_inRegMouseClicked

    private void repassRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repassRegMouseClicked
    repassReg.setText("");
      repassReg.setEchoChar('*');
     repassReg.setForeground(Color.black);
     repassReg.setHorizontalAlignment(2);
    }//GEN-LAST:event_repassRegMouseClicked

    private void unRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unRegActionPerformed

    
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
            new RegisterPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundLP;
    private javax.swing.JLabel backgroundSUP;
    private javax.swing.JLabel cancelBtn;
    private javax.swing.JLabel createAccount;
    private javax.swing.JTextField fnReg;
    private javax.swing.JTextField inReg;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel miniBtn;
    private javax.swing.JPasswordField passReg;
    private javax.swing.JPasswordField repassReg;
    private javax.swing.JCheckBox showpassReg;
    private javax.swing.JCheckBox showrepassReg;
    private javax.swing.JTextField snReg;
    private javax.swing.JComboBox<String> stsReg;
    private javax.swing.JTextField unReg;
    // End of variables declaration//GEN-END:variables
}
