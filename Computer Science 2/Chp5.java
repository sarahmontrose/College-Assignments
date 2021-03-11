//Sarah Montrose
//898715
//Ch 5 Review

import java.util.*;
public class Chp5
{
   public static void main (String [] args)
   {
      double width = 0, length = 0, area = 0;
      length = getLength();
      width = getWidth();
      area = getArea(length, width);
      displayData(width, length, area);
   }
   public static double getLength()
   {
      double l;
      Scanner input = new Scanner(System.in);
      System.out.println("What is the length of the rectangle?");
      l = input.nextDouble();
      return l;
   }
   public static double getWidth()
   {
      double w;
      Scanner input = new Scanner(System.in);
      System.out.println("What is the width of the rectangle?");
      w = input.nextDouble();
      return w;
   }
   public static double getArea(double l, double w)
   {
      double a = l*w;
      return a;
   }
   public static void displayData(double l, double w, double a)
   {
      System.out.println("With a length of "+ l +" and a width of "+ w +", your rectangle's area is: "+ a);
   }
}