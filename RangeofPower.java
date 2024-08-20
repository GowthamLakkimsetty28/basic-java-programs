import java.util.Scanner;

class PowerNumberInRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the starting number of the range: ");
        int start = s.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int end = s.nextInt();

        for (int num = start; num <= end; num++) {
            int sum = 0;
            int product = 1;
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                product *= digit;
                temp /= 10;
            }

            if (sum == product) {
                System.out.println(num + " is a power number.");
            } else {
                System.out.println(num + " is not a power number.");
            }
        }
    }
}
