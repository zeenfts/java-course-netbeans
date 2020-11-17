package Exc6JvOOP;
import java.util.ArrayList;
import java.util.Scanner;

public class Jmenam 
{
 public static void main(String[] args) 
 {
  int jmlhPohon = 0;
  Scanner masuk = new Scanner(System.in);
      
  System.out.print("Masukkan jumlah pohon                 : ");
  jmlhPohon = masuk.nextInt();
        
  ArrayList<Pohon> tree = new ArrayList<>();
  
  for(int a=0 ; a<jmlhPohon; a++)
  { 
   Pohon Apaaja = new Pohon();
   
   System.out.println("\n("+(a+1)+")");  
   System.out.print("Masukkan nama pohon                  : ");
   Apaaja.setNamaPohon(masuk.next());
   tree.add(a, Apaaja);
   System.out.print("Masukkan jenis pohon                 : ");
   Apaaja.setJenisPohon(masuk.next());
   tree.add(a, Apaaja);
   System.out.print("Masukkan jumlah panen buah per bulan : ");
   Apaaja.setPanenPohon(masuk.nextInt());
   tree.add(a, Apaaja);
   System.out.print("Masukkan jumlah buah busuk           : ");
   Apaaja.setBuahBusuk(masuk.nextInt());
   tree.add(a, Apaaja);
  }
    
  System.out.println("\n-------------- Menampilkan Data --------------\n");
 
  Pohon Apaaja2 = new Pohon();
  for(int a=0 ; a<jmlhPohon; a++)
  {    
   Apaaja2 = tree.get(a);
   System.out.println("("+(a+1)+")"); 
   Apaaja2.Show();
  }
               
 }
}
