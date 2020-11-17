package BukuPraktikum6;

public class Account {
    protected double balance;
    private OverdraftException ove;
    
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
    
    public void withdraw(double amt){
       if(amt<0){ 
           System.out.println("Saldo ditarik minus");
       }
       else if(amt>balance){ 
           ove = new OverdraftException("insufficient fund", balance);
       }
       else{
           balance -= amt;
       }
    }
}
