/*
BY:
MUHAMMAD DIFAGAMA IVANKA
SI-42-08
1202184310
*/
package Exc6JvOOP;//Nama packagenya

public class DairyProducts//Nama classnya 
{   
 public static void main(String[] args)//Main Methode
 {
  Milk mlk = new Milk();//Deklarasi dan alokasi instance Milk yg disebut mlk
  mlk.label();//Untuk memanggil methode label
  mlk.userwriteData();//Untuk memanggil methode input data dari user 
  //Untuk merubah nilai dari yang sebelumnya dimasukkan user
  mlk.setBrandName("Sorry the name will be blurred");
  //Untuk merubah nilai dari yang sebelumnya dimasukkan user
  mlk.setQuantity(700);
  
  //Deklarasi dan alokasi instance Yogurt yg disebut ygrt
  Yogurt ygrt = new Yogurt();
  ygrt.label();//Untuk memanggil methode label
  ygrt.userwriteData();//Untuk memanggil methode input data dari user 
  //Untuk merubah nilai dari yang sebelumnya dimasukkan user
  ygrt.setBrandName("Sorry the name will be blurred");
  
  //Deklarasi dan alokasi instance IceCream yg disebut icrm
  IceCream icrm = new IceCream();
  icrm.label();//Untuk memanggil methode label
  icrm.userwriteData();//Untuk memanggil methode input data dari user
  //Untuk merubah nilai dari yang sebelumnya dimasukkan user
  icrm.setBrandName("Sorry the name will be blurred");
  //Untuk merubah nilai dari yang sebelumnya dimasukkan user
  icrm.setCondition("freeze");
  
  //Deklarasi dan alokasi instance Chees yg disebut chs
  Cheese chs = new Cheese();
  chs.label();//Untuk memanggil methode label
  chs.userwriteData();//Untuk memanggil methode input data dari user 
  //Untuk merubah nilai dari yang sebelumnya dimasukkan user
  chs.setBrandName("Sorry the name will be blurred");
  //Untuk merubah nilai dari yang sebelumnya dimasukkan user
  icrm.setFlavour("Yummy");
  
  mlk.labelTwo();//Untuk memanggil methode label 2
  //Untuk memanggil methode penampilan data
  mlk.displayedintheEnd();
  ygrt.labelTwo();//Untuk memanggil methode label 2
  //Untuk memanggil methode penampilan data
  ygrt.displayedintheEnd();
  icrm.labelTwo();//Untuk memanggil methode label 2
  //Untuk memanggil methode penampilan data
  icrm.displayedintheEnd();
  chs.labelTwo();//Untuk memanggil methode label 2
  //Untuk memanggil methode penampilan data
  chs.displayedintheEnd();
  
 }
    
}
