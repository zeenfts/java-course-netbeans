
package HelloPakeNama;

import java.util.Scanner;

public class HelloPakeNama {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String Enter, NamaDepanAnda,NamaBelakangAnda;
       System.out.print("Selamat Datang di Program ini. press Enter");
       Enter = input.nextLine();
       System.out.print("Siapa Nama Depan Anda?");
       NamaDepanAnda = input.nextLine();
       System.out.print("Kemudian, Nama Belakang Anda?");
       NamaBelakangAnda = input.nextLine();
       System.out.printf("Hello, %s %s!!!\n", NamaBelakangAnda, NamaDepanAnda);     
   }
    
    
}
