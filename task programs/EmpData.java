//9.
import java.util.*;
class EmpData
{
 public void acceptData()
 {
  System.out.println("Accept the Data");
 }
 public void displayData()
 {
  System.out.println("Display the Data");
 } 



public static void main(String a[])
{
 EmpData p1=new EmpData();
 String ch,ans;
 Scanner sc=new Scanner(System.in);
 
System.out.println("---------Menu----------");
System.out.println("1.Accept data");
System.out.println("2.Display data");
System.out.println("3.Exit");

 ch=sc.next();
 switch(ch)
 {
  case "1":
  {
   p1.acceptData();
   break;
  }
 case "2":
  {
   p1.displayData();
   break;
  }
 case "3":
   {
    System.exit(0);
    break;
   }
 default:System.out.println("Invalid choice");
 }
 
 
}
}