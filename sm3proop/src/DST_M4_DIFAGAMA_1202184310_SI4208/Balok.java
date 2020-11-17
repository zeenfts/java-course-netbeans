package DST_M4_DIFAGAMA_1202184310_SI4208;

public class Balok extends BangunRuang {
    private double panjang, lebar;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    protected double keliling() {
        return 4*panjang + 4*lebar+ 4*tinggi;
    }

    @Override
    protected double volume() {
        return panjang * lebar * tinggi;
    }
    
    @Override
    public void rotate(int xDegrees, int yDegrees){
        double save;
        System.out.println("Balok dirotasi sebesar x = "+xDegrees+"derajat, "
                         + "y = "+yDegrees+" derajat");
        
        if(xDegrees==0 || 
           xDegrees>270&&xDegrees<=360 || xDegrees<-270&&xDegrees>=-360 || 
           xDegrees>90&&xDegrees<=180 || xDegrees<-90&&xDegrees>=-180){
           xDegrees = 0;
            if(yDegrees==0 || 
               yDegrees>270&&yDegrees<=360 || yDegrees<-270&&yDegrees>=-360 ||
               yDegrees>90&&yDegrees<=180 || yDegrees<-90&&yDegrees>=-180 ){
               yDegrees = 0;
            }
            
            else if(yDegrees>0&&yDegrees<=90 || yDegrees<0&&yDegrees>=-90 ||
                    yDegrees>180&&yDegrees<=270 || yDegrees<-180&&yDegrees>=-270){
                yDegrees = 90;
                save = panjang;
                panjang = lebar;
                lebar =  save;
            }
            
        }
        
        else if(xDegrees>0 && xDegrees<=90 || xDegrees<0 && xDegrees>=-90 ||
                xDegrees>180 && xDegrees<=270 || xDegrees<-180 && xDegrees>=-270){
            xDegrees = 90;
            if(yDegrees==0 || 
               yDegrees>270&&yDegrees<=360 || yDegrees<-270&&yDegrees>=-360 ||
               yDegrees>90&&yDegrees<=180 || yDegrees<-90&&yDegrees>=-180 ){
               yDegrees = 0;
               save = tinggi;
               tinggi = lebar;
               lebar =  save;
            }
            
            else if(yDegrees>0&&yDegrees<=90 || yDegrees<0&&yDegrees>=-90 ||
                    yDegrees>180&&yDegrees<=270 || yDegrees<-180&&yDegrees>=-270){
                yDegrees = 90;
                save = panjang;
                panjang = tinggi;
                tinggi = lebar;
                lebar = save;
            }
        }

    }
    
    @Override
    public void perbesar(double persen){
        System.out.println("Ukuran Balok diperbesar "+persen+"%");
        panjang = panjang + (panjang*persen/100);
        lebar = lebar + (lebar*persen/100);
        tinggi = tinggi + (tinggi*persen/100);
    }
    
    @Override
    public void perkecil(double persen){
        System.out.println("Ukuran Balok diperkecil "+persen+"%");
        panjang = panjang - (panjang*persen/100);
        lebar = lebar - (lebar*persen/100);
        tinggi = tinggi - (tinggi*persen/100);
    }
    
    public void show(){
        System.out.println("------- Balok -------");
        System.out.printf("Panjang  : %.2f %s", panjang, "cm");
        System.out.printf("\nLebar    : %.2f %s", lebar, "cm");
        System.out.printf("\nTinggi   : %.2f %s", tinggi, "cm");
        System.out.printf("\nKeliling : %.2f %s", keliling(), "cm");
        System.out.printf("\nVolume   : %.2f %s", volume(), "cm");
        System.out.println();
    }
    
}
