package M2TPQueue;

public class TP2QueueLaunch {

    public static void main(String[] args) {
        
        TP2Queue stp = new TP2Queue(9); //Membuat queue baru
        try{ //Menggunakan try-catch agar untuk antisipasi jika ada error
            System.out.println("Queue dengan adanya yang di-dequeue:");
            stp.enqueue(7); 
            stp.enqueue(98);
            stp.enqueue(14);
            stp.enqueue(91);
            stp.enqueue(21);
            stp.dequeue();// Ambil/hapus 7
            stp.dequeue();// Ambil/hapus 98
            stp.dequeue();// Ambil/hapus 14
            stp.enqueue(84); 
            stp.enqueue(28);
            stp.enqueue(77);
            stp.enqueue(35);
            stp.enqueue(70); 
            stp.enqueue(42);
            stp.enqueue(63);//91 21 84 28 77 35 70 42 63 49
            
            while(!stp.isEmpty()){//Looping untuk tampil data di queue
                System.out.print(stp.dequeue());
                System.out.print(" "); 
            } System.out.println();
      
        }
        catch(Exception e) {//Jika ada error akan dijalankan kesini
            System.out.println(e);
        }
    }

}
    

