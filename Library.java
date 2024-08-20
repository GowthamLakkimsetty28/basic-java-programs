class Library
{
 public static void main(String[] args) 
 {
  int daysLate = 10;
  double fine = 0.0;
    if (daysLate > 30) 
    {
     System.out.println("Your membership is cancelled.");
    } 
    else if (daysLate > 10) 
    {
     fine = 5 * 0.50 + 5 * 1 + (daysLate - 10) * 5;
     System.out.println("The fine is: Rs. " + fine);
    } 
    else if (daysLate > 5) 
    {
     fine = 5 * 0.50 + (daysLate - 5) * 1;
     System.out.println("The fine is: Rs. " + fine);
    }
    else if (daysLate > 0) 
    {
     fine = daysLate * 0.50; 
     System.out.println("The fine is: Rs. " + fine);
    } 
    else {
            System.out.println("No fine.");
         }
  }
}
