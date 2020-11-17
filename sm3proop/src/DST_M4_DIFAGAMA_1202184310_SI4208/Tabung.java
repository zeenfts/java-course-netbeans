package DST_M4_DIFAGAMA_1202184310_SI4208;

public class Tabung extends BangunRuang{
    private double diameter;
    private final double phi = 3.14;

   public Tabung(double diameter, double tinggi) {
        this.diameter = diameter;
        this.tinggi = tinggi;
   }

   private double getJariJari(){
       return diameter/2; 
   }
   
    @Override
    protected double keliling() {
       return 2*phi*diameter;
    }

    @Override
    protected double volume() {
        return phi*getJariJari()*getJariJari()*tinggi;
    }
   
   @Override
    public void rotate(int xDegrees, int yDegrees){
        System.out.println("Tabung dirotasi sebesar x = "+xDegrees+"derajat, "
                         + "y = "+yDegrees+" derajat");
    }
    
    @Override
    public void perbesar(double persen){
        System.out.println("Ukuran Tabung diperbesar "+persen+"%");
        diameter = diameter + (diameter*persen/100);
        tinggi = tinggi + (tinggi*persen/100);
    }
    
    @Override
    public void perkecil(double persen){
        System.out.println("Ukuran Tabung diperkecil "+persen+"%");
        diameter = diameter - (diameter*persen/100);
        tinggi = tinggi - (tinggi*persen/100);
    }
    
    public void show(){
        System.out.println("------- Tabung -------");
        System.out.printf("Diameter  : %.2f %s", diameter,"cm");
        System.out.printf("\nJari-Jari : %.2f %s", getJariJari(), "cm");
        System.out.printf("\nTinggi    : %.2f %s", tinggi, "cm");
        System.out.printf("\nKeliling  : %.2f %s", keliling(), "cm");
        System.out.printf("\nVolume    : %.2f %s", volume(), "cm");
        System.out.println();
    }
    
}
