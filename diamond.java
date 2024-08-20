class diamond
{
 public static void main(String []args)
   {
     int rows=5,temp=1;	;
     for(int r=1;r<=rows;r++)
      {
       for(int s=rows;s>r;s--)
       {
        System.out.print("  ");
       }
        for(int c=1;c<=temp;c++)
        {
          System.out.print("* ");
        }
        System.out.println();
        temp=temp+2;
      }
    }
  }

class diamond1
{
 public static void main(String []args)
   {
     int rows=9, temp=rows;      
    for(int r=1;temp>0;r++)
      {
       for(int s=1;s<r;s++)
       {
        System.out.print("  ");
       }
        for(int c=1;c<=temp;c++)
        {
          System.out.print("*  ");
        }
        System.out.println();
        temp=temp-2;
      }
    }
  }
 