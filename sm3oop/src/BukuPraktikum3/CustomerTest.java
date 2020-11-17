package BukuPraktikum3;

public class CustomerTest {

    public static void main(String[] args) {
        Customer cs1 = new Customer();
        cs1.setCustomerInfo("1234567", "Ramadhanu", "Bengkulu", "081222222903");
        Customer cs2 = new Customer();
        cs2.setCustomerInfo("1234568", "Difagama", "Balikpapan", "081444444909", "ghjk@mael.coom");
        
        cs1.info();
        System.out.println();
        cs2.info();
    }
    
}
