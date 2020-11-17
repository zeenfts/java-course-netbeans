package SYF_M2_DIFAGAMA_1202184310_SI4208;

public class Mamalia {
    protected String jenis, nama, makanan, habitat;

    public Mamalia(String jenis, String nama, String makanan, String habitat) {
        this.jenis = jenis;
        this.nama = nama;
        this.makanan = makanan;
        this.habitat = habitat;
    }

    public void detail() {
        System.out.println("Nama Hewan : "+nama+
                         "\nMakanan    : "+makanan);
    }
    
}
