
package Exc1JvFundamental;
import java.util.Scanner;

public class HitungLuasSegitiga 
{
    public static void main(String[] args) 
    {
     Scanner masukan = new Scanner(System.in);
     
     int Alas, Tinggi, Luas;
     
     System.out.println("--- Menghitung Luas Segitiga ---");
     System.out.println("================================");
     System.out.print("Masukkan panjang Alas segitiga (cm) = ");
     Alas = masukan.nextInt();
     System.out.print("Masukkan panjang Tinggi segitiga (cm) = ");
     Tinggi = masukan.nextInt();
     
     Luas = Alas*Tinggi*1/2;
     
     System.out.println();
     System.out.println("Luas segitiga adalah "+Luas+" cm");
    }
    
}
