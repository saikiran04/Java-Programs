//5.
class NumericPattern
{
int i,j;
	public void displayData()
	{
	
 for(i=5;i>=1;i--)
  {
   for(j=i;j>=1;j--)
   { 
    System.out.print(j);
  
     }
  System.out.println();
  }
}

 public static void main(String a[])
 { 
  NumericPattern ns=new NumericPattern();
  ns.displayData();
 }
}