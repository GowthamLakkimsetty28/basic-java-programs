import java.util.Scanner;
class Digitoperations 
 {
    public static void main(String[] args) 
     {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        
        int Even=0,Odd=1;
         while (number>0) 
          {
            int digit = number % 10;//
            if (digit % 2 == 0)
            {
                Even =Even+digit;
            } 
            else 
            {
                Odd =Odd*digit;
                
            }
            number=number/10;
         }

        System.out.println("Sum of even digits: " +Even);
        System.out.println("Product of odd digits: " +Odd);
    }
}
