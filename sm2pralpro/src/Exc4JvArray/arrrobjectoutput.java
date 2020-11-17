package Exc4JvArray;

public class arrrobjectoutput {

    
    public static void main(String[] args) 
    {
        arrrobjectsource[] dataMahasiswa = new arrrobjectsource[10];
        dataMahasiswa[0] = new arrrobjectsource();
        dataMahasiswa[0].namanya = "Udin Seduania";
        dataMahasiswa[0].nimnya = "1202185522";
        dataMahasiswa[0].kelasnya = "SI-31-09";
        System.out.println(dataMahasiswa[0].namanya);
        System.out.println(dataMahasiswa[0].nimnya);
        System.out.println(dataMahasiswa[0].kelasnya);
    }
    
}
