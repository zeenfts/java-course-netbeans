
package Exc1JvFundamental;
import java.util.Scanner;

public class Hitungnilai 
{
    public static void main(String[] args) 
    {
     Scanner angka = new Scanner(System.in);
     
     double NilaiAlPro, NilaiBahasaInggris, NilaiAgama, NilaiSistemOperasi;
     double NilaiRataRata;
     String Enter;
     
     System.out.print("Selamat Datang di Program ini. press Enter");
     Enter = angka.nextLine();
     System.out.println();
     System.out.print("Silahkan Masukkan Nilai Anda! press Enter");
     Enter = angka.nextLine();
     System.out.println();
     
     System.out.print("Nilai AlPro = ");
     NilaiAlPro=angka.nextDouble();
     System.out.print("Nilai Bahasa Inggris = ");
     NilaiBahasaInggris=angka.nextDouble(); 
     System.out.print("Nilai Agama = ");
     NilaiAgama=angka.nextDouble(); 
     System.out.print("Nilai Sistem Operasi = ");
     NilaiSistemOperasi=angka.nextDouble();
     
     NilaiRataRata=(NilaiAlPro + NilaiBahasaInggris + NilaiAgama + NilaiSistemOperasi) / 4;
     System.out.println("Nilai Rata-Rata = " + NilaiRataRata);
    }
    
}
