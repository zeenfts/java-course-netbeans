package BukuPraktikum2;
import java.util.Scanner;

public class SequenceTwoTest {

    public static void main(String[] args) {
        
        SequenceTwo f = new SequenceTwo();
         
         System.out.println("================================================");
         System.out.println("");
         System.out.print("Masukkan jumlah angka yang ingin muncul : ");
         
         Scanner h = new Scanner(System.in);
         int angka = h.nextInt();
         f.displayCount(angka);
    }
    
}
