package CsesstudyUTS_1;
import java.util.Scanner;

public class CsestudyUTS_1 
{
    public static void main(String[] args) 
    {
     double UTS, UAS, Praktikum, Tugas, Kehadiran, NilaiTotal;
     
     Scanner masuk = new Scanner(System.in);
     
        System.out.print("Masukkan nilai UTS                    : ");
        UTS = masuk.nextDouble();
        System.out.print("Masukkan nilai UAS                    : ");
        UAS = masuk.nextDouble();
        System.out.print("Masukkan nilai Praktikum              : ");
        Praktikum = masuk.nextDouble();
        System.out.print("Masukkan nilai Tugas                  : ");
        Tugas = masuk.nextDouble();
        System.out.print("Masukkan bobot persentase kehadiran   : ");
        Kehadiran = masuk.nextDouble();
        System.out.println("=================================================");
        
        System.out.println("Nilai UTS       : "+UTS);
        System.out.println("Nilai UAS       : "+UAS);
        System.out.println("Nilai Praktikum : "+Praktikum);
        System.out.println("Nilai Tugas     : "+Tugas);
        System.out.println("Kehadiran(%)    : "+Kehadiran);
        
        NilaiTotal = (UTS*0.25+UAS*0.25+Praktikum*0.25+Tugas*0.25);
        System.out.println("Nilai Total     = "+NilaiTotal);
        
        if(Kehadiran>=75)
        {
         if(NilaiTotal>80&&NilaiTotal<=100)
         {
            System.out.println("Index Nilai Ujian adalah : A");
         }
         else if(NilaiTotal>70&&NilaiTotal<=80)
         {
            System.out.println("Index Nilai Ujian adalah : AB");
         }
         else if(NilaiTotal>60&&NilaiTotal<=70)
         {
            System.out.println("Index Nilai Ujian adalah : B");
         }
         else if(NilaiTotal>50&&NilaiTotal<=60)
         {
            System.out.println("Index Nilai Ujian adalah : C");
         }
         else if(NilaiTotal>40&&NilaiTotal<=50)
         {
            System.out.println("Index Nilai Ujian adalah : D");
         }
         else if(NilaiTotal>0&&NilaiTotal<=40)
         {
            System.out.println("Index Nilai Ujian adalah : E");
         }
         else
         {
            System.out.println("Index Nilai Ujian adalah : Tidak ada");  
         }
        }
        else
        {
            System.out.println("Index Nilai Ujian adalah : E");
        }
    }
    
}
