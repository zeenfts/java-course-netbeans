/*
By
Muhammad Difagama Ivanka
1202184310
SI-42-08
*/
package simulasiabsensi;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.*;
import java.sql.*;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class Mahasiswa_Data extends javax.swing.JFrame {
      Border bdr = BorderFactory.createLoweredSoftBevelBorder();  
  Border bdr1 = BorderFactory.createRaisedSoftBevelBorder(); 

  private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
  
    public Mahasiswa_Data() {
        initComponents();
        connection();
        showStudents();
        columnWidth();
    }
    
    public void connection() {
        try {
            String url = "jdbc:mysql://localhost:3306/dbsimulasiabsen";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
          
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        
        }

    }

    public void columnWidth() {
        TableColumn column;
        gridmahasiswa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        column = gridmahasiswa.getColumnModel().getColumn(0);
        column.setPreferredWidth(50);
        column = gridmahasiswa.getColumnModel().getColumn(1);
        column.setPreferredWidth(80);
        column = gridmahasiswa.getColumnModel().getColumn(2);
        column.setPreferredWidth(150);
        column = gridmahasiswa.getColumnModel().getColumn(3);
        column.setPreferredWidth(100);
        column = gridmahasiswa.getColumnModel().getColumn(4);
        column.setPreferredWidth(100);
        column = gridmahasiswa.getColumnModel().getColumn(5);
        column.setPreferredWidth(100);
        column = gridmahasiswa.getColumnModel().getColumn(6);
        column.setPreferredWidth(150);
    }

    public void showStudents() {
        DefaultTableModel kolom = new DefaultTableModel();
        kolom.addColumn("No");
        kolom.addColumn("NIM");
        kolom.addColumn("Nama Mahasiswa");
        kolom.addColumn("Kelas");
        kolom.addColumn("Jenis Kelamin");
        kolom.addColumn("Jurusan");
        kolom.addColumn("Fakultas");

        String db = "SELECT * FROM datamahasiswa";
        try {
            int i = 1;
            pst = con.prepareStatement(db);
            rs = pst.executeQuery();
            while (rs.next()) {
                kolom.addRow(new Object[]{
                    ("" + i++),
                    rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getString(4),rs.getString(5),
                    rs.getString(6)
                });
                gridmahasiswa.setModel(kolom);
                //BtnTambah.requestFocus();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridmahasiswa = new javax.swing.JTable();
        cancelBtn = new javax.swing.JLabel();
        printoutDMK = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 51));
        jLabel1.setText("Data Mahasiswa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(510, 30, 340, 50);

        jScrollPane1.setName("Informasi Buku"); // NOI18N

        gridmahasiswa.setAutoCreateRowSorter(true);
        gridmahasiswa.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        gridmahasiswa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        gridmahasiswa.setFont(new java.awt.Font("Garamond", 0, 12)); // NOI18N
        gridmahasiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        gridmahasiswa.setGridColor(new java.awt.Color(0, 0, 0));
        gridmahasiswa.setName(""); // NOI18N
        gridmahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridmahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(gridmahasiswa);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 150, 758, 370);

        cancelBtn.setBackground(java.awt.Color.pink);
        cancelBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelBtn.setText("<< Back");
        cancelBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
        getContentPane().add(cancelBtn);
        cancelBtn.setBounds(0, 10, 80, 23);

        printoutDMK.setBackground(java.awt.Color.pink);
        printoutDMK.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        printoutDMK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        printoutDMK.setText("Printout");
        printoutDMK.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        printoutDMK.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        printoutDMK.setOpaque(true);
        printoutDMK.setPreferredSize(new java.awt.Dimension(63, 23));
        printoutDMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printoutDMKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printoutDMKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printoutDMKMouseExited(evt);
            }
        });
        getContentPane().add(printoutDMK);
        printoutDMK.setBounds(630, 550, 130, 40);

        jLabel2.setBackground(new java.awt.Color(102, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/interior_style_design_home_hotel_living_room_83858_1280x720.jpg"))); // NOI18N
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gridmahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridmahasiswaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_gridmahasiswaMouseClicked

    private void cancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelBtnMouseClicked

    private void cancelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseEntered
cancelBtn.setForeground(Color.red);
    }//GEN-LAST:event_cancelBtnMouseEntered

    private void printoutDMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printoutDMKMouseClicked
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        jfc.showSaveDialog(null);

        PreparedStatement psm;
        ResultSet rss;
        String query ="SELECT * FROM datamahasiswa";
        try{
            psm = ConnecttoSQL.getConnection().prepareStatement(query);
            rss = psm.executeQuery();
            Document my_pdf_report = new Document();
            PdfWriter.getInstance(my_pdf_report,
                new FileOutputStream(jfc.getSelectedFile()
                    +"/Data Mahasiswa.pdf"));
            my_pdf_report.open();
            PdfPTable my_report_table = new PdfPTable(7);
            PdfPCell table_cell;

            String headerr = "NIM";
            table_cell=new PdfPCell(new Phrase(headerr));
            my_report_table.addCell(table_cell);
            String headerr1 = "Nama Mahasiswa";
            table_cell=new PdfPCell(new Phrase(headerr1));
            my_report_table.addCell(table_cell);
            String headerr2 = "Kelas";
            table_cell=new PdfPCell(new Phrase(headerr2));
            my_report_table.addCell(table_cell);
            String headerr3 = "Status";
            table_cell=new PdfPCell(new Phrase(headerr3));
            my_report_table.addCell(table_cell);
            String headerr4 = "Jenis Kelamin";
            table_cell=new PdfPCell(new Phrase(headerr4));
            my_report_table.addCell(table_cell);
            String headerr5 = "Jurusan";
            table_cell=new PdfPCell(new Phrase(headerr4));
            my_report_table.addCell(table_cell);
            String headerr6 = "Fakultas";
            table_cell=new PdfPCell(new Phrase(headerr4));
            my_report_table.addCell(table_cell);
            while (rss.next()) {

                String day = rss.getString("NIM");
                table_cell=new PdfPCell(new Phrase(day));
                my_report_table.addCell(table_cell);
                String time=rss.getString("Nama Mahasiswa");
                table_cell=new PdfPCell(new Phrase(time));
                my_report_table.addCell(table_cell);
                String code=rss.getString("Kelas");
                table_cell=new PdfPCell(new Phrase(code));
                my_report_table.addCell(table_cell);
                String lectures=rss.getString("Status");
                table_cell=new PdfPCell(new Phrase(lectures));
                my_report_table.addCell(table_cell);
                String room=rss.getString("Jenis Kelamin");
                table_cell=new PdfPCell(new Phrase(room));
                my_report_table.addCell(table_cell);
                 String jrs=rss.getString("Jurusan");
                table_cell=new PdfPCell(new Phrase(jrs));
                my_report_table.addCell(table_cell);
                 String fcy=rss.getString("Fakultas");
                table_cell=new PdfPCell(new Phrase(fcy));
                my_report_table.addCell(table_cell);
            }
            /* Attach report table to PDF */
            my_pdf_report.add(my_report_table);
            my_pdf_report.close();

            /* Close all DB related objects */
            rss.close();
            psm.close();
            ConnecttoSQL.getConnection().close();   }
        catch (SQLException | DocumentException | FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_printoutDMKMouseClicked

    private void printoutDMKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printoutDMKMouseEntered
     printoutDMK.setBorder(bdr);
      printoutDMK.setForeground(Color.gray);
    }//GEN-LAST:event_printoutDMKMouseEntered

    private void cancelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBtnMouseExited
      cancelBtn.setForeground(Color.white);
    }//GEN-LAST:event_cancelBtnMouseExited

    private void printoutDMKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printoutDMKMouseExited
     printoutDMK.setBorder(bdr1);
      printoutDMK.setForeground(Color.black);
    }//GEN-LAST:event_printoutDMKMouseExited

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
                | InstantiationException |
                IllegalAccessException |
                javax.swing.UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Mahasiswa_Data().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelBtn;
    private javax.swing.JTable gridmahasiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel printoutDMK;
    // End of variables declaration//GEN-END:variables
}
