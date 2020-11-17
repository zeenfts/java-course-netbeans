package BukuPraktikum4;

public class Vehicle {
   private double load, maxLoad;
   private String jenis;

    public Vehicle(double max_Load, double load, String jns) {
        maxLoad = max_Load;
        this.load = load;
        jenis = jns;
    }
   
    public double getLoad(){
        return load;
    }
    
    public double getMaxLoad(){
        return maxLoad;
    }
    
    public boolean addBox(double weight){
        return weight > getMaxLoad();
    }
    
    public void showInfo(){
        System.out.println("Kendaraan          : "+jenis);
        System.out.printf("Maksimal Muatan    : %.2f %s", getMaxLoad(), "Kg");
        System.out.printf("\nMuatan yang dibawa : %.2f %s", getLoad(), "Kg\n");
        System.out.println("Kelebihan Muatan?  : "+addBox(getLoad()));
    }
}
