import java.util.Scanner;
class ElectApp
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Welcome to Abc Store"); 
System.out.println("Your name");
String name=s.nextLine();
System.out.println("your gender");
String gender=s.next();
if(gender.equals("male"))
{
 System.out.println("welcome mr."+name);
}
else
{
 System.out.println("welcome miss/mrs."+name);
}
System.out.println("Available products are\n1.Laptop\n2.Mobiles\n3.TV\n4.AC\n5.Washing Machine");
char decision;
int product,quantity,lprice=50000,mprice=15000,tvprice=25000,acprice=45000,wmprice=30000,total=0;
do
{
System.out.println("enter a number 1 to 5");
product=s.nextInt();
if(product==1)
{
System.out.println("You choosed Laptop\nEnter the quantity");
quantity=s.nextInt();
total=total+(quantity*lprice);
}
else if(product==2)
{
System.out.println("You choosed Mobiles\nEnter the quantity");
quantity=s.nextInt();
total=total+(quantity*mprice);
}
else if(product==3)
{
System.out.println("You choosed TV\nEnter the quantity");
quantity=s.nextInt();
total=total+(quantity*tvprice);
}
else if(product==4)
{
System.out.println("You choosed AC\nEnter the quantity");
quantity=s.nextInt();
total=total+(quantity*acprice);
}
else if(product==5)
{
System.out.println("You choosed Washing Machine\nEnter the quantity");
quantity=s.nextInt();
total=total+(quantity*wmprice);
}
System.out.println("enter y to continue and n to exit");
decision=s.next().charAt(0);
if(decision=='n' || decision=='N')
{
System.out.println("total price is "+total+"\nThank you visit again happy shopping");
break;
}
}
while(true);
}
}