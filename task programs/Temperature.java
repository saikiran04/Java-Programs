//7.
import java.util.*;
class Temperature
{
 public void calculate()
 {
  int f,c;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the temperature in celsius");
  c=sc.nextInt();
  
  f=(c*(9/5))+32;
  System.out.println("The temperature in Fahrenheit : "+f);
  }
 public static void main(String a[])
 {
  Temperature t=new Temperature();
  t.calculate();
  }
 }
  