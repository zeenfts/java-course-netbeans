package BinaryTree;

import java.util.Scanner;

class BTNode {
    BTNode left, right;
    int data;
    
    public BTNode(){
        left = null;
        right = null;
        data = 0;
    }
    
    public BTNode(int n){
        left = null;
        right = null;
        data = n;
    }
    
    public void setLeft(BTNode n){
        left = n;
    }
    
    public void setRight(BTNode n){
        right = n;
    }
    
    public BTNode getLeft(){
        return left;
    }
    
    public BTNode getRight(){
        return right;
    }
    
    public void setData(int d){
        data = d;
    }
    
    public int getData(){
        return data;
    }
    
}

class BT{
    private BTNode root;
    public BT(){
    root = null;
    }
    
    public boolean isEmpty(){
        return root == null;
    }    
    
    public void insert(int data){
     root = insert(root, data);    
    }
    
    private BTNode insert(BTNode node, int data){
        if(node == null)
            node = new BTNode(data);
        else{
            if(node.getRight() == null)
                node.right = insert(node.right, data);
            else 
                node.left = insert(node.left, data);
        }
        return node;
        }
    
    public int countNodes(){
        return countNodes(root);
    }
    
    private int countNodes(BTNode r){
        if (r == null)
            return 0;
        else{
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }      
    }
    
    public boolean search (int val){
        return search(root, val);
    }
    
    private boolean search(BTNode r, int val){
        if(r.getData() == val)
            return true;
        if(r.getLeft() != null)
            if(search(r.getLeft(), val))
                return true;
        if(r.getRight() !=null)
            if(search(r.getRight(), val))
                return true;
        return false;
    }
    
    public void inorder(){
        inorder(root);
    }

private void inorder(BTNode r){
    if(r != null){
        inorder(r.getLeft());
        System.out.print(r.getData()+" ");
        inorder(r.getRight());
    }
}    
 
public void preorder(){
        preorder(root);
    }

private void preorder(BTNode r){
    if(r != null){
        System.out.print(r.getData()+" ");
        preorder(r.getLeft());
        preorder(r.getRight());
    }
} 

public void postorder(){
        postorder(root);
    }

private void postorder(BTNode r){
    if(r != null){
        postorder(r.getLeft());
        postorder(r.getRight());
        System.out.print(r.getData()+" ");
    }
}  
}
    public class BinaryTree{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       BT bt = new BT();
       
        System.out.println("Binary Tree Test\n");
        char ch;
        do{
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Count Nodes");
            System.out.println("4. Check Empty");
            System.out.print("Choices: ");
            
            int chc = scan .nextInt();
            switch(chc){
                case 1:
                    System.out.println("Enter integer element to insert");
                    bt.insert(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Enter integer element to search");
                    bt.search(scan.nextInt());
                    break;
                case 3:
                    System.out.println("Nodes: "+bt.countNodes());
                    break;
                case 4:
                    System.out.println("Empty Status: "+bt.isEmpty());
                    bt.insert(scan.nextInt());
                    break;
                default:
                    System.out.println("Wrong Entry\n");
                    break;
            }
            System.out.println("\nPost Order: ");
            bt.postorder();
            System.out.println("\nPre Order: ");
            bt.preorder();
            System.out.println("\nIn Order: ");
            bt.inorder();
            
            System.out.println("\n\nDo you want to continue\n");
            ch = scan.next().charAt(0);
        }while(ch == 'Y' || ch =='y');
    }
    
}
