package CircleOOP;
/*
MUHAMMAD DIFAGAMA IVANKA
1202184310
SI 42-08
*/
public class TestCircle
{
public static void main(String[] args) 
 {
  Circle c1 = new Circle();
  System.out.println(c1.toString()+
                     " and area of "+c1.getArea());
     
  Circle c2 = new Circle(2.0, "yellow");
  System.out.println(c2.toString()+
                     " and area of "+c2.getArea());
  
  Circle c3 = new Circle(3.0, "green");
  c3.setRadius(5.0);
  System.out.println(c3.toString()+
                     " and area of "+c3.getArea());
  
  Circle c4 = new Circle(4.0, "blue");
  System.out.println(c4.toString()+
                     " and area of "+c4.getArea());
 }
}