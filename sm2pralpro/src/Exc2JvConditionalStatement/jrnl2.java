
package Exc2JvConditionalStatement;
import java.util.Scanner;

public class jrnl2 
{
    public static void main(String[] args)
    {
     Scanner masuk = new Scanner(System.in);
     System.out.println("------- TOKO HIJAU -------");
     System.out.println();
     System.out.println("List Barang: ");
     System.out.println("1. Laptop Acar");
     System.out.println("2. HP Siomay");
     System.out.print("Apkah anda akan checkout(y/n)? ");
     String huruf = masuk.nextLine();
     String hrf = (huruf.equalsIgnoreCase("Y"))? "Berhasil Checkout" :"Gagal Checkout";
     System.out.println(hrf);
     System.out.println();
     
     System.out.println("------- WARUNG MAKAN -------");
     System.out.println();
     System.out.println("Daftar Menu: ");
     System.out.println("1. Gulai Rp 10.000,-");
     System.out.println("2. Sate  Rp 15.000,-");
     System.out.println("3. Bakso Rp 12.000,-");
     System.out.println("4. Rawon Rp 20.000,-");
     System.out.print("Masukkan menu : ");
     int dftrmnu = masuk.nextInt();
     System.out.println();
     
     switch(dftrmnu)
             {
              case 1 :
              System.out.println("Anda Memesan : Gulai");
              System.out.println("-----------------------------------");
              System.out.println("Menu "+dftrmnu);
              System.out.println("Harga : Rp 10.000,-");
              break;
              
              case 2 :
              System.out.println("Anda Memesan : Sate");
              System.out.println("-----------------------------------");
              System.out.println("Menu "+dftrmnu);
              System.out.println("Harga : Rp 15.000,-");
              break;
              
              case 3 :
              System.out.println("Anda Memesan : Bakso");
              System.out.println("-----------------------------------");
              System.out.println("Menu "+dftrmnu);
              System.out.println("Harga : Rp 12.000,-");
              break;
              
              case 4 :
              System.out.println("Anda Memesan : Rawon");
              System.out.println("-----------------------------------");    
              System.out.println("Menu "+dftrmnu);
              System.out.println("Harga : Rp 20.000,-");
              break;
              
              default :
              System.out.println("Mohon maaf menu tidak terdaftar");
              break;    
             }
     
     System.out.println();
     System.out.print("Masukkan Nama   : ");
     String namauser = masuk.next();
     System.out.print("Masukkan NIM   : ");
     int nim = masuk.nextInt();
     System.out.print("Masukkan Nilai : ");
     int nilai = masuk.nextInt();
     
     System.out.println("-----------------------------------");
     System.out.println("Nama       : "+namauser);
     System.out.println("NIM        : "+nim);
     System.out.println("Nilai      : "+nilai);
     
     if(nilai > 80)
     {
      System.out.println("Huruf Mutu : A");
     }
     else if(nilai > 70)
     {
      System.out.println("Huruf Mutu : AB");
     }
     else if(nilai > 65)
     {
      System.out.println("Huruf Mutu : B");
     }
     else if(nilai > 60)
     {
      System.out.println("Huruf Mutu : BC");
     }
     else if(nilai > 50)
     {
      System.out.println("Huruf Mutu : C");
     }
     else if(nilai > 40)
     {
      System.out.println("Huruf Mutu : D");
     }
     else
     {
      System.out.println("Huruf Mutu : E");
     }
    }
    
}
