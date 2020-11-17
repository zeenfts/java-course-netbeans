package BukuPraktikum2;// no 3
import java.util.Scanner;

public class DateTwoTest {

    public static void main(String[] args) {
        Scanner pilihan = new Scanner(System.in);
        DateTwo dtw = new DateTwo();
        try{
            while(true){
        System.out.print("\nTuliskan angka(1-7) untuk menampilkan hari: ");
        int theChoice = pilihan.nextInt();
        
        System.out.println(">> [Angka "+theChoice+"], "+dtw.displayDay(theChoice));
                System.out.print("\nCoba lagi? (Y/y) ");
                String jwb = pilihan.next();
                if(!jwb.equalsIgnoreCase("y"))
                    break;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
