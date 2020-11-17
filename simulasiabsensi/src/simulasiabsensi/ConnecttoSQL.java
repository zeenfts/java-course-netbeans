/*
By
Muhammad Difagama Ivanka
1202184310
SI-42-08
*/
package simulasiabsensi;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConnecttoSQL 
{ 
    private static Connection cnt = null;
    
 public static Connection getConnection(){
     
        if(cnt==null)
        {
        try {
             String url="jdbc:mysql://127.0.0.1/DBsimulasiabsen";
              
//            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            cnt = DriverManager.getConnection(url, "root", "");
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
            
        }

        }
        return cnt;
    }
 
}
