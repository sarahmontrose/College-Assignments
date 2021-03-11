//Sarah Montrose
//898715
//Homework 1

import java.util.*;
import java.io.*;

public class Homework1
{
   public static void main (String [] args) throws IOException
   {
      //define variables
      double counter = 0;
      double totalNum = 0;
      
      double evenCounter = 0;
      double totalEven = 0;
      
      double oddCounter = 0;
      double totalOdd = 0;
      
      double accumulator;
     
      //input file
      File file = new File ("numbers.txt");
      if(!file.exists())
      {
         System.out.println("The file is not found");
         System.exit(0);
      }
      
      Scanner inputFile = new Scanner(file);
      
      //math with numbers in file
      while(inputFile.hasNext())
      {
         counter++;
         accumulator = Double.parseDouble(inputFile.nextLine());
         totalNum += accumulator;
         
         if ((accumulator %2) == 0)
         {
            evenCounter ++;
            totalEven += accumulator;
         }
         else
         {
            oddCounter ++;
            totalOdd += accumulator;
         }
      }
      
      double totalAverage = totalNum / counter;
      double oddAverage = totalOdd / oddCounter;
      double evenAverage = totalEven / evenCounter;
      
      //outputs
      System.out.println("Student Name: Sarah Montrose");
      System.out.println("Email: SM898715@wcupa.edu");
      System.out.printf("There are %.0f numbers in the file.\n", counter);
      System.out.printf("There are %.0f even numbers.\n", evenCounter);
      System.out.printf("There are %.0f odd numbers.\n", oddCounter);
      System.out.printf("The total average value is %.2f\n", totalAverage);
      System.out.printf("The total odd number average is %.2f\n", oddAverage);
      System.out.printf("The total even number average is %.2f\n", evenAverage);
     
      inputFile.close();
   }
}