/**
 * @purpose Determine a fabbacci number given its place.
 * 
 * @author Jody Rutter
 * @version 7/29/2015 v1.0
 */
import java.util.Scanner;
public class FibonacciNumbers
{
    //Declare scanner
    Scanner in = new Scanner(System.in);
    /**
     * Default constructor for objects of type FibonacciNumbers (no parameters).
     */
    public FibonacciNumbers()
    {
    }
    
    /**
     * Method to accept user input for fibonacciNumber place value, print the output from the fibonacciNumber method, and loop the method until the user enters "q" (no parameters).
     */
    public void loopFibonacciNumber()
    {
        System.out.print("Enter the place value of the fibonacci number you wish to find: ");
        String unparsedPlace = in.next();
        if(unparsedPlace.equalsIgnoreCase("q"))
        {
            System.exit(0);    //Exit program
        }
        int place = (int)Double.parseDouble(unparsedPlace);
        System.out.println("The fibonacchi number of place "+place+" is "+fibonacciNumber(place));
        loopFibonacciNumber();
   }
    
    /**
     * Method to find the nth fibonacci number.
     * @param n Variable that stands for the place value of a fibonacci number.
     */
    public int fibonacciNumber(int n)
    {
        int num = 0;
        if(n<=46 && n>1)
        {
            num += fibonacciNumber(n-1) + fibonacciNumber(n-2);
        }
        else if(n>46)
        {
            System.out.println("The number you entered is to high.");
            System.out.println("This program can only find a fibonnacci number with a place value of 46 or less.");
            System.out.println("The value will be set to 0 and printed.");
        }
        else if(n==1)
        {
            num = 1;
        }
        else if(n==0)
        {
            num = 0;
        }
        else
        {
            System.out.println("I'm sorry, this program doesn't work with negative numbers.");
            System.out.println("The value will be set to 0 and printed.");
        }
        return num;
    }
}