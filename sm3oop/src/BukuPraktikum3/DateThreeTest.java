package BukuPraktikum3;

public class DateThreeTest {

    public static void main(String[] args) {
        DateThree d3 = new DateThree();
        
        d3.setDay(31);
        d3.setMonth(12);
        d3.setYear(2021);
        d3.setDate();
        System.out.println("Jumlah hari dalam bulan tersebut: "+d3.calDaysMonth());
        d3.displayDate();
        
        System.out.println();
        d3.setDay(35);
        d3.setMonth(14);
        d3.setYear(2021);
        d3.setDate();
        System.out.println("Jumlah hari dalam bulan tersebut: "+d3.calDaysMonth());
        d3.displayDate();
    }
    
}
