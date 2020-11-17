package Project1_5;

public class UrutNamaAbsen {

    private int size, itemKe, top;
    private String theQArr[], theSArr[];

    public UrutNamaAbsen(int s) {//Constructor
        size = s;
        theQArr = new String[size];
        itemKe = 0;
        theSArr = new String[size];
        top = -1;
    }
    //Methodenya queue (priority)
    public void enqueue(String item) {
        int j;
       
        if (itemKe == 0) //Jika tidak ada item
        {
            theQArr[itemKe++] = item;
        } else { //Jika ada item 
            for (j = itemKe - 1; j >= 0; j--) { //dimulai dari yang terakhir
                if (item.compareToIgnoreCase(theQArr[j])>=0) { //jika item baru lebih besar
                    theQArr[j + 1] = theQArr[j]; //pindahkan ke belakang 
                } else {
                    break;
                }
            }
            theQArr[j + 1] = item; //memasukan item ke queue 
            itemKe++;
        }
    }
    
    public String dequeue() { //menghapus item minimum
        return theQArr[--itemKe];
    }
    
    public String dequeueTertentu(int i){
        return theQArr[--i];
    }
    
    public void show(int index){
        System.out.println(theQArr[index]);
    }

    public String peekMin() { //melihat item minimum
        return theQArr[0];
    }

    public String peekMax() { //melihat item maksimum
        return theQArr[size - 1];
    }

    public boolean isEmpty() { //mengembalikan nilai true jika kosong
        return (itemKe == 0);
    }

    public boolean isFull() { //mengembalikan nilai true jika full
        return (itemKe == size - 1);
    }
    //Methodenya stack
    public void push(String j){ // menaruh item di stack bagian atas
        theSArr[++top] = j; // menambahkan nilai top, lalu memasukkan item baru 
    }
    
    public String pop(){ // menghapus item di stack bagian atas
        return theSArr[top--]; // akses ke itemnya, lalu kurangkan nilai top 
    }
    
    public String peekTop(){//Memunculkan item pada stack paling atas
        return theSArr[top];
    }
    
    public String peekBottom(){//Memunculkan item pada stack paling bawah
        return theSArr[0];
    }
    
    public Boolean sIsEmpty(){ // mengembalikan nilai “true” jika stack array kosong 
        return (top == -1); 
    }
    
    public Boolean sIsFull(){ // mengembalikan nilai “true” jika stack array penuh 
        return (top == size-1); 
    }
}
