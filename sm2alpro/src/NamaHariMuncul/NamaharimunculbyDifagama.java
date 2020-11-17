/*
 * Program nomor hari menggunakan pendekatan PIPO
 * By, Nama  : Muhammad Difagama Ivanka
 *     NIM   : 1202184310
 *     Kelas : SI 42-08
 */

package NamaHariMuncul;
import java.util.Scanner;

public class NamaharimunculbyDifagama
{
   public static void main(String[] args)
   {
    int nohari; //Preparation
    String theday; //Preparation
    Scanner userisi = new Scanner(System.in);  //Input
       
       for(theday="Y"; theday.equalsIgnoreCase("Y");) 
       {
        System.out.print("Tuliskan nomor hari : "); //Output
        nohari = userisi.nextInt();
        
        switch (nohari) 
        {
         case 1:
         System.out.println("= Hari Senin"); //output
         break;
            
         case 2:
         System.out.println("= Hari Selasa"); //output 
         break;
            
         case 3:
         System.out.println("= Hari Rabu"); //output   
         break;
            
         case 4:
         System.out.println("= Hari Kamis"); //output   
         break;
            
         case 5:
         System.out.println("= Hari Jum'at"); //output   
         break;
            
         case 6:
         System.out.println("= Hari Sabtu"); //output   
         break;
            
         case 7:
         System.out.println("= Hari Minggu"); //output   
         break;
            
         default:
         System.out.println("Maaf Seminggu Hanya Ada Tujuh Hari"); //output
         System.out.println("------- SELESAI -------");
         break;
        }   
        System.out.println();
        System.out.println("Run lagi (Y/N)??? ");
        theday = userisi.next();
        System.out.println("=======================");
       }
       System.out.println("------- SELESAI -------");
   }
    
}
   
