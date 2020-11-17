package BukuPraktikum6;
import java.util.ArrayList;

public class Bank{
    private static Bank bankInstance;
    private ArrayList<Customer> customers;

    private Bank() {
       customers = new ArrayList<>();
    }
 
    public static Bank getBank(){
        if(bankInstance == null)
            return bankInstance = new Bank();
        return bankInstance;
    }
    public void addCustomers(String fn, String ln, double firstDeposit){
        Customer csr = new Customer();
        csr.addAccount(fn, ln, firstDeposit);
        customers.add(csr);
    }
    
    public int getNumOfCustomers(){
        return customers.size();
    }
    
    public Customer getCustomer(int index){
        if(index<0)return null;
        return customers.get(index);
    }
    
}
