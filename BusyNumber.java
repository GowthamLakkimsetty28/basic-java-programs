class BusyNumber
 {
  public static void main(String[] args)
   {
     int number = 427;
     int lastDigit = number % 10;
        
      if (lastDigit == 7)
        {
            System.out.println("Busy number");
        } 
     else 
        {
         int remainder = number % 7;
         if (remainder == 0) 
           {
          System.out.println("Busy number");
            }
           else 
            {
              System.out.println("Not busy");
            }
        }
    }
}
