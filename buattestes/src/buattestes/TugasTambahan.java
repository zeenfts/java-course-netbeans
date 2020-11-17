package buattestes;
import java.util.Scanner;

public class TugasTambahan {
    private static TugasTambahan tsmb;
    private Scanner userInput;
    private String[][] NETFLIX_MOVIES_CATALOGUE = {
        {"Reality High                          ", "2017"},
        {"Roxy                                  ", "2018"}, 
        {"Rucker50                              ", "2016"}, 
        {"A Christmas Prince                    ", "2017"},
        {"A Haunting at Silver Falls: The Return", "2019"}, 
        {"A Billion Colour Story                ", "2016"},
        {"A Land Imagined                       ", "2019"}, 
        {"A Fortunate Man                       ", "2017"}};

    private TugasTambahan() {
        userInput = new Scanner(System.in);
        launchTugasTambahan();
    }

    private void launchTugasTambahan(){
        System.out.println("oooooooooooooo Netflix Movies Catalogue oooooooooooooo");
        System.out.println("Selamat Datang di Katalog Film Netflix");

        System.out.print("Anda ingin lihat catalog film berdasar: ");
        System.out.print( "\n1. Katalog Film Default"
                        + "\n2. Katalog Tahun Film (Lama-Baru)"
                        + "\n3. Katalog Tahun Film (Baru-Lama)"
                        + "\n4. Katalog Nama Film (A-Z)"
                        + "\n5. Katalog Nama Film (Z-A)" + "\n>> ");
        String answerMenu = userInput.next();

        if (answerMenu.equalsIgnoreCase("1")) {
            System.out.println("\n....... Katalog Film Default .......");
            displayKatalog(NETFLIX_MOVIES_CATALOGUE);
            confirmAction();
        }
        else if (answerMenu.equalsIgnoreCase("2")) {
            System.out.println("\n....... Katalog Film berdasar Tahun (Lama-Baru) .......");
            sortYearAscending(NETFLIX_MOVIES_CATALOGUE, 0, NETFLIX_MOVIES_CATALOGUE.length-1);
            displayKatalog(NETFLIX_MOVIES_CATALOGUE);
            confirmAction();
        }
        else if (answerMenu.equalsIgnoreCase("3")) {
            System.out.println("\n....... Katalog Film berdasar Tahun (Baru-Lama) .......");
            sortYearDescending(NETFLIX_MOVIES_CATALOGUE, 0, NETFLIX_MOVIES_CATALOGUE.length-1);
            displayKatalog(NETFLIX_MOVIES_CATALOGUE);
            confirmAction();
        }
        else if (answerMenu.equalsIgnoreCase("4")) {
            System.out.println("\n....... Katalog Film berdasar Nama (A-Z) .......");
            sortNameAscending(NETFLIX_MOVIES_CATALOGUE, 0, NETFLIX_MOVIES_CATALOGUE.length-1);
            displayKatalog(NETFLIX_MOVIES_CATALOGUE);
            confirmAction();
        }
        else if (answerMenu.equalsIgnoreCase("5")) {
            System.out.println("\n....... Katalog Film berdasar Nama (Z-A) .......");
            sortNameDescending(NETFLIX_MOVIES_CATALOGUE, 0, NETFLIX_MOVIES_CATALOGUE.length-1);
            displayKatalog(NETFLIX_MOVIES_CATALOGUE);
            confirmAction();
        }
        else {
            System.out.println("Pilihan tidak ada!!\n");
            launchTugasTambahan();
        }
    }
    
