class PowerNumber {
    public static void main(String[] args) {
        int num = 132;
        int sum = 0;
        int product = 1;
        int temp=num;
        
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
