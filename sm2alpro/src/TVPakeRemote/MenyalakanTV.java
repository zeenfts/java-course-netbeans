package TVPakeRemote;
/*
MUHAMMAD DIFAGAMA IVANKA
1202184310
SI 42-08
*/
public class MenyalakanTV 
{
 public static void main(String[] args) 
 {
    RemoteTVnya rmttv1 = new RemoteTVnya();
    RemoteTVnya rmttv2 = new RemoteTVnya(); 
    RemoteTVnya rmttv3 = new RemoteTVnya(); 
    Televisinya tv1 = new Televisinya();
    Televisinya tv2 = new Televisinya();
    Televisinya tv3 = new Televisinya();
    
    tv1.TVsatu();
    rmttv1.tvName = tv1.tvName = "Apple";
    rmttv1.remoteName = "1";
    rmttv1.hidup = true;
    rmttv1.toString();
    tv1.toString();
    tv1.setChannel(99);
    tv1.setVolume(35);
    tv1.showOther();
    rmttv1.hidup =  false;
    rmttv1.toString();
    tv1.toString();
    
    tv2.TVdua();
    rmttv2.tvName = tv2.tvName = "LG";
    rmttv2.remoteName = "2";
    rmttv2.hidup = true;
    rmttv2.toString();
    tv2.toString();
    tv2.setChannel(7);
    tv2.setVolume(99);
    tv2.showOther();
    rmttv2.hidup =  false;
    rmttv2.toString();
    tv2.toString();
    
    tv3.TVtiga();
    rmttv3.tvName = tv3.tvName = "Samsung";
    rmttv3.remoteName = "3";
    rmttv3.hidup = true;
    rmttv3.toString();
    tv3.toString();
    tv3.setChannel(21);
    tv3.setVolume(77);
    tv3.showOther();
    rmttv3.hidup =  false;
    rmttv3.toString();
    tv3.toString();
    
 }
}   

