class No_else
{
 public static void main(String args[])
  {
   int a=30,b=100,c=10;
   if(a>b)
   {
    int d=a;
    a=b;
    b=d;
   }
   if(a>c)
   {
   int d=a;
   a=c;
   c=d;
   }
   if(b>c)
   {
   int d=b;
   b=c;
   c=d;
   }
   System.out.println("a:"+a);
   System.out.println("b:"+b);
   System.out.println("c:"+c);
  }
}
 