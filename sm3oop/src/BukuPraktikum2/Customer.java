package BukuPraktikum2;

public class Customer {
    private String  nama, alamat, nomorTelepon, alamatEmail;
    private boolean status;
    private double totalPenjualan;
    private int customerID;

    public Customer(String nm, String almt, String noTelp, String lmtEmail) {
        nama = nm;
        alamat = almt;
        nomorTelepon = noTelp;
        alamatEmail = lmtEmail;
    }
    
    public Customer(int cID, boolean stts, double tPenjualan) {
        customerID = cID;
        status = stts;
        totalPenjualan = tPenjualan;
    }
  
    public void displayCustomerInfo(){
        System.out.println("Customer ID     : "+customerID);
        if(status){
            System.out.println("Status          : O (lama)");
        }
        else{
            System.out.println("Status          : N (baru)");
        }
        System.out.println("Total Penjualan : " + totalPenjualan);
    }
}
