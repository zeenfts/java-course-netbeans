package Exc4JvArray;

public class arrrmultidimension
{
 public static void main(String[] args)
 {
    int angka[][] = new int[3][3];
    angka[0][0] = 0;
    angka[0][1] = 3;
    angka[0][2] = 5;
    angka[1][0] = 7;
    angka[1][1] = 1;
    angka[1][2] = 4;
    angka[2][0] = 9; 
    angka[2][1] = 2;
    angka[2][2] = 0;
    
    for (int i = 0; i < 3; i++) 
    { 
     for (int j = 0; j < 3; j++) 
     {
      System.out.print(angka[i][j]+" ");
     }
     System.out.println("");
    }
    
    System.out.println();
    
    for(int i[] : angka)
    {
     for(int j : i)
     {
      System.out.print(j+" ");
     }
     System.out.println("");
    }
  }   
}

