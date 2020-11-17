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

public class LoginPage extends javax.swing.JFrame 
{    
 public LoginPage() 
 {
  initComponents();
  passWord.setEchoChar((char)0);
 }
    
 private void login()
 {
  PreparedStatement pst;  
  ResultSet rst;
  String name = userName.getText();
  String pss = String.valueOf(passWord.getPassword());
     
  String query = "SELECT * FROM `logindb` where `Username` ='"+name+"' "
          + "AND `Password` ='"+pss+"'";
     
  try 
  {
   pst = ConnecttoSQL.getConnection().prepareStatement(query);
   rst = pst.executeQuery();
            
   while(rst.next())
   {
  
      if (rst.getString("Status").equals("Admin")) {
                new AdminHome(name).show();
                this.dispose();
      }
      else if (rst.getString("Status").equals("Dosen")) {
                new DosenHome(name).show();
                this.dispose();
        }
     else if (rst.getString("Status").equals("Mahasiswa")) {
                new StudentHome(name).show();
                this.dispose();
      }
  
    else if(!(name.equals(rst.getString("Username"))))
    {
       JOptionPane.showMessageDialog(null, "Wrong Username entered!!");
    }
    else if(!(pss.equals(rst.getString("Password"))))
    {
       JOptionPane.showMessageDialog(null, "Wrong data entered!!");
    }}
   }
   catch (SQLException ex) 
   {
      JOptionPane.showMessageDialog(null, ex);
   }
  }
    
