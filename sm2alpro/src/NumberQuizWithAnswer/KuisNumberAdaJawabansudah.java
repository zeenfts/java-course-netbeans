
package NumberQuizWithAnswer;
import java.util.Scanner;

public class KuisNumberAdaJawabansudah 
{
    public static void main(String[] args) 
    {
     Scanner isiannya = new Scanner(System.in);   
     
     String Enter;
     int jawaban;
     System.out.println("Selamat datang di quiz ini, kesempatan anda menebak hanya 3 kali.press Enter");
     Enter = isiannya.nextLine();
    
     for (int i=0; i<3; i++)
     {
      System.out.print("Hasil dari 15+31x3-7 = ");
      jawaban = isiannya.nextInt();
      
      if(jawaban == 15+31*3-7)
      {
       System.out.println("You're answer is correct, thank you for playing with us :)");
       break;
      }
      else 
      {
          System.out.println("You're answer is incorrect");
      }
     }
     System.out.println("Game Over!!!");
    }
    
}
