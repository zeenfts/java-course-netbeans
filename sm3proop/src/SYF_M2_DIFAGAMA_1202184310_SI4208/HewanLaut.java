package SYF_M2_DIFAGAMA_1202184310_SI4208;

public class HewanLaut extends Mamalia{
    
    public HewanLaut(String jenis, String nama, String makanan, String habitat) {
        super(jenis, nama, makanan, habitat);
    }
    
    public void detail(){
       super.detail();
       System.out.println(nama+" adalah seekor "+jenis+
                         ", hidupnya di "+habitat);
    }
}
