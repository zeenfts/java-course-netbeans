package BukuPraktikum6;

public class TestAnimals {

    public static void main(String[] args) {
        Fish f = new Fish();
        Cat c = new Cat("Pipo");
        Animal an1 = new Spider();
        Pet p = new Cat(); 
        
        f.setName("Nemo");
        f.jenis();
        f.eat();
        f.play();
        f.walk();
        System.out.println();
        c.jenis();
        c.eat();
        c.play();
        System.out.println();
        an1.eat();
        an1.walk();
        System.out.println();
        p.setName("Lupyy");
        p.play();
    }
    
}
