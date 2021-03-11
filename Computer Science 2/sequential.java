//Sarah Montrose

public class sequential
{
  public static int sequential(int[] n, int a)
   {
      //go through all of the element
      int result = -1;
      for(int i = 0; i < n.length; i++)
      {
         if(n[i] == a)
         result = i; //index
      }
      return result;
   }

   public static void main (String[] args)
   {
      int[] test = {3,5,7,9,11};
      int result = sequential(test,5);
      
      if(result == -1)
      {
         System.out.println("Not found.");
      }
      else
      {
         System.out.println("The index is "+result);
      }
   }
}