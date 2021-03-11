//Sarah Montrose
//Homework 7
//11-14-17

import java.util.*;

public class hw7
{
   public static void main (String [] args)
   {
      Scanner input = new Scanner (System.in);
      
      int year = 0;
      int total = 0;
      int month = 0;
      int rainfall = 0;
      boolean flag = false;
      
      while(!flag)
      {
         System.out.println("How many years of recorded rainfall? ");
         year = input.nextInt();
         
         if (year >= 1)
         {
            break;
         }
         
         else
         {
            System.out.println("Invalid, enter a number greater than 0");
         }
      }//this closes while loop
  
      
      for(int x = 1; x <= year; x++)//years
      {         
         for (int i = 1; i<=12; i++)//months
         {
            month++;
         while(!flag)
         {
            System.out.println("Enter the amount of rainfall for month " + month);
            rainfall = input.nextInt();

            if (rainfall < 0)
            {
               System.out.println("Invalid, enter a positive amount of rainfall.");
            }
            else
            {
               break;
            }
         
         }
            total += rainfall;
         }
      }
      int average = total/month;
         System.out.println("With a total of "+ month +" months, there was "+ total +" inches of rain. The average rainfall" +
                            " each month was "+ average +" inches.");
   }
}
