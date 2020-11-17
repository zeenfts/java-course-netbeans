package BukuPraktikum3;

public class DateThree {
    private int day, month, year;
    private String date;

    public DateThree() {
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if(day>0 && day<=31)
        this.day = day;
        else
            System.out.println("Error"); 
    }

    public void setMonth(int month) {
        if(month>0 && month<=12)
        this.month = month;
        else
            System.out.println("Error"); 
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public int calDaysMonth(){
        switch (getMonth()) {
            case 1:
                return 31;
            case 2:
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
        }
        return 0;
    }
    
    public void setDate() {
        String hari = String.valueOf(getDay());
        String bulan = String.valueOf(getMonth());
        String tahun = String.valueOf(getYear());
        String dates = bulan+","+hari+","+tahun;
        this.date = dates;   
    }
    
    public void displayDate(){
        String[] splitTgl = date.split(",");
        String dates = splitTgl[0]+"/"+splitTgl[1]+"/"+splitTgl[2];
        System.out.println("Hari ini adalah "+dates);
    }
}
