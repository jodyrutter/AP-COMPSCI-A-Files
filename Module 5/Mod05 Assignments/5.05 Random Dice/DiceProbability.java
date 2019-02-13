/**
 * Determine the probability for getting certain sums on a die, using nested loops.
 *
 * @author: Jody Rutter
 * @version: 6/30/2015 v1.0
 */
import java.util.Random;
import java.util.Scanner;
public class DiceProbability
{
    public static void main(String[] args)
    {
    	//Scanner decleration
        Scanner in = new Scanner(System.in);
        //Random decleration
        Random randNum = new Random();
        //Input: ask user for number of rolls and number of sides on a die
        System.out.print("Please enter the number of sides on a die: ");
        String numSidesS = in.next();
        System.out.print("Please enter the number of rolls: ");
        String numRollsS = in.next();
        System.out.print("\n Sum of dice \t Probability \n");
        //Declare and initialize variables and objects
        int numSides = (int)Double.parseDouble(numSidesS);
        int numRolls = (int)Double.parseDouble(numRollsS);
        int match = 0;
        double probability = 0.0;
        int sum = 0;
        int die1 = 0;
        int die2 = 0;
        //For loops to calculate combinations of sums the dice can add up to and probability for reaching those sums
        for( sum = 2; sum <= (numSides * 2); sum++ )
        {   
            match = 0;
            for( int roll  = 0; roll < numRolls; roll++ )
            {
                die1 = randNum.nextInt( numSides ) +1;
                die2 = randNum.nextInt( numSides ) +1;
                if ( die1 + die2 == sum )
                {
                     match++;
                }                 
            }
            probability = (double)match / numRolls * 100;
            System.out.println("    " + sum + "\t\t" + probability );
        }
    }
}
