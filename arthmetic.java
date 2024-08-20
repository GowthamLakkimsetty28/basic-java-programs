class Main
{
 public static void main(String []args)
  {
    char ch='+';
    int a=10,b=20,c=0;

    switch(a)
     {
       case '+':
       c=a+b;
       System.out.println(c);
       break;
 
       case '-':
       c=a-b;
       System.out.println(c);
       break;
  
       case '*':
       c=a*b;
       System.out.println(c);
       break;

       case '/':
       c=a/b;
       System.out.println(c);
       break;

       case '%':
       c=a%b;
       System.out.println(c);
       break;
 
       default:
        System.out.println("Invalid");
       
     }
   System.out.println(c);
  }
}
     
        
    