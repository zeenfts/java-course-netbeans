package Project1_5two;
import java.util.Scanner;

public class AngkaAngkaDiapainApp {

    public static void main(String[] args) {
     try{  
        Scanner ketikk = new Scanner (System.in);
        System.out.print("Silahkan pilih: "+
                            "\nA. Queue"+
                            "\nB. Stack"+
                            "\n>> ");
        String ansFirst = ketikk.nextLine();
        String ansFirst1 = ansFirst.toUpperCase();//Berfungsi agar semua yg diketik berubah jadi huruf kapital
        
       switch(ansFirst1){
           case "A"://queue
       System.out.print("Tentukan jumlah angka yang ingin ditambahkan: ");
       int jml = ketikk.nextInt();
       AngkaAngkaDiapain aad = new AngkaAngkaDiapain(jml);
       
       aw:  while(true){
           System.out.print("\nApa yang ingin anda lakukan: "+
                            "\nA. Menambahkan angka"+
                            "\nB. Menghapus angka"+
                            "\nC. Menampilkan angka"+
                            "\nD. Menghitung total angka"+
                            "\nE. -'Exit'-"+
                            "\nJawaban >> ");
        String ansMenu = ketikk.nextLine();
        String ansMenu1 = ansMenu.toUpperCase();//Berfungsi agar semua yg diketik berubah jadi huruf kapital
        
        if(ansMenu1.equals("A")){//enqueue
            int idx = 1;
            System.out.print("\n1. Masukkan langsung banyak"+
                             "\n2. Masukkan satu per satu"+
                             "\n>> ");
                int ansA = ketikk.nextInt();
                if(ansA == 1){
                System.out.println("\nMasukkan daftar angka: ");
                while(true){
                    System.out.print(idx+") ");
                    double nums = ketikk.nextDouble();
                    aad.enqueue(nums);                
                idx++;
                if(idx > jml)//jika sudah lebih dari jumlah data
                    continue aw;//kembali ke menu awal
                } }
                else if(ansA==2){
                  System.out.println("Masukkan sebuah angka: ");
                    System.out.print(">> ");
                    double num = ketikk.nextDouble();
                    num = ketikk.nextDouble();
                    aad.enqueue(num);  
                }
                else
                    System.out.println("Error");
        }
        
        else if(ansMenu1.equals("B")){//dequeue
            System.out.println("hapus berurutan (press enter)");
            ketikk.nextLine();
                System.out.println(aad.dequeue()+" dikeluarkan");
        }
        
        else if(ansMenu1.equals("C")){
            System.out.print("\n1. Semua angka"+
                             "\n2. Angka ganjil"+
                             "\n3. Angka genap"+
                             "\n4. Angka pertama"+
                             "\n5. Angka terakhir"+
                             "\n>> ");
            int ansC = ketikk.nextInt();
            
            if(ansC == 1){
                System.out.println("\nList semua Angka: ");
                while(!aad.isEmpty()){               
                    System.out.print(aad.dequeue()+" ");
                }System.out.println();
                   break;
            }
            
            else if(ansC ==2){
                System.out.println("\nList angka ganjil: ");
                while(!aad.isEmpty()){
                    double ind = aad.dequeue();
                    if(ind%2!=0){
                        System.out.println(ind+" ");
                    }System.out.println();
                } break;
            }
            
            else if(ansC ==3){
                System.out.println("\nList angka genap: ");
                while(!aad.isEmpty()){
                    double ind = aad.dequeue();
                    if(ind%2 == 0){
                        System.out.println(ind+" ");
                    }System.out.println();
                }break;
            }
            
            else if(ansC ==4){
                System.out.print("\nList angka pada urutan pertama: ");
                System.out.println(aad.peekFront());
            }
            
            else if(ansC ==5){
                System.out.print("\nList angka pada urutan terakhir: ");
                System.out.println(aad.peekRear());
            }
        }
        else if(ansMenu1.equals("D")){
            double totale = 0;
            while(!aad.isEmpty()){
                totale +=  aad.dequeue();  
            }
            System.out.println("Jumlah angka di queue saat ini: "+totale );
            break;
       }
        else if(ansMenu1.equals("E"))
            System.exit(0);
        else
            System.out.println("Programmnya error!!!");
       }
       break;
       
       //Stack
            case "B":
              System.out.print("Tentukan jumlah angka yang ingin ditambahkan: ");
       int jmh = ketikk.nextInt();
       AngkaAngkaDiapain ads = new AngkaAngkaDiapain(jmh);
       
       ax:  while(true){
           System.out.print("\nApa yang ingin anda lakukan: "+
                            "\nA. Menambahkan angka"+
                            "\nB. Menghapus angka"+
                            "\nC. Menampilkan angka"+
                            "\nD. Menghitung total angka"+
                            "\nE. -'Exit'-"+
                            "\nJawaban >> ");
        String ansMenu = ketikk.nextLine();
        String ansMenu1 = ansMenu.toUpperCase();//Berfungsi agar semua yg diketik berubah jadi huruf kapital
        
        if(ansMenu1.equals("A")){//push
            int idx = 1;
            System.out.print("\n1. Masukkan langsung banyak"+
                                   "\n2. Masukkan satu per satu"+
                                   "\n>> ");
                int ansAS = ketikk.nextInt();
                if(ansAS == 1){
                System.out.println("\nMasukkan daftar angka: ");
                while(true){
                    System.out.print(idx+") ");
                    double nums = ketikk.nextDouble();
                    ads.push(nums);                
                idx++;
                if(idx > jmh)//jika sudah melebihi jumlah data
                    continue ax;// kembali ke menu awal
                }}
                else if(ansAS == 2){
                    System.out.println("Masukkan sebuah angka: ");
                    System.out.print(">> ");
                    double num = ketikk.nextDouble();
                    num = ketikk.nextDouble();
                    ads.push(num);  
                }
                else
                    System.out.println("Error");
        }
        
        else if(ansMenu1.equals("B")){//pop
            System.out.println("hapus berurutan (press enter)");
            ketikk.nextLine();
                System.out.println(ads.pop()+" dikeluarkan");
        }
        
        else if(ansMenu1.equals("C")){
            System.out.print("\n1. Semua angka"+
                             "\n2. Angka ganjil"+
                             "\n3. Angka genap"+
                             "\n4. Angka teratas"+
                             "\n5. Angka paling bawah"+
                             "\n>> ");
            int ansC = ketikk.nextInt();
            
            if(ansC == 1){
                System.out.println("\nList semua Angka: ");
                while(!ads.sIsEmpty()){               
                    System.out.println(ads.pop());
                }break;
            }
            
            else if(ansC ==2){
                System.out.println("\nList angka ganjil: ");
                while(!ads.sIsEmpty()){
                    double inx = ads.pop();
                    if(inx%2!=0){
                        System.out.println(inx);
                    }
                } break;
            }
            
            else if(ansC ==3){
                System.out.println("\nList angka genap: ");
                while(!ads.sIsEmpty()){
                    double inx = ads.pop();
                    if(inx%2 == 0){
                        System.out.println(inx);
                    }
                }break;
            }
            
            else if(ansC ==4){
                System.out.print("\nList angka pada urutan teratas: ");
                System.out.println(ads.peekTop());
            }
            
            else if(ansC ==5){
                System.out.print("\nList angka pada urutan terbawah: ");
                System.out.println(ads.peekBottom());
            }
        }
        else if(ansMenu1.equals("D")){
            double totaleS = 0;
            while(!ads.sIsEmpty()){
                totaleS +=  ads.pop();  
            }
            System.out.println("Jumlah angka di stack saat ini: "+totaleS );
            break;
       }
        else if(ansMenu1.equals("E"))
            System.exit(0);
        else
            System.out.println("Programmnya error!!!");
       }  
            break;
            
            default:
                System.out.println("Error");    
            break;
        }
       
     }
     catch(Exception e){
         System.out.println("\n"+e);
     }
    }
    
}
