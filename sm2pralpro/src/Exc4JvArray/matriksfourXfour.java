package Exc4JvArray;
import java.util.Scanner;

public class matriksfourXfour 
{
    public static void main(String[] args) 
    {
     int ordonya[][] = new int [4][4];
     Scanner masuk = new Scanner(System.in);
      
     for (int a = 0; a < 4; a++) 
     {
      System.out.print("Input angka baris 1 kolom "+ (a+1) +" = "); 
      ordonya[0][a] = masuk.nextInt(); 
     }
     
     for (int a = 0; a < 4; a++) 
     {
      System.out.print("Input angka baris 2 kolom "+(a + 1)+" = "); 
      ordonya[1][a] = masuk.nextInt(); 
     }
    
     for (int a = 0; a < 4; a++) 
     {
      System.out.print("Input angka baris 3 kolom "+(a + 1)+" = "); 
      ordonya[2][a] = masuk.nextInt(); 
     }
     
     for (int a = 0; a < 4; a++) 
     {
      System.out.print("Input angka baris 4 kolom "+(a + 1)+" = "); 
      ordonya[3][a] = masuk.nextInt(); 
     }
    
     System.out.println();
     
     for(int b[] : ordonya)
    {
     for(int k : b)
     {
      System.out.print(k+" ");
     }
     System.out.println("");
    }
     
    System.out.println();
    
    for (int b = 0; b < 4; b++) 
    { 
     for (int k = 0; k < 4; k++) 
     {
      System.out.print(ordonya[b][k]+" ");
     }
     System.out.println("");
    }
      
    }
    
}
