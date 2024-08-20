class Normalpattern
{
 public static void main(String args[])
  {
   for(int i=1;i<=5;i++)
   {
    for(int j=i;j<5;j++)
    {
     System.out.print(" ");
    }
    for(int j=1;j<=i;j++)
    {
     System.out.print("* ");
    }
    System.out.println();
   }
  }
}


class Evenpattern
{
 public static void main(String args[])
  {
   for(int i=1;i<=5;i++)
   {
    for(int j=1;j<=5;j++)
    {
     if(i%2==0)
     {
     System.out.print("*");
     }
     else
     {
     System.out.print("$");
     }
   }
    System.out.println();
   }
  }
}

class Diagonalpattern
{
 public static void main(String args[])
  {
   for(int i=1;i<=5;i++)
   {
    for(int j=1;j<=5;j++)
    {
     if(i==j)
     {
     System.out.print("*");
     }
     else
     {
     System.out.print("$");
     }
   }
    System.out.println();
   }
  }
}

class ReverseDiagonal
{
 public static void main(String args[])
  {
    int rows=5;
   for(int i=1;i<=rows;i++)
   {
    for(int j=1;j<=rows;j++)
    {
     if(i+j==rows+1)
     {
     System.out.print("*");
     }
     else
     {
     System.out.print("$");
     }
   }
    System.out.println();
   }
  }
}

class hollow
{
 public static void main(String args[])
  {
    int rows=5;
   for(int i=1;i<=rows;i++)
   {
    for(int j=1;j<=rows;j++)
    {
     if(i==1||i==rows||j==1||j==rows||i==j||i+j==rows+1)
     {
     System.out.print("* ");
     }
     else
     {
     System.out.print("  ");
     }
   }
    System.out.println();
   }
  }
}

class RATpattern
{
 public static void main(String args[])
  {
    int rows=5;
   for(int i=1;i<=rows;i++)
   {
    for(int j=1;j<=i;j++)
    {
     System.out.print("* ");
    }
    System.out.println();
   }
  }
}

class IRATpattern
{
 public static void main(String args[])
  {
    int rows=5;
   for(int i=1;i<=rows;i++)
   {
    for(int j=rows;j>=i;j--)
    {
     System.out.print("*");
    }
    System.out.println();
   }
  }
}

class MRATpattern
{
 public static void main(String args[])
  {
   int rows=5;
   for (int i=1;i<=rows;i++) 
   {
    for (int j=rows;j>=i;j--) 
    {
     System.out.print(" ");
    }
    for (int k = 1 ; k <=i; k++ ) 
    {
     System.out.print("*");
    }
    System.out.println();
   }
 }
}

class IMRATpattern
{
 public static void main(String args[])
  {
   int rows=5;
   for (int i=1;i<=rows;i++) 
   {
    for (int j=1;j<=i;j++) 
    {
     System.out.print(" ");
    }
    for (int k =rows; k>=i; k-- ) 
    {
     System.out.print("*");
    }
    System.out.println();
   }
 }
}


