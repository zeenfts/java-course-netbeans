package Bab15;

class Callme{
    synchronized void call(String msg){
            System.out.println("["+msg);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("]");
            }
    }
}

class Caller implements Runnable{
    String msg;
    Callme target;

    public Caller(Callme t, String s) {
        target = t;
        msg = s;
        new Thread(this).start();
    }
    
    @Override
    public void run(){
        target.call(msg);
    }
}

public class Synchronizer {
    
    public static void main(String[] args) {
        Callme target = new Callme();
        new Caller(target, "Prodi Sistem Informasi");
        new Caller(target, "Fakultas Rekayasa Industri");
        new Caller(target, "Universitas Telkom");
    }
    
}
