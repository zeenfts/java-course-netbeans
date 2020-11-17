package Exc6JvOOP;

public class Firstexe6_Capsule 
{
 private String name, recommendation;
 private double weight;
 
 public String getName()
 {
  return name;   
 }
 
 public void setName(String name)
 {
  this.name = name;   
 }
 
 public String getRecommendation()
 {
  return recommendation;   
 }
 
 public void setRecommendation(String recommendation)
 {
  this.recommendation = recommendation;   
 }
 
 public double getWeight()
 {
  return weight;
 }
 
 public void setWeight(double weight)
 {
  this.weight = weight;   
 }
 
 public void showinscreen()
 {
     System.out.println("Medicine name  : "+getName());
     System.out.println("Recommendation : "+getRecommendation());
     System.out.println("Weight         : "+getWeight()+" gr\n");
 }   
}
