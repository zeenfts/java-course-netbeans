package Exc6JvOOP;

public class Firstexe6_Medicine 
{
 public static void main(String[] args) 
 {
  Firstexe6_Capsule cpsl = new Firstexe6_Capsule();
  cpsl.setName("Fermino");
  cpsl.setWeight(0.2);
  cpsl.setRecommendation("1x3");
  cpsl.showinscreen();
  
  Firstexe6_Liquid lqd = new Firstexe6_Liquid();
  lqd.setName("Mylanta");
  lqd.setWeight(2.3);
  lqd.setRecommendation("1x3");
  lqd.showinscreen();
 }
    
}
