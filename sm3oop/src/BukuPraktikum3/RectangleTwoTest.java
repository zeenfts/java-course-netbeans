package BukuPraktikum3;

public class RectangleTwoTest {

    public static void main(String[] args) {
       RectangleTwo rng1 = new RectangleTwo();
       for(int z=rng1.lebar; z>0; z--){
           for(int y=rng1.panjang; y>0; y--){
               System.out.print("* ");
           }
           System.out.println();
       }
       System.out.println("Luasnya: "+rng1.hitungLuas());
       
       System.out.println("\nPersegi panjang dibuat dengan panjang=4, lebar=3");
       RectangleTwo rng2 = new RectangleTwo(4, 3);
       for(int a= rng2.lebar; a>0; a--){
           for(int b=rng2.panjang; b>0; b--){
               System.out.print("* ");
           }
           System.out.println();
       }
       System.out.println("Luasnya: "+rng2.hitungLuas());
    }
}
