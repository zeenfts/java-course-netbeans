package BukuPraktikum2;//no 8

public class SequenceTwo {
    private int i1=0, i2=1, i3, i;

    public SequenceTwo() {
    }
    
    public void displayCount(int count){  // outputnya fibonacci series
        
        System.out.print(">> "+i1+" "+i2);
        for (i = 2; i<count; ++i) {
            i3 = i1+i2;
            System.out.print(" "+i3);
            i1=i2;
            i2=i3;
        }
        System.out.println("\n");
        System.out.println("=================================================");

    }
}
