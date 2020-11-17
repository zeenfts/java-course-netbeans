/*
/*
By
Muhammad Difagama Ivanka
1202184310
SI-42-08
*/
package CalculatorTulisSendiri;

public class Calcuwriteonyourown extends javax.swing.JFrame 
{    
    double firstnum, secondnum, hasilakhir;
    String perhitungan;
    
    public Calcuwriteonyourown() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        langkaKeSatu = new javax.swing.JTextField();
        ltandaOperasinya = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        langkaKeDua = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lhasilnya = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        samaDengan = new javax.swing.JButton();
        operasiKali = new javax.swing.JButton();
        operasiKurang = new javax.swing.JButton();
        operasiTambah = new javax.swing.JButton();
        operasiBagi = new javax.swing.JButton();
        tandaHapus = new javax.swing.JButton();
        modulus = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator by Difagama");

        jLabel5.setBackground(new java.awt.Color(51, 0, 51));

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Angka 1");

        langkaKeSatu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        langkaKeSatu.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        langkaKeSatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                langkaKeSatuActionPerformed(evt);
            }
        });

        ltandaOperasinya.setEditable(false);
        ltandaOperasinya.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ltandaOperasinya.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ltandaOperasinya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ltandaOperasinyaActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Operasi");
        jLabel2.setAlignmentX(-1.0F);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Angka 2");

        langkaKeDua.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        langkaKeDua.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        langkaKeDua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                langkaKeDuaActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hasil");

        lhasilnya.setEditable(false);
        lhasilnya.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lhasilnya.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lhasilnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lhasilnyaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(langkaKeSatu)
                        .addGap(3, 3, 3)
                        .addComponent(ltandaOperasinya)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(langkaKeDua)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lhasilnya)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(langkaKeSatu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ltandaOperasinya, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(langkaKeDua, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lhasilnya, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBackground(java.awt.Color.darkGray);

        samaDengan.setBackground(java.awt.Color.lightGray);
        samaDengan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        samaDengan.setText("=");
        samaDengan.setToolTipText("");
        samaDengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samaDenganActionPerformed(evt);
            }
        });

        operasiKali.setBackground(java.awt.Color.lightGray);
        operasiKali.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        operasiKali.setText("*");
        operasiKali.setToolTipText("");
        operasiKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operasiKaliActionPerformed(evt);
            }
        });

        operasiKurang.setBackground(java.awt.Color.lightGray);
        operasiKurang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        operasiKurang.setText("-");
        operasiKurang.setToolTipText("");
        operasiKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operasiKurangActionPerformed(evt);
            }
        });

        operasiTambah.setBackground(java.awt.Color.lightGray);
        operasiTambah.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        operasiTambah.setText("+");
        operasiTambah.setToolTipText("");
        operasiTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operasiTambahActionPerformed(evt);
            }
        });

        operasiBagi.setBackground(java.awt.Color.lightGray);
        operasiBagi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        operasiBagi.setText("/");
        operasiBagi.setToolTipText("");
        operasiBagi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        operasiBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operasiBagiActionPerformed(evt);
            }
        });

        tandaHapus.setBackground(java.awt.Color.lightGray);
        tandaHapus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tandaHapus.setText("C");
        tandaHapus.setToolTipText("");
        tandaHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tandaHapusActionPerformed(evt);
            }
        });

        modulus.setBackground(java.awt.Color.lightGray);
        modulus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        modulus.setText("mod");
        modulus.setToolTipText("");
        modulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modulusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(operasiTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(tandaHapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(operasiKurang, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(operasiKali, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(operasiBagi, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(modulus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(samaDengan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(operasiKali, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operasiKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operasiTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operasiBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tandaHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modulus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(samaDengan, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void samaDenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samaDenganActionPerformed

        String jawaban;

        secondnum = Double.parseDouble(langkaKeDua.getText());

        switch (perhitungan) 
        {
            case "+":
                hasilakhir = firstnum + secondnum;
                jawaban = String.format("%.2f",hasilakhir);
                lhasilnya.setText(jawaban);
                break;
            case "-":
                hasilakhir = firstnum - secondnum;
                jawaban = String.format("%.2f",hasilakhir);
                lhasilnya.setText(jawaban);
                break;
            case "*":
                hasilakhir = firstnum * secondnum;
                jawaban = String.format("%.2f",hasilakhir);
                lhasilnya.setText(jawaban);
                break;
            case "/":
                hasilakhir = firstnum / secondnum;
                jawaban = String.format("%.2f",hasilakhir);
                lhasilnya.setText(jawaban);
                break;
            case "%":
                hasilakhir = firstnum % secondnum;
                jawaban = String.format("%.2f",hasilakhir);
                lhasilnya.setText(jawaban);
                break;
            default:
                break;
        }

    }//GEN-LAST:event_samaDenganActionPerformed

    private void lhasilnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lhasilnyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lhasilnyaActionPerformed

    private void operasiTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operasiTambahActionPerformed

        firstnum = Double.parseDouble(langkaKeSatu.getText());
        perhitungan = "+";
        ltandaOperasinya.setText(perhitungan+" ");

    }//GEN-LAST:event_operasiTambahActionPerformed

    private void operasiKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operasiKurangActionPerformed

        firstnum = Double.parseDouble(langkaKeSatu.getText());
        perhitungan = "-";
        ltandaOperasinya.setText(perhitungan+" ");

    }//GEN-LAST:event_operasiKurangActionPerformed

    private void operasiKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operasiKaliActionPerformed

        firstnum = Double.parseDouble(langkaKeSatu.getText());
        perhitungan = "*";
        ltandaOperasinya.setText(perhitungan+" ");

    }//GEN-LAST:event_operasiKaliActionPerformed

    private void operasiBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operasiBagiActionPerformed

        firstnum = Double.parseDouble(langkaKeSatu.getText());
        perhitungan = "/";
        ltandaOperasinya.setText(perhitungan+" ");

    }//GEN-LAST:event_operasiBagiActionPerformed

    private void ltandaOperasinyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ltandaOperasinyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ltandaOperasinyaActionPerformed

    private void langkaKeSatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_langkaKeSatuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_langkaKeSatuActionPerformed

    private void langkaKeDuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_langkaKeDuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_langkaKeDuaActionPerformed

    private void tandaHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tandaHapusActionPerformed

        langkaKeSatu.setText("");
        ltandaOperasinya.setText("");
        langkaKeDua.setText("");
        lhasilnya.setText("");
        
    }//GEN-LAST:event_tandaHapusActionPerformed

    private void modulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modulusActionPerformed
        firstnum = Double.parseDouble(langkaKeSatu.getText());
        perhitungan = "%";
        ltandaOperasinya.setText(perhitungan+" ");
    }//GEN-LAST:event_modulusActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calcuwriteonyourown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calcuwriteonyourown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calcuwriteonyourown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcuwriteonyourown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calcuwriteonyourown().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField langkaKeDua;
    private javax.swing.JTextField langkaKeSatu;
    private javax.swing.JTextField lhasilnya;
    private javax.swing.JTextField ltandaOperasinya;
    private javax.swing.JButton modulus;
    private javax.swing.JButton operasiBagi;
    private javax.swing.JButton operasiKali;
    private javax.swing.JButton operasiKurang;
    private javax.swing.JButton operasiTambah;
    private javax.swing.JButton samaDengan;
    private javax.swing.JButton tandaHapus;
    // End of variables declaration//GEN-END:variables
}