    private void clearField() 
    {
     userName.setText("Username");
     passWord.setText("Password");
     passWord.setEchoChar((char)0);
     userName.setForeground(Color.gray);
     passWord.setForeground(Color.gray);
           }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        BackgroundLP = new javax.swing.JPanel();
        userName = new javax.swing.JTextField();
        showPass = new javax.swing.JCheckBox();
        passWord = new javax.swing.JPasswordField();
        signUp = new javax.swing.JLabel();
        signIn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JLabel();
        miniBtn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jScrollPane1.setViewportView(jTree1);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        BackgroundLP.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 1, true));
        BackgroundLP.setOpaque(false);
        BackgroundLP.setPreferredSize(new java.awt.Dimension(395, 206));
        BackgroundLP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BackgroundLPMouseDragged(evt);
            }
        });

        userName.setBackground(java.awt.SystemColor.menu);
        userName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userName.setForeground(java.awt.Color.gray);
        userName.setText("Username");
        userName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userNameMouseClicked(evt);
            }
        });
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });

        showPass.setForeground(new java.awt.Color(255, 255, 255));
        showPass.setOpaque(false);
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });

        passWord.setBackground(java.awt.SystemColor.menu);
        passWord.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passWord.setForeground(java.awt.Color.gray);
        passWord.setText("Password");
        passWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passWordMouseClicked(evt);
            }
        });

        signUp.setBackground(java.awt.Color.pink);
        signUp.setForeground(new java.awt.Color(255, 255, 255));
        signUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUp.setText("Sign Up now");
        signUp.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        signUp.setPreferredSize(new java.awt.Dimension(63, 23));
        signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpMouseExited(evt);
            }
        });

        signIn.setBackground(java.awt.Color.pink);
        signIn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        signIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signIn.setText("Login");
        signIn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signIn.setOpaque(true);
        signIn.setPreferredSize(new java.awt.Dimension(63, 23));
        signIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signInMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("HOMEPAGE");

        exitBtn.setBackground(java.awt.Color.red);
        exitBtn.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitBtn.setText("X");
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBtnMouseExited(evt);
            }
        });

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

        jLabel5.setText("Don't have account?");

        javax.swing.GroupLayout BackgroundLPLayout = new javax.swing.GroupLayout(BackgroundLP);
        BackgroundLP.setLayout(BackgroundLPLayout);
        BackgroundLPLayout.setHorizontalGroup(
            BackgroundLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLPLayout.createSequentialGroup()
                .addGroup(BackgroundLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLPLayout.createSequentialGroup()
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(miniBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4))
                    .addGroup(BackgroundLPLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(BackgroundLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLPLayout.createSequentialGroup()
                                .addComponent(passWord, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showPass))
                            .addComponent(signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BackgroundLPLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGap(10, 10, 10))
        );
        BackgroundLPLayout.setVerticalGroup(
            BackgroundLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLPLayout.createSequentialGroup()
                .addGroup(BackgroundLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLPLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(miniBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLPLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4)))
                .addGap(39, 39, 39)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(BackgroundLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showPass)
                    .addComponent(passWord, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(BackgroundLPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        getContentPane().add(BackgroundLP);
        BackgroundLP.setBounds(510, 230, 270, 240);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/milky_way_august_sky_fir-trees_trees_night_45544_1920x1080.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-310, 0, 1920, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitBtnMouseClicked

    private void miniBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtnMouseClicked
     this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_miniBtnMouseClicked

    private void BackgroundLPMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundLPMouseDragged
       
    }//GEN-LAST:event_BackgroundLPMouseDragged

    private void signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseClicked
        new RegisterPage().show();
       this.dispose();
    }//GEN-LAST:event_signUpMouseClicked

    private void signInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInMouseClicked
    login();
    clearField();
    }//GEN-LAST:event_signInMouseClicked

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        if(showPass.isSelected())
        passWord.setEchoChar((char)0);
        else
        passWord.setEchoChar('*');
    }//GEN-LAST:event_showPassActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed

    }//GEN-LAST:event_userNameActionPerformed

    private void signInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInMouseEntered
     Border bdr = BorderFactory.createLoweredSoftBevelBorder();  
    signIn.setBorder(bdr);
    signIn.setForeground(Color.gray);
    }//GEN-LAST:event_signInMouseEntered

    private void signInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInMouseExited
      Border bdr = BorderFactory.createRaisedSoftBevelBorder();  
    signIn.setBorder(bdr);
    signIn.setForeground(Color.black);
    }//GEN-LAST:event_signInMouseExited

    private void userNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameMouseClicked
       userName.setText("");
       userName.setForeground(Color.black);
    }//GEN-LAST:event_userNameMouseClicked

    private void passWordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passWordMouseClicked
     passWord.setText("");
      passWord.setEchoChar('*');
     passWord.setForeground(Color.black);
    }//GEN-LAST:event_passWordMouseClicked

    private void signUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseEntered
     signUp.setForeground(Color.blue);
    }//GEN-LAST:event_signUpMouseEntered

    private void signUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseExited
      signUp.setForeground(Color.white);
    }//GEN-LAST:event_signUpMouseExited

    private void exitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseEntered
       exitBtn.setForeground(Color.red);
    }//GEN-LAST:event_exitBtnMouseEntered

    private void exitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseExited
      exitBtn.setForeground(Color.white);
    }//GEN-LAST:event_exitBtnMouseExited

    private void miniBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtnMouseEntered
     miniBtn.setForeground(Color.yellow);
    }//GEN-LAST:event_miniBtnMouseEntered

    private void miniBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtnMouseExited
  miniBtn.setForeground(Color.white);
    }//GEN-LAST:event_miniBtnMouseExited

    public static void main(String args[]) 
    {   
     try 
     {
      for (javax.swing.UIManager.LookAndFeelInfo info :
              javax.swing.UIManager.getInstalledLookAndFeels()) 
      {
       if ("Windows".equals(info.getName())) 
       {
        javax.swing.UIManager.setLookAndFeel(info.getClassName());
        break;
       }
      }
     } 
    catch (ClassNotFoundException |
            InstantiationException |
            IllegalAccessException |
            javax.swing.UnsupportedLookAndFeelException ex) 
     {
      java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     }
     
        java.awt.EventQueue.invokeLater(() -> {
            new LoginPage().setVisible(true);
     });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundLP;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel miniBtn;
    private javax.swing.JPasswordField passWord;
    private javax.swing.JCheckBox showPass;
    private javax.swing.JLabel signIn;
    private javax.swing.JLabel signUp;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
