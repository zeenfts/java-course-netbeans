package BukuPraktikum1;

public class LaunchWelcome {
  
    public static void main(String[] args) {
      //Instansiasi dengan constructor memakai Array Object
        WelcomeSource[] ws = new WelcomeSource[6];
      
        ws[0] = new WelcomeSource("Welcome");//kata-1
        ws[1] = new WelcomeSource("to");//kata-2
        ws[2] = new WelcomeSource("Obyek");//kata-3
        ws[3] = new WelcomeSource("Oriented");//kata-4
        ws[4] = new WelcomeSource("Programming");//kata-5
        ws[5] = new WelcomeSource("I");//kata-6
      //Menampilkan nomor 2a
        for(int a=0; a<ws.length; a++){
            System.out.print(ws[a].cetakHasil()+" ");//kata-1 s/d kata-6
        }
        System.out.println("\n");
      //Menampilkan nomor 2b
        System.out.println(ws[0].cetakHasil());//kata-1
        System.out.println(ws[1].cetakHasil());//kata-2
        for(int b=2; b<ws.length; b++){
            System.out.print(ws[b].cetakHasil()+" ");//kata-2 s/d kata-6
        }
        System.out.println();
    }
    
}
