import java.util.Scanner;

class AutomaticNumberInRange {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the starting number of the range: ");
        int start = s.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int end = s.nextInt();

        for (int num = start; num <= end; num++) {
            int count = 0;
            int square = num * num;
            int temp = num;

            while (temp > 0) {
                count++;
                temp = temp / 10;
            }

            int lastDigit = (int) (square % (Math.pow(10, count)));
            if (num == lastDigit) {
                System.out.println(num + " is an automorphic number.");
            } else {
                System.out.println(num + " is not an automorphic number.");
            }
        }
    }
}
