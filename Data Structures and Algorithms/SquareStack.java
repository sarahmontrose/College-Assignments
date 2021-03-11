//Sarah Montrose
//898715
//midterm
//3-25-19


public class SquareStack 
{
    //square shaped stack
    public int size;    //the size of the edges, not the total number of entries
    public int s [][];
    public int row, col; //location of last entry - the top of the s

    public SquareStack(int n) 
    {//constructor
        //n is the size
        //fill with all 0's
        this.size = n;
        s = new int[size][size];
        this.row = 0;
        this.col = -1;
    }
    public void display() 
    {
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
            {
                if (s[i][j] < 10)
                    System.out.print(" " + s[i][j] + " ");
                else
                    System.out.print(s[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();

        //formatted display with 4 spaces for each entry

        //display the results of the 4 calculation methods
        System.out.println("The corner sum is: " + cornerSum());
        System.out.println("The edge sum is: " + edgeSum());
        System.out.println("The diagonal sum is: " + diagonalSum());
        System.out.println("The square sum is: " + squareSum());
    }

    public boolean push(int newInt)
    {
        //return false and display "Square is full" if full
        //push across the first row, then the second row, etc.
        if (row == size - 1 && col == size - 1) 
        {
            System.out.println("The square is full.");
            return false;
        }
        if (col == size - 1) 
        {
            ++row;
            col = -1;
        }
        s[row][++col] = newInt;
        return true;
    }

    public int pop()
    {
        //pop the last entry pushed or display "Square is empty" and return -1 if empty
        if (row == 0 && col == -1) 
        {
            System.out.println("The square is empty");
            return -1;
        }

        if (col == -1)
        {
            row--;
            col = 4;
        }
        int result = s[row][col];
        s[row][col--] = 0;
        return result;
    }

    //4 calculation methods
    public int cornerSum() 
    { //all 4 corners
        int cornerSum;
        cornerSum = s[0][0] + s[0][size - 1] + s[size - 1][0] + s[size - 1][size - 1];
        return cornerSum;
    }

    public int edgeSum() 
    {
        //all 4 edges, including the corners
        int edgeSum = 0;
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
                if ((i == 0 || i == size - 1) || (j == 0 || j == size - 1))
                    edgeSum += s[i][j];
        }
        return edgeSum;
    }
    
    public int diagonalSum() 
    {//both diagonals: NW to SE and SW to NE
      int diagnolSum = 0;
      for (int i = 0; i < size; i++) 
      {
         for (int j = 0; j < size; j++) 
         {
            if ((j + i == size - 1) || (i == j)) 
            {
               if ((j + i == size - 1) && (i == j))
                  diagnolSum += s[i][j];
            }
         }
      }
      return diagnolSum;
    }
    
    public int squareSum() 
    { //all entries
        int sum = 0;
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
                sum += s[i][j];
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        //construct a 5 x 5 square
        SquareStack sq = new SquareStack(5);
        sq.display();
        //fill the square from 1 to 25
        for (int i = 1; i < 27; i++) sq.push(i);
        sq.display();
        //pop 5 entries
        for (int j = 1; j < 6; j++)
            System.out.println("pop = " + sq.pop());
        sq.display();
        //pop 21 entries - one too many!
        for (int j = 1; j < 22; j++)
            System.out.println("pop = " + sq.pop());
        sq.display();
    }
}