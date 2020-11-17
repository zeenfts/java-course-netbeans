
package Exc3JvLooping;
import java.util.Scanner;

public class Sebutanlab 
{    
    public static void main(String[] args) 
    {
     Scanner masuk =new Scanner(System.in);
     
     for(int x=1; x>0; x++)
     {
      System.out.println("Sebutan Lab yang menangani AlPro? ");
      System.out.print("Jawaban : ");
      String jawabnuser = masuk.next();
      System.out.println();
      
      if(jawabnuser.equals("Daspro"))
      {
       System.out.println("Jawaban Benar");
       System.out.println("---------------------");
       break;
      }
      else
      {
       System.out.println("Jawaban Salah");
       System.out.println("---------------------");
      }
     }
    }
    
}
