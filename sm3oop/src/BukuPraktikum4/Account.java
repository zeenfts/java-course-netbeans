package BukuPraktikum4;

public class Account {
    private double balance;

    public Account(double init_balance) {
        balance = init_balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public double deposit(double amt){
        if(amt >= 100000){
            System.out.println("Berhasil, Deposit sebesar "+amt);
            return balance += amt;
        }
        System.out.println("Mohon maaf minimal anda memasukkan Rp 100.000,-");
        return balance;
    }
    
    public double withdraw(double amt){
        if(amt<=(getBalance()-20000) && amt>=50000){
            System.out.println("Berhasil, Penarikan sebesar "+amt);
            return balance -= amt;
    }
        System.out.println("Mohon maaf saldo tidak mencukupi untuk penarikan");
        return balance;
    }
}
