
package buattestes;
import java.util.Scanner;

public class Buattestes 
{    
    public static void main(String[] args) 
    {
        int x =0;
     Scanner keyboard = new Scanner(System.in);
//try
//{
//System.out.println("Masukkan jumlah donut      :");
//int jmlhDonut = keyboard.nextInt();
//System.out.println("Masukkan jumlah gelas susu :");
//int jmlhSusu = keyboard.nextInt();
//if (jmlhDonut < 1)
//throw new Exception("Susu tidak ada!");
//double donutStpGls = jmlhDonut / (double)jmlhSusu;
//System.out.println(jmlhDonut + " donut.");
//System.out.println(jmlhSusu + " gelas susu.");
//System.out.println("Anda memiliki " + donutStpGls +
//" donut untuk setiap gelas susu.");
//}
//catch(Exception pesan)
//{
//System.out.println(pesan.getMessage());
//System.out.println("Silahkan beli susu.");
//}
//System.out.println("Program selesai.");
while(x<3)System.out.println("hello");x++;
        System.out.println("\nKonversi decimal > biner\nMasukkan angka dalam decimal");
        double ang = keyboard.nextDouble();
        int sebelumBiner = (int) ang*1;
        String biner = Integer.toBinaryString(sebelumBiner);
        System.out.println("Hasil konversi angka "+ang+" ke biner yaitu: "+biner);
        
        System.out.println("\nKonversi decimal > oktal\nMasukkan angka dalam decimal");
        double ang1 = keyboard.nextDouble();
        int sebelumBiner1 = (int) ang1*1;
        String octal = Integer.toOctalString(sebelumBiner1);
        System.out.println("Hasil konversi angka "+ang1+" ke oktal yaitu: "+octal);
        
        System.out.println("\nKonversi decimal > heksadesimal\nMasukkan angka dalam decimal");
        double ang2 = keyboard.nextDouble();
        String hexD = Double.toHexString(ang2);
        System.out.println("Hasil konversi angka "+ang2+" ke heksadesimal yaitu: "+hexD);
        
        //sebaliknya
        System.out.println("\nKonversi biner > desimal\nMasukkan angka dalam biner");
        String ang3 = keyboard.next();
        int binerDec = Integer.parseInt(ang3,2);
        double binerDec2 = (double)binerDec*1.0;
        System.out.println("Hasil konversi bil.biner "+ang3+" ke desimal yaitu: "+binerDec2);
        
        System.out.println("\nKonversi oktal > desimal\nMasukkan angka dalam oktal");
        String ang4 = keyboard.next();
        int octalDec = Integer.parseInt(ang4,8);
        double octalDec2 = (double)octalDec*1.0;
        System.out.println("Hasil konversi bil.oktal "+ang4+" ke desimal yaitu: "+octalDec2);
        
        System.out.println("\nKonversi heksadesimal > desimal\nMasukkan angka dalam heksadesimal");
        String ang5 = keyboard.next();
        int hexDec = Integer.parseInt(ang5,16);
        double hexDec2 = (double)hexDec*1.0;
        System.out.println("Hasil konversi bil.biner "+ang5+" ke desimal yaitu: "+hexDec2);
        
     }
    
}
