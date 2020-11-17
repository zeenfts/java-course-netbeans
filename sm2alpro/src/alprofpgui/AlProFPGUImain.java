package alprofpgui;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AlProFPGUImain extends javax.swing.JFrame 
{
   
 public AlProFPGUImain() 
 {
  initComponents();
 }
 
  int jmlhTran=0;
  String input;
   
   ArrayList<String> dskrp = new ArrayList<>();
   ArrayList<String> pricee = new ArrayList<>();
//   String dskrp1[], pricee1[];
   
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        tulisFile = new javax.swing.JButton();
        perintahKlik = new java.awt.Label();
        bacaFile1 = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Program pengisian data by Difagama");
        setBackground(new java.awt.Color(0, 0, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.darkGray);

        tulisFile.setText("Menulis File");
        tulisFile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tulisFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tulisFileActionPerformed(evt);
            }
        });

        perintahKlik.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        perintahKlik.setText("Apa yang ingin anda lakukan?");

        bacaFile1.setText("Membaca File");
        bacaFile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bacaFile1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(perintahKlik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tulisFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bacaFile1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(perintahKlik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(tulisFile)
                .addGap(10, 10, 10)
                .addComponent(bacaFile1)
                .addGap(24, 24, 24))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tulisFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tulisFileActionPerformed
      try
        {
         File createFilee = new File("D:/Fprcssng/Barang.txt");
         createFilee.createNewFile();
         
         input = JOptionPane.showInputDialog(
                 "Masukkan jumlah barang yang akan anda data : ");
         jmlhTran = Integer.parseInt(input);
//         NewJFrame ghf = new NewJFrame();
         for(int a=0; a<jmlhTran; a++)
         {
//            ghf.setVisible(true);
//            ghf.setBackground(Color.BLACK);
           
          dskrp.add(a, JOptionPane.showInputDialog(null, 
                          "", "Nama Barang "+(a+1), 1));
          pricee.add(a, JOptionPane.showInputDialog(null, 
                                     "", "Harga Barang "+(a+1), 1));
         }
         
      PrintWriter nyetakNih = new PrintWriter(new FileWriter(
                                      "D:/Fprcssng/Barang.txt"));
      for(int b=0; b<jmlhTran; b++)
      {
       nyetakNih.write((b+1)+". Nama Barang  : "+dskrp.get(b)+", "
                            +"Harga Barang : "+pricee.get(b)+"\r\n");  
      }
      System.out.println("\r\n");
      JOptionPane.showMessageDialog(rootPane, "File berhasil ditulis:)");
      nyetakNih.close();
        }
         
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(rootPane, "File not created");
        }   
       
       
    }//GEN-LAST:event_tulisFileActionPerformed

    private void bacaFile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bacaFile1ActionPerformed
        BufferedReader bacaDiatas;
     try 
     {
      bacaDiatas = new BufferedReader(new FileReader("D:/Fprcssng/Barang.txt"));
     
         String tampilkan;
         while((tampilkan=bacaDiatas.readLine())!=null)          
         JOptionPane.showMessageDialog(rootPane, tampilkan, 
                 "Data barang anda", WIDTH);
     
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
    }//GEN-LAST:event_bacaFile1ActionPerformed

 public static void main(String args[]) 
 {
  
   java.awt.EventQueue.invokeLater(new Runnable() 
   {
    public void run() 
    {
     new AlProFPGUImain().setVisible(true);
    }
   });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bacaFile1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Label perintahKlik;
    private javax.swing.JButton tulisFile;
    // End of variables declaration//GEN-END:variables

    private void JList(String tampilkan) {
         
    }
}
