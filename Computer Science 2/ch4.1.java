//Sarah Montrose
//898715
//Ch 4 Review pt 1
import java.util.*;
public class Ch4.1
{
   public static void main (String [] args)
   {
      Random rand = new Random();
      int num = rand.nextInt(10)+1;
      
      Scanner input = new Scanner(System.in);
      int userGuess;
      
      int round = 0;
      do
      {
         System.out.println("Guess a number.");
         userGuess = input.nextInt();
         round++;
         
         if (userGuess < 1 || userGuess < num)
            System.out.println("Number entered is too low, please enter a new number.");
            
         else if (userGuess > 10 || userGuess > num)
            System.out.println("Number entered is too high, please enter a new number.");
            
         else
            System.out.printf("Good guess! Your number of rounds is %d. \n", round);
            
      } while (userGuess != num);
   }
}