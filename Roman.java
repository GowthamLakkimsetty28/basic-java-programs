class Roman
{
 public static void main(String args[])
   {
    Student obj=new Student();//method declaration
     obj.rev();//method call
   }
}
 class Student//2nd class
   {
    void rev()// method implementation
     {
    int num=1756,rev=0,temp=num;
     while(num>0)
     {
      int rem=num%10;
      rev=rev*10+rem;
      num=num/10;
     }
     System.out.println(rev);
     temp=rev;
     for(;temp>0;temp/=10)
     {
       int rem=temp%10;
     switch(rem)
     {
      case 1:
      System.out.println("I");
      break;
      case 2:
      System.out.println("II");
      break;
      case 3:
      System.out.println("III");
      break;
      case 4:
      System.out.println("IV");
      break;
      case 5:
      System.out.println("V");
      break;
      case 6:
      System.out.println("VI");
      break;
      case 7:
      System.out.println("VII");
      break;
      case 8:
      System.out.println("VIII");
      break;
      case 9:
      System.out.println("IX");
      break;
      default:
      System.out.println("invalid");
     
     }
    } 
  }
 }
