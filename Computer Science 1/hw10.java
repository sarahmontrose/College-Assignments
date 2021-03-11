//Sarah Montrose
//898715
//Homework 10

import java.util.*;
public class hw10
{
   public static void main(String [] args)
   {
      double rooms, sqFeet, hours, paint, pPrice, labor, totalP, total;
      rooms = getRooms();
      sqFeet = getSqFeet(rooms);
      hours = getHours(sqFeet);
      paint = getPaint(sqFeet);
      pPrice = getPPrice();
      totalP = getTotalP(paint, pPrice);
      labor = getLabor(hours);
      total = getTotal(totalP, labor);
      //outputs
      System.out.printf("You need %.0f gallon(s) of paint.\n",paint);
      System.out.printf("The labor will take %.0f hour(s).\n",hours);
      System.out.printf("The total cost of paint will be $%.2f\n",totalP);
      System.out.printf("The charges for labor will be $%.2f\n",labor);
      System.out.printf("The total cost will be $%.2f",total);
   }
   
   public static double getRooms()
   {
      Scanner input = new Scanner(System.in);
      System.out.println("How many rooms are you painting?");
      return input.nextDouble();
   }
   
   public static double getSqFeet(double r)
   {
      Scanner input = new Scanner(System.in);
      double sqFeet = 0;
      double sum = 0;
      for (int i = 1; i <= r; i++)
      {
         System.out.println("What is the square feet for room " + i + "?");
         sqFeet = input.nextDouble();
         sum += sqFeet;
      }
      return sum;
   }
   
   public static double getPPrice()
   {
      Scanner input = new Scanner(System.in);
      System.out.println("What is the price of the paint per gallon?");
      return input.nextDouble();
   }
   
   public static double getPaint(double sf)//sf is square feet
   {
         return sf/115;
   }
   
   public static double getHours(double sf)
   {
      return (8*sf)/115;
   }
   
   public static double getTotalP(double p, double pp)// p is paint in gallons, pp is paint price per gallon
   {
      return p*pp;
   }
   
   public static double getLabor(double h)//h is hours
   {
      return h*18;
   }
   
   public static double getTotal(double tp, double l)//tp is total paint, l is labor
   {
      return tp+l;
   }
}