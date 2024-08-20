import java.util.Scanner;

class EvilNumber
{
 public static void main(String args[]) 
  {
   Scanner s= new Scanner(System.in);
   System.out.print("Enter a number: ");
   int n = s.nextInt();
   int count = 0,p = 0,temp = 0;
   while (n > 0)
   {
    int d = n % 2;
    if (d == 1)
    count++;
    temp=(int)(d * Math.pow(10,count));
    count++;
    n=n/2;
   }
    if (count % 2 == 0)
            System.out.println("Output: Evil Number");
    else
            System.out.println("Output: Not an Evil Number");
  }
}