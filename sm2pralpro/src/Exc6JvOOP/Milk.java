package Exc6JvOOP;//Nama packagenya
import java.util.Scanner;//Javadoc untuk menggunakan Scanner

public class Milk //Nama classnya
{
 private String brandName;//Atribut 1
 private String expired;//Atribut 2
 private String condition;//Atribut 3
 private String flavour;//Atribut 4
 private Integer price;//Atribut 5
 private Integer quantity;//Atribut 6
 private Integer temperature;//Atribut 7
 private Integer weight;//Atribut 8
 private String answer;//Atribut 9

 public Milk()//Constructor
 {
  brandName = null;//Nilai default
  expired = null;//Nilai default
  condition = null;//Nilai default
  flavour = null;//Nilai default
  price = 0;//Nilai default
  quantity = 0;//Nilai default
  temperature = 0;//Nilai default
  weight = 0;//Nilai default
  answer = null;//Nilai default
 }
 
 public String getBrandName()//Methode getter 1
 {
  return brandName;//Tidak ada void maka harus dikembalikan nilainya
 }
 
 public void setBrandName(String brandName)//Methode setter 1
 {
  this.brandName = brandName;//"this.brandName" mengacu ke instance number
 }                           //"brandName" mengacu ke argumen metode
 
 public String getExpired()//Methode getter 2
 {
  return expired; //Tidak ada void maka harus dikembalikan nilainya  
 }
 
 public void setExpired(String expired)//Methode setter 2
 {
  this.expired = expired;//"this.expired" mengacu ke instance number
 }                       //"expired" mengacu ke argumen metode
 
 public String getCondition()//Methode getter 3
 {
  return condition; //Tidak ada void maka harus dikembalikan nilainya  
 }
 
 public void setCondition(String condition)//Methode setter 3
 {
   
  this.condition = condition;//"this.condition" mengacu ke instance number
 }                          //"condition" mengacu ke argumen metode
 
 public String getFlavour()//Methode getter 4
 {
  return flavour;//Tidak ada void maka harus dikembalikan nilainya   
 }
 
 public void setFlavour(String flavour)//Methode setter 4
 {
  this.flavour = flavour;//"this.flavour" mengacu ke instance number
 }                       //"flavour" mengacu ke argumen metode
 
 public int getPrice()//Methode getter 5
 {
  return price;  //Tidak ada void maka harus dikembalikan nilainya 
 }
 
 public void setPrice(int price)//Methode setter 5
 {
  this.price = price;//"this.price" mengacu ke instance number
 }                   //"price" mengacu ke argumen metode
 
 public int getQuantity()//Methode getter 6
 {
  return quantity;//Tidak ada void maka harus dikembalikan nilainya   
 }
 
 public void setQuantity(int quantity)///Methode setter 6
 {
  this.quantity = quantity;//"this.quantity" mengacu ke instance number
 }                        //"quantity" mengacu ke argumen metode
 
 public int getTemperature()//Methode getter 7
 {
  return temperature; //Tidak ada void maka harus dikembalikan nilainya  
 }
 
 public void setTemperature(int temperature)//Methode setter 7
 {
  this.temperature = temperature;//"this.temperature" mengacu ke instance number
 }                              //"temperature" mengacu ke argumen metode
 
 public int getWeight()//Methode getter 8
 {
  return weight; //Tidak ada void maka harus dikembalikan nilainya  
 }
 
 public void setWeight(int weight)//Methode setter 8
 {
  this.weight = weight;//"this.weight" mengacu ke instance number
 }                     //"weight" mengacu ke argumen metode
 
 public String getAnswer()//Methode getter 9
 {
  return answer; //Tidak ada void maka harus dikembalikan nilainya  
 }
 
 public void label()//Methode label
 {
  //Print yang di bawah ini, berfungsi sebagai estetika   
  System.out.println("===================== Milk =====================\n");   
 }
 
 public void labelTwo()//Methode label 2
  {
   //Print yang di bawah ini, berfungsi sebagai estetika     
   System.out.println("\n---------------------------------");
   System.out.println("      Dairy Products : Milk");
   System.out.println("---------------------------------");  
  }
 
