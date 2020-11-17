
package Exc2JvConditionalStatement;
import java.util.Scanner;

public class Fakultasdipilih 
{
    public static void main(String[] args)
    {
     Scanner isi = new Scanner(System.in); 
     System.out.println("Jurusan di SMA: ");
     System.out.println("A. IPA");
     System.out.println("B. IPS");
     System.out.print("= ");
     String Jurusan = isi.nextLine();
     
     if("A".equalsIgnoreCase(Jurusan))
     {
      System.out.println("- Fakultas Rekayasa Industri");
      System.out.println("- Fakultas Teknik Elektro");
      System.out.println("- Fakultas Informatika");
     }
     else if("B".equalsIgnoreCase(Jurusan))
     {
      System.out.println("- Fakultas Ekonomi Bisnis");
      System.out.println("- Fakultas Komunikasi dan Bisnis");
      System.out.println("- Fakultas Industri Kreatif");
     }
     else
     {
      System.out.println("Maaf Pilihan Anda Tidak Ada");
     }
     
    }
    
}
