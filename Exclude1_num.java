class Exclude1_num
{
  public static void main(String[] args)
     {
      int num=100,highFact=num; 
      int lowFact=1,start=2;
        while (start<num)
          { 
            if (num%start==0)
               {
               
                if (start<highFact)
                    {
                    highFact=start;
                    }
                if (start>lowFact) 
                    {
                    lowFact=start;
                    }
                }
            start++;
        }

        if (highFact==num)
           {
            System.out.println("No factors other than 1 and the number itself.");
           } 
       else 
           {
            System.out.println("Lowest factor  excluding 1 and itself : " +highFact);
            System.out.println("Highest factor  excluding 1 and itself : " +lowFact);
           }
    }
}
