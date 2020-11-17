package Nodee;
class Node {
    String name;
    Node next;
} 
public class LinkListNode {
  
    public static void main(String[] args) {
        Nodee.Node current = null;
        Nodee.Node first = new Nodee.Node();
        Nodee.Node second = new Nodee.Node();
        Nodee.Node third = new Nodee.Node();
        
        first.name = "aku";
        first.next = second;
        second.name = "saya";
        second.next = third;
        third.name = "kamu";
        current = first;
        
        while(current != null){
            System.out.println(current.name);
            current = current.next;
        };
    }
    
}
