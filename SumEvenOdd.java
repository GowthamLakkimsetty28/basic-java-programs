class SumEvenOdd
 {
   public static void main(String[] args) 
     {
        int start = 1,end = 100;
        int sumEven = 0,countEven = 0;
        int sumOdd = 0,countOdd = 0;

        int currentNumber = start;

        while (start<= end) 
        {
           if (start % 2 == 0) 
           {
                sumEven = sumEven+start;
                countEven++;
            }
           else
            {
                sumOdd = sumOdd+start;
                countOdd++;
            }
            start++;
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Number of even numbers: " + countEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
        System.out.println("Number of odd numbers: " + countOdd);

        int maxSum = (sumEven > sumOdd) ? sumEven : sumOdd;
        System.out.println("Maximum sum: " + maxSum);
    }
}
