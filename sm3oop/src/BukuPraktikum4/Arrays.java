package BukuPraktikum4;

public class Arrays {
    private int[] array1 = {2,3,5,7,11,13,17,19}, 
                  array2 = {2,3,5,7,11,13,17,19};

    public Arrays() {  
    }
    
    public void printArray(){
        int a;
        System.out.print("Array 1: ");
        for(a=0; a<array1.length; a++){
            System.out.print(array1[a]+" ");
        }
        
        System.out.print("\nArray 2: ");
        for(a=0; a<array2.length; a++){
            if(a%2==0)
                array2[a]=a;
            System.out.print(array2[a]+" ");
        }
        System.out.println();
    }
}
