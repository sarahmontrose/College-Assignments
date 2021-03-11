import java.util.*;
import java.io.*; //input or output file

public class blackJack
{
   public static void main (String [] args) throws IOException
   {
      Scanner input = new Scanner (System.in);
      Random rand = new Random ();
      
      int user = rand.nextInt(11)+1;
      int dealer = rand.nextInt(11)+1;
      String answer;
      
      System.out.println("The users total is "+user+ " The dealers total is "+dealer);
      
      System.out.println("Continue?");
      answer = input.nextLine();
      
      if(user <= 21&&dealer <=21)
      {
         if(user > dealer)
         {
            System.out.println("The winner is the user with a score of "+user);
         }
         else
         {
            System.out.println("The winner is the dealer with a score of "+dealer);
         }
      }
      if(user > 21)
         System.out.println("The winner is the dealer with a score of "+dealer);
      
      if(dealer > 21)
         System.out.println("The winner is the user with a score of "+user);
         
      
   }
}
         