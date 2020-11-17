package WA1OOP;

//Kelas DataPraktikan
class DataPraktikan {
    //Attribute yang hanya dapat diakses oleh kelas DataPraktikan
    private String nama, nim, notlp, alamat;
    
    //Constructor + set semua attribute
    public DataPraktikan(String nama, String nim, String notlp, String alamat){
        this.nama = nama;
        this.nim = nim;
        this.notlp = notlp;
        this.alamat = alamat;
    }
    
    //Methode Getter
    public String getNama(){
        return nama;
    }
    
    public String getNim(){
        return nim;
    }
    
    public String getNotlp(){
        return notlp;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    //Methode void
    public void tampilData(){
        System.out.println("==================================="+
                         "\nNama     : "+getNama()+
                         "\nNIM      : "+getNim()+
                         "\nNo. Telp : "+getNotlp()+
                         "\nAlamat   : "+getAlamat()+
                         "\n===================================");
    }
}

//Main class
public class IDL_WA_MODUL1_OOP_MUHAMMADDIFAGAMAIVANKA_1202184310_SI4208 {

    public static void main(String[] args) {
        //Instansiasi
        DataPraktikan dp = new DataPraktikan("Muhammad Difagama Ivanka", 
                "1202184310", "+6282157111178", 
                "Jalan Soekarno-Hatta km.1,5 Balikpapan");
        
        dp.tampilData();
    }
    
}
