package PraktikumM4;

public class Bank_EAD {
   protected String no_rek, NamaPemilik;
   protected int saldo;

    protected Bank_EAD(String no_rek, String NamaPemilik, int saldo) {
        this.no_rek = no_rek;
        this.NamaPemilik = NamaPemilik;
        this.saldo = saldo;
    }
   
   protected void transfer(int uangTransfer, String no_rek_tujuan){
       if(uangTransfer > saldo){
           System.out.println("Saldo tidak cukup");
       }
       else{
       saldo-= uangTransfer;
       System.out.println("Uang berhasil ditransfer ke rekening "+no_rek_tujuan+" sebesar Rp "+uangTransfer);
       System.out.println("Saldo anda tersisa RP "+saldo);
       }
   }
}
