class HollowComborat
{
 public static void main(String args[])
  {
    int rows=5;
   for(int i=1;i<=rows;i++)
   {
    for(int j=1;j<=i;j++)
    {
      if(i==j||j==1)
     System.out.print("* ");
     else
     System.out.print(" "); 
    }
    System.out.println();
   }

   for(int i=1;i<=rows;i++)
   {
    for(int j=rows;j>i;j--)
    {
     if(j==rows||i==j)
     System.out.print("* ");
     else
     System.out.print(" ");
    }
    System.out.println();
   }
  }
}