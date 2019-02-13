/**
 * Write a description of class CountingWithWhileLoops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CountingWithWhileLoops
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        System.out.print("Please set a number to terminate at: ");
        int theTerminator = in.nextInt();
        
        while(counter <= theTerminator)
        {
            System.out.println("terminator = " + theTerminator);
            theTerminator-=9;
        }
    }
}
