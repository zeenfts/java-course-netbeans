package BukuPraktikum2;//no 7
import java.util.Scanner;

public class CounterTwo {
    
     private int dat;

    public CounterTwo() {
    }

    public int getDat() {
        return dat;
    }

    public void setDat(int data) {
        dat = data;
    }
    
    public void displayCount(){
      
        int y =0;  
        for(int v = 1; v<=getDat(); v++){
            y = v + y;
        } 
        System.out.println("Jumlah nilai data adalah : " + y);
        System.out.println("");
        System.out.println("=================================================");
        
    }
}

class CounterThree {
    
     private int dat;

    public CounterThree() {
    }

    public int getDat() {
        return dat;
    }

    public void setDat(int data) {
        dat = data;
    }
    
    public void displayCount(){
        
        int l = 1;
        int y =0;
        
        do{
            y = l + y;
           
             l++;
        } while (l <= getDat());
         System.out.println("Jumlah nilai data adalah : " + y);
             System.out.println("");
             System.out.println("=================================================");
            
    }
}
    


class CounterTwoTest{
     public static void main(String[]args){
         
         CounterTwo f = new CounterTwo();
         
         System.out.println("================================================");
         System.out.println("");
         System.out.print("Masukkan jumlah angka yang ingin dihitung : ");
         
         Scanner h = new Scanner(System.in);
         int angka = h.nextInt();
         f.setDat(angka);
         f.displayCount();
          
     }
}

class CounterThreeTest{
     public static void main(String[]args){
         
         CounterThree h = new CounterThree();
         
         System.out.println("================================================");
         System.out.println("");
         System.out.print("Masukkan jumlah angka yang ingin dihitung : ");
         
         Scanner g = new Scanner(System.in);
         int angk = g.nextInt();
         h.setDat(angk);
         h.displayCount();
          
     }
} 

