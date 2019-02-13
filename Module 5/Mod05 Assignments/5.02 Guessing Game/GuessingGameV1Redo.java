/**
 * This program is supposed to model a number guessing game between the computer and the user by using while statements and the random method.
 * 
 * @author: Jody Rutter
 * @version: 6/29/2015 v1.0
 */
import java.util.Scanner;
public class GuessingGameV1Redo
{
    public static void main(String[] args)
    {
        //Scanner decleration
        Scanner in = new Scanner(System.in);
        

        
        //Make random number   
        double sRandNum = Math.random();
        double RandNum = (sRandNum*100)+1;         //This sets the random number between 1 and 100, and rounds the number up.
        int RandNumInt = (int)RandNum;
        int intGuess = 0;
        int numOfGuesses = 0;
        
        while(intGuess != RandNumInt)
        {
            System.out.println("Please enter an integer between 1 and 100 as a guess: ");
            String guess = in.next();
            System.out.println();
            intGuess = (int)(Double.parseDouble(guess)+0.5);        //Parse and round number up to int
            System.out.println("You entered: " + intGuess);
            if(intGuess > RandNumInt)
            {
                System.out.println("Too high");
            }
            if(intGuess < RandNumInt)
            {
                System.out.println("Too low");
            }
            else  //The surrounding commands will already execute the else. I'm basically telling the program to do nothing.
            {
            }
            numOfGuesses++;
        }
        System.out.println("Congradulations");
        System.out.println("The random number was "+RandNumInt); 
        System.out.println("Number of guesses: "+numOfGuesses);
    }
}