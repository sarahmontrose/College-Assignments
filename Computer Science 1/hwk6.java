//Sarah Montrose
//Homework 6
//November 8, 2017

import java.util.*;
public class hwk6
{
   public static void main (String [] args)
   {
      Scanner input = new Scanner (System.in);
      
      //define variables
      String name1, name2, name3;
      
      //get input
      System.out.println("Enter the name of your first friend.");
      name1 = input.nextLine();
      
      System.out.println("Enter the name of your second friend.");
      name2 = input.nextLine();
      
      System.out.println("Enter the name of your third friend.");
      name3 = input.nextLine();
      
      System.out.print("\n");//line between inputs and ascending list
      
      
      //compare names
      
      if(name1.compareTo(name2) < 0 && name1.compareTo(name3) < 0)
      {
         System.out.println(name1);
         
         if (name2.compareTo(name3) < 0)
         {
            System.out.println(name2);
            System.out.println(name3);
         }
         else
         {
            System.out.println(name3);
            System.out.println(name2);
         }
      }
      
      else if(name1.compareTo(name2) > 0 && name1.compareTo(name3) > 0)
      {
         System.out.println(name2);
         
         if (name1.compareTo(name3) < 0)
         {
            System.out.println(name1);
            System.out.println(name3);
         }
         else
         {
            System.out.println(name3);
            System.out.println(name1);
         }
      }
      else 
         {
         System.out.println(name3);
         
            if (name1.compareTo(name2) < 0)
            {
               System.out.println(name1);
               System.out.println(name2);
            }
            else
            {
               System.out.println(name2);
               System.out.println(name1);
            }
         }
   }
}
            
      
      