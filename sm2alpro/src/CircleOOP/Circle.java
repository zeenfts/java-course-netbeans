package CircleOOP;
/*
MUHAMMAD DIFAGAMA IVANKA
1202184310
SI 42-08
*/
public class Circle 
{
 private double radius;
 private String color;
   
 public Circle()
 {
     radius = 1.0;
     color = "red";
 }
 
 public Circle(double r, String C)
 {
     radius = r;
     color = C;
 }
 
 public double getRadius()
 {
     return radius;
 }
 
 public double getArea()
 {
     return radius*radius*Math.PI;
 }
 
 public void getColor(String color)
 {
     this.color=color;
 }
 
 public void setRadius(double radius)
 {
     this.radius = radius;
 }
   
 public void setColor(String color)
 {
     this.color = color;
 }
 
 @Override
 public String toString()
 {
     return "Circle: Radius= "+radius+" color= "+color;
 }
}
