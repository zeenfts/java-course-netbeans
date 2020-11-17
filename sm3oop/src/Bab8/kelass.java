package Bab8;

public class kelass {
    
    public kelass(){
        
    }
    
    public float hitungRataRataIF(int nilai1, int nilai2, int nilai3){
        float hitungRataRata = (float)(nilai1+nilai2+ nilai3)/3;
        if(hitungRataRata <5.0)
            System.out.println("Gagal");
        return hitungRataRata;
    }
    
     public float hitungRataRataTandaTanya(int nilai1, int nilai2, int nilai3){
        float hitungRataRata = (float)(nilai1+nilai2+ nilai3)/3;
        String hasil = hitungRataRata < 5.0 ? "gagal":"Berhasil";
        System.out.println(hasil);
        return hitungRataRata;
    }
     
     public float hitungRataRataIfElse(int nilai1, int nilai2, int nilai3){
        float hitungRataRata = (float)(nilai1+nilai2+ nilai3)/3;
        if(hitungRataRata <5.0)
            System.out.println("Gagal");
        else if(hitungRataRata >=5.0 && hitungRataRata<6.0)
            System.out.println("Perbaikan");
        else
            System.out.println("Berhasil");
        return hitungRataRata;
    }
     
     public float hitungRataRataSwitch(int nilai1, int nilai2, int nilai3){
        int hitungRataRata = (int)(nilai1+nilai2+ nilai3)/3;
        switch(hitungRataRata){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("gagal");
                break;
            case 6: 
                System.out.println("Perbaikan");
                break;
            case 7:
                System.out.println("Berhasil");
                break;
            default:
                System.out.println("Berhasil");
                break;
        }
        return hitungRataRata;
    }
}
