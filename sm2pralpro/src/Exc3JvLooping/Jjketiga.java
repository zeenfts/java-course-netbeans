
package Exc3JvLooping;
import java.util.Scanner;

public class Jjketiga 
{  
    public static void main(String[] args)
    {
        
        for (int y=1; y<=100; y++) //nomor satu
        {
            if (y%2==0)
            {
                System.out.print(y);
            }
            else
            {
                System.out.print(" ");
            }
            
        }
        System.out.println();
        System.out.println();
         
         for(int q=0; q<7; q++) //nomor tiga
         {
          for(int s=6; s>q; s--)
          {
           System.out.print("*"+" ");
          }
           System.out.println();
         }
         System.out.println();
         
        Scanner userisi = new Scanner(System.in);
        String jawaban;
         
        do
        {
          System.out.println("------- PROGRAM INPUT ABSENSI -------");
          System.out.print("Masukkan Nama      : ");
          String nama = userisi.next();
          System.out.print("Masukkan NIM       : ");
          int nim = userisi.nextInt();
          System.out.print("Masukkan Kelas     : ");
          String kelass = userisi.next();
        
          System.out.println();
          System.out.println("Nama  : "+nama);
          System.out.println("NIM   : "+nim);
          System.out.println("Kelas : "+kelass);
          System.out.println("------- Absensi Berhasil di Input -------");
          System.out.println();
          System.out.println("Apakah ingin menginput lagi? (y/n)");
          jawaban = userisi.next();
         
        if(jawaban.equalsIgnoreCase("N"))
         {
          System.out.println("------- PROGRAM INPUT ABSENSI SELESAI -------");
          break;
         }
        else if(!(jawaban.equalsIgnoreCase("Y")||jawaban.equalsIgnoreCase("N")))
        {
         System.out.println("Maaf tidak ada pilihan tersebut");
        }
        } while(jawaban.equalsIgnoreCase("Y"));
        
    }
}
    

