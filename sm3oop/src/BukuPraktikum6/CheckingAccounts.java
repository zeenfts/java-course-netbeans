package BukuPraktikum6;

public class CheckingAccounts extends Account {

    private double overdraftProtection;
    private OverdraftException ove;

    public CheckingAccounts(double balance) {
        super(balance);
    }

    public CheckingAccounts(double balance, double protect) {
        this(balance);
        overdraftProtection = protect;
    }

    @Override
    public void withdraw(double amt) {
        if (amt < 0) {
            System.out.println("Saldo ditarik minus");
        }
        else if (amt > balance) {
            if ((amt-balance) <= overdraftProtection) {
                balance -= amt;
                ove = new OverdraftException("Insufficient fund for overdraft protection ", balance);
            }
            else {
                ove = new OverdraftException("No overdraft Protection ", balance);
            }
        }
        else {
            balance -= amt;
        }
    }
}
