class prime
{
  public static void main(String args[])
     {
       int num1=11,start=1,count=0,num2=19;
       while(start<=num1) 
        {
          if(num1%start==0) 
          {
	   count++;
	  }
	  start++;
	}
        if(count==2) 
        {
	System.out.println("prime");
	}
        else
        {
         System.out.println("not a prime");
        }
       while(start<=num2) 
        {
          if(num2%start==0) 
          {
	   count++;
	  }
	  start++;
	}
	
	if(count==2) 
        {
	System.out.println("prime");
	}
        else
        {
         System.out.println("not a prime");
        }

     }
}