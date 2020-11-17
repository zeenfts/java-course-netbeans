/*
 NIM   : 1202184310
 NAMA  : MUHAMMAD DIFAGAMA IVANKA
 KELAS : SI 42-08
*/
package Exc4JvArray;
import java.util.Scanner;

public class jurnalzero 
{
    public static void main(String[] args) 
    {
     Scanner masuk = new Scanner (System.in);
     
     jurnalzerosource[]databuatTabel = new jurnalzerosource[1];
     databuatTabel[0] = new jurnalzerosource();
     
     System.out.println(databuatTabel[0].hiasannya[0]);
     System.out.println("     Input Daftar Barang yang dijual di Toko");
     System.out.println(databuatTabel[0].hiasannya[0]);
     
     for (int a=0; a<3; a++)
     {
     System.out.print("Masukkan nama barang "+ (a+1) +"     : ");
     databuatTabel[0].posisidiTabel[a][0]=masuk.next();
     System.out.print("Masukkan kualitas barang "+ (a+1) +" : ");
     databuatTabel[0].posisidiTabel[a][1]=masuk.next();
     System.out.print("Masukkan harga barang "+ (a+1) +"    : ");
     databuatTabel[0].posisidiTabel[a][2]=masuk.next();
     System.out.print("Masukkan stok barang "+ (a+1) +"     : ");
     databuatTabel[0].stokdiTabel[a][3]=masuk.nextInt();
     System.out.println();
     }
             
     System.out.println();
     System.out.println(databuatTabel[0].hiasannya[1]);
     System.out.print("                           ");
     System.out.println("Daftar barang dijual");                   
     System.out.println(databuatTabel[0].hiasannya[1]);
     System.out.println();
     
     System.out.print(databuatTabel[0].judulnya[0]);
     System.out.print(databuatTabel[0].judulnya[1]);
     System.out.print(databuatTabel[0].judulnya[2]);
     System.out.println(databuatTabel[0].judulnya[3]);
     System.out.println();
   
     for(int a=0; a<3; a++)
     {
     System.out.print(databuatTabel[0].posisidiTabel[0][a]);
     System.out.print("               ");
     }
     System.out.print(databuatTabel[0].stokdiTabel[0][3]);
     System.out.println();
     
     for(int a=0; a<3; a++)
     {
     System.out.print(databuatTabel[0].posisidiTabel[1][a]);
     System.out.print("               ");
     }
     System.out.print(databuatTabel[0].stokdiTabel[1][3]);
     System.out.println();
     
     for(int a=0; a<3; a++)
     {
     System.out.print(databuatTabel[0].posisidiTabel[2][a]);
     System.out.print("               ");
     }
     System.out.print(databuatTabel[0].stokdiTabel[2][3]);
     System.out.println();
     System.out.println();
     
     databuatTabel[0].totalStok = databuatTabel[0].stokdiTabel[0][3]
                                  +databuatTabel[0].stokdiTabel[1][3]
                                  +databuatTabel[0].stokdiTabel[2][3];
     
     System.out.println(databuatTabel[0].hiasannya[1]);
     System.out.print("Total :                                  ");
     System.out.println("                     "+databuatTabel[0].totalStok);
     System.out.println(databuatTabel[0].hiasannya[2]);
     
     if(databuatTabel[0].totalStok>0)
     {
      System.out.println("Stok barang masih ada bos Nussa :)");   
     }
     else if(databuatTabel[0].totalStok==0)
     {
      System.out.println("Stok barang habis bos Nussa !!!");  
     }
     else
     {
      System.out.println("Kita rugi bos Nussa :(");  
     }
     System.out.println(databuatTabel[0].hiasannya[1]);
     System.out.println();
    }
    
}
