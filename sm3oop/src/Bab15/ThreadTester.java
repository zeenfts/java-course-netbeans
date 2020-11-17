package Bab15;

public class ThreadTester {

    public static void main(String[] args) {
       HelloRunner r1 = new HelloRunner();
       HelloRunner r2 = new HelloRunner();
       Thread t1 =  new Thread(r1);
       Thread t2 =  new Thread(r2);
       t1.start();
       t2.start();
    }
        
}

class HelloRunner implements Runnable{
    int i;
    @Override
    public void run() {
        i =0;
        while(true){
            System.out.println("Hello "+i++);
            if(i == 50) break;
            try{
                Thread.sleep(11);
            }
            catch(InterruptedException ie){
                
            }
        }
    }
        
 }
