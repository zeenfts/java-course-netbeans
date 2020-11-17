package strukdat;

import java.util.Scanner;

public class Strukdat {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String id = "dete";
        int password = 123;
     
     do{ 
        System.out.println("Login Instagram");
        System.out.print("Masukkan id = ");
        id = scn.nextLine();
        id = scn.nextLine();
        System.out.print("Masukkan password = ");
        password = scn.nextInt();
        System.out.println("\n");
     }while(password!=123||!(id.equals("dete")));
        System.out.println("Berhasil Login");
    }
    
        
}
