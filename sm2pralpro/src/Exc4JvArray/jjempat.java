package Exc4JvArray;
import java.util.Scanner;

public class jjempat
{    
    public static void main(String[] args) 
    {
       String [][] posisiDuduk= {{"A","B","C"}, {"D","E","F"}, {"G","H","I"}};
       
       for(String b[] : posisiDuduk)
       {
        for(String k : b)
        {
         System.out.print(k+"\t");   
        }
        System.out.println();
       }
       
       Scanner masuk = new Scanner(System.in);
        
       System.out.print("\nJumlah Donatur yang di input : ");
       int jumlahDonatur = masuk.nextInt();
       
       String[] namaDonatur = new String[jumlahDonatur];
       int[] jumlahDonasi = new int[jumlahDonatur];
       
       System.out.println("==========================================");
       System.out.println("\tInput Donatur");
       System.out.println("==========================================");
       
       for(int a=0; a<namaDonatur.length&&a<jumlahDonasi.length; a++)
       {
        namaDonatur[a] = masuk.nextLine();
        System.out.print("Nama          : ");
        namaDonatur[a] = masuk.nextLine();
        System.out.print("Jumlah Donasi : Rp ");
        jumlahDonasi[a] = masuk.nextInt();
        System.out.println("-----------------------------------");   
       }
       
       System.out.println("\n\n==============--------------==============");
       System.out.println("\t      Daftar Donatur");
       System.out.println("==============--------------==============");
       
     
       for(int a=0; a<namaDonatur.length&&a<jumlahDonasi.length; a++)
       {
        System.out.println(namaDonatur[a]+" : Rp "+jumlahDonasi[a]);
       }
       
       int totalDonasi = 0;
       System.out.println("__________________________________________");
       System.out.println("Jumlah Donatur : "+jumlahDonatur);
       for(int a=0; a<namaDonatur.length&&a<jumlahDonasi.length; a++)
       totalDonasi += jumlahDonasi[a];
       System.out.println("Total Donasi   : "+totalDonasi);
    }
}
