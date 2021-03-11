//Sarah Montrose
//Homework 5
//10-31-17

import java.util.*;

public class hw5
{
   public static void main (String[] args)
   {
     Scanner input = new Scanner(System.in);
 
     System.out.println("Enter numbers of books purchased this month.");
     double books = input.nextDouble();
     
     if (books >= 4)
     {
         System.out.println("You have earned 60 points.");
     }
     if (books == 3)
     {
         System.out.println("You have earned 30 points.");
     }
     if (books == 2)
     {
         System.out.println("You have earned 15 points.");
     }
     if (books == 1)
     {
         System.out.println("You have earned 5 points");
     }
     if (books <= 0)
     {
         System.out.println("You have earned 0 points");
     }   
   }
}
