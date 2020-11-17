
package Exc2JvConditionalStatement;
import java.util.Scanner;

public class Bilganjilgenap 
{
    public static void main(String[] args) 
    {
     Scanner angka = new Scanner(System.in);
     System.out.println("----- Menentukan Angka Ganjil/Genap -----");
     System.out.print("Silahkan Masukkan Angka: ");
     int angkauser = angka.nextInt();
     
     if(angkauser%2 != 0)
     {
     System.out.println("Angka Tersebut Adalah Bilangan Ganjil");    
     }
     else
     {
     System.out.println("Angka Tersebut Adalah Bilangan Genap");        
     }
     
    }
    
}
