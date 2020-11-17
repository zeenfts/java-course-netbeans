package BukuPraktikum5.Banking;

public class SavingAccounts extends Account {
    private double interestRate;

    public SavingAccounts(double balance, double interestRate) {
        super(balance);
        balance = balance + (balance*interestRate/100);
        this.interestRate = interestRate;
    }
    
}
