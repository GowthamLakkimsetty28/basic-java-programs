class ProfitLoss 
{
 public static void main(String[] args) 
 {
   double costPrice = 20;
   double sellingPrice = 30;
   double profitOrLoss = sellingPrice - costPrice;
   if (profitOrLoss > 0) 
   {
    System.out.println("Seller made a profit.");
    System.out.println("Profit amount:" + profitOrLoss);
   }
   else if (profitOrLoss < 0)
   {
    System.out.println("Seller incurred a loss.");
    System.out.println("Loss amount: $" + (-profitOrLoss));
   }
   else 
   {
    System.out.println("No profit, no loss.");
   }
  }
}
