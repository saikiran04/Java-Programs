//8.
import java.util.*;
class VowelCon
{
 char ch;
 public void check()
 {
  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter any Character");
  ch=sc.next().charAt(0);
  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
  {
   System.out.println("It is a Vowel");
  }
 else 
 {
  System.out.println("It is a Consonant");
 }
}
public static void main(String a[])
{ 
 VowelCon vc=new VowelCon();
 vc.check();
 }
}