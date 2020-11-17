package BukuPraktikum1;

public class WelcomeSource {
    private String kataKata;//Deklarasi Attribute

    public WelcomeSource(String kataKata){//Constructor
        this.kataKata = kataKata;
    }
    
    public String getKataKata(){//Methode Getter
        return kataKata;
    }
    
    public String cetakHasil(){//Methode untuk menampilkan
        return kataKata;
    }
    
}