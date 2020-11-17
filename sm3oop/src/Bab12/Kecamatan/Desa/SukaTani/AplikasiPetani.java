package Bab12.Kecamatan.Desa.SukaTani;

public class AplikasiPetani {

    public static void main(String[] args) {
        Petani asep = new Petani();
        Petani ade = new Petani();
        Petani ijah = new Petani();
        Lumbung.setNama("SukaTani");
        
        asep.setLumbung(Lumbung.getlumbung());
        ade.setLumbung(Lumbung.getlumbung());
        ijah.setLumbung(Lumbung.getlumbung());
        
        asep.panen(1000.0f);
        ade.panen(900.0f);
        ijah.panen(200.0f);
        
        asep.simpan_padi_di_lumbung();
        ade.simpan_padi_di_lumbung();
        ijah.simpan_padi_di_lumbung();
        Lumbung.cetakPersediaan();
    }
    
}
