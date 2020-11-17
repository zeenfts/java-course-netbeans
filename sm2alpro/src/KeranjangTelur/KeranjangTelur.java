
package KeranjangTelur;


public class KeranjangTelur 
{
    public static void main(String[] args) 
    {
        int jumlahKeranjang, telurSetiapKeranjang, totalTelur;
        
        jumlahKeranjang = 127;
        telurSetiapKeranjang = 7;
        
        totalTelur = jumlahKeranjang*telurSetiapKeranjang;
        
        System.out.println("Jika kamu memiliki");
        System.out.println(telurSetiapKeranjang + " butir telur setiap keranjang dan ada");
        System.out.println(jumlahKeranjang + " buah keranjang, maka");
        System.out.println("Jumlah total Telur adalah " + totalTelur + " butir");
    }
    
}
