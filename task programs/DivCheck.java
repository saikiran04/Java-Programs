//14.
import java.util.*;
class DivCheck
{
  public void check()
 { 
  int i,j;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter First number");
  i=sc.nextInt();
  System.out.println("Enter second number");
  j=sc.nextInt();
  
  if(i%j==0)
  {
    System.out.println(+i+" is divisible by "+j);
  }
  else
  {
    System.out.println(+i+" is not divisible by "+j);
  }
 }
public static void main(String a[])
 {
  DivCheck dc=new DivCheck();
  dc.check();
 }
}