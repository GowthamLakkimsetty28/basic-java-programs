import java.util.Scanner;

class Even2odd1
{
  public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        
        int numberchange = 0,place = 1,even=0,odd=0,total=0;

        while(number>0)
           {
            int digit = number % 10;
            if (digit % 2 == 0) 
            {
                digit=digit+2;
                even=even+digit;
            } 
           else
            {
                digit=digit+1;
                odd=odd+digit;
            }
            numberchange= numberchange + digit * place;
            place =place*10;
            number=number/10;
            total=even+odd;
            
        }

        System.out.println(numberchange);
        System.out.println("sum of even digits:"+even);
        System.out.println("sum of odd digits:"+odd);
        System.out.println("total:"+total);
        
    }
}
