/*
Sarah Montrose

sm898715@wcupa.edu
*/

public class Car
{
   private String brand;
   private int year;
   private double price;
   private static int number;
   
   public Car(String b, int y, double p)
   {
      brand = b;
      year = y;
      price = p;
      number++;
   }
   
   public Car()
   {
      brand = "Chevy";
      year = 2005;
      price = 3000;
      number++;
   }
   
   public void setBrand(String b)
   {
      brand = b;
   }
   public void setYear(int y)
   {
      year = y;
   }
   public void setPrice (double p)
   {
      price = p;
   }
   public void setNumber (int n)
   {
      number = n;
   }
   public String getBrand()
   {
      return brand;
   }
   public int getYear()
   {
      return year;
   }
   public double getPrice()
   {
      return price;
   }
   public int getNumber()
   {
      return number;
   }
}