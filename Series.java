class Series
 {
   public static void main(String[] args) 
     {
       int num=3;
        System.out.print(num+" ");
        while(num>1)
         {
           if(num%2==0)
            {
             num=num/2;
            }
           else
            {
            num=3*num+1;
            }
            System.out.print(num+" ");
         }
     }
 }