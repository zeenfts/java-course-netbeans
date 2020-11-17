package M2Example;

public class QueueAppM2 {

    public static void main(String[] args) {
        QueueM2 theQueue = new QueueM2(5); //membuat queue baru 
        theQueue.enqueue(10);
        theQueue.enqueue(20); 
        theQueue.enqueue(30); 
        theQueue.enqueue(40); 
        theQueue.dequeue(); //menghapus 3 item
        theQueue.dequeue(); //(10,20,30) 
        theQueue.dequeue(); 
        theQueue.enqueue(50);
        theQueue.enqueue(60); 
        theQueue.enqueue(70); 
        theQueue.enqueue(80);
        
        while (!theQueue.isEmpty()){ //hapus dan tampilkan semua data                                    
            System.out.print(theQueue.dequeue()); //40,50,60,70,80 
            System.out.print(" "); 
        } System.out.println(""); 
        System.out.println("Depan   : "+theQueue.peekFront());
        System.out.println("Belakang: "+theQueue.peekRear());
    }
 
}
