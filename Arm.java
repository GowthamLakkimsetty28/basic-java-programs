class Arm
{
public static void main(String args[])
{
int num=155, result=0, sum=0, temp=num; 
while(num>0)
{
result=num%10;
int power=(int)Math.pow(result,3);
 num=num/10;
sum=power+sum;
}
if(sum==temp) {
System.out.println("arm strong number");
} else{
System.out.println("not arm strong number");
}
}
}