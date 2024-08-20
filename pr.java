class pr
{
 public static void main(String args[])
  {
   int start=151,end=161,rev=0,result=0,temp=start;
    for(;start<=end;start++)
     {
      for(int x=start;x<=end;start=start/10)
      {
       result=start%10;
       rev=rev*10+result;
       
       }
      if(temp==rev)
       {

       System.out.println("palindrome");
       }
  else
       {
       System.out.println(" not palindrome");
       }
}
}
}
       
      
   