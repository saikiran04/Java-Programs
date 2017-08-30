//2.
import java.util.*;
class Volume
{
 public void calculate()
 {
  int r,h;
  double volume;
  float p=3.14f;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Radius of the Cylinder ");
  r=sc.nextInt();
  System.out.println("Enter Height of the Cylinder ");
  h=sc.nextInt();
  
  volume=p*r*r*h;
  System.out.println("The volume of the Cylinder is "+volume);
  }
 public static void main(String a[])
 {
  Volume v=new Volume();
  v.calculate();
 }
}