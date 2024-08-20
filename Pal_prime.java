class Pal_prime
{
  public static void main(String args[])
     {
       int num=11,reverse=0,result=0,temp=num,start=1,count=0;
        while(num>0)
        {
         result=num%10;
         reverse=reverse*10+result;
	 num=num/10;
        }
		
	if(temp==reverse)
        {
        System.out.println("palindrome");
        }
	num=temp;
	while(start<=num) 
        {
          if(num%start==0) 
          {
	   count++;
	  }
	  start++;
	}
	
	if(count==2) 
        {
	System.out.println("prime");
	}
	if(temp==num)
        {
         System.out.println("palprime");
	}
    }
}