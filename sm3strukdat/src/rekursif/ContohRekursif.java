package rekursif;
import java.util.Scanner;

public class ContohRekursif {
    
    public static void main(String[] args) {
        int nilai;
        Scanner in =new Scanner(System.in);
        System.out.print("Masukkan nilai Faktorial: ");
        nilai = in.nextInt();
        int hsl = rekursif(nilai);
        System.out.print("Hasil faktorial: "+hsl+"\n");
    }
    
    public static int rekursif(int n){
        if(n==0 || n==1)
            return 1;
        return n*rekursif(n-1);
    }
    
}
