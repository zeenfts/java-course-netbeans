package CsesstudyUTS_2;
import java.util.Scanner;

public class CsesstudyUTS_2 
{
    public static void main(String[] args) 
    {
        int bil1, bil2, bil3, bil4, Min, Max;
        double Nratarata;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan ke 1 : ");
        bil1 = masuk.nextInt();
        System.out.print("Masukkan bilangan ke 2 : ");
        bil2 = masuk.nextInt();
        System.out.print("Masukkan bilangan ke 3 : ");
        bil3 = masuk.nextInt();
        System.out.print("Masukkan bilangan ke 4 : ");
        bil4 = masuk.nextInt();
        System.out.println("=================================================");
        
        System.out.println("Bilangan ke 1 : "+bil1);
        System.out.println("Bilangan ke 2 : "+bil2);
        System.out.println("Bilangan ke 3 : "+bil3);
        System.out.println("Bilangan ke 4 : "+bil4);
        System.out.println();
        
        if(bil1>=bil2&&bil1>=bil3&&bil1>=bil4)//nilai maksimum
        {
         System.out.println("Nilai Maksimum adalah  : "+bil1);  
        }
        else if(bil2>=bil1&&bil2>=bil3&&bil2>=bil4)
        {
         System.out.println("Nilai Maksimum adalah  : "+bil2);  
        }
        else if(bil3>=bil1&&bil3>=bil2&&bil3>=bil4)
        {
         System.out.println("Nilai Maksimum adalah  : "+bil3);  
        }       
        else if(bil4>=bil1&&bil4>=bil2&&bil4>=bil3)
        {
         System.out.println("Nilai Maksimum adalah  : "+bil4);  
        }
       
        if(bil1<=bil2&&bil1<=bil3&&bil1<=bil4)//nilai minimum
        {
         System.out.println("Nilai Minimum adalah   : "+bil1);  
        }
        else if(bil2<=bil1&&bil2<=bil3&&bil2<=bil4)
        {
         System.out.println("Nilai Minimum adalah   : "+bil2);  
        } 
         else if(bil3<=bil1&&bil3<=bil2&&bil3<=bil4)
        {
         System.out.println("Nilai Minimum adalah   : "+bil3);  
        }
         else if(bil4<=bil1&&bil4<=bil2&&bil4<=bil3)
        {
         System.out.println("Nilai Minimum adalah   : "+bil4);  
        }
        
        Nratarata = (bil1+bil2+bil3+bil4)/4.0;
        System.out.println("Nilai Rata-Rata adalah  : "+Nratarata);
    }
    
}
