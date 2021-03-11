//Sarah Montrose
//898715
//Homework 11

import java.util.*;
public class hw11
{
   public static void main (String [] args)
   {
      double distance = 0, speed = 0, time = 0;
      time = getTime();
      speed = getSpeed();
      distance = Distance(speed, time);
      System.out.println("You traveled " + distance + " miles.");
   }
   
   public static double getTime() //make sure you dont put semi colon after the methods
   {
      Scanner input = new Scanner (System.in);
      System.out.println("How long were you driving for?");
      return input.nextDouble(); //returns users input to main method
   }
   
   public static double getSpeed()
   {
      Scanner input = new Scanner (System.in);
      System.out.println("How fast were you driving?");
      return input.nextDouble();
   }
   
   public static double Distance(double s, double t)
   {
      return s*t;
   }
}