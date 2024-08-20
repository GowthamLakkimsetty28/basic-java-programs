class HollowIMRAT
{
 public static void main(String args[])
  {
   int rows=5;
   for (int i=1;i<=rows;i++) 
   {
    for (int j=1;j<=i;j++) 
    {
     System.out.print(" ");
    }
    for (int k =rows; k>=i; k-- ) 
    {
     if(i==1||i==k||k==rows)
     System.out.print("*");
     else
     System.out.print(" ");
    }
    System.out.println();
   }
 }
}