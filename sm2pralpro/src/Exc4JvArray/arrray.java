package Exc4JvArray;
import java.util.Scanner;

public class arrray 
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in); 
     int jumlahPasien = 5;
     String dataObat[] = new String[jumlahPasien]; 
     
     System.out.println("Masukkan nama obat pasien :"); 
     for (int i = 0; i < dataObat.length; i++) 
     {
      System.out.print("Obat pasien ke-" + (i + 1) + " : "); 
      dataObat[i] = sc.nextLine(); 
     }
     
     System.out.println();
   
     System.out.println("Data obat yang diberikan ke pasien :"); 
     for (int i = 0; i < dataObat.length; i++) 
     {
      System.out.println("Obat pasien ke" + (i + 1) + "adalah " + dataObat[i]); 
     }
    }
}
