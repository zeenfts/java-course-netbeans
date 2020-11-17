package PraktikumM4;

public class mBanking extends Bank_EAD implements account{
    private String username;
    private int sandi;
    
    public mBanking(String username, int sandi, String no_rek, String NamaPemilik, int saldo) {
        super(no_rek, NamaPemilik, saldo);
        this.username = username;
        this.sandi = sandi;
    }

    public boolean login(String username, int sandi){
        if(username.equals(this.username) && sandi == this.sandi){
            System.out.println("Login berhasil");
            return true;
        }
        else if(username.equals(this.username) && sandi != this.sandi){
            System.out.println("Sandi salah");
            return false;
        }
        System.out.println("Username salah");
        return false;
    }
    
    @Override
    public void showData() {
        System.out.println("Nama Nasabah : "+NamaPemilik+
                         "\nNo Rekening  : "+no_rek+
                         "\nJumlah saldo : "+saldo+
                         "\nUsername     : "+username+
                         "\nSandi        : "+sandi);
    }

    @Override
    public void gantiPass() {
        System.out.println("Sandi berhasil dirubah");
        sandi = 56789;
    }
    
    
}
