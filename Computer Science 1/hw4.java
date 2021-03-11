//Sarah Montrose
//Oct. 18, 2017
//Homework 4

import javax.swing.*; //import JOptionPane

public class hw4
{
   public static void main (String[] args)
   {
      
      String input = JOptionPane.showInputDialog("Input amount of seconds."); //allows someone to enter an amount of seconds
      int seconds = Integer.parseInt(input); // changes from a string to an int
      
       
      int minute, hour, day, seconds2, minute2, hour2; //defines variables
      
      if (seconds < 60) //less than 60 seconds
      {
         JOptionPane.showMessageDialog(null, "The time entered is: "+ seconds +"second(s).");
      }
      else if (seconds >= 60 && seconds < 3599) //seconds are greater than or equal to 60 and less than 3599
      { //math
         minute = seconds/60;
         seconds2 = seconds%60;
         JOptionPane.showMessageDialog(null, "The time entered is: "+ minute +"minute(s) and " + seconds2 + " second(s)");
      }
      else if (seconds >= 3600 && seconds < 86399) //seconds are greater than or equal to 3600 and less than 86399
      { //math
         hour = seconds/3600;
         minute2 = (seconds/60)-(hour*60);
         seconds2 = (seconds%3600)-(minute2*60);
         JOptionPane.showMessageDialog(null, "The time entered is: "+ hour + "hour(s) " + minute2 + " minute(s) and " + seconds2 + " second(s)");
      }
      else if(seconds >= 86400) //seconds are greater than or equal to 86400
      { //math
         day = seconds/86400;
         hour2 = (seconds % 6400) /3600;
         minute2 = ((seconds % 86400) %3600) /60;
         seconds2 = ((seconds % 86400) %3600)%60;
         JOptionPane.showMessageDialog(null, "The time entered is: "+ day + " day(s) " + hour2 + "hour(s) " + minute2 + "minute(s) and " + seconds2 + " second(s)");
      }
      
      System.exit(0);
   }
}