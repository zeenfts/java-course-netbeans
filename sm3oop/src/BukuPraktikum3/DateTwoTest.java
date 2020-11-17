package BukuPraktikum3;

public class DateTwoTest {

    public static void main(String[] args) {
        try{
        DateTwo d2 = new DateTwo();
        
        System.out.println("Tanggal: "+d2+"/"+d2+"/"+d2);
        }
        catch(Exception ec){
            System.out.println("Error: \n"+ec);
        }
    }
    
}
