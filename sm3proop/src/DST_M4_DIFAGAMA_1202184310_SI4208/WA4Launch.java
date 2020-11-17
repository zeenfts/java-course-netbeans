package DST_M4_DIFAGAMA_1202184310_SI4208;
import java.util.Scanner;

public class WA4Launch {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
      
            System.out.println("Balok:");
            System.out.print("Masukkan Panjang(cm) : ");
            double pb = in.nextDouble();
            System.out.print("Masukkan Lebar(cm)   : ");
            double lb = in.nextDouble();
            System.out.print("Masukkan Tinggi(cm)  : ");
            double tb = in.nextDouble();   
            Balok bk1 = new Balok(pb, lb, tb);
            
            System.out.println("\nTabung:");
            System.out.print("Masukkan Diameter(cm) : ");
            double dt = in.nextDouble();
            System.out.print("Masukkan Tinggi(cm)   : ");
            double tt = in.nextDouble();
            Tabung tb1 = new Tabung(dt, tt);
            
            System.out.println();
            bk1.show();
            System.out.println();
            tb1.show();
            
            System.out.println();
            tb1.perkecil(20);
            tb1.show();
            System.out.println();
            bk1.perbesar(44);
            bk1.show();
    }
    
}