    //Merge Sort Movie Name (A-Z)
    private void mergeNameAscending(String arr[][], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        String L[][] = new String[n1][2];
        String R[][] = new String[n2][2];

        for (int i = 0; i < n1; ++i) {
            L[i][0] = arr[l + i][0];
            L[i][1] = arr[l + i][1];
        }
        for (int j = 0; j < n2; ++j) {
            R[j][0] = arr[m + 1 + j][0];
            R[j][1] = arr[m + 1 + j][1];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i][0].compareToIgnoreCase(R[j][0]) < 0) {
                arr[k][0] = L[i][0];
                arr[k][1] = L[i][1];
                i++;
            }
            else {
                arr[k][0] = R[j][0];
                arr[k][1] = R[j][1];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k][0] = L[i][0];
            arr[k][1] = L[i][1];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k][0] = R[j][0];
            arr[k][1] = R[j][1];
            j++;
            k++;
        }
    }

    private void sortNameAscending(String arr[][], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            sortNameAscending(arr, l, m);
            sortNameAscending(arr, m + 1, r);

            mergeNameAscending(arr, l, m, r);
        }
    }
    
    //Merge Sort Movie Name (Z-A)
    private void mergeNameDescending(String arr[][], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        String L[][] = new String[n1][2];
        String R[][] = new String[n2][2];

        for (int i = 0; i < n1; ++i) {
            L[i][0] = arr[l + i][0];
            L[i][1] = arr[l + i][1];
        }
        for (int j = 0; j < n2; ++j) {
            R[j][0] = arr[m + 1 + j][0];
            R[j][1] = arr[m + 1 + j][1];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i][0].compareToIgnoreCase(R[j][0]) > 0) {
                arr[k][0] = L[i][0];
                arr[k][1] = L[i][1];
                i++;
            }
            else {
                arr[k][0] = R[j][0];
                arr[k][1] = R[j][1];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k][0] = L[i][0];
            arr[k][1] = L[i][1];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k][0] = R[j][0];
            arr[k][1] = R[j][1];
            j++;
            k++;
        }
    }

    private void sortNameDescending(String arr[][], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            sortNameDescending(arr, l, m);
            sortNameDescending(arr, m + 1, r);

            mergeNameDescending(arr, l, m, r);
        }
    }
    
    //Merge Sort Year Ascending
    private void mergeYearAscending(String arr[][], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        String L[][] = new String[n1][2];
        String R[][] = new String[n2][2];

        for (int i = 0; i < n1; ++i) {
            L[i][0] = arr[l + i][0];
            L[i][1] = arr[l + i][1];
        }
        for (int j = 0; j < n2; ++j) {
            R[j][0] = arr[m + 1 + j][0];
            R[j][1] = arr[m + 1 + j][1];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (Integer.valueOf(L[i][1]) < Integer.valueOf(R[j][1])) {
                arr[k][0] = L[i][0];
                arr[k][1] = L[i][1];
                i++;
            }
            else {
                arr[k][0] = R[j][0];
                arr[k][1] = R[j][1];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k][0] = L[i][0];
            arr[k][1] = L[i][1];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k][0] = R[j][0];
            arr[k][1] = R[j][1];
            j++;
            k++;
        }
    }

    private void sortYearAscending(String arr[][], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            sortYearAscending(arr, l, m);
            sortYearAscending(arr, m + 1, r);

            mergeYearAscending(arr, l, m, r);
        }
    }
    
    //Merge Sort Year Descending
    private void mergeYearDescending(String arr[][], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        String L[][] = new String[n1][2];
        String R[][] = new String[n2][2];

        for (int i = 0; i < n1; ++i) {
            L[i][0] = arr[l + i][0];
            L[i][1] = arr[l + i][1];
        }
        for (int j = 0; j < n2; ++j) {
            R[j][0] = arr[m + 1 + j][0];
            R[j][1] = arr[m + 1 + j][1];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (Integer.valueOf(L[i][1]) > Integer.valueOf(R[j][1])) {
                arr[k][0] = L[i][0];
                arr[k][1] = L[i][1];
                i++;
            }
            else {
                arr[k][0] = R[j][0];
                arr[k][1] = R[j][1];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k][0] = L[i][0];
            arr[k][1] = L[i][1];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k][0] = R[j][0];
            arr[k][1] = R[j][1];
            j++;
            k++;
        }
    }

    private void sortYearDescending(String arr[][], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            sortYearDescending(arr, l, m);
            sortYearDescending(arr, m + 1, r);

            mergeYearDescending(arr, l, m, r);
        }
    }
    
    private void confirmAction() {
        System.out.print("Lihat lagi? (y/n)");
        String answerMenuDefault = userInput.next();
        if (answerMenuDefault.equalsIgnoreCase("y")) {
            System.out.println();
            launchTugasTambahan();
        }
        else if (answerMenuDefault.equalsIgnoreCase("n")) {
           System.out.println("\nTerima Kasih telah melihat katalog film Netflix:)");
           System.exit(0);
        }
        else {
            System.out.println("Inputan salah!");
            confirmAction();
        }
    }
    
    private void displayKatalog(String theArr[][]) {
        System.out.println("____________________________________________________");
        System.out.println("|                Movie Name                 | Year |");
        System.out.println("----------------------------------------------------");
        for (int a = 0; a < theArr.length; a++) {
            for (int b = 0; b < 1; b++) {
                System.out.print("| " + (a + 1) + ". " + theArr[a][0] + " | ");
                System.out.print(theArr[a][1] + " |");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
    }

    public static void main(String[] args) {
        try {
            tsmb = new TugasTambahan();
        }
        catch (Exception e) {
            System.out.println("Program Bermasalah!!!");
        }
    }

}
