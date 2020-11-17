package BukuPraktikum2;//no 6
import java.util.Scanner;

public class SequenceTest {

    public static void main(String[] args) {
         Sequence f = new Sequence();
         
         System.out.println("================================================");
         System.out.println("");
         System.out.print("Masukkan jumlah angka yang ingin muncul : ");
         
         Scanner h = new Scanner(System.in);
         int angka = h.nextInt();
         f.displayCount(angka);
    }
    
}
