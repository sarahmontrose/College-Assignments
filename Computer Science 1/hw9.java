//Sarah Montrose
//Homework 9
//November 23, 2017

import javax.swing.*;
import java.util.*;
public class hw9
{
   public static void main (String [] args)
   {
      Random rand = new Random ();
      
      int colors;
      int correctGuesses = 0;
      String computerColor = " ";
      String userInput;
      
      rand.nextInt(5);
      
           
      //for loop to play game of 10 rounds
      for(int colorGuess = 1; colorGuess <= 10; colorGuess++)
      {
         colors = rand.nextInt(5);
         
         switch(colors)
         {
            case 0:
                  computerColor = "Red";
                  break;
            case 1:
                  computerColor = "Green";
                  break;
            case 2:
                  computerColor = "Blue";
                  break;
            case 3:
                  computerColor = "Orange";
                  break;
            case 4:
                  computerColor = "Yellow";
                  break;
            default:
                  JOptionPane.showMessageDialog(null, "The number you entered " + colors + " is not associated with a color.");
                  break;
          }
          
          userInput = JOptionPane. showInputDialog("I have generated a number for round " + colorGuess + " can you guess the color?");
          
          if(userInput.equalsIgnoreCase(computerColor))
          {
            correctGuesses = correctGuesses + 1;
            JOptionPane.showMessageDialog(null, "I generated " + computerColor + " and you input " + userInput + ".");
          }
          else
            JOptionPane.showMessageDialog(null, "I generated " + computerColor + " and you input " + userInput + ".");
      
        }
     JOptionPane.showMessageDialog(null, "Congrats! You correctly guessed the color " + correctGuesses + " times!");
     
     System.exit(0);
   }
}
          
          


      
      