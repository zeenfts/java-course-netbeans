/*
 * Program bilangan bulat menggunakan pendekatan PIPO
 * By, Nama  : Muhammad Difagama Ivanka
 *     NIM   : 1202184310
 *     Kelas : SI 42-08
 */

package BilanganBulat;
import java.util.Scanner;

public class BilanganbulatbyDifagama
{
   public static void main(String[] args)
   {
    int biluser, hasilakhir=0, x, y; //preparation
    Scanner angkauser = new Scanner(System.in); //input
    System.out.print("Bilangan bulat??? "); //input
    biluser = angkauser.nextInt(); //input
    for (x=1; x<=biluser; x++)
    hasilakhir += x;
   
    for (x=0; x<100; x++) //process
    {
     if(biluser<=0) //process
     {  
      System.out.print("Maaf hanya bilangan bulat positif, "); //output
      System.out.print("Bilangan bulat??? "); //output
      biluser = angkauser.nextInt();
      for (y=1; y<=biluser; y++)
      hasilakhir += y; 
     }
     else if(biluser==1) //process
     {
      System.out.println(biluser+" = "+hasilakhir); //output
      break;
     }
     else if(biluser>0) //process
     {
      System.out.println("1+...+"+biluser+" = "+hasilakhir); //output
      break;    
     }
     
    }
    System.out.println("------- SELESAI -------"); //output
   }
    
}
