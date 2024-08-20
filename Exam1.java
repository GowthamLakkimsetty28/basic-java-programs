 class Exam1 
{
 public static void main(String[] args) 
  {
    printArmstrongNumbers();
  }

    public static void printArmstrongNumbers() 
     {
        for (int num = 1; num <= 100; num++) 
          {
            int sum = 0, count = 0, temp = num;
            for (int n = temp; n > 0; n /= 10)
            {
                count++;
            }
            for (int n = temp; n > 0; n /= 10) 
            {
                int rem = n % 10;
                sum += Math.pow(rem, count);
            }
            if (temp == sum) 
            {
                System.out.println(temp + " is an Armstrong number");
            }
        }
    }
}
