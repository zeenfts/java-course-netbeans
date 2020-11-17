package BukuPraktikum6;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Customer{
    private String firstName, lastName;
    private ArrayList<Account> akunTabungan, akunGiro;
    NumberFormat kursDollar = NumberFormat.getCurrencyInstance(Locale.US);

    public Customer() {
        akunTabungan = new ArrayList<>();
        akunGiro = new ArrayList<>();
    }
    
    public void addAccount(String fn, String ln, double firstDeposit){
        firstName = fn;
        lastName = ln;
        Account sa = new SavingAccounts(firstDeposit, 0);
        akunTabungan.add(sa);
        Account ca = new CheckingAccounts(firstDeposit, 500000);
        akunGiro.add(ca);
    }
    
    public Account getAccountSA(int index){
        if(index<0) return null;
        return akunTabungan.get(index);
    }
    
    public Account getAccountCA(int index){
        if(index<0) return null;
        return akunGiro.get(index);
    }
    
    public int getNumOfAccount(String jenisAkun){
        if(jenisAkun.equals("Saving"))
            return akunTabungan.size();
        else if(jenisAkun.equals("Checking"))
            return akunGiro.size();
        return 0;
    }
    
    public String getCustomerInfoSavingAccount(){
        
        for(int a=0; a<=akunTabungan.size(); a++){
            return "\nNama Lengkap : "+firstName+" "+lastName+
                   "\nTipe akun    : "+"Saving"+
                   "\nIsi Rekening : "+kursDollar.format(akunTabungan.get(a).getBalance());
        }
        return null;
    }
    
    public String getCustomerInfoCheckingAccount(){
        for(int a=0; a<=akunGiro.size(); a++){
            return "\n\nNama Lengkap : "+firstName+" "+lastName+
                   "\nTipe akun    : "+"Checking"+
                   "\nIsi Rekening : "+kursDollar.format(akunGiro.get(a).getBalance());
        }
        return null;
    }
    
}
