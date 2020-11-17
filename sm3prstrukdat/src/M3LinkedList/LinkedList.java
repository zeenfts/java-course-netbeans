package M3LinkedList;

class Node {
    public String data; 
    public Node next; 
    public Node(String data){ 
        this.data = data;
    }
}

public class LinkedList {
    Node head;
    int size;
    
    public void showAll() { // menampilkan seluruh data yang ada pada linkedlist
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");  
            temp = temp.next;
        } 
    } 

    public void addLast(String data) { //menambahkan data yang ada pada node terakhir
        Node newNode = new Node(data); 
        Node temp = head;
        if (isEmpty()) {
            head = newNode;
        }  
        else {
            while (temp.next != null) {
                temp = temp.next;
                
            } temp.next = newNode;
        }
        
    } 
    
    public void addFirst(String data) { // menambahkan data yang ada pada node pertama
        Node newNode = new Node(data);
        if (isEmpty()) { 
            head = newNode;
        } 
        else {
            newNode.next = head; 
            head = newNode; 
        } 
    } 
    
    public void deleteLast() { // menghapus data yang ada pada node terakhir
        Node temp = head;
        if (!isEmpty()) { 
            while (temp.next.next != null) { 
                temp = temp.next;       
            }  temp.next = null;
        } 
        else {
            System.out.println("List Kosong");
        } 
    }
    
    public void deleteFirst() { //menghapus data yang ada pada node pertama
        Node temp = head;
        if (!isEmpty()) {
            if (temp.next == null) { 
                head = null;
            }
            else {
                temp = temp.next;
                head = temp;
                temp = null;
             }
        }
        
        else {
            System.out.println("List Kosong");
             } 
    } 

    public boolean isEmpty() { // mememeriksa apakah linked list kosong atau tidak
        if (head == null) 
            return true;
        else 
            return false;
    }
    
    public boolean find(String search) { //mencari data pada linked list
        Node temp = head;
        while (temp.data != search) {
            if (temp.next == null) { 
                return false;
            } temp = temp.next; 
        } return true; 
    }
    
}
