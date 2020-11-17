package M5Tree;

import java.util.Stack;

class Node {
    int iData;// data digunakan sebagai nilai kunci
    Node leftChild; // ini left child nya node 
    Node rightChild; // ini right child nya node 

    public Node() {
    }
}

public class Tree {
    public Node root; // ini root child nya node 
     
    public Node find(int key){ // mencari node dengan key yang diberikan // asumsikan tree yang tidak kosong
        Node current = root; // mulai dari root
        while(current.iData != key){ // ketika tidak ada yang cocok, 
            if(key < current.iData){ // pergi ke kiri?
                current = current.leftChild;
            } 
            else{ // atau pergi ke kanan?
                current = current.rightChild;
            } 
            if (current == null) { // jika child tidak ada
                return null; // tidak menemukan child tersebut
            }
        }return current; // menemukan child tersebut
    }
    
    public void insert(int id) {
        Node newNode = new Node();// membuat node baru
        newNode.iData = id; // memasukan data
        if (root == null) { // tidak ada node dalam root
            root = newNode;
        } 
        else { // root ditempati 
            Node current = root; // mulai dari root
            Node parent;
            while (true) { 
                parent = current;
            
            if (id < current.iData) { // pergi ke kiri?
                current = current.leftChild;
                if (current == null) { // jika akhir dari garis (path)
                    parent.leftChild = newNode; // masukkan ke kiri
                    return;
                } // selesai jika pergi ke kiri
            } 
            else { // atau pergi ke kanan?
                current = current.rightChild;
                if (current == null) { // jika akhir dari garis (path)
                    parent.rightChild = newNode; // masukkan ke kanan 
                    return;
                }
            } // selesai kalau ke kanan
        } // akhir dari perulangan while
     }
    } // akhir dari tidak dari root // akhir dari insert
        
    public boolean deleteAllBT(){
        Node current = root;
        root = null;
        return true;
    }
    
