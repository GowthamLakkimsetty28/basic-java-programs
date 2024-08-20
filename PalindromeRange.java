class PalindromeRange 
{
 public static void main(String[] args)
 {
  for(int x=1;x<=100;x++)
  {
   int rev=0,temp=x;
   for(int start=1;temp>0;temp/=10)
   {
    int rem=temp%10;
    rev=rev*10+rem;
   }
    if(rev==x)
    System.out.println(x+" is palindrome number");
  }

 }
}