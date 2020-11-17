package M1TPArrMulti;

public class ArrayTwoD {

    //Deklarasi Array 2 Dimensi langsung inisialisasi(pengisian)
    private static int[][] otherNumbers = {{10,11,12},{13,14,15},{16,17,18}};
    
    //Deklarasi Array 2 Dimensi beserta Intansiasi                                 
    private static int angka[][] = new int[3][3]; 
    
    /*Tambahan. Penulisan tanda "[]" dapat ditulis setelah tipe data maupun 
      setelah nama variabel*/
    
    public static void main(String[] args) {
        //Inisialisasi Array 2 Dimensi
        angka[0][0] = 1; 
        angka[0][1] = 2;
        angka[0][2] = 3;
        angka[1][0] = 4;
        angka[1][1] = 5;
        angka[1][2] = 6;
        angka[2][0] = 7; 
        angka[2][1] = 8;
        angka[2][2] = 9; 
        
        //a) Menampilkan Array 2D dengan nested loop for
        for (int i = 0; i < 3; i++){ //Bagian a1 ini membentuk segitiga siku2
            for (int j = 0; j <= i; j++){
                System.out.print(angka[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int i = 0; i < 3; i++){ //Bagian a2 ini membentuk persegi
            for (int j = 0; j <= 2; j++){
                System.out.print(angka[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        for (int i = 2; i >= 0; i--){ //Bagian a3: segitiga siku2 kebalik
            for (int j = 0; j <= i; j++){
                System.out.print(otherNumbers[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println();
        
        for (int i = 0; i < 2; i++){ //Bagian a4: persegi panjang
            for (int j = 0; j < 3; j++){
                System.out.print(otherNumbers[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println();
    
        /*b) Menampilkan Array 2D dengan nested loop for-each
        (memiliki syarat jumlah baris dan kolom yang ditampilkan pasti sama
        {persegi} misal: 2x2, 3x3, 4x4, 5x5, dst)*/
        for(int i[] : angka){ //bagian b1
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        
        for(int i[] : otherNumbers){ //bagian b2
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    
}
