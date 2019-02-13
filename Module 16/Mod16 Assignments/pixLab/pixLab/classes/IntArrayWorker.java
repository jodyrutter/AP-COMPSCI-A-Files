public class IntArrayWorker
{
  /** two dimensional matrix */
  private int[][] matrix = null;
  
  /** set the matrix to the passed one
    * @param theMatrix the one to use
    */
  public void setMatrix(int[][] theMatrix)
  {
    matrix = theMatrix;
  }
  
  /**
   * Method to return the total 
   * @return the total of the values in the array
   */
  public int getTotal()
  {
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        total = total + matrix[row][col];
      }
    }
    return total;
  }
  
  /**
   * Method to return the total using a nested for-each loop
   * @return the total of the values in the array
   */
  public int getTotalNested()
  {
    int total = 0;
    for (int[] rowArray : matrix)
    {
      for (int item : rowArray)
      {
        total = total + item;
      }
    }
    return total;
  }
  
  /**
   * Method to fill with an increasing count
   */
  public void fillCount()
  {
    int numCols = matrix[0].length;
    int count = 1;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        matrix[row][col] = count;
        count++;
      }
    }
  }
  
  /**
   * print the values in the array in rows and columns
   */
  public void print()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        System.out.print( matrix[row][col] + " " );
      }
      System.out.println();
    }
    System.out.println();
  }
  
  
  /** 
   * fill the array with a pattern
   */
  public void fillPattern1()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; 
           col++)
      {
        if (row < col)
          matrix[row][col] = 1;
        else if (row == col)
          matrix[row][col] = 2;
        else
          matrix[row][col] = 3;
      }
    }
  }
  
  /**
   * Method to find how many times a given integer occurs in the matrix array.
   * @param passed Variable indicating an integer that the matrix will be searched for.
   * @return Number of times "passed" occurs in the matrix.
   */
  public int getCount(int passed)
  {
      int total = 0;
      for(int row = 0; row<matrix.length; row++)
      {
          for(int column = 0; column<matrix[0].length; column++)
          {
              if(matrix[row][column] == passed)
              {
                  total++;
              }
          }
      }
      return total;
  }
  
  /**
   * Method to find the largest integer in matrix.
   * @return Largest integer in matrix.
   */
  public int getLargest()
  {
      int max = Integer.MIN_VALUE;
      for(int row = 0; row<matrix.length; row++)
      {
          for(int column = 0; column<matrix[0].length; column++)
          {
              if(matrix[row][column] > max)
              {
                  max = matrix[row][column];
              }
          }
      }
      return max;
  }
  
  /**
   * Method that returns the total of all the intergers in a specified column.
   * @param column Column number to find total of.
   * @return Total of a given column.
   */
  public int getColTotal(int column)
  {
      int total = 0;
      if(column > matrix[0].length)
      {
          return 0;
      }
      else
      {
          for(int row = 0; row<matrix.length; row++)
          {
              total += matrix[row][column];
          }
          return total;
      }
  }
}