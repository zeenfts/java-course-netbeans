package BukuPraktikum6;

public class Cat extends Animal implements Pet {

    public Cat() {
    }
    
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public void play() {
        System.out.println(name+" bermain bola benang");
    }
    
    @Override
    public void eat() {
        System.out.println(name+" memakan ikan");
    }
    
    public void jenis(){
        System.out.println(name+" adalah seekor kucing");
    }
    
}
