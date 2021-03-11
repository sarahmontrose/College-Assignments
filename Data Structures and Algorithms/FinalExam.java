//Sarah Montrose
//898715
//5-10-19
//Final Exam

import java.util.*;

public class FinalExam 
{
/* Three-way heap and heapsort
 * Date supplied in array declaration
 * Children of parent i are 3i-1, 3i, and 3i+1
 * Parent of child j is (j+1)/3
*/ 
  private int size;
  private int [] data;
  
  public FinalExam() //constructor
  {
      data = new int[14];
      size = 0;
  }

  public boolean isEmpty()
  { 
      boolean Empty;
      if (size == 0)
      {
         Empty = true;
      }
      else
      {
         Empty = false;
      }
      return Empty;  
  }
 
  //display method for FinalExam object to use
  public void display()
  {
      for(int a = 1; a < size + 1; a++)
      {
         System.out.printf("%3d \t", data[a]);
      }
      System.out.println();
  }  
   
  public boolean add(int elt)
  {
      int space = percolateUp(++size, elt);
      data[space] = elt;
      return true;     
  }
 
  private int percolateUp(int hole, int elt)
  {   
      while(hole != 1 && data[(hole + 1)/3] > elt)
      {
          data[hole] = data[(hole + 1)/3];
          hole = (hole + 1)/3;
      }
      return hole;  
  }
 
  public int remove()
  {
      if(size == 0)
         throw new NoSuchElementException("Remove element");
      int t = data[1];
      int addIn = data[size--];
      int space = percolateDown(1, addIn);
      data[space] = addIn;
      return t;
  }
 
  private int percolateDown(int hole, int elt)
  {
      while(true)
      {
          int left = (3 * hole)-1, center= (3 * hole), right = (3 * hole)+1;
          
          if(left > size)
             break;
          
          int child;
          
          if(left == size)
             child = left;
         
          else if(data[center] <= data[right] && data[center] <= data[left])
             child = center;
             
          else if(data[left] <= data[center] && data[left] <= data[right])
        	    child = left;
          
          else
             child = right;
          
          if(elt <= data[child])
             break;
         
          else
          {
             data[hole] = data[child];
             hole = child;
          }
       }
       return hole;     
  }
    
}// FinalExam class

class Container //for other display and main methods
{ 
    //display method for arrays (notFinalExam object)
    public static void display(int [] array)
    {
       for(int b = 0; b < array.length; b++)
       {
    	    if(array[b] != 0)
    		    System.out.printf("%3d \t",array[b]);
       }
       System.out.println();     
    }
    
    public static void main(String[] args) throws Exception 
    {
        int []A ={14,34,12,28,100,23,46,16,22,11,89,78,26};
        System.out.println("Array:");  
        display(A);

        FinalExam H = new FinalExam();
                
        System.out.println("============================================================================"); 
        System.out.println("Add to Heap:");
        // create the heap
        for(int c = 0; c < A.length; c++)
        {
           H.add(A[c]);
           H.display();
        }
        
        System.out.println("============================================================================");
        System.out.println("Remove from Heap:");
        // remove one-by-one, putting back into array
        for(int d = 0; d < A.length; d++)
        {
        	  A[d] = H.remove();
        	  H.display();
        }
        
        System.out.println("============================================================================");
        System.out.println("Array:"); 
        display(A);
    }//main
}//container
