
package SearchSort;

public class urutInsert {

    public static void main(String[] args) {
       int bil[] = {9, 2, 4, 1, 7};
       int j, i, simpanDulu;  
       
        System.out.println("Sebelum disort secara ascending: ");
        for(j=0; j< bil.length; j++)
            System.out.println("Data ke-"+j+" = "+bil[j]);
        
        for (j = 0; j < bil.length; j++) {  
            simpanDulu = bil[j];  
            i = j-1;  
            while ( (i > -1) && ( bil [i] > simpanDulu ) ) {  
                bil[i+1] = bil [i];  
                i--;  
            }  
            bil[i+1] = simpanDulu;  
        } 
        
        System.out.println("\nSetelah disort secara ascending: ");
        for(j=0; j< bil.length; j++)
            System.out.println("Data ke-"+j+" = "+bil[j]);
        
    }
    
}
