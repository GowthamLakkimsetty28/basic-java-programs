class Insurance
{
 public static void main(String[] args) 
  {
   String health = "excellent";          
   int age = 30;                
   String location = "city";
   String gender = "male";               
   boolean isInsured = false;
   int premiumRate = 0;
   int maxPolicyAmount = 0;

     if (health=="excellent") 
     {
      if (age >= 25 && age <= 35)
      {
       if (location=="city") 
       {
        if (gender=="male") 
        {
         isInsured = true;
         premiumRate = 4; 
         maxPolicyAmount = 200000;
        } 
        else if (gender=="female") 
        {
         isInsured = true;
         premiumRate = 3;
         maxPolicyAmount = 100000;
        }
      }
     }
    } 
    else if (health=="poor")
    {
     if (age >= 25 && age <= 35) 
     {
      if (location=="village")
      {
       if (gender=="male") 
       {
        isInsured = true;
        premiumRate = 6; 
        maxPolicyAmount = 10000; 
       }
      }
     }
   }
   if (isInsured) 
   {
    System.out.println("The person is insured.");
    System.out.println("Premium rate: Rs. " + premiumRate + " per thousand");
    System.out.println("Maximum policy amount: Rs. " + maxPolicyAmount);
   }
   else 
   {
    System.out.println("The person is not insured.");
   }
  }
}
