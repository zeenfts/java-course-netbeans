package Project1_5;
import java.util.Scanner;

public class UrutNamaAbsenApp {

    public static void main(String[] args) {
        
       Scanner ketikan = new Scanner (System.in);
         //stack
         
//       System.out.println("Metode konvensional");
//       System.out.print("Tentukan jumlah orang yang ingin ditambahkan: ");
//       int jlh = ketikan.nextInt();
//       UrutNamaAbsen unc = new UrutNamaAbsen(jlh);
//       
//       ae:  while(true){
//           System.out.print("\nApa yang ingin anda lakukan: "+
//                            "\nA. Menambahkan orang"+
//                            "\nB. Mengeluarkan orang"+
//                            "\nC. Menampilkan daftar orang"+
//                            "\nD. -'Exit'-"+
//                            "\nJawaban >> ");
//        String anwMenu = ketikan.next();
//        String anwMenu1 = anwMenu.toUpperCase();//Berfungsi agar semua yg diketik berubah jadi huruf kapital
//        
//        if(anwMenu1.equals("A")){//push
//            int idx = 1;
//                    System.out.println("\nMasukkan daftar nama anggota: ");
//                    while(true){
//                        System.out.print(idx+". ");
//                        String names = ketikan.next();
//                        unc.push(names);                
//                    idx++;
//                    if(idx > jlh)//jika sudah melebihi jumlah data
//                        continue ae;// kembali ke menu awal
//                }
//               
//        }
//        
//        else if(anwMenu1.equals("B")){//pop
//            System.out.println("Keluarkan berurutan (press enter)");
//            ketikan.nextLine();
//                System.out.println(unc.pop()+" dikeluarkan");
//        }
//        
//        else if(anwMenu1.equals("C")){
//            System.out.println("\nList Anggota terkini: ");
//            while(!unc.sIsEmpty()){               
//                System.out.println(unc.pop());
//            }
//             break;
//        }
//        else if(anwMenu1.equals("D"))
//            System.exit(0);
//        else
//            System.out.println("Programmnya error!!!");
//       }

        
     
         //queue
         System.out.println("\nMetode aplikasi");
       System.out.print("Tentukan jumlah orang yang ingin ditambahkan: ");
       int jlo = ketikan.nextInt();
       UrutNamaAbsen una = new UrutNamaAbsen(jlo);
       
       ad:  while(true){
           System.out.print("\nApa yang ingin anda lakukan: "+
                            "\nA. Menambahkan orang"+
                            "\nB. Mengeluarkan orang"+
                            "\nC. Menampilkan daftar orang"+
                            "\nD. -'Exit'-"+
                            "\nJawaban >> ");
        String anwMenu = ketikan.next();
        String anwMenu1 = anwMenu.toUpperCase();//Berfungsi agar semua yg diketik berubah jadi huruf kapital
        
        if(anwMenu1.equals("A")){
            int idx = 1;
                    System.out.println("\nMasukkan daftar nama anggota: ");
                    while(true){
                        System.out.print(idx+". ");
                        String names = ketikan.next();
                        una.enqueue(names);                
                    idx++;
                    if(idx > jlo)//jika sudah melebihi jumlah data 
                        continue ad;//kembali ke menu awal
                }
              
                
        }
        
        else if(anwMenu1.equals("B")){
            System.out.println("Keluarkan berurutan (press enter)");//dequeue
            ketikan.nextLine();
                System.out.println(una.dequeue()+" dikeluarkan");
        }
        
        else if(anwMenu1.equals("C")){
            System.out.println("\nList Anggota terkini: ");
            while(!una.isEmpty()){               
                System.out.println(una.dequeue());
            }
             break;
        }
        else if(anwMenu1.equals("D"))
            System.exit(0);
        else
            System.out.println("Programmnya error!!!");
       } 
    }
}
