package M2Example;

public class StackM2 {
    private int size, top, stackArray[];
    
    public StackM2(int s){ // constructor
        size = s; // menentukan ukuran array stackArray = new long[maxSize]; // membuat array 
        stackArray = new int[size];
        top = -1; // menunjukkan bahwa belum terdapat item
    }
    public void push(int j){ // menaruh item di stack bagian atas
        stackArray[++top] = j; // menambahkan nilai top, lalu memasukkan item baru 
    }
    
    public int pop(){ // menghapus item di stack bagian atas
        return stackArray[top--]; // akses ke itemnya, lalu kurangkan nilai top 
    }
    
    public int peek(){
        return stackArray[top];
    }
    
    public Boolean isEmpty(){ // mengembalikan nilai “true” jika array kosong 
        return (top == -1); 
    }

}
