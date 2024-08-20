class Fibnocci
{
  public static void main(String[] args)
  {
   int a=0,b=1,c=1,d=0;
   System.out.print(a+" "+b+" "+c+" ");
   for(int i=2;i<10;++i)
   {
    d=a+b+c;
    System.out.print(d+" ");
    a=b;
    b=c;
    c=d;
   }
  }
}