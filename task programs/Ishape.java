//15.
import java.util.*;
interface IShape
{
 
 void calculate();
}
class Triangle implements IShape
{
 System.out.println("Triangle");
 Scanner sc=new Scanner(System.in);
 public void calculate()
 {
 System.out.println("Enter the base lenght");
  int b=sc.nextInt();
  System.out.println("Enter the height");
  int h=sc.nextInt();
  int t=(1/2)*b*h;
  System.out.println("Area of the Triangle is "+t);
 }
}
class Square implements IShape
{
 System.out.println("Square");
 Scanner sc=new Scanner(System.in);
 public void calculate()
 {
  System.out.println("Enter the length of side");
  int l1=sc.nextInt();
  int s=l1*l1;
  System.out.println("Area of Square is "+s);
 }
}
class Circle implements IShape
{
 System.out.println("Circle");
 Scanner sc=new Scanner(System.in);
 public void calculate()
 {
 System.out.println("Enter the radius");
  int r1=sc.nextInt();
  int c=r1*r1;
  System.out.println("Area of the circle is "+c);
 }
}
class Rectangle implements IShape
{
 System.out.println("Rectangle");
 Scanner sc=new Scanner(System.in);
 public void calculate()
 {
  System.out.println("Enter the lenght");
  int l=sc.nextInt();
  System.out.println("Enter the breadth");
  int b=sc.nextInt();
   int r=l*b;
  System.out.println("Area of rectangle is "+r);
 }
}
class InterfaceTest
{
 public static void main(String a[])
 {
  IShape s1=new Triangle();
  
  s1.calculate();
  s1=new Square();
  
  s1.calculate();
  s1=new Circle();
  s1.calculate();
  s1=new Rectangle();
  s1.calculate();
 }
}