    public boolean delete(int key){ // hapus node dengan key yang diberikan// (asumsikan daftar yang tidak kosong)
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while (current.iData != key){ // mencari node
            parent = current;
            if (key < current.iData){ // pergi ke kiri?
                isLeftChild = true;
                current = current.leftChild;
            } 
            else { // pergi ke kanan?
                isLeftChild = false;
                current = current.rightChild;
            } 
            if (current == null) { // akhir dari garis,
                return false; // tidak menemukan node tersebut
            } 
        } // akhir dari perulangan while // node untuk di hapus ditemukan// jika tidak ada child, tinggal hapus saja
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) { // jika root,
                root = null; // tree kosong
            } 
            else if (isLeftChild) { 
                parent.leftChild = null;
            } // putuskan
            else { // dari parent
                parent.rightChild = null;
            } // jika tidak ada child bagian kanan, timpa dengan subtree bagian kiri
        } 
        
        else if (current.rightChild == null) {
            if (current == root) {
                root = current.leftChild;
            } 
            else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } 
            else {
                parent.rightChild = current.leftChild;
            }
        }// jika tidak ada child bagian kiri, timpa dengan subtree bagian kanan
        else if (current.leftChild == null) {
            if (current == root) {
                root = current.rightChild;
            } 
            else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } 
            else {
                parent.rightChild = current.rightChild;
            }
        }// dua child, jadi timpa dengan inorder successor
        else {// ambil successor dari node untuk dihapus (current)
            Node successor = getSuccessor(current);// hubungkan parent dari current ke successor sebagai gantinya
            if (current == root) {
                root = successor;
            } 
            else if (isLeftChild) {
                parent.leftChild = successor;
            }
            else {
                parent.rightChild = successor;
            }// akhir dari 2 children// (successor tidak bisa mempunyai child bagian kiri)
            // hubungkan successor ke child bagian kirinya current
                successor.leftChild = current.leftChild;} 
                return true; // sukses
         // delete() selesai
        }
        

        private Node getSuccessor(Node delNode){
            Node successorParent = delNode;
            Node successor = delNode;
            Node current = delNode.rightChild; // pergi ke child bagian kanan
            while (current != null){ // sampai tidak ada lagi// child yang tersisa,
                successorParent = successor;
                successor = current;
                current = current.leftChild; // pergi ke child bagian kiri
            }
            if (successor != delNode.rightChild) { // jika successor tidak di
                successorParent.leftChild = successor.rightChild; // bagian kanan,
                successor.rightChild = delNode.rightChild; // buat koneksi
            }
            return successor;
        }
        
        public void traverse(int traverseType){
            switch (traverseType) {
                case 1:
                    System.out.print("\nPreorder Traversal : ");
                    preOrder(root);
                    break;
                case 2:
                    System.out.print("\nInorder Traversal : ");
                    inOrder(root);
                    break;
                case 3:
                    System.out.print("\nPostorder Traversal : ");
                    postOrder(root);
                    break;
            } System.out.println();
        } //------------------------------------------------------------------------
        
        private void preOrder(Node localRoot) {
            if (localRoot != null) {
                System.out.print(localRoot.iData + " ");
                preOrder(localRoot.leftChild);
                preOrder(localRoot.rightChild);
            }
        }//------------------------------------------------------------------------ 
        
        private void inOrder(Node localRoot) {
            if (localRoot != null) {
                inOrder(localRoot.leftChild);
                System.out.print(localRoot.iData + " ");
                inOrder(localRoot.rightChild);
            }
        }//------------------------------------------------------------------------
        
        private void postOrder(Node localRoot) {
            if (localRoot != null) {
                postOrder(localRoot.leftChild);
                postOrder(localRoot.rightChild);
                System.out.print(localRoot.iData + " ");
            }
        }
          
        public void inOrderGenap(Node lRoot) {
            if(lRoot != null){ // sampai ke bawah  
                 inOrderGenap(lRoot.leftChild); // pergi ke child bagian kiri
                 if(lRoot.iData%2==0)
                    System.out.print(lRoot.iData+" ");
                 inOrderGenap(lRoot.rightChild);
            }
        }
        
        public int nilaiMaximum(){ // mengembalikan node dengan nilai key yang terbesar
            Node current;
            Node last = null;
            current = root; // dimulai dari root
            while(current != null){ // sampai ke bawah
               last = current;// mengingat node yg dikunjungi
               current = current.rightChild; // pergi ke child bagian kanan
            }
            
            return last.iData;
        }
        
        public int nilaiMinimum(){ // mengembalikan node dengan nilai key yang terkecil
            Node current;
            Node last = null;
            current = root; // dimulai dari root
            while(current != null){ // sampai ke bawah
                last = current; // mengingat node yg dikunjungi
                current = current.leftChild; // pergi ke child bagian kiri
            }
            return last.iData;
        }
        
        
        public void displayTree(){
            if (root == null) {
                System.out.println("...");
                System.out.println("Tree Masih Kososng");
                System.out.println("....");
            } 
            else {
                Stack globalStack = new Stack();
                globalStack.push(root);
                int nBlanks = 32;
                boolean isRowEmpty = false;
                
                for (int i = 0; i < nBlanks; i++) {
                    System.out.print("..");
                } 
                System.out.println("");
                
                while (isRowEmpty == false) {
                    Stack localStack = new Stack();
                    isRowEmpty = true;
                
                    for (int j = 0; j < nBlanks; j++) {
                        System.out.print(' ');
                    } 
                    while (globalStack.isEmpty() == false) {
                        Node temp = (Node) globalStack.pop();
                        if (temp != null) {
                            if (temp == root) {
                                System.out.println("root");
                                for (int j = 0; j < nBlanks; j++) {
                                System.out.print(' ');
                                } 
                            System.out.print(" "+ temp.iData);
                            }
                            else {
                                System.out.print(" " + temp.iData); 
                            }
                        localStack.push(temp.leftChild);
                        localStack.push(temp.rightChild);
                        
                        if (temp.leftChild != null || temp.rightChild != null) {
                            isRowEmpty = false;
                        }
                        else {
                            System.out.print("--");
                            localStack.push(null);
                            localStack.push(null);
                        }
                        for (int j = 0; j < nBlanks * 2 - 2; j++) {
                            System.out.print(' ');
                        }
                        
                    }
                }// perulangan while globalStack.isEmpty() == false selesai
                    System.out.println();
                    nBlanks /= 2;
                    while (localStack.isEmpty() == false) {
                        globalStack.push(localStack.pop());
                    } 
                } // perulangan while isRowEmpty == false selesai
            
                for (int i = 0; i < 32; i++) {
                System.out.print("..");
            }
            System.out.println("");
            } // akhir dari displayTree()
        }
}
        
