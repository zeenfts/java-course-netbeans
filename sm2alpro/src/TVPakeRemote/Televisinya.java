package TVPakeRemote;
/*
MUHAMMAD DIFAGAMA IVANKA
1202184310
SI 42-08
*/
public class Televisinya extends RemoteTVnya
{
    int volume, channel;
    
    public void TVsatu()
    {
        System.out.println("============== TVsatu ==============");
    }
    
    public void TVdua()
    {
        System.out.println("============== TVdua ==============");
    }
    
    public void TVtiga()
    {
        System.out.println("============== TVtiga ==============");
    }
    
    public void setVolume(int volume)
    {
     this.volume = volume;   
    }
    
    public void setChannel(int channel)
    {
     this.channel = channel;
    }
    
  public boolean changeStatus()
    {
     if(hidup)
     {
        System.out.println("TV "+tvName+" akan mati...");
     hidup = false;
     nowStatus();
     }
     
     else 
      {
        System.out.println("TV "+tvName+" akan hidup...");
     hidup = true;
     nowStatus();
     }
        return hidup;
 }  
  
  public boolean nowStatus()
  {
   if(hidup)   
       System.out.println("TV "+tvName+" sudah menyala\n");
   
   else
       System.out.println("TV "+tvName+" sudah mati\n");
        return hidup;
  }
  
  public String showOther()
  {
      System.out.println("Volume  : "+volume);
      System.out.println("Channel : "+channel+"\n");
        return null;
  }
 
 @Override
   public String toString()//Menampilkan info channel dan volume suara
   { 
    return "" + changeStatus();
   }
}

 
    
    

