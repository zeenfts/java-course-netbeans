package BukuPraktikum5.Banking;

public class Arrays {
    private int[][] matrix;

    public Arrays(int b, int k) {
        matrix= new int[b][k];
    }
    
    public void cetakArray(){
        for(int r=0; r<matrix.length; r++){
            System.out.print(r+"\t");
            for(int c=0; c<r; c++){
                System.out.print(r*c+"");
            }
            System.out.println();
        }
        System.out.println();
    }
}
