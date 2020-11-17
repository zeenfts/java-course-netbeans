package SearchSort;

public class urut {

    public static void main(String[] args) {
        int data[] = {5, 6, 3};
        int i , j, hasil;
        
        System.out.println("Data sebelum Urut secara ascending: ");
        for(i=0; i<data.length; i++)
            System.out.println("Data ke-"+i+" = "+data[i]);
        for(i=0; i<data.length; i++)
            for(j=0; j<data.length; j++)
                if(data[i]<data[j]){
                    hasil = data[i];
                    data[i] = data[j];
                    data[j] = hasil;
                }
        
        System.out.println();
        System.out.println("Data setelah Urut secara Ascending");
        for(j=0; j<data.length; j++)
            System.out.println("Data ke-"+j+" = "+data[j]);
    }
    
}
