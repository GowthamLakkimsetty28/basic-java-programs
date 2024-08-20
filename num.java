class num
{
 public static void main (String args[])
  {
   int n=100;
     if(n/10>=1&&n/10<=9)
    {
     System.out.println("2 digit number");
    }
   else if(n/100>=1&&n/100<=9)
    {
     System.out.println("3 digit number");
    }
    else{
     System.out.println("another digit number");
    }
       
  }
}