//12.
import java.util.*;
class Books
{
 String name,title;
 int price,pages;
 public void acceptData()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Author name");
  name=sc.next();
  System.out.println("Enter Title");
   title=sc.next();
  
  System.out.println("Enter the price");
 price=sc.nextInt();
  System.out.println("Enter number of pages");
  pages=sc.nextInt();
  }
  
}
class Hardware extends Books
 {
  public void acceptData()
  {
   super.acceptData();
 Scanner sc=new Scanner(System.in);
   System.out.println("Enter the harware category");
   String catg=sc.next();
   System.out.println("Enter the publisher");
   String publ=sc.next();
  }
}
  
class Software extends Books
 {
  public void acceptData()
  {
  super.acceptData();
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Software version");
   String version=sc.next();
   System.out.println("Enter the Software name");
   String softname=sc.next();
  }
} 
class BookMain
{
 
public static void main(String a[])
 {
  Books h1=new Hardware();
  h1.acceptData();
  h1=new Software();
  h1.acceptData();
 }
}