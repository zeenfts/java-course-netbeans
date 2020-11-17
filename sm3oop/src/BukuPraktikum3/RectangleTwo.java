package BukuPraktikum3;

public class RectangleTwo {
    protected int panjang, lebar, luas;

    public RectangleTwo() {
        System.out.println("Default persegi panjang dibuat dengan panjang=5, lebar=5");
        panjang = 5;
        lebar = 5;
    }

    public RectangleTwo(int w, int h) {
        if(w>0 && w<30 && h>0 && h<30){
            this.panjang = w;
            this.lebar = h;
        }
        else
            System.out.println("Maaf panjang dan lebar melebihi interval!!");
    }
    
    public int hitungLuas(){
        return luas=panjang*lebar;
    }
}
