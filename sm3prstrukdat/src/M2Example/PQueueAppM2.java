package M2Example;

public class PQueueAppM2 {

    public static void main(String[] args) {
        PriorityQueueM2 pq = new PriorityQueueM2(10);
        pq.enqueue(30);
        pq.enqueue(50); 
        pq.enqueue(34); 
        pq.enqueue(12); 
        pq.enqueue(33); 
        pq.enqueue(24);
        pq.enqueue(100); 
        pq.enqueue(53); 
        pq.enqueue(1); 
        pq.enqueue(76); 
        
        while(!pq.isEmpty()){
            int item = pq.dequeue();
            System.out.print(item + " ");
        } System.out.println("");
    }
    
}
