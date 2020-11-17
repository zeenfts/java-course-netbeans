package M5Tree;

public class TreeApp {

    public static void main(String[] args) {
        Tree tr = new Tree(); //membuat objek tree
        System.out.println("Memasukan Angka 20, 10, 30, 26, 12, 7, 45"); 
        tr.insert(20);//memanggil method insert untuk memasukan data ke tree 
        tr.insert(10);
        tr.insert(30);
        tr.insert(26);
        tr.insert(12);
        tr.insert(7); 
        tr.insert(45);
        System.out.println("Menampilkan Data yang telah dimasukan : "); 
        tr.displayTree();//memanggil method display untuk menampilkan tree 
        System.out.println(); 
        System.out.println("Menghapus Angka 12"); 
        tr.delete(12); //menghapus elemen 12 dari tree 
        System.out.println();
        tr.displayTree(); //menampilkan ulang tree 
        System.out.println("Minimum: "+tr.nilaiMinimum());
        System.out.println("Maksimum: "+tr.nilaiMaximum());
        
        //nomor 1 latihan Modul 5
        tr.deleteAllBT();
        tr.insert(8);
        tr.insert(10);
        tr.insert(14);
        tr.insert(13);
        tr.insert(3);
        tr.insert(1);
        tr.insert(6);
        tr.insert(4);
        tr.insert(7);
        System.out.print("\nNomor 1 latihan : "); 
        tr.displayTree();
        System.out.print("\ninorder bil. genap : "); 
        tr.inOrderGenap(tr.root);
    }
    
}
