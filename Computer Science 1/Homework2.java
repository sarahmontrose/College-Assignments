//Sarah Montrose
//898715
//Sept. 2017
//Homework 2

import java.text.DecimalFormat;
import javax.swing.*;

public class Homework2
{
   private static DecimalFormat df = new DecimalFormat("#.##");
   
   public static void main (String[] args)
   { //enter charge of meal under price
   
      double price = Double.parseDouble(JOptionPane.showInputDialog("Enter Price:"));
      System.out.println(price);
      
      double taxRate = 0.06;
      double tipRate = 0.2;
      double tax,tip,mealCharge,total;
      
      tax = price*taxRate;
      mealCharge = price+tax;
      tip = mealCharge*tipRate;
      total = mealCharge+tip;
      
      JOptionPane.showMessageDialog(null, "Meal Charge: $" + df.format(price)+"\n"
                        +"Tax: $"+ df.format(tax) +"\n"
                        +"Suggested Tip: $"+df.format(tip)+"\n"
                        +"Total: $"+df.format(total)+"\n");
      
      System.exit(0);
      }
}