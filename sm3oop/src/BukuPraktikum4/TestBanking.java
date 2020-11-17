package BukuPraktikum4;

public class TestBanking {

    public static void main(String[] args) {
       Customer cs1 = new Customer("Ramadhanu", "T");
       Customer cs2 = new Customer("M Difagama", "I");
       Account ac1 = new Account(7100000);
       Account ac2 = new Account(7090000);
       
       cs1.setAccount(ac1);
       cs2.setAccount(ac2);
       
       cs1.getAccount().deposit(300000);
       cs1.showInfo();
       System.out.println();
       cs2.getAccount().withdraw(40000);
       cs2.showInfo();
    }
    
}
