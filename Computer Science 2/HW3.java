//Sarah Montrose
//898715
//3-22-18

import java.util.*;
public class HW3//you told us to make it HW1 but this is HW3, so I took a chance and made the program title HW3
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("How many people in your party?");
      int party = input.nextInt(); 
      
      double [] people = new double[party];//create array named people
      
      System.out.println("Soups and Salads\n 1.Cream of Tomato ------$5.00\n 2.Chicken Tortilla ---------$6.50\n 3.Seafood Bisque ---------$9.50\n 4.Ahi Tuna ------------------$10.50\n 5.House ---------------------$6.00\n 6.Caesar ---------------------$8.00\n\n Finger Foods\n 7.Soft Pretzel Sticks -------$5.00\n 8.Spicy Tuna Egg Rolls ----$7.50\n 9.Guacamole ----------------$5.00\n\nBurgers\n 10.Main Street ----------------$12.00\n 11.Southwest ------------------$14.00\n 12.Sunny ------------------------$11.00\n 13.Steakhouse -----------------$18.0\n");

      for(int i = 0; i < party; i++)
      {
         System.out.println("Person "+ (i+1) +" please select the number correlating with your selection.");
      
         do{
            int s = input.nextInt();//s stands for selection
            
            if (s == 1||s == 7||s == 9)//options grouped together have same price
               people [i] += 5;
               
            else if (s == 2)
               people [i] += 6.50;
               
            else if(s == 3)
               people [i] += 9.50;
               
            else if (s == 4)
               people [i] += 10.50;
               
            else if (s == 5)
               people [i] += 6;
               
            else if (s == 6)
               people [i] += 8;
               
            else if (s == 8)
               people [i] += 7.50;
               
            else if (s == 10)
               people [i] += 12;
               
            else if (s == 11)
               people [i] += 14;
               
            else if (s == 12)
               people [i] += 11;
               
            else if (s == 13)
               people [i] += 18;
               
            else
               break;
               
            System.out.println("Is there anything else you'd like to order? If no, type 0.");
            }while(true);
      }
     
      for (int p = 0; p < party; p++)//displays the price for each person with tax

         System.out.print("The total price for person number "+ (p+1) +" is $"+ (people [p] + (.06 * people [p])) +"\n");
   }
}
