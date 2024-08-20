import java.util.Scanner;

class BusyNumberInRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the starting number of the range: ");
        int start = s.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int end = s.nextInt();

        for (int number = start; number <= end; number++) {
            int lastDigit = number % 10;

            if (lastDigit == 7) {
                System.out.println(number + " is a Busy number.");
            } else {
                int remainder = number % 7;
                if (remainder == 0) {
                    System.out.println(number + " is a Busy number.");
                } else {
                    System.out.println(number + " is not Busy.");
                }
            }
        }
    }
}
