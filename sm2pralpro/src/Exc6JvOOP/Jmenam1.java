package Exc6JvOOP;
import java.util.Scanner;

public class Jmenam1 
{
 public static void main(String[] args) 
 {
  int jmlhPohon = 0;
  Scanner masuk = new Scanner(System.in);
      
  System.out.print("Masukkan jumlah pohon                 : ");
  jmlhPohon = masuk.nextInt();
  Pohon[] Apaaja = new Pohon[jmlhPohon];
  
  for(int a=0 ; a<Apaaja.length; a++)
  {
   Apaaja[a] = new Pohon();
   
   System.out.println("\n("+(a+1)+")");  
   System.out.print("Masukkan nama pohon                  : ");
   Apaaja[a].setNamaPohon(masuk.next());
   System.out.print("Masukkan jenis pohon                 : ");
   Apaaja[a].setJenisPohon(masuk.next());
   System.out.print("Masukkan jumlah panen buah per bulan : ");
   Apaaja[a].setPanenPohon(masuk.nextInt());
   System.out.print("Masukkan jumlah buah busuk           : ");
   Apaaja[a].setBuahBusuk(masuk.nextInt());
  }
    
  System.out.println("\n-------------- Menampilkan Data --------------\n");
 
  for(int a=0 ; a<Apaaja.length; a++)
  {    
   System.out.println("("+(a+1)+")"); 
   Apaaja[a].Show();
  }
               
 }
}
