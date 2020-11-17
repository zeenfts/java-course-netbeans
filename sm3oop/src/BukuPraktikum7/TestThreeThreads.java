package BukuPraktikum7;

public class TestThreeThreads {

    public static void main(String[] args) {
       PrintMe pm1 = new PrintMe();
       
       Thread tr1 = new Thread(pm1);
       Thread tr2 = new Thread(pm1);
       Thread tr3 = new Thread(pm1);
       
       tr1.setName("Asia Swimmer");
       tr2.setName("Australia Swimmer");
       tr3.setName("Europe Swimmer");
       
       tr1.start();
       tr2.start();
       tr3.start();
       
        try {
            tr1.join();
            tr2.join();
            tr3.join();
        }
        catch (InterruptedException ex) {
            System.out.println("thread ada gangguan");
        }
        System.out.println("\n------- Finish -------");
    }
    
}
