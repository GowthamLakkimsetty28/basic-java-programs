import java.util.Scanner;
class AutomaticNumber  
{  
 public static void main(String args[])  
  {  
   Scanner s = new Scanner(System.in);  
   System.out.print("Enter a number: ");  
   int num = s.nextInt();  
   int count=0,square = num*num,temp = num;     
   while(temp>0)  
   {  
   count++;    
   temp=temp/10;  
   }    
   int lastDigit =(int)(square%(Math.pow(10, count)));   
   if(num == lastDigit)  
   System.out.println(num+ " is an automorphic number.");  
   else  
   System.out.println(num+ " is not an automorphic number.");  
 }  
}  