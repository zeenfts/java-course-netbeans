package PraktikumM4;

public class ATM extends Bank_EAD implements account {
    private int sandi;
    
    public ATM(String no_rek, String NamaPemilik, int saldo, int sandi) {
        super(no_rek, NamaPemilik, saldo);
        this.sandi = sandi;
    }

    @Override
    public void showData() {
       System.out.println("Nama         : "+NamaPemilik+
                        "\nNo rekening  : "+no_rek+
                        "\nJumlah saldo : "+saldo+
                        "\nSandi ATM    : "+sandi);
    }

    @Override
    public void gantiPass() {
        sandi = 12345;
    }
    
    public void tarik(int jumlahUang){
        if(jumlahUang > saldo)
            System.out.println("Saldo tidak cukup");
        else
            saldo-=jumlahUang;
    }
    
    public void tarikSemua(){
      saldo = 0;
    }
    
    public void simpanUang(int jumlahUang){
        System.out.println("Saldo anda tersisa Rp "+saldo);
        saldo += jumlahUang;
        System.out.println("Saldo anda sekarang Rp "+saldo);
    }
    
    public boolean login(int sandi){
        if(sandi != this.sandi){
            System.out.println("Sandi salah");
            return false;
        }
        System.out.println("Login berhasil\nProses berhasil");
        return true;
    }
}
