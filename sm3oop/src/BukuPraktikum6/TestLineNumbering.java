package BukuPraktikum6;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestLineNumbering {
    private ArrayList<Byte> dataAngka = new ArrayList<>();
    private ArrayList<String> dataKarakter = new ArrayList<>();
    private BufferedInputStream bis;
    private BufferedReader br;
    private FileOutputStream fos;
    private FileReader fr;
    private FileWriter fw;
    private Scanner input;
    private String namaFile;
    private static TestLineNumbering tln;
    
    public static void main(String[] args) {
       tln = new TestLineNumbering();
    }

    private TestLineNumbering() {
        input = new Scanner(System.in);
        cetakKeFileByte();
        System.out.println();
        bacaDariFileByte();
        System.out.println();
        cetakKeFileKarakter();
        System.out.println();
        bacaDariFileKarakter();
    }
    
    private void cetakKeFileByte(){
        try {
            System.out.println("------- Menulis File dalam Byte -------");
            System.out.print("Tuliskan nama file: ");
            namaFile = input.nextLine();
            
            fos = new FileOutputStream("C:/Users/ASUS/Desktop/"+namaFile+".bin");
            System.out.print("Berapa jumlah angka yang ingin ditulis? ");
            int a = input.nextInt();
            byte angkaIn;
            
            System.out.println("Masukkan angka-angka tersebut (-128 s/d 127)");
            for(int b=0; b<a; b++){
                dataAngka.add(b, angkaIn = input.nextByte());
                fos.write(dataAngka.get(b));
            }
            fos.write(250);
            fos.close();
            System.out.println("File berhasil ditulis");
        }
        catch (IOException ex) {
            System.out.println("File gagal ditulis!!");
        }
    }
    
    private void bacaDariFileByte(){
        try {
            System.out.println("------- Membaca File dalam Byte -------");
            System.out.print("Tuliskan nama file yang ingin dibaca: ");
            input.nextLine();
            namaFile = input.nextLine();
            bis = new BufferedInputStream(new FileInputStream
                        ("C:/Users/ASUS/Desktop/"+namaFile+".bin"));
            int saveData;
            
            System.out.println("\nBerikut data angka dalam file "+namaFile+".bin :");
            while((saveData = bis.read())!=250){
                System.out.print(saveData+" ");     
            }
            bis.close();
            System.out.println("\nFile berhasil dibaca");
        }
        catch (FileNotFoundException ex) {
            System.out.println("File tidak ditemukan!!");
        }
        catch (IOException ex) {
            System.out.println("Gagal membaca File!!");
        }
    }
    
    private void cetakKeFileKarakter(){
        try {
            System.out.println("------- Menulis File dalam Karakter -------");
            System.out.print("Tuliskan nama file: ");
            namaFile = input.nextLine();
            
            fw = new FileWriter("C:/Users/ASUS/Desktop/"+namaFile+".bin");
            System.out.print("Berapa jumlah kata yang ingin ditulis? ");
            int a = input.nextInt();
            String karakterIn;
            
            System.out.println("Masukkan kata2 tersebut");
            input.nextLine();
            for(int b=0; b<a; b++){
                dataKarakter.add(b, karakterIn = input.nextLine());
                fw.write(dataKarakter.get(b)+"\r");
            }
            fw.close();
            System.out.println("File berhasil ditulis");
        }
        catch (IOException ex) {
            System.out.println("File gagal ditulis!!");
        }
    }
    
    private void bacaDariFileKarakter(){
        try {
            System.out.println("------- Membaca File dalam Karakter -------");
            System.out.print("Tuliskan nama file yang ingin dibaca: ");
            namaFile = input.nextLine();
            br = new BufferedReader(new FileReader
                        ("C:/Users/ASUS/Desktop/"+namaFile+".bin"));
            String saveData;
            int baris = 1;
            
            System.out.println("\nBerikut data karakter dalam file "+namaFile+".bin :");
            while((saveData = br.readLine())!=null){
                System.out.println(baris+" "+saveData+" ");
                baris++;
            }
            br.close();
            System.out.println("\nFile berhasil dibaca");
        }
        catch (FileNotFoundException ex) {
            System.out.println("File tidak ditemukan!!");
        }
        catch (IOException ex) {
            System.out.println("Gagal membaca File!!");
        }
    }
}
