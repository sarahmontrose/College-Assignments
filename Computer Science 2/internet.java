//Sarah Montrose
//898715
//ch 3 review
import java.util.*;
public class internet
{
   public static void main (String [] args)
   {
      double hours, bill;
      String pack = new String();
      pack = getPackage();
      hours = getHours();
      bill = getBill(pack, hours);
      System.out.println("You have chosen package "+ pack +", with a total of "+ hours +" hours, your bill total is $"+ bill +".");
   }
   
   public static String getPackage()
   {
      Scanner input = new Scanner (System.in);
      System.out.println("Choose package A, B, or C");
      String pack = input.nextLine();
      return pack;
   }
   
   public static double getHours()
   {
      Scanner input = new Scanner (System.in);
      System.out.println("Enter number of hours used this month.");
      int hours = input.nextInt();
      return hours;
   }
   
   public static double getBill(String p, double h)
   {
      double price = 0;
      if(p.equals("A"))
      {
         if (h <= 10)
         {
            price = 9.95;
         }
         if (h > 10)
         {
            price = 9.95+(2*(h-10));
         }
      }
      if (p.equals("B"))
      {
         if (h <= 20)
         {
            price = 13.95;
         }
         if (h > 20)
         {
            price = 13.95+(1*(h-20));
         }
      }
      if (p.equals("C"))
      {
         price = 19.95;
      }
   return price;
   }
}  
         