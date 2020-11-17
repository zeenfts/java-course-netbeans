package Bab12.Kecamatan.Desa.SukaTani;

public class Petani {
   private Lumbung hhssj;
   private float hasilPanen;
   
   public void setLumbung(Lumbung ll1){
       hhssj = ll1;
   }

   public void panen(float kg){
       hasilPanen = kg;
   }
   
   public void simpan_padi_di_lumbung(){
       hhssj.simpanPadi(hasilPanen);
   }
   
   public void ambil_padi_di_lumbung(float panenAmbil){
      float diambil = hhssj.ambilPadi(panenAmbil);
       System.out.println("Padi diambil: "+diambil+" kg");
   }
}
