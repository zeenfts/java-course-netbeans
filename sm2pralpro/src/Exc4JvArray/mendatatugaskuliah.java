package Exc4JvArray;
import java.util.Scanner;

public class mendatatugaskuliah 
{
    public static void main(String[] args)
    {
     Scanner masuk = new Scanner(System.in);
     int jumlahData=3;
     String Matakuliah[]=new String[jumlahData];
     String Deadline[]=new String[jumlahData];
     
     System.out.println();
     System.out.println("==================================================");
     System.out.println("                  Daftar Tugas");
     System.out.println("==================================================");
     System.out.println();
    
     for (int a=0; a<Matakuliah.length&&a<Deadline.length; a++)
     {
      System.out.print("Mata Kuliah : ");
      Matakuliah[a]= masuk.nextLine();
      System.out.print("Deadline    : ");
      Deadline[a]= masuk.nextLine();
      System.out.println();
     }
     
    }
    
}
