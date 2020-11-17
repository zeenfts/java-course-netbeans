
package DIV_M3_DIFAGAMA_1202184310_SI4208;

public class Animals {
    protected int jumlahKaki=0;
    protected String subFilum, habitat, name, sReproduksi;
    //Constructor //Overloading
    public Animals(String sFil, String habitat, String nama, String sRep, int jmlKaki) {
        subFilum = sFil;
        this.habitat = habitat;
        name = nama;
        sReproduksi = sRep;
        jumlahKaki = jmlKaki;
    }
    
    public Animals(String sFil, String habitat, String sRep, String nama) {
        subFilum = sFil;
        this.habitat = habitat;
        sReproduksi = sRep;
        name = nama;
    }
    
    public String getName(){
        return name;
    }
    
    public int getJumlahKaki(){
        return jumlahKaki;
    }
    
    public void habitat(){
        System.out.println("Habitat...");
    }
    
    public void subFilum(){
        System.out.println("Sub Filum...");
    }
    
   public void sistemReproduksi(){
       System.out.println("Sistem Reproduksi...");
   }
   
   public void detail(){
       System.out.println("Nama hewan  : "+getName()+
                        "\nJumlah Kaki : "+getJumlahKaki());
   }
}
