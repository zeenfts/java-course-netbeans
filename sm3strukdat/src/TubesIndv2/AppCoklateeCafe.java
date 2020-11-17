package TubesIndv2;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class AppCoklateeCafe {

    public static void main(String[] args) {
        try {
            accf = new AppCoklateeCafe();
        }
        catch (Exception e) {
            System.out.println("Ada kesalahan Program!!!");
        }
    }

    private AppCoklateeCafe() {
        totalPrice = 0;
        belanjaan.clear();
        launchCafeApp();
    }

    private void launchCafeApp() {
        System.out.println("oooooooooooooo Coklatee Café oooooooooooooo");
        System.out.println("Selamat Datang di Coklatee Café");

        System.out.print("Apa yang ingin dilakukan: "
                + "\na. Lihat Menu"
                + "\nb. Keranjang Belanja"
                + "\nc. Keluar" + "\n>> ");
        String ans1 = USER_INPUT.next();

        if (ans1.equalsIgnoreCase("a")) {
            System.out.println();
            listMenu();
        }
        else if (ans1.equalsIgnoreCase("b")) {
            System.out.println();
            shopCart();
        }
        else if (ans1.equalsIgnoreCase("c")) {
            System.exit(0);
        }
        else {
            System.out.println("Inputan Salah!!\n");
            launchCafeApp();//recursive 
        }
    }

    private void listMenu() {
        System.out.print("\n------- Menu Coklatee Café -------"
                + "\n1. Menu Default"
                + "\n2. Menu harga Murah-Mahal"
                + "\n3. Menu harga Mahal-Murah"
                + "\n4. Menu urut Nama (a-z)"
                + "\n5. Menu urut Nama (z-a)" + "\n>> ");
        String answerMenu = USER_INPUT.next();

        if (answerMenu.equalsIgnoreCase("1")) {
            System.out.println("....... Daftar Menu Default .......");
            displayMenu(MERK_COKLAT);
            confirmTransaction();
        }
        else if (answerMenu.equalsIgnoreCase("2")) {
            System.out.println
                ("\n....... Daftar Menu Urut Sesuai Harga (Murah-Mahal) .......");
            sortHargaAscending(MERK_COKLAT, MERK_COKLAT.length);
            displayMenu(MERK_COKLAT);
            confirmTransaction();
        }
        else if (answerMenu.equalsIgnoreCase("3")) {
            System.out.println
                ("\n....... Daftar Menu Urut Sesuai Harga (Mahal-Murah) .......");
            sortHargaDescending(MERK_COKLAT, MERK_COKLAT.length);
            displayMenu(MERK_COKLAT);
            confirmTransaction();
        }
        else if (answerMenu.equalsIgnoreCase("4")) {
            System.out.println
                ("\n....... Daftar Menu Urut Sesuai Nama Produk (A-Z) .......");
            sortNamaAscending(MERK_COKLAT, MERK_COKLAT.length);
            displayMenu(MERK_COKLAT);
            confirmTransaction();
        }
        else if (answerMenu.equalsIgnoreCase("5")) {
            System.out.println
                ("\n....... Daftar Menu Urut Sesuai Nama Produk (Z-A) .......");
            sortNamaDescending(MERK_COKLAT, MERK_COKLAT.length);
            displayMenu(MERK_COKLAT);
            confirmTransaction();
        }
        else {
            System.out.println("Pilihan tidak ada!!");
            listMenu();
        }
    }

    private void shopCart() {
        System.out.println(">>>>>>> Shopping Cart <<<<<<<");
        System.out.println("Checkout belanjaan: ");
        for (int q = 0; q < belanjaan.size(); q++) {
            System.out.println(belanjaan.get(q));
        }
        System.out.println("\nTotal Belanjaan: " + belanjaan.size());
        System.out.println("Total harga yang harus dibayar: "
                + KURS_POUNDS.format(totalPrice));
        System.out.print("\nLakukan: "
                + "\n1. Pembayaran"
                + "\n2. Cancel 1 Order"
                + "\n3. Cancel All Order"
                + "\n4. Back" + "\n>> ");
        String ansShopCart = USER_INPUT.next();

        if (ansShopCart.equals("1")) {
            bayarCoklat();
        }
        else if (ansShopCart.equals("2")) {
            System.out.print("\nOrder ke berapa yang ingin di-cancel? ");
            int urutOrder = USER_INPUT.nextInt();
            if (urutOrder >= 0 && urutOrder <= belanjaan.size()) {
                int ambilHargaPlain = hargaPlain.get(urutOrder - 1);
                totalPrice -= ambilHargaPlain;
                hargaPlain.remove(urutOrder - 1);
                belanjaan.remove(urutOrder - 1);
                System.out.println();
                shopCart();
            }
            else {
                System.out.println("Pilihan tidak ada!!");
                shopCart();
            }
        }
        else if (ansShopCart.equals("3")) {
            belanjaan.clear();
            hargaPlain.clear();
            totalPrice = 0;
            System.out.println("Semua Order dibatalkan\n");
            launchCafeApp();
        }
        else if (ansShopCart.equals("4")) {
            System.out.println();
            launchCafeApp();
        }
        else {
            System.out.println("Pilihan tidak ada!!\n");
            shopCart();
        }
    }

    private void confirmTransaction() {
        System.out.print("Pesan sekarang? (y/n)");
        String answerMenuDefault = USER_INPUT.next();
        if (answerMenuDefault.equalsIgnoreCase("y")) {
            transaksiTerjadi();
            System.out.println();
            shopCart();
        }
        else if (answerMenuDefault.equalsIgnoreCase("n")) {
            System.out.println();
            launchCafeApp();
        }
        else {
            System.out.println("Inputan salah!");
            confirmTransaction();//recursive
        }
    }

    private void transaksiTerjadi() {
        System.out.println("\n\\\\\\\\\\\\\\ Transaksi Coklatee Café ///////");
        System.out.print("Jumlah Pesanan: ");
        int amount = USER_INPUT.nextInt();
        int x = 0;
        while (x < amount) {
            x++;
            System.out.print("\n" + x + "))\nMerk          : ");
            String merk = USER_INPUT.next();
            search(kapitalAwal(merk), MERK_COKLAT);
        }
    }

    private void bayarCoklat() {
        System.out.print("Bayar? (y/n) ");
        String answerPay = USER_INPUT.next();
        if (answerPay.equalsIgnoreCase("n")) {
            System.out.println();
            launchCafeApp();
        }
        else if (answerPay.equalsIgnoreCase("y")) {
            System.out.println("Terima Kasih, transaksi sebesar "
                    + KURS_POUNDS.format(totalPrice) + " sukses!!");
            System.out.println("\nSemoga Hari Anda Selalu Bahagia:)");
        }
        else {
            System.out.println("Pilihan tidak ada!!");
            bayarCoklat();
        }
    }

    private void search(String name, String[][] theArr) {//search
        for (int a = 0; a < theArr.length; a++) {
            if (theArr[a][0].contains(name)) {
                System.out.println("Harganya      : "
                        + KURS_POUNDS.format(Integer.parseInt(theArr[a][1])));
                System.out.println("Ada di urutan : " + (a + 1));
                belanjaan.add(1 + " " + String.valueOf(theArr[a][0]) + " -> "
                        + String.valueOf(KURS_POUNDS.format
                                        (Integer.parseInt(theArr[a][1]))));
                hargaPlain.add(Integer.parseInt(theArr[a][1]));
                totalPrice += Integer.parseInt(theArr[a][1]);
            }
        }
    }

    private void sortHargaDescending(String theArr[][], int index) {
        if (index <= 1) {
            return;
        }

        sortHargaDescending(theArr, index - 1); //recursive

        int last = Integer.valueOf(theArr[index - 1][1]);
        String lastPrice = theArr[index - 1][1];
        String lastName = theArr[index - 1][0];
        int j = index - 2;
        while (j >= 0 && Integer.valueOf(theArr[j][1]) < last) {
            theArr[j + 1][0] = theArr[j][0];
            theArr[j + 1][1] = theArr[j][1];
            j--;
        }
        theArr[j + 1][0] = lastName;
        theArr[j + 1][1] = lastPrice;
    }

    private void sortHargaAscending(String theArr[][], int index) {
        if (index <= 1) {
            return;
        }

        sortHargaAscending(theArr, index - 1); //recursive

        int last = Integer.valueOf(theArr[index - 1][1]);
        String lastPrice = theArr[index - 1][1];
        String lastName = theArr[index - 1][0];
        int j = index - 2;
        while (j >= 0 && Integer.valueOf(theArr[j][1]) > last) {
            theArr[j + 1][0] = theArr[j][0];
            theArr[j + 1][1] = theArr[j][1];
            j--;
        }
        theArr[j + 1][0] = lastName;
        theArr[j + 1][1] = lastPrice;
    }

    private void sortNamaAscending(String theArr[][], int index) {
        if (index <= 1) {
            return;
        }

        sortNamaAscending(theArr, index - 1); //recursive

        String lastPrice = theArr[index - 1][1];
        String lastName = theArr[index - 1][0];
        int j = index - 2;
        while (j >= 0 && (theArr[j][0].compareTo(lastName)) > 0) {
            theArr[j + 1][0] = theArr[j][0];
            theArr[j + 1][1] = theArr[j][1];
            j--;
        }
        theArr[j + 1][0] = lastName;
        theArr[j + 1][1] = lastPrice;
    }

    private void sortNamaDescending(String theArr[][], int index) {
        if (index <= 1) {
            return;
        }

        sortNamaDescending(theArr, index - 1);//recursive

        String lastPrice = theArr[index - 1][1];
        String lastName = theArr[index - 1][0];
        int j = index - 2;
        while (j >= 0 && (theArr[j][0].compareTo(lastName)) <= 0) {
            theArr[j + 1][0] = theArr[j][0];
            theArr[j + 1][1] = theArr[j][1];
            j--;
        }
        theArr[j + 1][0] = lastName;
        theArr[j + 1][1] = lastPrice;
    }

    private void displayMenu(String theArr[][]) {
        System.out.println("______________________________");
        System.out.println("|   Coklat     |    Harga    |");
        System.out.println("------------------------------");
        for (int a = 0; a < theArr.length; a++) {
            for (int b = 0; b < 1; b++) {
                System.out.print("| " + (a + 1) + " " + theArr[a][0] + " | ");
                System.out.print(KURS_POUNDS.format
                                (Integer.parseInt(theArr[a][1])) + " |");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }

    private String kapitalAwal(String kata) {
        char pisahHuruf[] = kata.toCharArray();
        for (int i = 0; i < kata.length(); i++) {
            if (i == 0 && pisahHuruf[i] != ' '
                    || pisahHuruf[i] != ' ' && pisahHuruf[i - 1] == ' ') {
                if (pisahHuruf[i] >= 'a' && pisahHuruf[i] <= 'z') {
                    pisahHuruf[i] = (char) (pisahHuruf[i] - 'a' + 'A');
                }
            }
            else if (pisahHuruf[i] >= 'A' && pisahHuruf[i] <= 'Z') {
                pisahHuruf[i] = (char) (pisahHuruf[i] + 'a' - 'A');
            }
        }
        String gabungHuruf = new String(pisahHuruf);
        return gabungHuruf;
    }

    private static AppCoklateeCafe accf;
    private Scanner USER_INPUT = new Scanner(System.in);
    private NumberFormat KURS_POUNDS = NumberFormat.getCurrencyInstance(Locale.UK);
    private String[][] MERK_COKLAT
        = {{"Toblerone  ", "7000"}, {"Silverqueen", "12000"}, {"Ghirardeli ", "19000"},
           {"Hershey's  ", "9000"}, {"Delfi      ", "5000"}, {"Cadbury    ", "5500"},
           {"Nestle     ", "6500"}, {"Patchi     ", "13500"}, {"Guylian    ", "16600"},
           {"Milka      ", "15203"}};
    private ArrayList<String> belanjaan = new ArrayList<>();
    private ArrayList<Integer> hargaPlain = new ArrayList<>();
    private int totalPrice;
}
