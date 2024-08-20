class Main
{
  public static void main(String args[])
   {
     int age=20;
     double TicketPrice=100;
     double price=0;
     double discount=0;
     if(age>0 && age<=5)
     {
      System.out.println("free");
     }
     else if(age>=6 && age<=10)
     { 
      price=(TicketPrice)/2;
     }
     else if(age>11 && age<50)
     {
      discount=0.10*TicketPrice;
      price=Ticketprice + discount;
     }
     else if(age>50)
     {
      discount=0.30*TicketPrice;
      price=Ticketprice + discount;
     }
     else 
     {
      System.out.println("enter valid input");
     }
    System.out.println(
      
     