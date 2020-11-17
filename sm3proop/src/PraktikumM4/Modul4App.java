package PraktikumM4;

import java.util.Scanner;

public class Modul4App {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.println("Selamat Datang di ATM EAD");
        ATM atm = new ATM("1111", "Difagama", 100000000, 12345);
        System.out.print("Password: ");
        int pass = masuk.nextInt();
        System.out.println();
        atm.login(pass);
        atm.tarik(1500000);
        atm.simpanUang(1500000);
        atm.transfer(1500000, "1202202020");
        atm.showData();
        
        System.out.println("\nMobile Banking EAD");
        mBanking mb = new mBanking("difgam", 12345, "1111", "Difagama", 100000000);
        System.out.print("Username: ");
        String usn = masuk.next();
        System.out.print("Password: ");
        int pass2 = masuk.nextInt();
        System.out.println();
        mb.login(usn, pass2);
        mb.gantiPass();
        mb.transfer(3000000, "1202191919");
        mb.showData();
    }
    
}
