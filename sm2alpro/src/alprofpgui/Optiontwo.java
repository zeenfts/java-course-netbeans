package alprofpgui;
import java.io.*;
import javax.swing.JOptionPane;

public class Optiontwo extends javax.swing.JFrame 
{
    public Optiontwo()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenu1 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        confirm = new javax.swing.JButton();
        label6 = new java.awt.Label();
        cancelButton = new javax.swing.JButton();
        condition = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label7 = new java.awt.Label();
        label2 = new java.awt.Label();
        label8 = new java.awt.Label();
        weight = new javax.swing.JTextField();
        flavour = new javax.swing.JTextField();
        expired = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        name = new javax.swing.JTextField();
        label4 = new java.awt.Label();
        price = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        showtheData = new java.awt.Button();
        condition1 = new javax.swing.JTextField();
        label13 = new java.awt.Label();
        weight1 = new javax.swing.JTextField();
        flavour1 = new javax.swing.JTextField();
        expired1 = new javax.swing.JTextField();
        quantity1 = new javax.swing.JTextField();
        name1 = new javax.swing.JTextField();
        price1 = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("jMenu1");

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

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        confirm.setText("Ok");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        label6.setText("Kadaluarsa");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        condition.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                conditionInputMethodTextChanged(evt);
            }
        });
        condition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conditionActionPerformed(evt);
            }
        });

        label1.setText("Nama Barang");

        label7.setText("Kondisi");

        label2.setText("Harga ");

        label8.setText("Masukkan sebuah data barang random!");

        weight.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                weightInputMethodTextChanged(evt);
            }
        });
        weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightActionPerformed(evt);
            }
        });

        flavour.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                flavourInputMethodTextChanged(evt);
            }
        });
        flavour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flavourActionPerformed(evt);
            }
        });

        expired.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                expiredInputMethodTextChanged(evt);
            }
        });
        expired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expiredActionPerformed(evt);
            }
        });

        quantity.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                quantityInputMethodTextChanged(evt);
            }
        });
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        label3.setText("Jumlah");

        name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        name.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                nameInputMethodTextChanged(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        label4.setText("Berat");

        price.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                priceInputMethodTextChanged(evt);
            }
        });
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        label5.setText("Rasa");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Program output by Difagama");

        showtheData.setLabel("Tampilkan Data");
        showtheData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showtheDataActionPerformed(evt);
            }
        });

        condition1.setEditable(false);
        condition1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                condition1InputMethodTextChanged(evt);
            }
        });
        condition1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condition1ActionPerformed(evt);
            }
        });

        label13.setText("Tampilan Data Barang Random");

        weight1.setEditable(false);
        weight1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                weight1InputMethodTextChanged(evt);
            }
        });
        weight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weight1ActionPerformed(evt);
            }
        });

        flavour1.setEditable(false);
        flavour1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                flavour1InputMethodTextChanged(evt);
            }
        });
        flavour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flavour1ActionPerformed(evt);
            }
        });

        expired1.setEditable(false);
        expired1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                expired1InputMethodTextChanged(evt);
            }
        });
        expired1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expired1ActionPerformed(evt);
            }
        });

        quantity1.setEditable(false);
        quantity1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                quantity1InputMethodTextChanged(evt);
            }
        });
        quantity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantity1ActionPerformed(evt);
            }
        });

        name1.setEditable(false);
        name1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        name1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                name1InputMethodTextChanged(evt);
            }
        });
        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });

        price1.setEditable(false);
        price1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                price1InputMethodTextChanged(evt);
            }
        });
        price1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(expired1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(condition1)
                            .addComponent(flavour1)
                            .addComponent(weight1)
                            .addComponent(quantity1)
                            .addComponent(price1)
                            .addComponent(name1)
                            .addComponent(label13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(showtheData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(quantity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(weight1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(flavour1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(condition1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expired1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showtheData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showtheDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showtheDataActionPerformed
        BufferedReader bacaDiatas;
     try 
     {
      bacaDiatas = new BufferedReader(new FileReader
                                   ("D:/Fprcssng/Data 1 Barang Random.txt"));
    
         name1.setText(bacaDiatas.readLine());
         price1.setText(bacaDiatas.readLine());
         quantity1.setText(bacaDiatas.readLine());
         weight1.setText(bacaDiatas.readLine());
         flavour1.setText(bacaDiatas.readLine());
         condition1.setText(bacaDiatas.readLine());
         expired1.setText(bacaDiatas.readLine());
         bacaDiatas.close();
     } 
   
     catch (FileNotFoundException e) 
     {
         JOptionPane.showMessageDialog(rootPane, "File tidak ditemukan"); 
     }
     catch(IOException e)
     {
         JOptionPane.showMessageDialog(rootPane, "File gagal dibaca");
     }
    }//GEN-LAST:event_showtheDataActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        
    }//GEN-LAST:event_confirmActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
       
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void conditionInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_conditionInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_conditionInputMethodTextChanged

    private void conditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conditionActionPerformed

    private void weightInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_weightInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_weightInputMethodTextChanged

    private void weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightActionPerformed

    private void flavourInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_flavourInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_flavourInputMethodTextChanged

    private void flavourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flavourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flavourActionPerformed

    private void expiredInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_expiredInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_expiredInputMethodTextChanged

    private void expiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expiredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expiredActionPerformed

    private void quantityInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_quantityInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityInputMethodTextChanged

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void nameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_nameInputMethodTextChanged

    }//GEN-LAST:event_nameInputMethodTextChanged

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed

    }//GEN-LAST:event_nameActionPerformed

    private void priceInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_priceInputMethodTextChanged

    }//GEN-LAST:event_priceInputMethodTextChanged

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed

    }//GEN-LAST:event_priceActionPerformed

    private void name1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_name1InputMethodTextChanged

    }//GEN-LAST:event_name1InputMethodTextChanged

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed

    }//GEN-LAST:event_name1ActionPerformed

    private void quantity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantity1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantity1ActionPerformed

    private void quantity1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_quantity1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_quantity1InputMethodTextChanged

    private void expired1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expired1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expired1ActionPerformed

    private void expired1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_expired1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_expired1InputMethodTextChanged

    private void flavour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flavour1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flavour1ActionPerformed

    private void flavour1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_flavour1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_flavour1InputMethodTextChanged

    private void weight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weight1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weight1ActionPerformed

    private void weight1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_weight1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_weight1InputMethodTextChanged

    private void price1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price1ActionPerformed

    }//GEN-LAST:event_price1ActionPerformed

    private void price1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_price1InputMethodTextChanged

    }//GEN-LAST:event_price1InputMethodTextChanged

    private void condition1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condition1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_condition1ActionPerformed

    private void condition1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_condition1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_condition1InputMethodTextChanged

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Optiontwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Optiontwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Optiontwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Optiontwo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Optiontwo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField condition;
    private javax.swing.JTextField condition1;
    private javax.swing.JButton confirm;
    private javax.swing.JTextField expired;
    private javax.swing.JTextField expired1;
    private javax.swing.JTextField flavour;
    private javax.swing.JTextField flavour1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private java.awt.Label label13;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField price;
    private javax.swing.JTextField price1;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField quantity1;
    private java.awt.Button showtheData;
    private javax.swing.JTextField weight;
    private javax.swing.JTextField weight1;
    // End of variables declaration//GEN-END:variables
}
