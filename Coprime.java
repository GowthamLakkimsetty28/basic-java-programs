import java.util.Scanner;

class Coprime
{
 public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        int gcd=0;
        for (int i = 1; i <= firstNumber && i <= secondNumber; i++) 
        {
            if (firstNumber % i == 0 && secondNumber % i == 0) 
            {
                gcd = i;
            }
        }

        if (gcd == 1) 
        {
            System.out.println("(" + firstNumber + " & " + secondNumber + ") are Co-Prime numbers");
        } 
        else 
        {
            System.out.println("(" + firstNumber + " & " + secondNumber + ") are not Co-prime numbers");
        }
    }
}
