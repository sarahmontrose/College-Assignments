//Sarah Montrose
//898715

import java.util.*;
import java.io.*;
public class hw4
{
   public static void main(String args []) throws IOException
   {
      ArrayList <Integer> num = new ArrayList <Integer>();
      int o[] = new int[101];
      File file = new File("hw4#.txt");
      Scanner input = new Scanner(file); 
      
      if(!file.exists())
         System.exit(0);
         

      while(input.hasNext())
      {
         boolean b = false;
         int z = input.nextInt();
         for(int x=1; x <= 101; x++)
         {
            if(x == z)
            {
               o[x]++;
               
               if(o[x]>1)
               {
                  b = true;
               }
               break;
            }  
         }
         if(!b)
            num.add(z);
         
      }

      
      PrintWriter outputFile = new PrintWriter("results.txt");
      
      outputFile.println("Name: Sarah Montrose\n Email: SM898715@wcupa.edu");
      outputFile.println();
      outputFile.println("Number\t\tOccurance times");

      for (int u = 0; u < 100; u++)
      {
         String y1 = num.get(u).toString();
         int y = u;
         outputFile.println(y+"\t\t\t"+o[y]);
      }
      outputFile.close();
  }
}
