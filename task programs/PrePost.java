//Prefix and Postfix
class PrePost
{
 public void display()
 { 
   int i=5,j,k;
   j=i++;
  System.out.println("Post fix value: "+j);
   
   k=++j;
    System.out.println("Pre fix value: "+k);
  }
 public static void main(String args[])
 {
  PrePost pp=new PrePost();
  pp.display();
 }
}