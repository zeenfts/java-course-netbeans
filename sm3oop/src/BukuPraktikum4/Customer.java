package BukuPraktikum4;

public class Customer {
    private String firstName,lastName;
    private Account account;

    public Customer(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account acct) {
        account = acct;
    }
    
    public void showInfo(){
        System.out.println("Nama nasabah: "+getFirstName()+" "+getLastName());
        System.out.println("Isi Rekening: Rp "+getAccount().getBalance());
    }
}
