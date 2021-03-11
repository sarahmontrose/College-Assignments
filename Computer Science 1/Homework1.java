//Sarah Montrose
//898715
//Sept. 21 2017
//Homework 1

import java.text.DecimalFormat; //import this to make the decimal format work

public class Homework1

{
       public static void main(String[] args)
       {
         String myName = "Sarah Montrose"; //create a string for my name

         int age = 17; //create an int for my age
         double annualPay = 200000; //use a double for annual income
         
         DecimalFormat df = new DecimalFormat("#,###.00");//how to add commas within my annual pay
        
               System.out.println("My name is "+myName+", my age is "+age+", and I hope to earn $"+df.format(annualPay)+" per year.");
        }
}
