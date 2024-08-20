import java.util.Scanner;

class TechnologyNumberInRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the starting number of the range: ");
        int start = s.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int end = s.nextInt();

        for (int num = start; num <= end; num++) {
            int numOfDigits = 0;
            int temp = num;

            // Calculate the number of digits in the number
            while (temp > 0) {
                numOfDigits++;
                temp /= 10;
            }

            // Check if the number of digits is even
            if (numOfDigits % 2 != 0) {
                System.out.println(num + " is not a technology number.");
                continue;
            }

            int divider = (int) Math.pow(10, numOfDigits / 2);
            int num1 = num / divider;    // First half
            int num2 = num % divider;    // Second half

            int sum = num1 + num2;
            int square = sum * sum;

            if (square == num) {
                System.out.println(num + " is a technology number.");
            } else {
                System.out.println(num + " is not a technology number.");
            }
        }
    }
}
