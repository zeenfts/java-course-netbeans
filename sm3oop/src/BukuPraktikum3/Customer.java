package BukuPraktikum3;

public class Customer {
    private String id, name, address, phoneNumber, eMail;

    public Customer() {
    }
    
    public void setCustomerInfo(String id, String name, String address, String phoneNumber){
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public void setCustomerInfo(String ID, String name, String address, String phoneNumber, String eMail){
        setCustomerInfo(ID, name, address, phoneNumber);
        this.eMail = eMail;
    }
    
    public void info(){
        System.out.printf(  "ID     : %s",id);
        System.out.printf("\nNama   : %s",name);
        System.out.printf("\nAlamat : %s",address);
        System.out.printf("\nNo. HP : %s",phoneNumber);
        System.out.printf("\nE-Mail : %s",eMail);
        System.out.println();
    }
}