 public void userwriteData()//Methode untuk meminta user memasukan data
 { 
  Scanner masuk = new Scanner(System.in);//Persiapan agar bisa input data
  do//Looping do-while yang akan run dulu statement kemudian baru cek kondisi
  {
   brandName = masuk.nextLine();// Untuk mengatasi bug 
   System.out.print("Input Brand Name         : ");//Meminta input data
   brandName = masuk.nextLine();//Variabel akan terisi dan lanjut
   System.out.print("Input Flavour            : ");//Meminta input data
   flavour = masuk.nextLine();//Variabel akan terisi dan lanjut
   System.out.print("Input Expired(yes/no)    : ");//Meminta input data
   expired = masuk.next();//Variabel akan terisi dan lanjut
   System.out.print("Input Quantity(int)      : ");//Meminta input data
   quantity = masuk.nextInt();//Variabel akan terisi dan lanjut
   System.out.print("Input Temperature(C)(int): ");//Meminta input data
   temperature = masuk.nextInt();//Variabel akan terisi dan lanjut
   System.out.print("Input Weight(gr)(int)    : ");//Meminta input data
   weight = masuk.nextInt();//Variabel akan terisi dan lanjut
   System.out.print("Input Price(IDR)(int)    : ");//Meminta input data
   price = masuk.nextInt();//Variabel akan terisi dan lanjut
   System.out.println();//Enter
   
   if(temperature>70)//Jika temperature lebih besar dari 70
   condition=("Hot");//Maka variable itu akan terisi dengan kata tersebut
   //Jika temperature lebih besar dari 30, lebih kecil sama dengan 70
   else if(temperature>30)
   condition=("Warm");//Maka variable itu akan terisi dengan kata tersebut
   //Jika temperature lebih besar dari 0, lebih kecil sama dengan 30
   else if(temperature>0)
   condition=("Cold");//Maka variable itu akan terisi dengan kata tersebut
   else//Selain dari yg di atas(temperatur lebih kecil sama dengan 0)
   condition=("Freeze"); //Maka variable itu akan terisi dengan kata tersebut  
   
   //Bertanya ke user
   System.out.print("Apakah anda yakin dengan data tersebut(y/n)? ");
   answer = masuk.next();//Variabel akan terisi dan lanjut
   System.out.println();//Enter
   
   if(getAnswer().equalsIgnoreCase("Y"))//Jika jawaban tadi y atau Y
   break;//Looping berhenti
   
  }while(getAnswer().equalsIgnoreCase("N"));//Jika jawaban tadi N atau n
  }                                    //Maka looping berlanjut terus
  
  public void displayedintheEnd()//Methode utk menampilkan data yang di isi td
  {
    //Mengambil dari methode getter 1  
    System.out.println("Brand name  : "+getBrandName());
    //Mengambil dari methode getter 4
    System.out.println("Flavour     : "+getFlavour());
    //Mengambil dari methode getter 6
    System.out.println("Quantity    : "+getQuantity());
    //Mengambil dari methode getter 7
    System.out.println("Temperature : "+getTemperature()+" Celcius"); 
    //Mengambil dari methode getter 8
    System.out.println("Weight      : "+getWeight()+" gram");
    //Mengambil dari methode getter 5
    System.out.println("Price       : Rp "+getPrice());
    
    //Jika dari methode getter 2 sama dgn Yes(tdk memperhatikan kapital) 
    if(getExpired().equalsIgnoreCase("yes"))
    System.out.println("Expired     : Already");//Maka ini yg muncul
    //Jika dari methode getter 2 sama dgn No(tdk memperhatikan kapital) 
    else if(getExpired().equalsIgnoreCase("no"))
    System.out.println("Expired     : Not yet");//Maka ini yg muncul
    else//Selain dua itu jawabannya
    System.out.println("Expired     : null");//Maka ini yang muncul
    //Mengambil dari methode getter 3    
    System.out.println("Condition   : "+getCondition()+"\n"); 
 }

}  
    

