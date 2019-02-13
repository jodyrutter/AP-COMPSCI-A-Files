/**
 * The purpose of this program is to illustrate the use of the for loop
 * as a counter.
 * 
 * FLVS 2007
 * @author B. Jordan 
 * @version 04/02/2007
 */
import java.util.Scanner;
public class CountingWithForLoops
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Type an int to count to ");
        int theTerminator = in.nextInt();   //initialize the terminating condition
        
        for(int counter = 1; counter <= theTerminator; counter++)     //test the terminating condition
        {
            System.out.println("counter = " + counter);
            
        }//end of for loop  
    }//end of main method
}//end of class
