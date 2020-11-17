package BukuPraktikum2;//no 4

public class DateThree {
   
    public DateThree() {
    }
    
    public String displayDay(int ketik){  
        switch(ketik){
            case 1:
                return "Hari Senin";
            case 2:
                return "Hari Selasa";
            case 3:
                return "Hari Rabu";
            case 4:
                return "Hari Kamis";
            case 5:
                 return "Hari Jumat";
            case 6:
                return "Hari Sabtu";
           case 7:
               return "Hari Ahad";
        }
        return "(Error..)";
    }
}
