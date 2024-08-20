class Sumof3_5
{
  public static void main(String[] args)
   {
    int start=1,end=100,sum=0,count=0;
    while(start<=end)
     {
      if(start%3==0 && start%5==0){
       sum=sum+start;
       count++;
     }
     start++;
     }
     System.out.println(sum);
     System.out.println(count);
   }
}
