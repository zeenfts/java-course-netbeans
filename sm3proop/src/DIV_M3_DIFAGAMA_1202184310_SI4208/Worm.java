package DIV_M3_DIFAGAMA_1202184310_SI4208;

public class Worm extends Animals{
    
    public Worm(String sFil, String habitat, String sRep, String nama) {
        super(sFil, habitat, sRep, nama);
    }
    
    @Override
    public void habitat(){
        System.out.println("Habitat     : "+habitat);
    }
    
    @Override
    public void subFilum(){
        System.out.println("Sub Filum   : "+subFilum);
    }
    
    @Override
   public void sistemReproduksi(){
       System.out.println("Reproduksi  : "+sReproduksi);
   }
   
    @Override
   public void detail(){
       super.detail();
   }
}
