//17.
import java.util.*;
class Math
{
 public void calculate()
 {
  int i,j,k,l;
  Scanner sc=new Scanner(System.in);
  System.out.println("1.Addition");
System.out.println("2. Substraction");
System.out.println("3. Multiplication");
System.out.println("4. Division");
 k=sc.nextInt();
  switch(k)
  {
  case 1:System.out.println("Enter first number");
         i=sc.nextInt();
         System.out.println("Enter second number");
         j=sc.nextInt();
         assert(i>=0 && i<=10):"The number is not with in the range";
         assert(j>=0 && j<=10):"The number is not with in the range";
            l=i+j;
         System.out.println("The sum is "+l);
         break;
  case 2:System.out.println("Enter first number");
         i=sc.nextInt();
         System.out.println("Enter second number");
         j=sc.nextInt();
         assert(i>=0 && i<=10):"The number is not with in the range";
         assert(j>=0 && j<=10):"The number is not with in the range";
            l=i-j;
         System.out.println("The value is "+l);
          break;
  case 3:System.out.println("Enter first number");
         i=sc.nextInt();
         System.out.println("Enter second number");
         j=sc.nextInt();
         assert(i>=0 && i<=10):"The number is not with in the range";
         assert(j>=0 && j<=10):"The number is not with in the range";
            l=i*j;
         System.out.println("The value is "+l);
         break;
  case 4:System.out.println("Enter first number");
         i=sc.nextInt();
         System.out.println("Enter second number");
         j=sc.nextInt();
         assert(i>=0 && i<=10):"The number is not with in the range";
         assert(j>=0 && j<=10):"The number is not with in the range";
            l=i/j;
         System.out.println("The value is "+l);
          break;
     
  default:System.out.println("Invalid choice");
   break;
 }
}
public static void main(String a[])
 {
  Math m=new Math();
  m.calculate();
 }
}