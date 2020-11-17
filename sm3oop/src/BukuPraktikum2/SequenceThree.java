package BukuPraktikum2;

public class SequenceThree {
    private int i1=0, i2=1, i3, i;

    public SequenceThree() {
    }
    
    public void displayCount(int count){  // outputnya fibonacci series
        
        i = 2;
        System.out.print(">> "+i1+" "+i2);
         do{
            i3 = i1+i2;
            System.out.print(" "+i3);
            i1=i2;
            i2=i3;
             ++i;
        }while (i < count);
        System.out.println("\n");
        System.out.println("=================================================");

    }
}
