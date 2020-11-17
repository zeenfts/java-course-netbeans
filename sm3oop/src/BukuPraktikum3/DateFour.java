package BukuPraktikum3;

public class DateFour {
    private int day, month, year;
    private String date;

    public DateFour() {
        day = 1;
        month = 1;
        year = 2007;
    }

    public DateFour(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void displayDate(){
        date = day+"/"+month+"/"+year;
        System.out.println("Hari ini adalah "+date);
    }
}
