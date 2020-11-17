package exOOP;

public class PembuatTV 
{
    String power, cannel = "apaya TV", sources;
    int volume = 10;

	public void tblpower() 
        {
		System.out.println(" TV menyala");
                System.out.println("-----------------------------------");
	}

	public void suara() 
        {
		System.out.println("Volume suara TV : " + volume + "");

	}
        
        public void chanel() 
        {
		System.out.println(cannel + " ");
	}
	
	public void sources() 
        {
         System.out.println("-----------------------------------");
	 System.out.println("TV ini made in NetBeans");
	}

}


