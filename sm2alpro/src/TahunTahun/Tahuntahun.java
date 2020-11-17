
package TahunTahun;

public class Tahuntahun
{   
    public static void main(String[] args)
    {
     System.out.println("She was born in 2000, ");
     
     for(int w=2000; w<2019; w++)
     {
         int age = w-2000;
         if(age<2)
         {
         System.out.println("In "+w+", She was "+age+" year old.");   
         }
         else
         {
         System.out.println("In "+w+", She was "+age+" years old.");
         }
     }
     for(int z=2019; z==2019; z++)
     {
         int age = z-2000;
         System.out.println();
         System.out.println("It's August "+z+" now");
         System.out.println("She will turn "+age+" very soon.");
         System.out.println();
     }
     
     System.out.println("And then, ");
     for(int x=2020; x<=2035; x++)
     {
         int age = x-2000;
         System.out.println("She will be "+age+" in "+x);
     }
    }
    
}
