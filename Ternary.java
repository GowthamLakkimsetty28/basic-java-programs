class Ternary
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 20;
        int c = 15;

       String greatest = (a > b && a > c)?" a is greater":(b > a && b > c)?"b is greater":"c is greater";
           
        System.out.println(greatest);
      
    }
}
