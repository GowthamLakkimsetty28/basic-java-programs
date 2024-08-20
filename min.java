import java.util.Scanner; 
class First 
{
  public static void main(String[] args)
 {
   int a = 10;
   int b = 20;
   int c = 5;
   int min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);

   System.out.println("The minimum value is: " + min);
    }
}

class Second
{
  public static void main(String[] args) 
   {
    int n = 10;
    printFibonacciSeries(n);
   }
 
    public static void printFibonacciSeries(int n) 
     {
        int a = 0, b = 1;
        System.out.print("First " + n + " terms of Fibonacci series: ");
           for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
class Third
{
  public static void main(String[] args) 
   {
     int number = 12345;
     String numStr = Integer.toString(number);
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < numStr.length() - 1; i++) {
            if (numStr.charAt(i) > numStr.charAt(i + 1)) {
                isIncreasing = false;
            }
            if (numStr.charAt(i) < numStr.charAt(i + 1)) {
                isDecreasing = false;
            }
        }

        if (isIncreasing) {
            System.out.println(number + " is an increasing number.");
        } else if (isDecreasing) {
            System.out.println(number + " is a decreasing number.");
        } else {
            System.out.println(number + " no increasing and decreasing.");
        }
    }
}
class Fourth
{
  public static void main(String[] args)
   {
     int start = 10;
     int end = 50;
     System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) 
        {
          if (isPrime(i))
           {
            System.out.print(i + " ");
           }
        }
    }
    public static boolean isPrime(int num)
      {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
           {
            if (num % i == 0) 
             {
                return false;
             }
          }
        return true;
    }
}
 class Fifth 
{
    public static void main(String[] args)
      {
        int[] a = {3, 2, 1, 4};
        int n = a.length;
        int[] output = new int[n];
        int left = 1;
        for (int i = 0; i < n; i++) {
            output[i] = left;
            left *= a[i];
        }
        int right= 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= right;
            right *= a[i];
        }
        System.out.print("Output: ");
        for (int i = 0; i < n; i++) {
            System.out.print(output[i] + " ");
        }
    }
}

class Sixth 
{
 public static void main(String[] args)
 {
   int[] array = {1, 2, 3, 2, 3, 4, 3, 3, 5, 1};
   int maxFrequency = 0,element=0;
        for (int i = 0; i < array.length; i++) 
           {
            int count = 0;
            for (int j = 0; j < array.length; j++) 
               {
                if (array[i] == array[j])
                {
                    count++;
                   
                }
  
            }
            if (count > maxFrequency)
            {
                maxFrequency = count;
                 element=array[i];
            }
      
        }
         
        System.out.println("The maximum repeated element frequency of element is: "+element+" " + maxFrequency);
    }
}
 class Seventh
 {
    public static void main(String[] args)
     {
        String input = "hello all good morning";
        String output = transformString(input);
        System.out.println(output);
    }

    public static String transformString(String input) {
        char[] ch = input.toCharArray();
        boolean W = false;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
                if (!W)
                    {
                    W = true;
                    if (ch[i] >= 'a' && ch[i] <= 'z') {
                        ch[i] = (char) (ch[i] - 32);
                    }
                }
            } else {
                if (W) {
                    W = false;
                }
            }
            if (W && (i + 1 == ch.length || ch[i + 1] == ' '))
               {
                if (ch[i] >= 'a' && ch[i] <= 'z') 
                {
                    ch[i] = (char) (ch[i] - 32);
                }
            }
        }
        
        return new String(ch);
    }
}

class Eighth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input string:");
        String input = sc.nextLine();
        String[] words = input.split("++ ");
        boolean[] printed = new boolean[words.length];
        for (int i = 0; i < words.length; i++) {
            if (!printed[i]) {
                int count = 0;
                for (int j = 0; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                    }
                }
                if (count == 1) {
                    System.out.print(words[i] + " ");
                    printed[i] = true; 
                }
            }
        }
        System.out.println();

        sc.close();
    }
}

class Nineth1 
{
    public static void main(String[] args)
   {
        MathOperations math = new MathOperations();

        System.out.println("Sum of 2 and 3: " + math.add(2, 3));
        System.out.println("Sum of 1, 2, and 3: " + math.add(1, 2, 3)); 
        System.out.println("Sum of 2.5 and 3.5: " + math.add(2.5, 3.5));
    }
}

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
}
 class Nineth2 
{
    public static void main(String[] args) {
        Animal myAnimal;
        myAnimal = new Dog();
        myAnimal.makeSound();
        myAnimal = new Cat();
        myAnimal.makeSound();
    }
}
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

class Tenth
{
public static void main (String[] args) throws InsufficientBalanceException
{
Scanner sc=new Scanner(System.in);
System.out.println("ENTER CURRENT BALANCE AMOUNT");
int currentbalance=sc.nextInt();
System.out.println("ENTER WITHDRAW AMOUNT");
int required=sc.nextInt();
withDraw(currentbalance,required);
}
public static void withDraw(int currentbalance,int required) throws InsufficientBalanceException
{
if(currentbalance >= required)
{
currentbalance=currentbalance-required;
System.out.println(currentbalance);
}
else
throw new InsufficientBalanceException("lNSUFFlClENT BALANCE");
}
}
 class InsufficientBalanceException extends RuntimeException
{
public InsufficientBalanceException(String str)
{
  super(str);
}
}
class Eleventh
{
  public static void main(String args[])
  {
  String s1="Hello all Good Morning";
   Set<Character> s=new LinkedHashSet<>();
   for(int x=0;x<s1.length();x++)
    {
     s.add(s1.charAt(x));
    }
     for(char temp: s)
     System.out.print(temp);
  }
}
class twelveth
{
public static void main(String args[])
  {
   int rows=5;
   for (int i=1;i<=rows;i++) 
   {
    for (int j=1;j<=i;j++) 
    {
     System.out.print(" ");
    }
    for (int k =rows; k>=i; k-- ) 
    {
     System.out.print(k+"");
    }
    System.out.println();
   }
 }
}


















