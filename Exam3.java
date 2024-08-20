class Exam2
{
    public static int currentNumber = 1;
    public static void main(String[] args) 
      {
        System.out.println("Armstrong numbers between 1 and 100 are:");
        for (currentNumber = 1; currentNumber <= 100; currentNumber++)
        {
            if (isArmstrong()) 
            {
                System.out.println(currentNumber + " is an Armstrong number");
            }
        }
     }
    public static boolean isArmstrong() {
        int sum = 0, count = 0, temp = currentNumber;

        // Calculate the number of digits
        for (int n = temp; n > 0; n /= 10) {
            count++;
        }

        // Calculate the Armstrong sum
        for (int n = temp; n > 0; n /= 10) {
            int rem = n % 10;
            sum += Math.pow(rem, count);
        }
        return temp == sum;
    }
}
