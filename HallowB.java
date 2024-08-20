class HallowB
{
 public static void main(String []args)
{
int rows=5;
   for(int i=1;i<=rows;i++)
   {
    for(int j=rows;j>=i;j--)
    {
     if(i==1||i==j||j==rows)
     System.out.print("* ");
     else
     System.out.print("  ");
    }
    System.out.println();
   }
   for(int i=1;i<=rows;i++)
   {
    for(int j=1;j<=i;j++)
    {
     if(j==1||i==j||i==rows)
     System.out.print("* ");
     else
     System.out.print("  ");
    }
    System.out.println();
   }
 }
}
