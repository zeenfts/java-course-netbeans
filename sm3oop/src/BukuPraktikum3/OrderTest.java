package BukuPraktikum3;

public class OrderTest {

    public static void main(String[] args) {
        Shirt s1 = new Shirt();
        s1.setPrice(20000);
        Order o1 = new Order();
        System.out.println("Baju 1, harga: "+o1.addShirt(s1));
        
        Shirt s2 = new Shirt();
        s2.setPrice(500000);
        Order o2 = new Order();
        System.out.println("Baju 2, harga: "+o2.addShirt(s2));
        
        Shirt s3 = new Shirt();
        s3.setPrice(150000);
        Order o3 = new Order();
        System.out.println("Baju 3, harga: "+o3.addShirt(s3));
    }
    
}
