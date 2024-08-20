class Twistedprime
{
 public static void main(String args[])
   {
    int num=151,reverse=0,result=0,temp=num,start=1,count=0;
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
    else
     {
      System.out.println(" not a palindrome");
     } 
    num=reverse;
    System.out.println(reverse);
    while(start<=reverse) 
    {
      if(reverse%start==0) 
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
      System.out.println(" not a prime");
     } 
     if(num==reverse && count==2)
     {
      System.out.println("twisted prime");
     }
     else{
            System.out.println("not twisted");
	}
  }
}