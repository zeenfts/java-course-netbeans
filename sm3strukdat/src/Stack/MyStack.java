package Stack;

import java.util.Scanner;
class Node{
    String nama;
    Node next;
}
public class MyStack {
    private static Scanner input;
    public static void main(String[] args) {
        int x;
        input = new Scanner(System.in);
        Node pStack = null;
        
        System.out.println("Masukkan nama: ");
        for(x=1; x<=3; x++){
            Node cad = new  Node();
            cad.nama = input.nextLine();
            cad.next = pStack;
            pStack = cad;
        }
            System.out.println("\nYang keluar dari tumpukan: ");
            while(pStack!= null){
                System.out.println(pStack.nama);
                pStack = pStack.next;
            }
        }
        
    }
    

