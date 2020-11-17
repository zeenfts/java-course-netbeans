package TVPakeRemote;
/*
MUHAMMAD DIFAGAMA IVANKA
1202184310
SI 42-08
*/
public class RemoteTVnya 
{
  protected boolean hidup; //Deklarasi variable
  protected String tvName, remoteName;
  
   
    public boolean setStatus()//TV dihidupkan
    { 
     if(hidup)
        System.out.println("Remote "+remoteName+" saat ini akan menyalakan TV "
                + tvName);
     else
         System.out.println("Remote "+remoteName+" saat ini akan mematikan TV "
                 + tvName);
      return hidup;
    }
   
    
    @Override
    public String toString()
    {
     return ""+setStatus();   
    }
}
