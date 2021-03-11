//Sarah Montrose
//11-15-2017
//Homework 8


import java.util.*;
import java.io.*;

public class hw8
{
   public static void main (String [] args) throws IOException
   {
      Scanner input = new Scanner (System.in);
      
      System.out.println("Enter the file name."); //ask user for file
      String fileName = input.nextLine();

      //input file
      
      File file = new File (fileName + ".txt");
      
      if(!file.exists()) //shows user if file does not exist
      {
         System.out.println("The file does not exist");
         System.exit(0);
      }
      Scanner inputFile = new Scanner(file);
      
      String line;
      
      int lineNumber = 0;//initializes how many lines can be shown
      
      while(inputFile.hasNext())
      {
         line = inputFile.nextLine();
         
         if(lineNumber < 5)
         {
            System.out.println(line);
            lineNumber += 1;
         }
      }
      inputFile.close();
   }
}