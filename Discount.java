class Discount
{
  public static void main(String args[])
  {
   int p_id;
   String name;
   double price;
   double discount;
    p_id=4;
    switch(p_id)

    {
     case 1:
            p_id=1;
            name="rice";
            price=100;
            discount=0.1;
          System.out.println("p_id:" +p_id);
          System.out.println("name:" +name);
          System.out.println("price:" +price);
          System.out.println("discount:" +discount);
          break;

     case 2:
            p_id=2;
            name="Bag";
            price=500;
            discount=0.3;
          System.out.println("p_id:" +p_id);
          System.out.println("name:" +name);
          System.out.println("price:" +price);
          System.out.println("discount:" +discount);
          break;
     case 3:
            p_id=3;
            name="Books";
            price=400;
            discount=0.4;
          System.out.println("p_id:" +p_id);
          System.out.println("name:" +name);
          System.out.println("price:" +price);
          System.out.println("discount:" +discount);
          break;
    case 4:
            p_id=4;
            name="shoes";
            price=800;
            discount=0.2;
          System.out.println("p_id:" +p_id);
          System.out.println("name:" +name);
          System.out.println("price:" +price);
          System.out.println("discount:" +discount);
          break;
   case 5:
            p_id=5;
            name="desk";
            price=1300;
            discount=0.5;
          System.out.println("p_id:" +p_id);
          System.out.println("name:" +name);
          System.out.println("price:" +price);
          System.out.println("discount:" +discount);
          break;
   default:
            System.out.println("invalid id");
     
    }
  }
}

  
