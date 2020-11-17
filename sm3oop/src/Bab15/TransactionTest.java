package Bab15;

class Transaction{
    int i;
    boolean valueSet = true;
    
    synchronized int get(){
        if(!valueSet)
            try{
                wait();
            }
            catch(Exception e){}
            System.out.println("Got: "+i);
            valueSet = false;
            notify();
            return i;
    }
    
    synchronized void put(int i){
        if(valueSet)
            try{
                wait();
            }
        catch(Exception e){}
        this.i = i;
        valueSet = true;
        System.out.println("Put: "+i);
        notify();
    }
}

class Producer implements Runnable{
    Transaction trans;
    
    Producer(Transaction trans){
        this.trans = trans;
        new Thread(this, "Producer").start();
    }
    
    public void run(){
        int i = 0;
        while(true){
            trans.put(i++);
            if(i == 20)
                break;
        }
    }
}

class Customer implements Runnable{
    Transaction trans;

    public Customer(Transaction trans) {
        this.trans = trans;
        new Thread(this, "Customer").start();
    }
    
    public void run(){
        int i = 0;
        while(i <= 20){
            trans.get();
            i++;
        }
    }
    
}

public class TransactionTest {

    public static void main(String[] args) {
        Transaction trans = new Transaction();
        new Producer(trans);
        new Customer(trans);
    }
    
}
