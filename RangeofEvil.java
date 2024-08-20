import java.util.Scanner;

class EvilNumberInRange {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the starting number of the range: ");
        int start = s.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int end = s.nextInt();

        for (int i = start; i <= end; i++) {
            int n = i;
            int count = 0;
            while (n > 0) {
                if ((n & 1) == 1) { 
                    count++;
                }
                n = n > 1; 
            }
            if (count % 2 == 0) {
                System.out.println(i + " is an Evil Number");
            } else {
                System.out.println(i + " is Not an Evil Number");
            }
        }
    }
}
