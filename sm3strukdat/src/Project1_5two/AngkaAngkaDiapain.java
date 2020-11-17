package Project1_5two;

public class AngkaAngkaDiapain {
    private int size, depan, belakang, itemKe, top; 
    private double qArray[], sArray[];
    
    public AngkaAngkaDiapain(int s){ //constructor
        size = s;
        qArray = new double[size];
        depan = itemKe =0;
        belakang = -1;
        sArray = new double[size];
        top = -1;
    }
    //methode queue
    public void enqueue(double iteme){ //menaruh item queue
        if (belakang == size - 1) //mengatur lokasi rear
            belakang = -1;
        qArray[++belakang] = iteme; //tambahkan nilai rear, masukkan nilai
        itemKe++; //menambahkan nilai nItems
    }
    
    public double dequeue(){ //menghapus item yang berada di lokasi terdepan 
        double temp = qArray[depan++]; //ambil valuenya lalu kurangi nilsai front
        if (depan == size) // mengatur lokasi front
            depan = 0;
        itemKe--;
        return temp;
    }
    
    public double peekFront(){//ambil item di queue yang awal
        return qArray[depan];
    }
    
    public double peekRear(){//ambil item di queue yang terakhir
        return qArray[belakang];
    }
    
    public boolean isEmpty(){ //true jika queue kosong
            return (itemKe == 0);
    }
    
    public boolean isFull(){ //true jika queue penuh
            return (itemKe == size);
    }
    //methode untuk stack
    public void push(double j){ // menaruh item di stack bagian atas
        sArray[++top] = j; // menambahkan nilai top, lalu memasukkan item baru 
    }
    
    public double pop(){ // menghapus item di stack bagian atas
        return sArray[top--]; // akses ke itemnya, lalu kurangkan nilai top 
    }
    
    public double peekTop(){//Memunculkan item pada stack paling atas
        return sArray[top];
    }
    
    public double peekBottom(){//Memunculkan item pada stack paling bawah
        return sArray[0];
    }
    
    public Boolean sIsEmpty(){ // mengembalikan nilai “true” jika stack array kosong 
        return (top == -1); 
    }
    
    public Boolean sIsFull(){ // mengembalikan nilai “true” jika stack array penuh 
        return (top == size-1); 
    }
}
