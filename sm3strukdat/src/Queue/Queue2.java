package Queue;
import java.util.Scanner;

class Node{
    String nama;
    Node next;
}
public class Queue2 {
    private static Scanner input;
    public static void main(String[] args) {
       int x;
       input = new Scanner(System.in);
       Node pDepan = null;
       Node pBelakang = null;
        System.out.println("Masukkan nama antrian: ");
       for(x=1; x<=3; x++){
           Node cad = new Node();
           cad.nama=input.nextLine();
           cad.next=null;
           if(pDepan==null)
           pDepan=cad;
           else if(pDepan!= null)
           pBelakang.next =cad;
           pBelakang=cad;
       }
        System.out.println("\nYang keluar dari antrian: ");
        
        while(pDepan!=null){
            System.out.println(pDepan.nama);
            pDepan=pDepan.next;
        }
       
    }
    
}
