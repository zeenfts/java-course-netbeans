package BukuPraktikum2;//no 3

public class DateTwo {
    private int hari[] = {1, 2, 3, 4, 5, 6, 7};

    public DateTwo() {
    }
    
    public String displayDay(int ketik){
        if(ketik == hari[0]){
            return "Hari Senin";
        }
        else if(ketik == hari[1]){
            return "Hari Selasa";
        }
        else if(ketik == hari[2]){
            return "Hari Rabu";
        }
        else if(ketik == hari[3]){
            return "Hari Kamis";
        }
        else if(ketik == hari[4]){
            return "Hari Jumat";
        }
        else if(ketik == hari[5]){
            return "Hari Sabtu";
        }
        else if(ketik == hari[6]){
            return "Hari Ahad";
        }
        return "(Error..)";
    }
}
