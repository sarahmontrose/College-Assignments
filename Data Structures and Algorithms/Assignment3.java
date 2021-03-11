//Sarah Montrose
//898715
//Assignment 3
//5-1-19

import java.io.*;
import java.util.*;
public class Assignment3
{
   static String arr[] = new String[201];
   static String country[] = new String[201];
   static int population[] = new int[201];
   static String shellCount[] = new String[201];
   static int shellPop[] = new int[201];
   static Hashtable <Integer, String> table = new Hashtable<Integer, String>(250);
   
   public static void main(String[] args)throws Exception
   {
      Scanner input = new Scanner(new File("CountrySortedAlpha.txt"));
      PrintWriter output = new PrintWriter("CountryUnsortedAlpha.txt");
      Random rand = new Random();
      String line;
      int where = 0;
         
      for(int i = 0; input.hasNextLine(); i++)
      {
         arr[i] = input.nextLine();
         StringTokenizer st = new StringTokenizer(arr[i]);
         
         while(st.hasMoreTokens())
         {
            String strt= st.nextToken();
            
            try
            {
               population[i] = Integer.parseInt(strt);
            }
            catch(Exception e)
            {
               if(country[i] == null)
                  country[i]= strt;
               else
                  country[i] = country[i] +" "+ strt;
            }
         }
      }
      input.close();
      
      //unsort text files
      System.out.println("Unsorting Phase \n");
      for(int j= 201; j >= 1; j--)
      {
         where = rand.nextInt(j);
         
         for(int k = 0; k <= where; k++)
         {
            if(arr[k].equals("null"))
               where++;

            if(k == where)
            {
               if(!(arr[k].equals("null")))
               {
                  output.println(arr[k]);//print to text file 
                  arr[k]= "null";
               }
            }
         }
      }
      output.close();
      
      System.out.println("CountryUnsortedAlpha.txt saved \n");
        
      System.out.println("----------Sort by User Percentage---------- \n");
      shellsort(country, population);
      System.out.println("Shellsorting phase ended \n");
      
      System.out.println("----------Put into Hash Table---------- \n");
      hashing();
      System.out.println("Hashing phase ended \n");
      
      System.out.println("----------Search the Hash Table---------- \n");
      search();
      System.out.println("Thank you for using this program! \n");
   }
   
   public static void shellsort(String [] a, int b[])
   {
      int l;
      
      for(int gap = a.length /2; gap > 0; gap/=2)
      {
         for(int i = gap; i < a.length; i++)
         {
            String tmp= a[i];
            int tmp2 = b[i];
            
            for(l= i; l >= gap && tmp2 > b[l -gap]; l -= gap)
            {
               a[l] = a[l-gap].trim();
               b[l] = b[l-gap];
            }
            a[l] = tmp;
            b[l] = tmp2;
         }
       }
       
       for(int m = 0; m < b.length; m++)
       {
         shellCount[m] = a[m];
         shellPop[m] = b[m];
         System.out.printf("%-26s   %3d\n", shellCount[m], shellPop[m]);
       }
   }
   public static void hashing()
   {
      String str;
      String str2;
      int hash;
      
      for(int n = 0; n < population.length; n++)
      {
         str = shellCount[n] + " "+ shellPop[n];
         char[] ch= shellCount[n].toCharArray();
         hash = hashing2(ch);
         hash %= 250;
         table.put(hash, shellCount[n]);
         System.out.printf("%-26s       hash to:         %3d\n", str, hash);
      }
   }
   public static int hashing2(char[] x)
   {
      int has = 0;
      
      for(int o = 0; o < x.length; o++)
         has += (int)x[o];
         
      if(table.get(has%250) == null)
         return has;
         
      else
      {
         do
         {
            has++;
         }
         while(table.get(has %250) != null);
      }
      return has;
   }
   
   public static void search()
   {
      Scanner scan = new Scanner(System.in);
      String cntry = " ";
      
      while(!cntry.equals("-1"))
      {
         System.out.println("Enter name of country (case sensitive), enter -1 when done.");
         cntry = scan.nextLine();
         
         if(cntry.equals("-1"))
            break;
         else{
            getLookUp(cntry);
         }
      }
      scan.close();
   }
   
   public static void getLookUp(String c)
   {
      int hash = 0;
      char[] ch = c.toCharArray();
      
      for(int in= 0; in< ch.length; in++)
         hash += (int)ch[in];
      try
      {
         if(table.get(hash%250).equals(c))
            System.out.println(hash%250 + ": "+ table.get(hash%250));
         else
         {
            do
            {
               System.out.println(hash%250 + ": "+ table.get(hash%250));
               hash++;
            }
            while(!table.get(hash%250).equals(c));
            System.out.println(hash%250 + ": "+ table.get(hash%250));
         }
      }
      catch(Exception e)
      {
         System.out.println("Not found in table, try again");
      }
   }
}