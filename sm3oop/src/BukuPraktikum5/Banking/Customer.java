package BukuPraktikum5.Banking;
import java.text.NumberFormat;
import java.util.Locale;

public class Customer{
    private String firstName, lastName;
    private Account[] akunTabungan, akunGiro;
    private int numOfSA = 0, numOfCA=0;
    NumberFormat kursDollar = NumberFormat.getCurrencyInstance(Locale.US);

    public Customer() {
        akunTabungan = new Account[2];
        akunGiro = new Account[2];
    }
    
    public void addAccount(String fn, String ln, double firstDeposit){
        firstName = fn;
        lastName = ln;
        Account sa = new SavingAccounts(firstDeposit, 0);
        akunTabungan[numOfSA] = sa;
        numOfSA++;
        Account ca = new CheckingAccounts(firstDeposit, 0);
        akunGiro[numOfCA] = ca;
        numOfCA++;
    }
    
    public Account getAccountSA(int index){
        if(index<0) return null;
        return akunTabungan[index];
    }
    
    public Account getAccountCA(int index){
        if(index<0) return null;
        return akunGiro[index];
    }
    
    public int getNumOfAccount(String jenisAkun){
        if(jenisAkun.equals("Saving"))
            return numOfSA;
        else if(jenisAkun.equals("Checking"))
            return numOfCA;
        return 0;
    }
    
    public String getCustomerInfoSavingAccount(){
        for(int a=0; a<=numOfSA; a++){
            return "\nNama Lengkap : "+firstName+" "+lastName+
                   "\nTipe akun    : "+"Saving"+
                   "\nIsi Rekening : "+kursDollar.format(akunTabungan[a].getBalance());
        }
        return null;
    }
    
    public String getCustomerInfoCheckingAccount(){
        for(int a=0; a<=numOfCA; a++){
            return "\n\nNama Lengkap : "+firstName+" "+lastName+
                   "\nTipe akun    : "+"Checking"+
                   "\nIsi Rekening : "+kursDollar.format(akunGiro[a].getBalance());
        }
        return null;
    }
    
}
