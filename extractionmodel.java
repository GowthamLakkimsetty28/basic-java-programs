class Extractionmodel
{
  public static void main(String[] args)
   {
     int num=1496,sum=0,count=0;
      while(num>0)
      {
       int rem=num%10;
       System.out.println(rem);
       num=num/10;
       sum=sum+rem;
       count++;
      }
      System.out.println(sum);
      System.out.println(count);
      System.out.println(count==sum?"equal":"notequal");
  }
 
}