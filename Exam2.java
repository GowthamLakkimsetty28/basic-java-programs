class Exam2 
{
 public static void main(String[] args) 
  {
   System.out.println("Armstrong numbers between 1 and 100 are:");
   for (int num = 1; num <= 100; num++) 
       {
            if (isArmstrong(num)) 
            {
                System.out.println(num + " is an Armstrong number");
            }
        }
    }
    public static boolean isArmstrong(int num) 
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
        return temp == sum;
    }
}
output:
Armstrong numbers between 1 and 100 are:
1 is an Armstrong number
2 is an Armstrong number
3 is an Armstrong number
4 is an Armstrong number
5 is an Armstrong number
6 is an Armstrong number
7 is an Armstrong number
8 is an Armstrong number
9 is an Armstrong number

