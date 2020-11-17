package M2Example;

public class QueueM2 {
    private int size, front, rear, nItems; 
    private long[] queArray;
    
    public QueueM2(int s){ //constructor
        size = s;
        queArray = new long[size];
        front = nItems =0;
        rear = -1;
    }
    
    public void enqueue(long j){ //menaruh item queue
        if (rear == size - 1) //mengatur lokasi rear
            rear = -1;
        queArray[++rear] = j; //tambahkan nilai rear, masukkan nilai
        nItems++; //menambahkan nilai nItems
    }
    
    public long dequeue(){ //menghapus item yang berada di lokasi terdepan 
        long temp = queArray[front++]; //ambil valuenya lalu kurangi nilsai front
        if (front == size) // mengatur lokasi front
            front = 0;
        nItems--;
        return temp;
    }
    
    public long peekFront(){
        return queArray[front];
    }
    
    public long peekRear(){
        return queArray[rear];
    }
    
    public boolean isEmpty(){ //true jika queue kosong
            return (nItems == 0);
    }
    
    public boolean isFull(){ //true jika queue penuh
            return (nItems == size);
    }
}
