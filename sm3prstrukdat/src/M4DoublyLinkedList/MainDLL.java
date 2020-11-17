package M4DoublyLinkedList;
public class MainDLL {

    public static void main(String[] args) {
//Implementasikan Class Doubly Linked List yang anda buat di sini
      DoublyLinkedList Dll = new DoublyLinkedList();
      Dll.addFirst("Strukdat");
      Dll.addFirst("Praktikum"); 
      Dll.addFirst("Ini"); 
// input dengan addLast
      Dll.addLast("Modul");
      Dll.addLast("Doubly Linked List");
// Menampilkan isi Link List dengan display
      Dll.display(); 
// delete dengan deleteFirst
      Dll.deleteFirst();
// delete dengan deleteLast
      Dll.deleteLast(); 
// Menampilkan isi Link List dengan display
      System.out.println("Setelah di delete : ");
      Dll.display();
      Dll.makeEmpty();
      Dll.display();
      
      DoublyLinkedList Dll2 = new DoublyLinkedList();
      System.out.print("\nData awal: ");
      Dll2.addFirst("49");
      Dll2.addFirst("16"); 
      Dll2.addFirst("33"); 
      Dll2.addFirst("16"); 
      Dll2.addFirst("16"); 
      Dll2.addFirst("21");
      Dll2.display();
      
      System.out.print("Tampilan secara backward: ");
      Dll2.displayInverse();
      
      Dll2.addAfterByKey("57", "16");
      System.out.print("Setelah di add "+Dll2.data+" : ");
      Dll2.display();
      
      Dll2.addBeforeByKey("77", "57");
      System.out.print("Setelah di add "+Dll2.data+" : ");
      Dll2.display();
      
      Dll2.deleteAllByKey("16");
      System.out.print("Setelah "+Dll2.key+" di delete : ");
      Dll2.display();
    } 

}
   

