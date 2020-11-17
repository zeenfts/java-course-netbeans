package BukuPraktikum5.Banking;

public class Account {
    protected double balance;

     public Account() {
    }
     
    public Account(double init_balance) {
        balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }
    
    public boolean deposit(double amt){
        if(amt<0) return false;
        balance += amt;
        return true;
    }
    
    public boolean withdraw(double amt){
       if(amt<0){ 
           System.out.println("Saldo ditarik minus");
           return false;}
       else if(amt>balance){ 
           System.out.println("Saldo tak mencukupi");
           return false;}
        balance -= amt;
        return true;
    }
}
