class ProductApplication 
{
 public static void main(String[] args) 
  {
   String productName = "Smartphone";
   double price = 699.99;
   int Quantity = 100;
   boolean isAvailable = true;
   char productCategory = 'E';
   long productCode = 1234567890L;
   float weight = 0.2f;
   short warrantyPeriodMonths = 12;
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Stock Quantity: " + Quantity);
        System.out.println("Availability: " + isAvailable);
        System.out.println("Product Category: " + productCategory);
        System.out.println("Product Code: " + productCode);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Warranty Period: " + warrantyPeriodMonths + " months");
    }
}
