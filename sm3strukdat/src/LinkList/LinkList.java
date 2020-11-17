package LinkList;
import java.util.*;

public class LinkList {

    public static void main(String[] args) {
        LinkedList<String> objek = new LinkedList<String>();
        
        objek.add("A");
        objek.add("B");
        objek.addLast("C");
        objek.addFirst("D");
        objek.add(2, "E");
        objek.add("F");
        objek.add("G");
        System.out.println("Linked List: "+objek);
        
        objek.remove("B");
        objek.remove(3);
        objek.removeFirst();
        objek.removeLast();
        System.out.println("Linkd List after deletion: "+objek);
        
        boolean status = objek.contains("E");
        
        if(status){
            System.out.println("List contain element 'E' ");
        }
        else{
            System.out.println("List doesn't contain the element 'E' ");
        }
        
        int size = objek.size();
        System.out.println("Size of Linked list: "+size);
        
        Object element = objek.get(2);
        System.out.println("Element returned by get(): "+element);
        objek.set(2,"Y");
        System.out.println("Linked List after change: "+objek);
    }
        
    }
    

