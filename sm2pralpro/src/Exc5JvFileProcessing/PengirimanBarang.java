package Exc5JvFileProcessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PengirimanBarang {

    public static void main(String[] args) {
        File senin = new File("C:/Users/ASUS/Desktop/Senin.txt");
        File selasa = new File("C:/Users/ASUS/Desktop/Selasa.txt");
        File rabu = new File("C:/Users/ASUS/Desktop/Rabu.txt");
        File kamis = new File("C:/Users/ASUS/Desktop/Kamis.txt");
        File jumat = new File("C:/Users/ASUS/Desktop/Jumat.txt");
        File sabtu = new File("C:/Users/ASUS/Desktop/Sabtu.txt");

        ArrayList<String> namaBarang1 = new ArrayList<>();
        ArrayList<String> jmlhsetiapBrg1 = new ArrayList<>();
        ArrayList<String> namaBarang2 = new ArrayList<>();
        ArrayList<String> jmlhsetiapBrg2 = new ArrayList<>();
        ArrayList<String> namaBarang3 = new ArrayList<>();
        ArrayList<String> jmlhsetiapBrg3 = new ArrayList<>();
        ArrayList<String> namaBarang4 = new ArrayList<>();
        ArrayList<String> jmlhsetiapBrg4 = new ArrayList<>();
        ArrayList<String> namaBarang5 = new ArrayList<>();
        ArrayList<String> jmlhsetiapBrg5 = new ArrayList<>();
        ArrayList<String> namaBarang6 = new ArrayList<>();
        ArrayList<String> jmlhsetiapBrg6 = new ArrayList<>();

        Scanner isianPemilik = new Scanner(System.in);

        System.out.println("Apa yang ingin anda lakukan?");
        System.out.println("A. Menulis File");
        System.out.println("B. Membaca File");
        System.out.print(">>> ");
        String answerAlphabet = isianPemilik.next();

        if (answerAlphabet.equalsIgnoreCase("A")) {
            int jumlahBarang = 0;
            String jawabanUntuklagi;

            try {
                PrintWriter monday = new PrintWriter(senin);
                PrintWriter tuesday = new PrintWriter(selasa);
                PrintWriter wednesday = new PrintWriter(rabu);
                PrintWriter thursday = new PrintWriter(kamis);
                PrintWriter friday = new PrintWriter(jumat);
                PrintWriter saturday = new PrintWriter(sabtu);

                System.out.print("\nJumlah barang yang ingin di input datanya(Senin): ");
                jumlahBarang = isianPemilik.nextInt();
                System.out.println();
                System.out.println("Tuliskan daftar barang hari Senin: ");
                monday.write("Data barang hari Senin:\r\n");
                for (int a = 0; a < jumlahBarang; a++) {
                    System.out.print("Nama barang ke-" + (a + 1) + " : ");
                    namaBarang1.add(a, isianPemilik.next());
                    System.out.print("Jumlah barang ke-" + (a + 1) + " : ");
                    jmlhsetiapBrg1.add(a, isianPemilik.next());
                    monday.write(jmlhsetiapBrg1.get(a) + " " + namaBarang1.get(a) + "\r\n");
                    System.out.println();
                }
                monday.close();

                System.out.print("\nJumlah barang yang ingin di input datanya(Selasa): ");
                jumlahBarang = isianPemilik.nextInt();
                System.out.println("Tuliskan daftar barang hari Selasa: ");
                tuesday.write("Data barang hari Selasa:\r\n");
                for (int a = 0; a < jumlahBarang; a++) {
                    namaBarang2.add(a, isianPemilik.nextLine());
                    System.out.print("Nama barang ke-" + (a + 1) + " : ");
                    namaBarang2.add(a, isianPemilik.nextLine());
                    System.out.print("Jumlah barang ke-" + (a + 1) + " : ");
                    jmlhsetiapBrg2.add(a, isianPemilik.nextLine());
                    tuesday.write(jmlhsetiapBrg2.get(a) + " " + namaBarang2.get(a) + "\r\n");
                    System.out.println();
                }
                tuesday.close();

                System.out.print("\nJumlah barang yang ingin di input datanya(Rabu): ");
                jumlahBarang = isianPemilik.nextInt();
                System.out.println("Tuliskan daftar barang hari Rabu: ");
                wednesday.write("Data barang hari Rabu:\r\n");
                for (int a = 0; a < jumlahBarang; a++) {
                    namaBarang3.add(a, isianPemilik.nextLine());
                    System.out.print("Nama barang ke-" + (a + 1) + " : ");
                    namaBarang3.add(a, isianPemilik.nextLine());
                    System.out.print("Jumlah barang ke-" + (a + 1) + " : ");
                    jmlhsetiapBrg3.add(a, isianPemilik.nextLine());
                    wednesday.write(jmlhsetiapBrg3.get(a) + " " + namaBarang3.get(a) + "\r\n");
                    System.out.println();
                }
                wednesday.close();

                System.out.print("\nJumlah barang yang ingin di input datanya(Kamis): ");
                jumlahBarang = isianPemilik.nextInt();
                System.out.println("Tuliskan daftar barang hari Kamis: ");
                thursday.write("Data barang hari Kamis:\r\n");
                for (int a = 0; a < jumlahBarang; a++) {
                    namaBarang4.add(a, isianPemilik.nextLine());
                    System.out.print("Nama barang ke-" + (a + 1) + " : ");
                    namaBarang4.add(a, isianPemilik.nextLine());
                    System.out.print("Jumlah barang ke-" + (a + 1) + " : ");
                    jmlhsetiapBrg4.add(a, isianPemilik.nextLine());
                    thursday.write(jmlhsetiapBrg4.get(a) + " " + namaBarang4.get(a) + "\r\n");
                    System.out.println();
                }
                thursday.close();

                System.out.print("\nJumlah barang yang ingin di input datanya(Jumat): ");
                jumlahBarang = isianPemilik.nextInt();
                System.out.println("Tuliskan daftar barang hari Jumat: ");
                friday.write("Data barang hari Jumat:\r\n");
                for (int a = 0; a < jumlahBarang; a++) {
                    namaBarang5.add(a, isianPemilik.nextLine());
                    System.out.print("Nama barang ke-" + (a + 1) + " : ");
                    namaBarang5.add(a, isianPemilik.nextLine());
                    System.out.print("Jumlah barang ke-" + (a + 1) + " : ");
                    jmlhsetiapBrg5.add(a, isianPemilik.nextLine());
                    friday.write(jmlhsetiapBrg5.get(a) + " " + namaBarang5.get(a) + "\r\n");
                    System.out.println();
                }
                friday.close();

                System.out.print("\nJumlah barang yang ingin di input datanya(Sabtu): ");
                jumlahBarang = isianPemilik.nextInt();
                System.out.println("Tuliskan daftar barang hari Sabtu: ");
                saturday.write("Data barang hari Sabtu:\r\n");
                for (int a = 0; a < jumlahBarang; a++) {
                    namaBarang6.add(a, isianPemilik.nextLine());
                    System.out.print("Nama barang ke-" + (a + 1) + " : ");
                    namaBarang6.add(a, isianPemilik.nextLine());
                    System.out.print("Jumlah barang ke-" + (a + 1) + " : ");
                    jmlhsetiapBrg6.add(a, isianPemilik.nextLine());
                    saturday.write(jmlhsetiapBrg6.get(a) + " " + namaBarang6.get(a) + "\r\n");
                    System.out.println();
                }
                saturday.close();
                System.out.println("\nFile telah tersimpan data barang");
            }
            catch (Exception e) {
                System.out.println("\nFile gagal menyimpan data barang!!!");
            }
        }
        else if (answerAlphabet.equalsIgnoreCase("B")) {
            BufferedReader dataBarang1 = null;
            BufferedReader dataBarang2 = null;
            BufferedReader dataBarang3 = null;
            BufferedReader dataBarang4 = null;
            BufferedReader dataBarang5 = null;
            BufferedReader dataBarang6 = null;

            try {
                dataBarang1 = new BufferedReader(new FileReader(senin));
                dataBarang2 = new BufferedReader(new FileReader(selasa));
                dataBarang3 = new BufferedReader(new FileReader(rabu));
                dataBarang4 = new BufferedReader(new FileReader(kamis));
                dataBarang5 = new BufferedReader(new FileReader(jumat));
                dataBarang6 = new BufferedReader(new FileReader(sabtu));

                System.out.println("Data barang hari apa yang ingin ditampilkan?");
                System.out.println("1. Senin");
                System.out.println("2. Selasa");
                System.out.println("3. Rabu");
                System.out.println("4. Kamis");
                System.out.println("5. Jumat");
                System.out.println("6. Sabtu");
                System.out.print(">>> ");
                String answerNumbershow = isianPemilik.next();

                String showinScreen, jwbLagi;

                if (answerNumbershow.equals("1")) {
                    while ((showinScreen = dataBarang1.readLine()) != null) {
                        System.out.println(showinScreen);
                    }
                }
                else if (answerNumbershow.equals("2")) {
                    while ((showinScreen = dataBarang2.readLine()) != null) {
                        System.out.println(showinScreen);
                    }
                }
                else if (answerNumbershow.equals("3")) {
                    while ((showinScreen = dataBarang3.readLine()) != null) {
                        System.out.println(showinScreen);
                    }
                }
                else if (answerNumbershow.equals("4")) {
                    while ((showinScreen = dataBarang4.readLine()) != null) {
                        System.out.println(showinScreen);
                    }
                }
                else if (answerNumbershow.equals("5")) {
                    while ((showinScreen = dataBarang5.readLine()) != null) {
                        System.out.println(showinScreen);
                    }
                }
                else if (answerNumbershow.equals("6")) {
                    while ((showinScreen = dataBarang6.readLine()) != null) {
                        System.out.println(showinScreen);
                    }
                }
                else {
                    System.out.println("Null");
                    System.exit(0);
                }
            }
            catch (FileNotFoundException e) {
                System.out.println("File is missing!!!");
            }
            catch (IOException e) {
                System.out.println("File can't be read!!!");
            }
            try {
                dataBarang1.close();
                dataBarang2.close();
                dataBarang3.close();
                dataBarang4.close();
                dataBarang5.close();
                dataBarang6.close();
                System.out.println("\nFile berhasil ditampilkan");
            }
            catch (IOException e) {
                System.out.println("File not show!!!" + e);
            }

        }

    }
}
