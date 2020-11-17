
package Exc2JvConditionalStatement;
import java.util.Scanner;

public class Penentuanmutunilai 
{
    public static void main(String[] args)
    {
     Scanner datadiri = new Scanner(System.in);
     System.out.print("Masukkan Nama Anda  : ");
     String nama = datadiri.nextLine();
     System.out.print("Masukkan NIM Anda   : ");
     String nim = datadiri.nextLine();
     System.out.print("Masukkan Nilai Anda : ");
     int nilai = datadiri.nextInt();
     System.out.println("--------------------------------------");
     
     if(nilai>=80)
     {
      System.out.println("Nama       : "+nama);
      System.out.println("NIM        : "+nim);
      System.out.println("Nilai      : "+nilai);
      System.out.println("Huruf Mutu : A");
     }
     else if(nilai>=70)
     {
      System.out.println("Nama       : "+nama);
      System.out.println("NIM        : "+nim);
      System.out.println("Nilai      : "+nilai);
      System.out.println("Huruf Mutu : AB");   
     }
     else if(nilai>=65)
     {
      System.out.println("Nama       : "+nama);
      System.out.println("NIM        : "+nim);
      System.out.println("Nilai      : "+nilai);
      System.out.println("Huruf Mutu : B");   
     }
     else if(nilai>=60)
     {
      System.out.println("Nama       : "+nama);
      System.out.println("NIM        : "+nim);
      System.out.println("Nilai      : "+nilai);
      System.out.println("Huruf Mutu : BC");   
     }
     else if(nilai>=50)
     {
      System.out.println("Nama       : "+nama);
      System.out.println("NIM        : "+nim);
      System.out.println("Nilai      : "+nilai);
      System.out.println("Huruf Mutu : C");   
     }
     else if(nilai>=40)
     {
      System.out.println("Nama       : "+nama);
      System.out.println("NIM        : "+nim);
      System.out.println("Nilai      : "+nilai);
      System.out.println("Huruf Mutu : D");   
     }  
     else
     {
      System.out.println("Nama       : "+nama);
      System.out.println("NIM        : "+nim);
      System.out.println("Nilai      : "+nilai);
      System.out.println("Huruf Mutu : E");   
     }
     
    }
    
}
