package BukuPraktikum1;
import java.util.Scanner;//import untuk Scanner

public class TemperatureTest {
  //Deklarasi variabel untuk looping
    private static boolean loopp = true;
  
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);//Scanner
        Temperature tm = new Temperature();//Instansiasi dengan constructor
      //Looping while
        while(loopp){
            System.out.print(tm.ask());//Perintah untuk memasukkan suhu(F)
            tm.setTemperatureFahrenheit(scn.nextFloat());//Inputan jawaban
          //Hasil konversi Fahreinheit ke Celcius
            System.out.println(tm.judul()+tm.getTemperatureCelcius()+"\n");
           
            System.out.print(tm.askLoop());//Perintah apa ingin mencoba lagi
            tm.setJawabanLoop(scn.next());//Inputan y/ lainnya
            if(tm.getJawabanLoop().equalsIgnoreCase("y")){//Jika jawaban y/Y
                loopp = true;//Program akan kembali berjalan
            }
            else{//Jawaban lainnya
                loopp = false;//Program berhenti
                System.out.println("-------------- Terima Kasih --------------")
                        ;
            }
        }
    }
}
