class Factorsofadigit
{
  public static void main (String[]args)
  {
    int num =10,num1=16,hcf=0,hcf1=0,start=1;
     while(start<=num1)
      {
     if (num%start== 0 && num1%start==0)
       {
        System.out.println(start);
        hcf=start;
       }
       start++;
     } 
    while(num>start)
      {
     if (num%start== 0 && num1%start==0)
       {
        System.out.println(start);
        hcf1=start;
       }
       start--;
     }
     System.out.println(hcf);
     System.out.println(hcf1);
       
  }
}