import java.util.Scanner;
/**
 * @purpose Decide whether a word or phrase is a palindrome or not.
 * 
 * @author Jody Rutter
 * @version 7/30/2015
 */
public class RecursivePalindrome
{
    //Declare scanner.
    Scanner in = new Scanner(System.in);
    
    /**
     * Default constructor for objects of type RecursivePalindrome (no parameters).
     */
    public RecursivePalindrome()
    {
    }
    
    /**
     * Method to prompt user for input, accept input, loop the method until the user enters "q", initialize the isPalindrome method, and print it's results (no parameters).
     */
    public void acceptInput()
    {
        System.out.print("Please enter a word or phrase you wish to test, or enter \"q\" to quite: ");
        String input = in.nextLine();
        if(input.equalsIgnoreCase("q"))
        {
            System.exit(0);
        }
        
        //Print answer.
        String decision;
        if(isPalindrome(input))
        {
            decision = "is";
        }
        else
        {
            decision = "isn't";
        }
        System.out.println("The word/phrase \""+input+"\" "+decision+" a palindrome.");
        acceptInput();
    }
    
    /**
     * Method to decide whether a word or phrase is a palindrome.
     * @param input Parameter that will be tested to decide whether or not it is a palindrome.
     */
    public boolean isPalindrome(String input)
    {
        String formattedInput = helper(input);
        boolean palindromeTest;
        
        if(formattedInput.length() > 1)
        {
            if(formattedInput.substring(0,1).equalsIgnoreCase(formattedInput.substring(formattedInput.length()-1)))
            {
                palindromeTest = isPalindrome(formattedInput.substring(1,formattedInput.length()-1));
            }
            else
            {
                palindromeTest = false;
            }
        }
        else
        {
            palindromeTest = true;
        }
        return palindromeTest;
    }
    
    /**
     * Method that turns an input word or phrase into an all lowercase word or phrase with no punctuation to help isPalindrome decide whether that word or phrase is a palindrome.
     * @param input Parameter that will be converted into an all lowercase word or phrase with no punctuation and fed back to isPalindrome.
     */
    private String helper(String input)
    {
        String formattedInput = input.replaceAll("[!.\",?'/\\-_ ]","");    //Remove punctuation.
        return formattedInput;
    }
}