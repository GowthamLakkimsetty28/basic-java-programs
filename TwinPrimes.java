class TwinPrimes 
{
  public static void main(String[] args)
   {
        int num1 = 17; // First number
        int num2 = 19; // Second number
        int TwinPrimes = 0;
        for (int i = 2; i <= num1 / 2; i++) 
        {
            if (num1 % i == 0) 
            {
                break;
            } 
            else if (i == num1 / 2) 
            {
             for (int j = 2; j <= num2 / 2; j++)
                  {
                    if (num2 % j == 0) 
                    {
                        break;
                    } 
                    else if (j == num2 / 2 && num1 - num2 == 2) 
                    {
                        isTwinPrimes = 1;
                    }
                }
            }
        }
        if (TwinPrimes == 1) 
        {
            System.out.println("The numbers " + num1 + " and " + num2 + " are twin primes.");
        } 
       else 
        {
            System.out.println("The numbers " + num1 + " and " + num2 + " are not twin primes.");
        }
    }
}
