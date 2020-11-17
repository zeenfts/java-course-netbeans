
package Money;
import java.util.Scanner;

public class Uang 
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("<<Program Kasir>>");
      int harga = 0;
      System.out.println("Silakan pilih jenis bukunya: ");
      System.out.println("A. Novel");
      System.out.println("B. Buku");
      System.out.println("C. Biografi"); 
      System.out.print("= ");
      String buku = sc.nextLine();
      
      switch (buku) 
      { 
       case "A": 
           System.out.println("Anda memilih Novel"); 
           harga = 100000; 
           break;
       case "B":
           System.out.println("Anda memilih Buku");
           harga = 20000;
           break;
       case "C":
           System.out.println("Anda memilih Biografi");
           harga = 50000;
           break;
       default:
           System.out.println("Tidak terdapat jenis buku");
      } 
      
      System.out.println("Harga: " + harga);
      System.out.println("");
      System.out.print("Silakan Masukan uang yang akan dibayar: ");
      int uang = sc.nextInt();
      
      if (uang > harga) 
      {
        int kembalian = uang - harga;
        System.out.println("Kembalian anda: " + kembalian);
      } 
      else if (uang < harga) 
      {
        System.out.println("Maaf uang anda kurang");
      } 
      else 
      { 
        System.out.println("Uang anda pas");
      }  
      
    }  
    
}
    

