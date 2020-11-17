
package Exc4JvArray;
import java.util.ArrayList;
import java.util.Scanner;

public class Bookreaddoubleinarrayfromkeyboard 
{
    public static void main(String[] args) 
    {
     ArrayList<Double> angkasiUser = new ArrayList<>();
        
     Scanner masuk = new Scanner(System.in);
     for (int a=0; a<20; a++)
     {
      System.out.print("Silahkan tuliskan angka (Double) ke-"+(a+1)+" : ");
      angkasiUser.add(a, masuk.nextDouble());
     }
     System.out.println();
     System.out.println("Angka terakhir (ke-20) yang Anda tuliskan : "
                      +angkasiUser.get(19)+"\n");
    
     for(int c=0; c<20; c++)
     {
         System.out.println("Selisih angka ke-"+(c+1)+" ("+angkasiUser.get(c)
                 +") Dengan angka terakhir(ke-20)"+angkasiUser.get(19)+
                 " : "+(angkasiUser.get(c)-angkasiUser.get(19)));   
     }
    }
    
}
