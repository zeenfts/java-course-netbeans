package Exc6JvOOP;

public class Pohon 
{
 private String namaPohon;
 private String jenisPohon;
 private int panenPohon;
 private int buahBusuk;
 private int totalBuah;
 
 public String getNamaPohon()
 {
  return namaPohon;   
 }
 
 public void setNamaPohon(String namaPohon)
 {
   this.namaPohon = namaPohon;   
 }
 
  public String getJenisPohon()
 {
  return jenisPohon;   
 }
  
  public void setJenisPohon(String jenisPohon)
 {
  this.jenisPohon = jenisPohon;   
 }
 
  public int getPanenPohon()
 {
  return panenPohon;   
 }
  
  public void setPanenPohon(int panenPohon)
 {
  this.panenPohon = panenPohon;   
 }
 
  public int getBuahBusuk()
 {
  return buahBusuk;   
 }
  
  public void setBuahBusuk(int buahBusuk)
 {
  this.buahBusuk = buahBusuk;   
 }
 
  public int getTotalBuah()
 {
  return totalBuah = panenPohon-buahBusuk;   
 }
  
  public void Show()
  {
   System.out.println("Nama pohon           : "+getNamaPohon());
   System.out.println("Jenis pohon          : "+getJenisPohon());
   System.out.println("Panen pohon perbulan : "+getPanenPohon());
   System.out.println("Jumlah buah busuk    : "+getBuahBusuk());
   System.out.println("Total buah           : "+getTotalBuah());
   if(totalBuah <6)
   System.out.println("Panen merugikan!!!");
   else
   System.out.println("Panen menguntungkan:)");   
   System.out.println("=============================================\n"); 
  }

}
