package rekursif;
import java.util.Scanner;

public class Koperasi {
    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        System.out.print("Masukkan saldo: ");
        double saldo = in.nextDouble();
        System.out.print("Masukkan bunga: ");
        double bunga = in.nextDouble();
        System.out.print("Jumlah total yang harus dikembalikan: "+rekursif(saldo, bunga)+"\n");
    }
    
    public static double rekursif(double n, double h){
        if(n<0)
            return 0;
        if(h>0){
            System.out.println(n*(h/100)+n);
            return n+(n*(h/100))+(rekursif(n, h-1));
        }
        return 0;
    }
}
