
package Bab7;

public class Bab7 {
    public static void main(String[] args) {
       String namaSiswa1 = "Adi";
       String namaSiswa2 = new String ("Adi");
       String namaSiswa3 = "Adi"; 
       String namaSiswa4 = new String("Adi");
       System.out.println(namaSiswa1 == namaSiswa2);
       System.out.println(namaSiswa1 == namaSiswa3);
       System.out.println(namaSiswa1.equals(namaSiswa2));
       System.out.println(namaSiswa2 == namaSiswa4);
       System.out.println(namaSiswa2.equals(namaSiswa4));
    }
    
}
