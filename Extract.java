class Extract
{
  public static void main(String args[])
  {
   int n=123,a=0,b=0;
   a=n%100;
   b=a;

   if(b%3==0)
    {
    System.out.println("multiple of 3");
    }
  else if(b%5==0)
   {
    System.out.println("multiple of 5");
   }
   else
   {
    System.out.println("not a multiple of 3 and 5");
   }
  }
}