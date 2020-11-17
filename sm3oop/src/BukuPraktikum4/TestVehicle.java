package BukuPraktikum4;

public class TestVehicle {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(35, 27, "Truk");
        Vehicle v2 = new Vehicle(21, 27, "Pickup");
        Vehicle v3 = new Vehicle(1, 0.5, "Mobil");
        
        v1.showInfo();
        System.out.println();
        v2.showInfo();
        System.out.println();
        v3.showInfo();
    }
    
}
