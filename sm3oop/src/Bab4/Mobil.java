package Bab4;

public class Mobil{
    public String noPol = "D 234 LE"; 
    public String merk = "Toyota Kijang"; 
    public int harga = 50000000; 
    public int tahunPembuatan = 1999; 
    public String namaPemilik = "ahmadd"; 
    
    public void tampilkanInfoMobil( ){ 
        System.out.println("Nomor Polisi : " + noPol+"\n"+
                           "Merk : "+merk+"\n"+
                           "Harga : "+harga+"\n"+
                           "Tahun Pembuatan : "+tahunPembuatan+"\n"+
                           "Nama Pemilik " + namaPemilik); 
    }
}