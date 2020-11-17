package QueueStack;
import java.util.Scanner;

public class urutNama {

    public static void main(String[] args) {
         Scanner masuk = new Scanner(System.in);
        StackLinkList tumpuk = new StackLinkList();
        QueueLinkList antri = new QueueLinkList();
        
        do{
            System.out.println("\nStack Link List dan Queue Link List ,Silahkan Pilih :");
            System.out.println("Stack Link List");
            System.out.println("!. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. IsEmpty");
            System.out.println("5. getSize");
            System.out.println("6. Clear");
            System.out.println("7. Search");
            System.out.println();
            System.out.println("Queue Link List");
            System.out.println("8. Enqueue");
            System.out.println("9. Dequeue");
            System.out.println("10. Peek");
            System.out.println("11. IsEmpty");
            System.out.println("12. getSize");
            System.out.println("13. Clear");
            System.out.println("14. Search");
            System.out.println();
            System.out.println("0. Keluar");
            
            System.out.println("\nPILIHAN ANDA->");
            int pilih = masuk.nextInt();
            if(pilih==1){
                System.out.println("Masukkan Datanya->");
                int m = masuk.nextInt();
                tumpuk.push(m);}
            if(pilih==2){
                System.out.println("Data "+tumpuk.pop()+" sudah diambil");
            }
            if(pilih==3){
                System.out.println("Data teratas = "+tumpuk.peek());
            }
            if(pilih==4){
                if(tumpuk.IsEmpty())
                    System.out.println("Data Kosong");
                else
                    System.out.println("Data Isi");
            }
            if(pilih==5){
                System.out.println("Datanya ada = "+tumpuk.getSize());
            }
            if(pilih==6){
                tumpuk.clear();
                System.out.println("Semua data sudah dihapus");
            }
            if(pilih==7){
                System.out.println("Data yang akan dicari->");
                int c = masuk.nextInt();
                if(tumpuk.search(c)==-1){
                    System.out.println("Data tidak ada");}
                    else{
                            System.out.println("DATA "+c+ " berada di indeks ke- "+tumpuk.search(c));}
                            }
            if(pilih==8){
                System.out.println("Masukkan Datanya->");
                int m = masuk.nextInt();
                antri.Enqueue(m);}
            if(pilih==9){
                System.out.println("Data "+antri.Dequeue()+" sudah diambil");
            }
            if(pilih==10){
                System.out.println("Data teratas = "+antri.peek());
            }
            if(pilih==11){
                if(tumpuk.IsEmpty())
                    System.out.println("Data Kosong");
                else
                    System.out.println("Data Isi");
            }
            if(pilih==12){
                System.out.println("Datanya ada = "+antri.getSize());
            }
            if(pilih==13){
                antri.clear();
                System.out.println("Semua data sudah dihapus");
            }
            if(pilih==14){
                System.out.println("Data yang akan dicari->");
                int c = masuk.nextInt();
                if(antri.search(c)==-1){
                    System.out.println("Data tidak ada");}
                else{
                    System.out.println("Data "+c+ " berada di indeks ke- "+antri.search(c));}
                }
            if(pilih==0){
                System.exit(0);
            }
        }
        while(true);
    }
}

class Node{
    Node next;
    int data;
    public Node(int value){data=value;}
    public void setNext(Node simpul){next=simpul;}
    public Node getNext(){return next;}
    public int getData(){return data;}
}

class LinkList{
    Node first;
    public void addFirst(int value){
        Node baru = new Node(value);
        baru.setNext(first);
        first=baru;
    }
    public int getFirst(){
        return first.getData();
    }
    public int removeFirst(){
        Node tmp=first;
        first=first.getNext();
        return tmp.getData();
    }
    public int getLast(){
        Node tmp=first;
        while(tmp.getNext()!=null)
        {tmp=tmp.getNext();}
        return tmp.getData();
    }
    public void addLast(int value){
        Node baru=new Node(value);
        Node tmp=first;
        if(first==null){addFirst(value);}
        else{
            while(tmp.getNext()!=null){
                tmp=tmp.getNext();
            }
            tmp.setNext(baru);
        }
    }
    public int removeLast(){
        Node tmp=first;
        int x;
        if(first==null){return 0;}
        else if(first.getNext()==null){
            return removeFirst();}
        else{
            while(tmp.getNext().getNext()!=null){
        tmp=tmp.getNext();}
            x=tmp.getNext().getData();
            tmp.setNext(null);
            return x;
            }
    }
    public void addAfterFirst(int value){
        Node baru = new Node(value);
        baru.setNext(first.getNext());
        first.setNext(baru);
    }
    public void addBeforeLast(int value){
        Node tmp=first;
        Node baru= new Node(value);
        while(tmp.getNext().getNext()!=null){
            tmp=tmp.getNext();}
        baru.setNext(tmp.getNext());
        tmp.setNext(baru);
        }
    public int search(int value){
        Node tmp=first;
        int i=0;
        while(tmp!=null){
        if(tmp.getData()==value){
            return i;}
        else{tmp=tmp.getNext();i++;}
        }
        return -1;
    }
    }
class StackLinkList{
    LinkList data = new LinkList();
    int i=0;
    
    public void push(int value){
        data.addLast(value);i++;
    }
    public int pop(){
        i--;
        return data.removeLast();}
    
    public int peek(){
        return data.getLast();
    }
    public int search(int value){
        return data.search(value);
    }
    public Boolean IsEmpty(){
        if(i==0){return true;}
        return false;}
    
    public int getSize(){
        return i;
    }
    public void clear(){
        data=new LinkList();
        i=0;}
    }

class QueueLinkList{
    LinkList data = new LinkList();
    int i=0;
    public void Enqueue(int value){
        data.addLast(value);i++;
    }
    public int Dequeue(){
        i--;
        return data.removeFirst();
    }
    public int search(int value){
        return data.search(value);
    }
    public int peek(){
        return data.getFirst();
    }
    public Boolean IsEmpty(){
        if(i==0){return true;}
        return false;}
    
    public int getSize(){
        return i;
    }
    public void clear(){
        data=new LinkList();
        i=0;}
    }
    

