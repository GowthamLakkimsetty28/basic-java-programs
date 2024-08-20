class HollowMB
{
public static void main(String[] args)
{
int rows=5;
for(int x=1;x<=rows;x++)
{
for(int y=1;y<x;y++)
{
System.out.print(" ");
}
for(int z=rows;z>=x;z--)
{
if(x==1||x==z||z==rows)
System.out.print("* ");
else
System.out.print(" ");
}
System.out.println();
}
{
for(int x=2;x<=rows;x++)
for(int y=rows;y>x;y--)
{
System.out.print(" ");
}
for(int z=1;z<=x;z++)
{
if(z==x||z==1||x==rows)
System.out.print("* ");
else
System.out.print(" ");
}
System.out.println();
}
}
}