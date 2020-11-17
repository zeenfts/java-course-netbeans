package BukuPraktikum5.Banking;

public class Bank{
    private static Bank bankInstance;
    private Customer[] customers;
    private int numOfCustomers = 0;

    private Bank() {
        customers = new Customer[1000];
    }
 
    public static Bank getBank(){
        if(bankInstance == null)
            return bankInstance = new Bank();
        return bankInstance;
    }
    public void addCustomers(String fn, String ln, double firstDeposit){
        Customer csr = new Customer();
        csr.addAccount(fn, ln, firstDeposit);
        customers[numOfCustomers] = csr; 
        numOfCustomers ++;
    }
    
    public int getNumOfCustomers(){
        return numOfCustomers;
    }
    
    public Customer getCustomer(int index){
        if(index<0)return null;
        return customers[index];
    }
    
}
