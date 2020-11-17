package M2Example;

public class StackAppM2 {

    public static void main(String[] args) {
        try{
        StackM2 ths = new StackM2(7); // membuat stack baru   
        ths.push(1);// memasukkan item kedalam stack
        ths.push(2);
        ths.push(3);
        ths.push(4);
        ths.push(5);
        ths.push(6);
        ths.push(7);

        while (!(ths.isEmpty())){ // mengulang hingga stack kosong // menghapus nilai stack 
            System.out.println(ths.pop()); // tampilkan 
        }
        }
        
        catch(Exception e){
            System.out.println(e);
        }
    }
}
