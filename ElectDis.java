import java.util.Scanner;

class ElectDis
{
    public static void main(String args[]) 
     {
        Scanner s= new Scanner(System.in);
        
        System.out.println("Welcome to ABC Store");
        System.out.print("Your name: ");
        String name = s.nextLine();
        System.out.print("Your gender (male/female): ");
        String gender = s.next();
   
        if (gender.equals("male")) 
        {
            System.out.println("Welcome Mr. " + name);
        }
        else 
        {
            System.out.println("Welcome Miss/Mrs. " + name);
        }
        
        // Available products
        System.out.println("Available products are\n1.Laptop\n2.Mobiles\n3.TV\n4.AC\n5.Washing Machine");
        int DELL_LAPTOP_PRICE = 50000;
        int HP_LAPTOP_PRICE = 55000;
        int ASUS_LAPTOP_PRICE = 60000;
        int MOBILE_PRICE = 15000;
        int TV_PRICE = 25000;
        int AC_PRICE = 45000;
        int WM_PRICE = 30000;
        int totalPrice = 0;
        
        char decision=' ';
        do 
         {
            System.out.print("Enter a number (1 to 5) to choose a product: ");
            int productChoice = s.nextInt();
            int quantity = 0;
            String brand = "";
           
            switch (productChoice) {
                case 1:
                    System.out.println("You chose Laptop.");
                    System.out.println("Available brands are:");
                    System.out.println("1. Dell @ " + DELL_LAPTOP_PRICE + " each");
                    System.out.println("2. HP @ " + HP_LAPTOP_PRICE + " each");
                    System.out.println("3. ASUS @ " + ASUS_LAPTOP_PRICE + " each");
                    System.out.print("Choose a brand (1-3): ");
                    int brandChoice = s.nextInt();
                    switch (brandChoice) {
                        case 1:
                            brand = "Dell";
                            System.out.print("Enter the quantity: ");
                            quantity = s.nextInt();
                            totalPrice += quantity * DELL_LAPTOP_PRICE;
                            break;
                        case 2:
                            brand = "HP";
                            System.out.print("Enter the quantity: ");
                            quantity = s.nextInt();
                            totalPrice += quantity * HP_LAPTOP_PRICE;
                            break;
                        case 3:
                            brand = "ASUS";
                            System.out.print("Enter the quantity: ");
                            quantity = s.nextInt();
                            totalPrice += quantity * ASUS_LAPTOP_PRICE;
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("You chose Mobiles.");
                    System.out.pr+`int("Enter the quantity: ");
                    quantity = s.nextInt();
                    totalPrice += quantity * MOBILE_PRICE;
                    break;
                case 3:
                    System.out.println("You chose TV.");
                    System.out.print("Enter the quantity: ");
                    quantity = s.nextInt();
                    totalPrice += quantity * TV_PRICE;
                    break;
                case 4:
                    System.out.println("You chose AC.");
                    System.out.print("Enter the quantity: ");
                    quantity = s.nextInt();
                    totalPrice += quantity * AC_PRICE;
                    break;
                case 5:
                    System.out.println("You chose Washing Machine.");
                    System.out.print("Enter the quantity: ");
                    quantity = s.nextInt();
                    totalPrice += quantity * WM_PRICE;
                  break;
                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 5.");
                    continue;
            }
            
           
            System.out.print("Enter 'y' to continue shopping or 'n' to exit: ");
            decision = s.next().charAt(0);
            
            if (decision == 'n' || decision == 'N') 
            {
                // Apply discounts
                if (totalPrice > 100000)
                {
                    System.out.println("You are eligible for a 10% discount.");
                    totalPrice *= 0.90;
                }
                System.out.println("Please review your order:");
                System.out.println("Total price (after discount if any): " + totalPrice);
                System.out.print("Do you want to confirm the purchase? (yes/no): ");
                String confirmation = s.next();
                
                if (confirmation.equals("yes"))
                  {
                    System.out.println("Customer: " + name);
                    System.out.println("Gender: " + gender);
                    System.out.println("Items Purchased:");
                    System.out.println("Total Amount: " + totalPrice);
                    System.out.println("Thank you for shopping with us! Visit again.");
                  }
               else 
                 {
                    System.out.println("Order cancelled. Thank you for visiting ABC Store.");
                 }
                
                break;
            }
        } while (decision == 'y' || decision == 'Y');
        
    
    }
}
