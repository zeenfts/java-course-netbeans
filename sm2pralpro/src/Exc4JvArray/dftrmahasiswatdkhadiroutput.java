package Exc4JvArray;
import java.util.Scanner;

public class dftrmahasiswatdkhadiroutput
{
    public static void main(String[] args)
    {
     Scanner masuk = new Scanner(System.in);
     
     arrrobjectsource[] dataAbsensi = new arrrobjectsource[10];
     dataAbsensi[0] = new arrrobjectsource();
     
     System.out.println("==================================================");
     System.out.print("Jumlah Mahasiswa tidak hadir : ");
     dataAbsensi[0].jumlahData = masuk.nextInt();
     System.out.println("--------------------------------------------------");
     System.out.println("   Input Nama dan NIM mahasiswa yang tidak hadir");
     System.out.println("==================================================");
   
     for (int a=0; a<dataAbsensi[0].jumlahData; a++)
     {
      System.out.print("Masukkan Nama : ");
      dataAbsensi[0].namanya= masuk.next();
      System.out.print("Masukkan NIM  : ");
      dataAbsensi[0].nimnya= masuk.next();
      System.out.println();
     }
     
     System.out.println();
     System.out.println("==================================================");
     System.out.println("         Daftar mahasiswa yang tidak hadir");
     System.out.println("==================================================");
     System.out.println();
     
     for (int a=0; a<dataAbsensi[0].jumlahData; a++)
     {
      System.out.println("Nama : "+dataAbsensi[0].namanya);
      System.out.println("NIM  : "+dataAbsensi[0].nimnya);
      System.out.println();
     }
    }
    
}
