package Bab3;

public class AplikasiKoperasi {

    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.jumlah = 20; 
        brg1.hargaJual = 25000; 
        brg1.hargaBeli = 10000;
        System.out.println( "Harga jual barang 1 = " + brg1.getHargaJual()+"\n"+
                            "Harga beli barang 1 = " + brg1.getHargaBeli()+ "\n"+ 
                            "Jumlah barang 1 yang akan dijual = "+ brg1.getJumlah()
                            +"\n"+"Total Harga jual barang 1 = "
                            +brg1.getTotalHargaJual()+"\n"+
                            "Total Harga beli barang 1 ="+brg1.getTotalHargaBeli()+
                            "\n"+"Keuntungan Barang 1 = " + brg1.getKeuntungan()
                            +"\n");
        
        Barang brg2 = new Barang();
        brg2.jumlah = 50; 
        brg2.hargaJual = 100000; 
        brg2.hargaBeli = 75000;
        System.out.println( "Harga jual barang 2 = " + brg2.getHargaJual()+"\n"+
                            "Harga beli barang 2 = " + brg2.getHargaBeli()+ "\n"+ 
                            "Jumlah barang 2 yang akan dijual = "+ brg2.getJumlah()
                            +"\n"+"Total Harga jual barang 2 = "
                            +brg2.getTotalHargaJual()+"\n"+
                            "Total Harga beli barang 2 ="+brg2.getTotalHargaBeli()+
                            "\n"+"Keuntungan Barang 2 = " + brg2.getKeuntungan());
   
    }
    
}
