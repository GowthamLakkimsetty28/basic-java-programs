class Armstrong
{
  public static void main(String[] args)
   {
     int num=1496,sum=0,count=0,power=0,temp=sum;
      for(;num>0;)
      {
       count++;
       num=num/10;
      }
      num=temp;
      for(;num>0;)
      {
       int rem=num%10;
       System.out.println(rem);
       power=(int)Math.pow(rem,count);
       sum=sum+power;
       num=num/10;
      }
      System.out.println(temp==sum?"Armstrong":"not a armstrong");
  }
 
}