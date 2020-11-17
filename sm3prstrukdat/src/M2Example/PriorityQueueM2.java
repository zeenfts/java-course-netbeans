package M2Example;

public class PriorityQueueM2 {
    private int maxSize; 
    private int[] queueArr;
    private int nItems;
    
    public PriorityQueueM2(int s) { 
        maxSize = s; 
        queueArr = new int[maxSize];
        nItems = 0; 
    } 
    
    public void enqueue(int item) { 
        int j;
        if (nItems == 0) //Jika tidak ada item
            queueArr[nItems++] = item; 
        else { //Jika ada item 
            for (j = nItems - 1; j >= 0; j--) { //dimulai dari yang terakhir
                if (item > queueArr[j]) { //jika item baru lebih besar
                    queueArr[j + 1] = queueArr[j]; //pindahkan ke belakang 
                } 
                else  
                    break;
            } 
            queueArr[j + 1] = item; //memasukan item ke queue 
            nItems++;
            } 
    }
    
    public int dequeue(){ //menghapus item minimum
        return queueArr[--nItems]; 
    } 
    
    public int peekMin(){ //melihat item minimum
        return queueArr[nItems - 1];
    }
    
    public int peekMax(){ //melihat item minimum
        return queueArr[0];
    }
    
    public boolean isEmpty(){ //mengembalikan nilai true jika kosong
        return (nItems == 0);
    }
}
