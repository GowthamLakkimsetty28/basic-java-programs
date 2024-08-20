class Cap_to_small
{
  public static void main(String args[])
  {
   char c='B';
   if(c>='A'&& c<='Z')
   {
    System.out.println("capital");
   }
   else if(c>='a'&& c<='z')
   {
    System.out.println("small");
   }
   else if(c>='0'&& c<='9')
   {
    System.out.println("digit");
   }
   else if(c==' ')
   {
    System.out.println("space");
   }
   else
   {
    System.out.println("Symbol");
   }
  }
}