//Sarah Montrose
//Assignment 2
//4-3-19

package Cashiers;
import java.util.Scanner;

class Cashiers 
{
    private int s[][];
    private int front[];
    private int back[]; 
    private int length[];

    public Cashiers() 
    {   //constructor
        //n = size, fill with all 0's
        s = new int[6][3];
        front = new int[3];
        back = new int[3];
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 6; j++) 
                s[j][i] = 0;
        }
    }
    
    public void display() 
    {
        //front and back with 6 spaces for each entry
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 6; j++) 
            {
                if (j == back[i] && j == front[i]) 
                    System.out.printf("%-8s", String.valueOf("F " + s[j][i] + " B"));
                else if (j == back[i]) 
                    System.out.printf("%-8s", String.valueOf(s[j][i] + " B"));
                else if (j == front[i]) 
                    System.out.printf("%-8s", String.valueOf("F " + s[j][i]));
                else 
                    System.out.printf("%-8d", (s[j][i]));
            }
            System.out.println("\n");
            System.out.println();
        }
    }
    
    //method to find index w smallest num
    public static int FindSmallest(int[] arr1) 
    {
        int index = 0;
        int min = arr1[index];
        for (int i = 1; i < arr1.length; i++) 
        {
            if (arr1[i] < min) 
            {
                min = arr1[i];
                index = i;
            }
        }
        return index;
    }
    
    public boolean enqueue(int customer) 
    {
        length = new int[3];
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 6; j++) 
            {
                if (0 != (s[j][i])) 
                    length[i] += 1;
            }
        }
        int Line = FindSmallest(length);
        
        for (int i = 0; i < 6; i++) 
        {
            int spot = i + front[Line];
            if (spot >5)
                spot = spot % 6;
            if (0 == (s[spot][Line])) 
            {
                s[spot][Line] = customer;
                back[Line] = spot;
                front[Line] = spot - length[Line];
                
                if (front[Line]< 0)
                  front[Line] = 6+ front[Line];
                        
                return true;                
            }
        }
        System.out.println("No more room!");
        return false;
    }
    
    public int dequeue(int line)
    {
        int out = 0;
        if (s[front[line]][line] == 0)
            System.out.println("Line " + (line + 1) + " No one in queue.");
        else
        {
            out = s[front[line]][line];
            s[front[line]][line] = 0;
            front [line] = front [line] + 1;
            
            if (front [line] > 5)
                front[line] = (front[line]) % 6; 
        }
        System.out.println("Customer " + out + "is finished");
        return out;
    }
    
    public void clear()
    {
        for (int i = 0; i < 3; i++)
        {
            front[i] = 0;
            back [i] = 0;
            for (int j = 0; j < 6; j++)
                s[j][i] =0;
        }
    }
    
    public void fill()
    {
        int customer = 0;
        for (int i = 0; i < 3; i++)
        {
           back[i] = 5;
           
           for (int j = 0; j < 6; j++)
           {
               customer += 1;
               s[j][i] = customer;
           }
        } 
    }

    public static void main(String[] args) 
    {
        //construct a 5 x 5 square
        Cashiers cashier = new Cashiers();
        Scanner input = new Scanner (System.in);
        int customer = 0;
        while (true)
        {
            cashier.display();
            System.out.println("Input Command E or 1 or 2 or 3 or F or C or Q");
            String command = input.nextLine();
            
            if("E".equals(command.toUpperCase()))
            {
                customer += 1;
                cashier.enqueue(customer);    
            }
            if("1".equals(command))
                cashier.dequeue(0);
            
            if("2".equals(command))
                cashier.dequeue(1);
            
            if("3".equals(command))
                cashier.dequeue(2);
            
            if("C".equals(command.toUpperCase()))
            {
                cashier.clear();
                cashier.display();
                customer = 0;
            }
            if("F".equals(command.toUpperCase()))
            {
                cashier.clear();
                cashier.fill();
                cashier.display();
                customer = 0;
            }
            else{System.out.println("Input Command E or 1 or 2 or 3 or F or C or Q");}
        }
    }
}