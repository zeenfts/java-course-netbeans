package Exc5JvFileProcessing;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DataPengeluaran {
    private static DataPengeluaran fvj;
    private File buatFile;
    private BufferedReader bacaDariFile;
    private int jmlhTran;
    private Scanner masuk;
    private ArrayList<String> dskrp = new ArrayList<>();
    private ArrayList<String> pricee = new ArrayList<>();

    private DataPengeluaran() {
        masuk = new Scanner(System.in);;
        jmlhTran = 0;
        buatFile = new File("C:/Users/ASUS/Desktop/Pengeluaran.txt");
        mencetakKeFile();
        membacaDariFile();
    }

    private void mencetakKeFile() {
        try {
            System.out.println("======= Menulis Data untuk File =======");
            System.out.print("Masukkan jumlah transaksi anda hari ini: ");
            jmlhTran = masuk.nextInt();

            PrintWriter cetakKeFile = new PrintWriter(new FileWriter(buatFile));
            cetakKeFile.write("======= Catatan Pengeluaran =======\r");
            for (int a = 0; a < jmlhTran; a++) {
                dskrp.add(a, masuk.nextLine());
                System.out.print("Deskripsi: ");
                dskrp.add(a, masuk.nextLine());
                System.out.print("Harga: ");
                pricee.add(a, masuk.nextLine());
                cetakKeFile.write(dskrp.get(a) + " " + pricee.get(a) + "\r");
                System.out.println(dskrp.get(a) + " berhasil dicatat ke file\n");
            }
            cetakKeFile.close();
        }
        catch (IOException e) {
            System.out.println("File gagal dicatat");
        }
    }

    private void membacaDariFile() {
        try {
            bacaDariFile = new BufferedReader(new FileReader(buatFile));
            String tampilkan;
            while ((tampilkan = bacaDariFile.readLine()) != null) {
                System.out.println(tampilkan);
            }
            bacaDariFile.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan ");
        }
        catch (IOException e) {
            System.out.println("File gagal dibaca ");
        }
    }

    public static void main(String[] args) {
        fvj = new DataPengeluaran();
    }
}
