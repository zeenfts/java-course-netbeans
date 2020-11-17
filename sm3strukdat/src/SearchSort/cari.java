package SearchSort;
import java.util.Scanner;

public class cari {

    public static void main(String[] args) {
        int tabInt[] = {24, 17, 18, 15, 22, 26, 13, 21, 16, 28};
        int ketemu, cariData, i;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Masukkan data yang dicari: ");
                cariData = inp.nextInt();
        i = 0;
        ketemu = 0;
        
        while(i<10 && ketemu!=-1){
            if(tabInt[i] == cariData)
                ketemu = 1;
            else
                i++;
            
            if(ketemu==1){
                System.out.println("Data "+cariData+" terdapat pada kumpulan data indeks ke-"+i);
                break;
            }
            else{
                System.out.println("Data "+cariData+" tidak terdapat pada kumpulan data");
                break;
            }
        }
    }
    
}
