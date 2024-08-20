class HCF
{
  public static void main (String[]args)
  {
    int num1 = 10, num2 = 16,hcf=0,start=1,start1=1;
      while(start<=num1)
      {
       if (num1 %start == 0 && num2 % start== 0)
        {
         System.out.print(start+"  ");
        }
       start++;
      }
      while(start1<=num1 || start1<=num2)
      {
     if (num1 %start1 == 0 && num2 % start1== 0)
        hcf =start1;
        start1++;
      }

    System.out.println("The HCF: "+ hcf);
       
  }
}