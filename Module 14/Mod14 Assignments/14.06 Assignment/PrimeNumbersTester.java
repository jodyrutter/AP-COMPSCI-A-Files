import java.util.Scanner;
/**
 * @purpose Calculate prime numbers between 1 and a user specified number.
 * 
 * @author Jody Rutter
 * @version 8/9/2015
 */
public class PrimeNumbersTester
{
    //Scanner for PrimeNumbersTester class.
    private static Scanner in = new Scanner(System.in);
    
    /**
     * Static method to accept and parse input, if the input can be parsed.
     * @return parsedInput.
     */
    public static int acceptInput()
    {
        System.out.println("This program finds all the numbers between 1 and a user specified number.");
        System.out.print("Please enter an integer between 1 and "+Integer.MAX_VALUE+" or enter \"q\" to quit: ");
        String unparsedInput = in.next();
        int notNumeral = 0;
        
        //Used to detect whether input can be parsed. If input cannot be parsed, the method is recalled. If the user enters "q", the program terminates.
        for(int index = 0; index<unparsedInput.length(); index++)
        {
            if((unparsedInput.substring(index, index+1).compareTo("0") >= 0 && unparsedInput.substring(index, index+1).compareTo("9") <= 0) || (unparsedInput.substring(index, index+1).equals(".") && unparsedInput.length() > 1 && unparsedInput.substring(unparsedInput.indexOf(".")+1).indexOf(".") < 0) || (unparsedInput.substring(index, index+1).equals("-") && unparsedInput.length() > 1 && unparsedInput.substring(unparsedInput.indexOf("-")+1).indexOf("-") < 0))
            {
                //Input can be parsed. Overflowing can still occur.
            }
            else if(unparsedInput.equalsIgnoreCase("q"))
            {
                System.exit(0);
            }
            else
            {
                notNumeral ++; //Input cannot be parsed.
            }
        }
        if(notNumeral == 0)
        {
            int parsedInput = (int)Double.parseDouble(unparsedInput);
            parsedInput = Math.abs(parsedInput);
            return parsedInput;
        }
        else
        {
            System.out.println();
            System.out.println("You didn't enter a numeral or \"q\". The input couldn't be parsed.");
            System.out.println("Try again.");
            return acceptInput();
        }
    }
    
    /**
     * Main method.
     */
    public static void main(String[] args)
    {
        //Get value for object.
        int upperLimit = acceptInput();
        
        //Create object
        PrimeNumbers calculatePrimeNumbers = new PrimeNumbers(upperLimit);
        calculatePrimeNumbers.reachLimit();
    }
}
