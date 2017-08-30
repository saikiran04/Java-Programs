//1.
import java.util.*;
class Distance
{
 public void calculate()
 {
  int u,t,a,distance;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Initial velocity in m/s ");
  u=sc.nextInt();
  System.out.println("Enter time taken in sec ");
  t=sc.nextInt();
  System.out.println("Enter acceleration in m/s2 ");
  a=sc.nextInt();
  
  
  distance=(u*t)+((a*t*t)/2);
  System.out.println("Distance travelled by Jhon is "+distance+"m");
 }
 public static void main(String a[])
 {
  Distance d=new Distance();
  d.calculate();
 }
}