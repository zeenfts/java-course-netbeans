package BukuPraktikum1;

public class LigaSepakbola {
  //Deklarasi Attributes
    private int jumlahGoalPemain, jumlahAssistPemain, goalsPerTim, 
            matchesTimInSeason, winPerTim, losePerTim, drawPerTim, 
            jumlahKartuKuning, jumlahKartuMerah, kebobolanPerTim, shots,
            selisihGoalPerTim, poinTeam, offside, totalKartu, penyelamatan;
    private String namaTim, namaPemain, namaPelatih, jadwalPertandingan, score, 
            pencetakGoal;
  //Constructor
    public LigaSepakbola(){
    }  
  //Constructors + Setter
    public LigaSepakbola(String jadwalPertandingan){
        this.jadwalPertandingan = jadwalPertandingan;
    }
    
    public LigaSepakbola(String score, String pencetakGoal, int offside, 
            int penyelamatan, int shots, int kartuKuning, int kartuMerah){
        this.score = score;
        this.pencetakGoal = pencetakGoal;
        this.offside = offside;
        this.penyelamatan = penyelamatan;
        this.shots = shots;
        jumlahKartuKuning = kartuKuning;
        jumlahKartuMerah = kartuMerah;
    }
    
    public LigaSepakbola(String namaTim, String namaPelatih,
            int matchesTimInSeason, int winPerTim,int drawPerTim, 
            int losePerTim, int goalsperTim, int kebobolanPerTim){
        this.namaTim = namaTim;
        this.namaPelatih = namaPelatih;
        this.matchesTimInSeason = matchesTimInSeason;
        this.winPerTim = winPerTim;
        this.drawPerTim = drawPerTim;
        this.losePerTim = losePerTim;
        this.goalsPerTim = goalsperTim;
        this.kebobolanPerTim = kebobolanPerTim;  
    }
    
    public LigaSepakbola(String namaPemain, String namaTim, int golPemain, 
            int assistPemain, int kartuKuning, int kartuMerah){
        this.namaPemain = namaPemain;
        this.namaTim = namaTim;
        jumlahGoalPemain = golPemain;
        jumlahAssistPemain = assistPemain;
        jumlahKartuKuning = kartuKuning;
        jumlahKartuMerah = kartuMerah;
    }   
  //Methode Getter
    public int getJumlahGoalPemain(){
        return jumlahGoalPemain;
    }
    
    public int getJumlahAssistPemain(){
        return jumlahAssistPemain;
    }
    
    public int getGoalsPerTim(){
        return goalsPerTim;
    }
    
    public int getMatchesTimInSeason(){
        return matchesTimInSeason;
    }
    
    public int getWinPerTim(){
        return winPerTim;
    }
    
    public int getLosePerTim(){
        return losePerTim;
    }
    
    public int getDrawPerTim(){
        return drawPerTim;
    }
    
    public int getJumlahKartuKuning(){
        return jumlahKartuKuning;
    }
    
    public int getJumlahKartuMerah(){
        return jumlahKartuMerah;
    }
    
    public int getKebobolanPerTim(){
        return kebobolanPerTim;
    }
    
    public int getSelisihGolPerTim(){
        return selisihGoalPerTim = goalsPerTim-kebobolanPerTim;
    }
    
    public int getPoinTeam(){
        return poinTeam = winPerTim*3 + losePerTim*0 + drawPerTim*1;
    }
    
    public int getTotalKartu(){
        return totalKartu = jumlahKartuKuning + jumlahKartuMerah;
    }
    
    public String getNamaTim(){
        return namaTim;
    }
    
    public String getNamaPemain(){
        return namaPemain;
    }
    
    public String getNamaPelatih(){
        return namaPelatih;
    }
    
    public String getJadwalPertandingan(){
        return jadwalPertandingan;
    }
    
    public String getScore(){
        return score;
    } 
    
    public String getPencetakGoal(){
        return pencetakGoal;
    }
    
    public int getOffside(){
        return offside;
    }
    
    public int getPenyelamatan(){
        return penyelamatan;
    }
    
    public int getShots(){
        return shots;
    }
  //Methode void untuk menampilkan informasi
  //Jadwal Pertandingan
    public void showHeaderSchedules(){
        System.out.println("<<<<<<<<<<<<<< Jadwal pertandingan "
                          +">>>>>>>>>>>>>>");
    }
    
    public void showSchedules(){
        System.out.println(getJadwalPertandingan());
    }
  //Skor pertandingan
    public void showHeaderScore(){
        System.out.println("**************************** Hasil Pertandingan "
                          +"****************************");
    }
    
    public void showScore(){
        System.out.println(getScore()+"\nPencetak Gol: "+getPencetakGoal()+
                "\nOffsides: "+getOffside()+
                "\nPenyelamatan: "+getPenyelamatan()+
                "\nShots: "+getShots()+
                "\nKartu Kuning: "+getJumlahKartuKuning()+
                "\nKartu Merah: "+getJumlahKartuMerah()+
                "\nTotal Kartu dikeluarkan: "+getTotalKartu());
    }
  //Klasemen
    public void showHeaderKlasemen(){
        System.out.println("========================================== "
                         + "Klasemen Akhir "
                         + "==========================================");
        System.out.println("   Nama Tim   |   Nama Pelatih   |"
                + " Jumlah Pertandingan | W | D | L | Gol | Kebobolan |"
                + " Selisih Gol | Poin ");
    }
    public void showKlasemennya(){
        System.out.println("   "+getNamaTim()+
                           "\t\t"+getNamaPelatih()+
                           "   \t\t"+getMatchesTimInSeason()+
                           "\t       "+getWinPerTim()+"   "+getDrawPerTim()+
                           "   "+getLosePerTim()+
                           "   "+getGoalsPerTim()+ 
                           "       "+getKebobolanPerTim()+ 
                           "\t       "+getSelisihGolPerTim()+
                           "           "+getPoinTeam());
    }
  //Statistik pemain
    public void showHeaderStatistikPemain(){
        System.out.println("--------------------- Statistik Pemain "
                         + "---------------------");
    }
  //Top skor
    public void showHeaderTopScorers(){
        System.out.println("Top Score:");
    }
    
    public void showTopScorers(){
        System.out.println(getNamaPemain()+" ("+getNamaTim()+") "+
                getJumlahGoalPemain()+" gol");
    }
  //Assist leader
    public void showHeaderAssistsLeader(){
        System.out.println("Assist Leader:");
    }
    
    public void showAssistsLeader(){
        System.out.println(getNamaPemain()+" ("+getNamaTim()+") "+
                getJumlahAssistPemain()+" Assist");
    }
  //Kartu Kuning
    public void showHeaderYellowCard(){
        System.out.println("Yellow Card:");
    }
    
    public void showYellowCard(){
        System.out.println(getNamaPemain()+" ("+getNamaTim()+") "+
                getJumlahKartuKuning()+" Kartu Kuning");
    }
  //Kartu Merah
    public void showHeaderRedCard(){
        System.out.println("Red Card:");
    }
    
    public void showRedCard(){
        System.out.println(getNamaPemain()+" ("+getNamaTim()+") "+
                getJumlahKartuMerah()+" Kartu Merah");
    }
}
