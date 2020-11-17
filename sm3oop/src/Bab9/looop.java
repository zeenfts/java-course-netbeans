package Bab9;

public class looop {
  public looop(){
      
  }  
  
  public void while_looping(){
      byte i = 3;
      while(true){
          System.out.print("* ");
          if(i==10)
              break;
          i++;
      }
      System.out.println();
  }
  
  public void nested_looping(){
      byte i = 3;
      while(true){
          for(byte j=0; j<5; j++){
              System.out.print("@ ");
          }
          System.out.print("* ");
          if(i==10)
              break;
          i++;
      }
      System.out.println();
  }
  
  public void pyramid_looping(){
      int a = 0;
      ac: while(true){
          int c = 0;
            while(true){
                if (c>a)
                    continue ac;
                if(c==a)
                    break; 
                System.out.print("* ");
                c++;  
            }
            if(a==5)
                break;
            a++;
            System.out.println();
        }  
      System.out.println();
  }
  
  public void pyramidend_looping(){
      int a = 5;
      sc: while(true){
             
              for(int j=5; j>a; j--){
                System.out.print("  ");
                if(j<a)
                    continue sc;
              }
              for(int j=1; j<=a; j++){
                System.out.print("* ");
              }
          if(a==0)
              break;
          a--;
          System.out.println();
      }  
      System.out.println();
  }
  
  public void kotak_looping(){
      int a = 0;
      while(true){
          for(int j=0; j<5; j++){
              System.out.print("* ");
          }
          if(a==4)
              break;
          a++;
          System.out.println();
      }  
      System.out.println();
  }
}
