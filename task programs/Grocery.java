//10.
import java.util.*;
class Grocery
{
  float weight,total;
  
  public void addWeight(float weight)
 {
   
    this.weight=this.weight+weight;
    
 }

   public void removeWeight(float weight)
 {
    
    this.weight=this.weight-weight;
    
 }
  public void displayWeight()
 {
  System.out.println("The weight is "+weight);
 }
 public static void main(String a[])
 {
  float wt;
  Grocery g1=new Grocery();
  Scanner sc=new Scanner(System.in);
 
  System.out.println("Enter weight of the grocery");
  g1.weight=sc.nextFloat();
  System.out.println("Enter the weight to be added");
  wt=sc.nextFloat();
  g1.addWeight(wt);
  System.out.println("Enter the weight to be removed");
  wt=sc.nextFloat();
  g1.removeWeight(wt);
  
  g1.displayWeight();
 }
}