package BukuPraktikum6;

public class OverdraftException extends Exception{
   private double deficit;

    public OverdraftException(String message, double deficit) {
        super(message);
        this.deficit = deficit;
        System.out.print("\n\n"+message);
    }

    public double getDeficit() {
        return deficit;
    }
   
}
