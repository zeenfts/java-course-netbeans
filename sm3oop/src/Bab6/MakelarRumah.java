package Bab6;

public class MakelarRumah {

    public static void main(String[] args) {
        Rumah rumah1 = new Rumah(200, 45, 200000000);
        Rumah rumah2 = new Rumah(500, 100, 700000000);
        
        rumah1 = rumah2;
        System.out.println(rumah1.infoRumah());
        System.out.println(rumah2.infoRumah());
    }
    
}
