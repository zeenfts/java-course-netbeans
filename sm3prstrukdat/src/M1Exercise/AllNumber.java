package M1Exercise;

import java.util.Arrays;

public class AllNumber {
    private static int myArray[] = {10, 20, 34, 43, 55};
    private static int myArray2[] = {12, 23, 34, 56, 67, 78};
    public static void main(String[] args) {
      //No 1a
        System.out.println("Data ke-2: "+myArray[1]);
        System.out.println("Data ke-4: "+myArray[3]+"\n");
      //No 1b
        System.out.println(indexGanjilDitambah(myArray)+"\n"); 
      //No 2a
        System.out.println(searchFromArray(myArray2)+"\n"); 
      //No 2b
        AllNumber anm = new AllNumber();
        anm.nilaiMaxMinArray();
    }
    
    private static boolean indexGanjilDitambah(int[] myArray) {
        boolean verified = false;
        int sum = 0;
        
        for(int g=0; g < myArray.length; g++){
            while(g%2 != 0){
                verified = true;
                sum += myArray[g];
                break;
            }
        }
        System.out.println("Total angka di index ganjil: "+sum);
        return verified;
    }

    private static boolean searchFromArray(int[] myArray2) {
        boolean verified = false;
        
        for(int g=0; g<myArray2.length; g++){
            if(myArray2[g]%2 != 0){
                System.out.println("Angka Ganjil Pertama: "+myArray2[g]);
                System.out.println("Index angka ganjil pertama: "+g);
                verified = true;
                break;
            }
        }
        return verified;
    }
    
    private void nilaiMaxMinArray(){
       Arrays.sort(myArray2);
       System.out.println("Minimum: "+myArray2[0]);
       System.out.println("Maksimum: "+myArray2[myArray2.length-1]);
    }
    
}
