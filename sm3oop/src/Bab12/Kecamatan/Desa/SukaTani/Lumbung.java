package Bab12.Kecamatan.Desa.SukaTani;

public class Lumbung {
    private static Lumbung lumbung = new Lumbung();
    private static float persediaan, padiDisimpan, padiDiambil;
    private static String nama;

    private Lumbung() {
    }
    
    public static void setNama(String nm){
        nama = nm;
    }
    
    public void hitungPersediaan(){
       persediaan = padiDiambil - padiDiambil; 
    }
    
    public void simpanPadi(float kilo){
        padiDisimpan = kilo;
        persediaan += padiDisimpan;
    }
    
    public float ambilPadi(float jml){
        padiDiambil =  jml;
        persediaan-= padiDiambil;
        return padiDiambil;
    }
    
    public static Lumbung getlumbung(){
        return lumbung;
    }
    
    public static void cetakPersediaan(){
        System.out.println("Persediaan padi di lumbung: "+nama+" saat ini "+persediaan);
    }
}
