package BukuPraktikum6;

public abstract class Animal {
    protected byte legs;
    protected String name = null;

    protected Animal() {
    }

    protected Animal(byte legs) {
        this.legs = legs;
    }
    
    protected Animal(String name) {
        this.name = name;
    }
    
    public void walk(){};
    public abstract void eat();
}
