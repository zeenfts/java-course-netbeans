
package NumberQuizRandom;
import java.util.Scanner;

public class KuisNumberAcak 
{
    public static void main(String[] args) 
    {
        String Enter;
        int jawabanasli = (int)((Math.random() * 20) + 0);
        int kesempatan = 10;
        
        System.out.println("Selamat datang di quiz ini, kesempatan anda menebak hanya 10 kali.press Enter");
        Scanner tulisan = new Scanner(System.in);
        Enter = tulisan.nextLine();
      
        for (int i=0; i<10; i++)
        {
         System.out.print("Tulis angka terserah diantara(0-20) = ");
         int jawaban = tulisan.nextInt();
         
          if (jawaban==jawabanasli)
          {
            System.out.println("You're answer is right, thank you for playing with us :)");
            break;
          }
          else if (jawaban>jawabanasli)
          {
            System.out.println("You're answer is too high, silahkan ulangi kembali");
            System.out.println("Kesempatan anda tersisa " + kesempatan);
            kesempatan--;
          }
          else
          {
            System.out.println("You're answer is too low, silahkan ulangi kembali");
            System.out.println("Kesempatan anda tersisa " + kesempatan);
            kesempatan--;
          }  
        } 
        System.out.println("Game Selesai!!!");
    }  
    
}
