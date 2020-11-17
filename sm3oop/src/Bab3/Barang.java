package Bab3;
import java.util.Date;

public class Barang {
    public int jumlah; //variabel menyimpan jumlah bertipe integer
    public double keuntungan;
    public double hargaBeli; //variabel menyimpan harga beli bertipe double
    public double totalHargaBeli;
    public double totalHargaJual;
    public Date tglKadaluarsa; //variabel menyimpan tglKadaluarsa bertipe Date
    public double hargaJual; //variabel menyimpan harga jual bertipe double
    public String idBarang; //variabel menyimpan id barang bertipe String
    double diskon = 0.0; //variabel menyimpan diskon bertipe double
 
    public double getHargaBeli(){
        return hargaBeli;
    }
    public double getHargaJual(){
        return hargaJual;
    }
    public int getJumlah(){
        return jumlah;
    }
    public void setHargaBeli( int hbl ){
        this.hargaBeli = hbl;
    }
     public void setHargaJual( int hjl ){
        this.hargaJual = hjl;
    }  
    public void setIDBarang( String  id ){
        this.idBarang = id;
    }
    public void setJumlah( int jml ){
        this.jumlah = jml;
    }
    public double getTotalHargaJual(){
        return totalHargaJual = hargaJual*jumlah;
    }
    public double getTotalHargaBeli(){
        return totalHargaBeli = hargaBeli*jumlah;
    }
    public double getKeuntungan(){
        return keuntungan = totalHargaJual-totalHargaBeli;
    } 
}
