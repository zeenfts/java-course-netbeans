package M2TPQueue;

public class TP2Queue {
    private int ukuran, awal, akhir, jumlahItem, theQueue[]; //Attribute

    public TP2Queue(int ukuran) { //Constructor
        this.ukuran = ukuran;
        theQueue = new int[ukuran];
        awal = jumlahItem =0;
        akhir = -1;
    }
        
    public void enqueue(int o){//Methode enqueue/add //Yang diubah posisi akhir
        if(akhir == ukuran-1)
            akhir = -1;
        theQueue [++akhir] = o;
        jumlahItem++;
    }
    
    public int dequeue(){//Methode dequeue/delete //Yang akan diubah adalah posisi awal
        int amb = theQueue[awal++];
        if(awal == ukuran)
            awal = 0;
        jumlahItem--;
        return amb;
    }
    
    public boolean isEmpty(){//True jika queue kosong
       return jumlahItem == 0; 
    }
    
    public boolean isFull(){//True jika queue penuh
       return jumlahItem == ukuran; 
    }
  
}
