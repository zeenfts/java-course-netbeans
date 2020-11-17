package BukuPraktikum2;//no 2

public class PersonTwo {
    private String kuota, person;

    public PersonTwo(String kuota, String person) {
        this.kuota = kuota;
        this.person = person;
    }
    
    public void displayQuote(){
        System.out.println("Kuota: "+kuota+
                         "\nNama : "+person);
    }
}
