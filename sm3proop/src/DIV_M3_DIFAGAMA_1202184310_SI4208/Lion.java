package DIV_M3_DIFAGAMA_1202184310_SI4208;

public class Lion extends Animals{
    
    public Lion(String sFil, String habitat, String nama, String sRep, int jmlKaki) {
        super(sFil, habitat, nama, sRep, jmlKaki);
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
