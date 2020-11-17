package BukuPraktikum5.Banking;

public class CheckingAccounts extends Account {
   private double overdraftProtection;
      
   public CheckingAccounts(double balance) {
        super(balance);
    }
   
   public CheckingAccounts(double balance, double protect) {
        this(balance);
        overdraftProtection = protect;
    }
   
   @Override
   public boolean withdraw(double amt){
        if((balance-amt) < overdraftProtection){
            System.out.println("Transaksi dibatalkan");
            return false;
        }
        return super.withdraw(amt);
   }
}
