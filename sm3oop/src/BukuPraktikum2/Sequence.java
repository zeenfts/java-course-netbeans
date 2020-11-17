package BukuPraktikum2;

public class Sequence {
    private int i1=0, i2=1, i3, i;

    public Sequence() {
    }
    
    public void displayCount(int count){  // outputnya fibonacci series
        
        i = 2;
        System.out.print(">> "+i1+" "+i2);
        while (i < count) {
            i3 = i1+i2;
            System.out.print(" "+i3);
            i1=i2;
            i2=i3;
             ++i;
        }
        System.out.println("\n");
        System.out.println("=================================================");

    }
}
