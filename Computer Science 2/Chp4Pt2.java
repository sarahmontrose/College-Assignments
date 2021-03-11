//Sarah Montrose
//898715
//Ch 4 review part 2
import java.io.*;
import java.util.*;
public class Chp4Pt2
{
   public static void main(String[] args) throws IOException
   {
      Random rand = new Random();
      int ComWin = 0,UserWin = 0;
      PrintWriter outputFile =  new PrintWriter("Who Wins.txt");
      
      for (int i = 1;i <= 10;i++)
      {
         int ComDie = rand.nextInt(6)+1;
         int UserDie = rand.nextInt(6)+1;   
         if(ComDie > UserDie)
            ComWin++;
         else if(ComDie < UserDie)
            UserWin++;
      }
      if (ComWin > UserWin)
         outputFile.println("Computer Wins!");
      else if(ComWin < UserWin)
         outputFile.println("User Wins!");
      else
         outputFile.println("It is a tie.");
         
      outputFile.close();
   
   }


}