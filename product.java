class product
{
public static void main(String args[])
{
String Name="rice";
int Code=2342;
int Price=3000;
int Quantity=10;
int Total=Price*Quantity;
double Discount=13.0/100*Total;
double Now_total=Total-Discount;
int Creditcardpay=150;
int Coupon=25;
double Tax=18.0/100*Total;
double Final_total=Now_total-Creditcardpay-Coupon+Tax;

System.out.println("Name of the product:"+Name);
System.out.println("product code:"+Code);
System.out.println("price of the product:"+Price);
System.out.println("Quantity of the product:"+Quantity);
System.out.println("Total price:"+Total);
System.out.println("Discount to the product:"+Discount);
System.out.println("After discount the total:"+Now_total);
System.out.println("if customer pay with creditcard:"+Creditcardpay);
System.out.println("coupon discount:"+Coupon);
System.out.println("Tax :"+Tax);
System.out.println("Final pay:"+Final_total);
}
}
