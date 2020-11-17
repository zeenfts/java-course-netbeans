/* By:
Muhammad Difagama Ivanka
1202184310
SI 42-08
(5_File Processing)
 */
package Exc5JvFileProcessing; //Daftar package yang diperlukan

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JurnalModulLima {

    public static void main(String[] args) {
        //Membuat objek file serta direktori penyimpanannya dalam format .bat  
        File apayaJudulnya = new File("C:/Users/ASUS/Desktop/Biodata Orang Random Ajadeh.bat");

        //Mempersiapkan agar user menginput suatu data sendiri  
        Scanner terserahIsiApa = new Scanner(System.in);

        System.out.println("Apa yang ingin anda lakukan?");
        System.out.println("A. Menulis File");
        System.out.println("B. Membaca File");
        System.out.print(">>> ");
        String pilganNih = terserahIsiApa.next();

        if (pilganNih.equalsIgnoreCase("A"))//Jika jawaban A atau a untuk menulis File
        {
            //Bagian untuk menulis file
            try {
                int jmlhOrng = 0;//Deklarasi variable 
                //Untuk menulis file
                PrintWriter isianAnda = new PrintWriter(apayaJudulnya);
                System.out.println("=================================================");
                //Bertanya kepada user
                System.out.print("Apakah Anda yakin ingin menginput Data (Y/N)?? ");
                String answerUserr = terserahIsiApa.next();
                if (answerUserr.equalsIgnoreCase("Y"))//Jika jawaban user Y atau y
                {
                    System.out.print("\nJumlah orang yang ingin di input datanya : ");
                    jmlhOrng = terserahIsiApa.nextInt();
                    System.out.println();

                    //Deklarasi array
                    String namaOrang[] = new String[jmlhOrng];
                    String tmpttglLahirr[] = new String[jmlhOrng];
                    String hobinya[] = new String[jmlhOrng];
                    int tinggiBadannya[] = new int[jmlhOrng];

                    //Looping, menyuruh user mengisi datanya 
                    for (int a = 0; a < namaOrang.length && a < tmpttglLahirr.length
                            && a < hobinya.length && a < tinggiBadannya.length; a++) {
                        namaOrang[a] = terserahIsiApa.nextLine();
                        System.out.print("Tuliskan Nama Orang Ke-" + (a + 1) + " : ");
                        namaOrang[a] = terserahIsiApa.nextLine();
                        System.out.print("Tuliskan TTL Orang Ke-" + (a + 1) + " : ");
                        tmpttglLahirr[a] = terserahIsiApa.nextLine();
                        System.out.print("Tuliskan Hobi Orang Ke-" + (a + 1) + " : ");
                        hobinya[a] = terserahIsiApa.nextLine();
                        System.out.print("Tuliskan Tinggi Badan Orang Ke-" + (a + 1) + " : ");
                        tinggiBadannya[a] = terserahIsiApa.nextInt();
                        System.out.println();
                    }

                    //Looping, untuk menulis file
                    for (int a = 0; a < namaOrang.length && a < tmpttglLahirr.length
                            && a < hobinya.length && a < tinggiBadannya.length; a++) {
                        isianAnda.write("Biodata Orang Ke-" + (a + 1) + " : \n");
                        isianAnda.write("Nama         : " + namaOrang[a] + "\n");
                        isianAnda.write("TTL          : " + tmpttglLahirr[a] + "\n");
                        isianAnda.write("Hobi         : " + hobinya[a] + "\n");
                        isianAnda.write("Tinggi Badan : " + tinggiBadannya[a] + "\n\n");
                    }

                    isianAnda.close();
                    System.out.println("\nFile berhasil dimasukkan datanya");
                }
                else if (answerUserr.equalsIgnoreCase("N"))//jika jawaban user N atau n
                {
                    System.out.println("\n---------------------Selesai---------------------");
                    isianAnda.close();
                    System.out.println("\nTidak ada data di Filenya");
                }
                else//Jika jawaban user selain pilihan2 di atas
                {
                    System.out.println("\nPilihan tidak ada silahkan ulangi kembali dari awal");
                    System.exit(0);//Mengeluarkan program(Berhenti sampai di sini saja)
                }
            }
            catch (Exception iii)//Jika file gagal dimasukkan data 
            {
                System.out.println("Maaf file gagal dimasukkan data!!!");
            }
        }

        else if (pilganNih.equalsIgnoreCase("B"))//Jika jawaban b atau B 
        {
            //Bagian untuk membaca file  
            FileReader yangdiatasTadi = null;//Deklarasi objek dengan nilai awal
            try {
                //Membaca file dari yang sudah diisikan data sebelumnya
                yangdiatasTadi = new FileReader("C:/Users/ASUS/Desktop/Biodata Orang Random Ajadeh.bat");
                //Membaca per baris
                BufferedReader samaajatapiperLine = new BufferedReader(yangdiatasTadi);

                System.out.println("=================================================");
                //Bertanya kepada user
                System.out.print("Apakah Anda yakin ingin menampilkan Data (Y/N)?? ");
                String answerUsertwo = terserahIsiApa.next();
                System.out.println();
                if (answerUsertwo.equalsIgnoreCase("Y"))//Jika jawaban user y atau Y
                {
                    String munculdiLayar;
                    //Jika yang dibaca perbaris sama dengan tidak kosong = variable di atas
                    while ((munculdiLayar = samaajatapiperLine.readLine()) != null) {
                        //Maka ini yang akan dijalankan   
                        System.out.println(munculdiLayar);
                    }
                }
                else if (answerUsertwo.equalsIgnoreCase("N"))//Jika jawaban user n atau N
                {
                    System.out.println("---------------------Selesai---------------------");
                    System.out.println("File tidak ditampilkan");
                    System.exit(0);
                }
                else//Jawaban user selain yang di atas tadi
                {
                    System.out.println("Pilihan tidak ada silahkan ulangi kembali dari awal");
                    System.exit(0);//Mengeluarkan program(Berhenti sampai di sini saja)
                }

            }
            catch (FileNotFoundException fnf)//Jika file ternyata tidak ditemukan
            {
                System.out.println("File Anda sepertinya sudah berubah/pindah tempat");
            }
            catch (IOException rde)//Jika file gagal terbaca 
            {
                System.out.println("Maaf file Anda tidak dapat terbaca!!!");
            }

            //Menutup file, lanjutan jika jawaban y atau Y
            try {
                yangdiatasTadi.close();//Jika berhasil ditutup
                System.out.println("File berhasil ditampilkan");//Perintah ini berjalan
            }
            // Jika file gagal ditutup, maka
            catch (Exception cls) {
                System.out.println("Gagal menutup file!!!");//Perintah ini yang berjalan
            }
        }
        else// Selain jawaban A, a, b, B
        {
            System.out.println("Maaf tidak ada pilihan tersebut, mohon run kembali");
            System.exit(0);//Program langsung terhenti
        }

    }
}
