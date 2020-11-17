package BukuPraktikum5.Banking;

public class TestBanking {

    public static void main(String[] args) {
        Bank bk = Bank.getBank();
        bk.addCustomers("M Difagama", "I", 7000000);
        bk.addCustomers("Ramadhanu", "T", 7100000);
           
        System.out.print("Jumlah customer: "+bk.getNumOfCustomers());
        CustomerReport cr = new CustomerReport();
        bk.getCustomer(0).getAccountSA(0).deposit(150000);
        bk.getCustomer(0).getAccountSA(0).withdraw(500000);
        
        CustomerReport csr = new CustomerReport();
        System.out.print(csr.getCustomerInfoSavingAccount(bk.getCustomer(0)));
        System.out.print(csr.getCustomerInfoCheckingAccount(bk.getCustomer(0)));
        System.out.println("\nJumlah rekening : Saving "+
                     bk.getCustomer(0).getNumOfAccount("Saving")+", Checking "+
                     bk.getCustomer(0).getNumOfAccount("Checking"));
        
        bk.getCustomer(1).getAccountSA(0).withdraw(100000);
        bk.getCustomer(1).getAccountCA(0).withdraw(30000);
        System.out.print(csr.getCustomerInfoSavingAccount(bk.getCustomer(1)));
        System.out.print(csr.getCustomerInfoCheckingAccount(bk.getCustomer(1)));
        System.out.println("\nJumlah rekening : Saving "+
                     bk.getCustomer(1).getNumOfAccount("Saving")+", Checking "+
                     bk.getCustomer(1).getNumOfAccount("Checking"));
    }
    
}
