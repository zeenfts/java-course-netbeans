package BukuPraktikum7;

public class PrintMe implements Runnable {
    private int i;
    @Override
    public void run() {
        i =0;
        while(true){
            System.out.println("Hello "+getClass().getSimpleName());
            if(i == 9) break;
            i++;
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException ie){
                System.out.println("thread dibatalkan!!");
            }
        }
    }
    
}
