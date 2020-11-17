package M4DoublyLinkedList;
class Node{
    public Node next;
    public Node prev;
    private String data;
    
    public Node(String data) {
        this.data = data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public String getData() {
        return this.data;
    }
}

public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;
    protected String data, key;
    
    public DoublyLinkedList() {
        this.head = null;
        this.tail = head;
        this.size = 0;
    } 
    public void addFirst(String data) { //method ini berfungsi untuk menambahkan sebuah node menjadi head
        this.data = data;
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = head;
        } 
        else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        } 
        size++;
    }
    
    public void addLast(String data) { //method ini berfungsi untuk menambahkan sebuah node menjadi tail
        this.data = data;
        Node newNode = new Node(data); 
        if (head == null && tail == null) { 
            head = newNode;
            tail = head;
        } 
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    
    public void addAfterByKey(String data, String key) { //method ini berfungsi untuk menambahkan node setelah node yang ditentukan
        this.data = data;
        Node newNode = new Node(data);
        Node current = head; 
        
        while (!current.getData().equals(key)) {
            current = current.next;
        }
        
        newNode.next = current.next;
        current.next.prev = newNode;
        current.next = newNode;
        newNode.prev = current;
        size++;
    } 
    
    public void addAfterByAllKey(String data, String key) { //method ini berfungsi untuk menambahkan node setelah node yang ditentukan
        this.data = data;
        Node newNode = new Node(data);
        Node current = head; 
        
        while (current != null) {
            if(current.getData().equals(key)){
                newNode.next = current.next;
                current.next.prev = newNode;
                current.next = newNode;
                newNode.prev = current;
            }
            else{
                current = current.next;
            }
        }
        size++;
    } 
    
    public void addBeforeByKey(String data, String key) { //method ini berfungsi untuk menambahkan node sebelum node yang ditentukan
        this.data = data;
        Node newNode = new Node(data);
        Node current = head; 
        
        while (!current.getData().equals(key)) {
            current = current.next;
        }
        
        newNode.prev = current.prev;
        current.prev.next = newNode;
        current.prev = newNode;
        newNode.next = current;
        size++;
    }
    
    public void deleteByKey(String key) { //method ini berfungsi untuk menghapus node yang ditentukan
        this.key = key;
        Node current = head; 
        
        while (!current.getData().equals(key)) {
            current = current.next;
        }
        current.prev.next = current.next;
        size--;
    } 
    
    public void deleteAllByKey(String key) { //method ini berfungsi untuk hapus semua node dengan nilai sama
        this.key = key;
        Node current = head; 
        
        while (current != null) {
            if(current.getData().equals(key)){
                current.prev.next = current.next;
                current = current.next;
            }
            else{
                current = current.next;
            }
        }
        size--;
    } 
    
    public void deleteFirst() { //method ini berfungsi untuk menghapus node pertama
        if (head == tail) {
            head = null;
            tail = null;
        } 
        else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    
    public void deleteLast() { //method ini berfungsi untuk menghapus node terakhir
        if (head == tail) { 
            head = null;
            tail = null; 
        } 
        else { 
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    
    public boolean findByKey(String key) { //method ini berfungsi untuk mencari apakah node dengan key tertentu ada atau tidak
        Node current = head;
        while (!current.getData().equals(key)) {
            if (current.next == null) {
                return false;
            }
            current = current.next;
        }
        return true;
    }
    
    public void display() { //method ini untuk menampilkan isi dari Doubly Linked List yang telah dibuat
        if (head != null) {
            Node current = head;
        
            while (current != null) {
                System.out.print(current.getData() + " ");
                current = current.next;}
                System.out.println("");} 
        else {
            System.out.println("Doubly Linked List Anda Kosong!");
        } 
    }
    
    public void displayInverse() { //method ini untuk menampilkan isi dari Doubly Linked List yang telah dibuat
        if (tail != null) {
            Node current = tail;
        
            while (current != null) {
                System.out.print(current.getData() + " ");
                current = current.prev;}
                System.out.println("");} 
        else {
            System.out.println("Doubly Linked List Anda Kosong!");
        } 
    }
    
    public String update(String data, String key) { //method ini berfungsi untuk mencari apakah node dengan key tertentu ada atau tidak
        Node current = head;
        while (!current.getData().equals(key)) {
            if (current.next == null) {
                return "Gagal Update";
            }
            current = current.next;    
        }    
        current.setData(data);
        return "Berhasil Update";
    }
    
    public boolean isEmpty() { //method ini untuk mengecek apakah Doubly Linked List kosong atau tidak 
        return (head == null && tail == null);}
    
    public void makeEmpty() { //method ini untuk mengosongkan Doubly Linked List
        head = null; 
        tail = null;}
}
