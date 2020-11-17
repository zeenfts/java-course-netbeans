package BukuPraktikum2;
import java.util.Scanner;

public class Counter {//nomor 5
    private int MAX_COUNT;

    public Counter(){
    }
    
    public int getData() {
        return MAX_COUNT;
    }

    public void setData(int data) {
        MAX_COUNT = data;
    }
    
    public void displayCount(){
        
        int l = 1 ;
  
        int y = 0;
        while (l <= getData()) {
             
             y = l + y;
             
             l++;  
        }
        System.out.println("Jumlah nilai data adalah : " + y);
        System.out.println("");
        System.out.println("=================================================");

    }
}

//Main Class
class CounterTest{
     public static void main(String[]args){
         
         Counter f = new Counter();
         
         System.out.println("================================================");
         System.out.println("");
         System.out.print("Masukkan jumlah angka yang ingin dihitung : ");
         
         Scanner h = new Scanner(System.in);
         int angka = h.nextInt();
         f.setData(angka);
         f.displayCount();
          
     }
}
