package M3LinkedList;

public class LinkedListLaunch {

    public static void main(String[] args) {
        LinkedList lil = new LinkedList(); 
        lil.addLast("Ilham"); 
        lil.addFirst("Udin"); 
        lil.addLast("Robert"); 
        lil.deleteFirst(); 
        lil.deleteLast(); 
        lil.showAll();
        System.out.println(lil.find("Ilham"));
    }
    
}
