//3.
import java.util.*;
class TrainReserv
{
 String name;
 int pnrnumber,trainno,personno;
 public void display()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your Name ");
  name=sc.next();
  System.out.println("Enter PNR Number");
  pnrnumber=sc.nextInt();
  System.out.println("Enter Train Number");
  trainno=sc.nextInt();
  System.out.println("Enter Number of persons travelling");
  personno=sc.nextInt();
  
  System.out.println("Name : "+name);
  System.out.println("PNR Number : "+pnrnumber);
  System.out.println("Train Number : "+trainno);
  System.out.println("Total no. of Persons : "+personno);
 }
 public static void main(String a[])
 {
  TrainReserv tr=new TrainReserv();
  tr.display();
 }
}