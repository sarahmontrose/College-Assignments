//Sarah Montrose
//Assignment1
//Long Number Linked Lists
//3-4-19

import java.util.*;

public class LongNumbersLinkedList
 {
  public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        String longNumber;
        LinkedList mainList = new LinkedList();
        LinkedList sumList = new LinkedList();
        LinkedList temp = null;
        int maxWidth = 0; //declare other variables 
        long carryNum = 0; //declare other variables 
        long sum = 0; //declare other variables 
        String tString = ""; //declare other variables 
        long tLong = 0; //declare other variables 
        
        System.out.println("Enter long numbers and input -1 to stop");//repeatedly input longNumbers, using -1 to indicate that you are done
        
        do
        {
         longNumber= stdIn.nextLine();
         
         if(longNumber.equals("-1"))
            break;
         
         if(longNumber.length() > maxWidth)
            maxWidth = longNumber.length(); //keep track of maxWidth, the number of digits of the widest longNumber input so far
         
			mainList.addFirst(new LinkedList()); //add a new LinkedList at the beginning of the mainList
			temp = (LinkedList) mainList.get(0); //use get(0) to set temp to be this new LinkedList

			for (int i = 0; i < longNumber.length(); i++) 
				temp.addFirst(Character.getNumericValue(longNumber.charAt(i)));
        }
        while(!longNumber.equals("-1"));
        	
        
        System.out.println(mainList);
          	
		  for (int f = 0; f < maxWidth; f++) 
        {
			   sum = 0;
			
			   for (int g = 0; g < mainList.size(); g++) 
            {
				   temp = (LinkedList) mainList.get(g);

				   if (!temp.isEmpty()) 
               {
					   tString = temp.pollFirst().toString();
					   tLong = Long.parseLong(tString);
					   sum = tLong + sum;
               }
            }
			   sum += carryNum;
			   long l = sum % 10;  //add sum%10 at the beginning of sumList
			   carryNum = sum / 10; //set carry equal to sum/10 (integer division)
			   sumList.addLast(l);
		   }
		   
		   if(carryNum > 0)
			   sumList.addLast(carryNum);
		   
		   tString = "";
            
		   for (int h = sumList.size(); h > 0; h--) 
			   tString = tString + sumList.get(h - 1).toString();
		  
		   char ifzero = tString.charAt(0);

		   if (ifzero == '0')
			   tString = tString.substring(1); 

		   System.out.println("Sum: " + tString);      
    }
}