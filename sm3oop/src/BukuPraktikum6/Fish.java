package BukuPraktikum6;

public class Fish extends Animal implements Pet {
   
    public Fish() {
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
         System.out.println(name+" bermain air");
    }
    
    @Override
    public void walk() {
         System.out.println(name+" Tidak bisa berjalan");
    }
   
    @Override
    public void eat() {
         System.out.println(name+" Makan makanan ikan");
    }
    
    public void jenis(){
        System.out.println(name+" adalah seekor ikan");
    }
}
