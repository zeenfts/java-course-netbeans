package BukuPraktikum1;
import java.util.ArrayList;

public class PencacatanLiga {

    public static void main(String[] args) {
      //Instansiasi dengan constructor
        LigaSepakbola ls = new LigaSepakbola();
      //Instansiasi dengan constructor untuk jadwal pertandingan
        LigaSepakbola jadwalPertama = new LigaSepakbola("Natural FC vs Alam FC");
        LigaSepakbola jadwalKedua = new LigaSepakbola("Alam FC vs Natural FC");
      //Instansiasi dengan constructor + Array Object untuk hasil pertandingan
        LigaSepakbola scoreMatch = new LigaSepakbola("Natural FC 3-2 Alam FC",
                "Jay 3x, Zen, Lay", 4, 12, 16, 3, 1);
        LigaSepakbola scoreMatch2 = new LigaSepakbola("Alam FC 4-1 Natural FC",
                "Kajj 2x, Lay, Zen, Jay", 9, 21, 15, 0, 1);
      //Instansiasi dengan constructor untuk tim
        LigaSepakbola teamSatu = new LigaSepakbola("Natural FC", "Ahmad", 2, 1, 
        0, 1, 4, 6);
        LigaSepakbola teamDua = new LigaSepakbola("Alam FC", "Salim", 2, 1, 0, 
        1, 6, 4);
      //Instansiasi dengan constructor untuk pemain
        LigaSepakbola pemainSatu = new LigaSepakbola("Jay", "Natural FC", 4, 0, 
                                                                        1, 0);
        LigaSepakbola pemainDua = new LigaSepakbola("Zen", "Alam FC", 2, 2, 
                                                                        0, 1);
        LigaSepakbola pemainTiga = new LigaSepakbola("Renn", "Natural FC", 0, 4,
                                                                        0, 0);
        LigaSepakbola pemainEmpat = new LigaSepakbola("Lay", "Alam FC", 2, 1, 
                                                                        2, 0);
        LigaSepakbola pemainLima = new LigaSepakbola("Red", "Natural FC", 0, 0, 
                                                                        0, 1);
        LigaSepakbola pemainEnam = new LigaSepakbola("Kajj", "Alam FC", 2, 0, 
                0, 0);
        
      //Menampilkan jadwal pertandingan
        ls.showHeaderSchedules();
        jadwalPertama.showSchedules();
        jadwalKedua.showSchedules();
        System.out.println();
      //Menampilkan hasil pertandingan
        ls.showHeaderScore();
        scoreMatch.showScore();
        System.out.println();
        scoreMatch2.showScore();
        System.out.println();
      //Menampilkan Klasemen
        ls.showHeaderKlasemen();
        teamDua.showKlasemennya();
        teamSatu.showKlasemennya();
        System.out.println();
      //Menampilkan statistik pemain
        ls.showHeaderStatistikPemain();
        ls.showHeaderTopScorers();//Top Skor
        pemainSatu.showTopScorers();
        pemainDua.showTopScorers();
        pemainEmpat.showTopScorers();
        pemainEnam.showTopScorers();
        System.out.println();
        
        ls.showHeaderAssistsLeader();//Assist Leader
        pemainTiga.showAssistsLeader();
        pemainDua.showAssistsLeader();
        pemainEmpat.showAssistsLeader();
        System.out.println();
        
        ls.showHeaderYellowCard();//Peraih kartu kuning
        pemainEmpat.showYellowCard();
        pemainSatu.showYellowCard();
        System.out.println();
        
        ls.showHeaderRedCard();//Peraih kartu merah
        pemainLima.showRedCard();
        pemainDua.showRedCard();
    }
    
}
