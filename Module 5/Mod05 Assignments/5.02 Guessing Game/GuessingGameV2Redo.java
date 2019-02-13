/**
 * This program is supposed to model a number guessing game between the computer and the user by using while statements and the random method.
 * 
 * @author: Jody Rutter
 * @version: 6/29/2015 v2.0
 */
import java.util.Scanner;
public class GuessingGameV2Redo
{
    public static void main(String[] args)
    {
        //Scanner decleration
        Scanner in = new Scanner(System.in);
        

        
        //Make random number
        System.out.println("Pick an integer minimum range: "); 
        String rangeMin = in.next();
        double rangeMinD = (int)(Double.parseDouble(rangeMin)); //Make int
        int intMinRange = (int)rangeMinD;
        System.out.println("Pick an integer maximum range: ");
        String rangeMax = in.next();
        double rangeMaxD = (int)(Double.parseDouble(rangeMax)); //Make int.
        int intRangeMax = (int)rangeMaxD;
        double sRandNum = Math.random();
        double randNum = (int)((sRandNum*((intRangeMax-intMinRange)+1))+intMinRange);         //Sets random number between range max and min
        int randNumInt = (int)randNum;
        int intGuess = 0;
        int numOfGuesses = 0;
        
        while(intGuess != randNumInt)
        {
            System.out.println("Please enter an integer between "+intMinRange+" and "+intRangeMax+" as a guess: ");
            String guess = in.next();
            System.out.println();
            intGuess = (int)(Double.parseDouble(guess));        //Parse and make to int
            System.out.println("You entered: " + intGuess);
            if(intGuess > randNumInt)
            {
                System.out.println("Too high");
            }
            if(intGuess < randNumInt)
            {
                System.out.println("Too low");
            }
            else  //The surrounding commands will already execute the else. I'm basically telling the program to do nothing.
            {
            }
            numOfGuesses++;
        }
        System.out.println("Congradulations");
        System.out.println("The random number was "+randNumInt); 
        System.out.println("Number of guesses: "+numOfGuesses);
    }
}