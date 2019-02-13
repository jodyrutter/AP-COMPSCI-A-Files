import java.util.Scanner;
/**
 * @purpose Encrypt or decrypt a message using a Caeser Shift algorithm.
 * 
 * @author Jody Rutter
 * @version 7/7/2015
 */
public class CaesarShiftDecryption
{
    //Declare scanner.
    public static Scanner in = new Scanner(System.in);
    
    /**
     * This method asks the user to input a shift key value (0-25).
     * @return the parsed shift key value.
     */
    public static int getInput()
    {
        System.out.println();
        System.out.print("Input the shift key (0 - 25) or input \"q\" to quit: ");
        String unparsedInput = in.nextLine();
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
                notNumeral += 1; //Input cannot be parsed.
            }
        }
        if(notNumeral == 0)
        {
            int parsedInput = (int)Double.parseDouble(unparsedInput);
            
            //While loops to fix input values over 25.
            while(parsedInput > 25)
            {
                parsedInput -= 26;
            }
            while(parsedInput < 0)
            {
                parsedInput += 26;
            }
            return parsedInput;
        }
        else
        {
            System.out.println();
            System.out.println("You didn't enter a numeral or \"q\". The input couldn't be parsed.");
            System.out.println("Try again.");
            return getInput();
        }
    }
    
    //Make shiftKey constant.
    private static final int shiftKey = getInput();
   
    /**
     * Method to get the regular alphabet.
     * @return an Array of the regular alphabet.
     */
    public static String[] generateRegularAlphabet()
    {
        String[] regularAlphabet = new String[26];
        for(int index = 0; index<regularAlphabet.length; index++)
        {
            regularAlphabet[index] = (char)(index+65) + "";
        }
        return regularAlphabet;
    }
    
    //Make regularAlphabet.
    private static final String[] regularAlphabet = generateRegularAlphabet();
    
    /**
     * Method to perform Caesar Shift.
     * @param shiftKey Parameter indicating the shift key of the Caesar Shift.
     * @param textInput Message to perform the Caesar Shift on.
     */
    public static String[] generateCipherAlphabet()
    {
        String[] cipherAlphabet = new String[26];

        for(int index = 0; index<cipherAlphabet.length && index<regularAlphabet.length; index++)
        {
            if(index < shiftKey)
            {
                cipherAlphabet[index] = regularAlphabet[regularAlphabet.length - (shiftKey - index)];
            }
            else if(regularAlphabet.length - index < shiftKey)
            {
                cipherAlphabet[index] = regularAlphabet[index - shiftKey];
            }
            else
            {
                cipherAlphabet[index] = regularAlphabet[index-shiftKey];
            }
        }
        
        //Print cipherAlphabet to screen.
        System.out.print("The cipher alphabet is: ");
        for(String printCipherAlphabet : cipherAlphabet)
        {
            System.out.print(printCipherAlphabet + " ");
        }
        System.out.println();
        return cipherAlphabet;
    }
    
    //Make cipherAlphabet.
    private static final String[] cipherAlphabet = generateCipherAlphabet();
    
    /**
     * Prompt user to enter text input.
     * @return user text input.
     */
    public static String getTextInput()
    {
        System.out.println();
        System.out.print("Enter a message to be decrypted: ");
        String textInput = in.nextLine();
        return textInput;
    }
    
    /**
     * Transform text input with Caesar Shift.
     */
    public static void decryptMessage()
    {
        String translateInput = getTextInput();
        String output = "";
        for(int index = 0; index<translateInput.length() ; index++)
        {
            for(int spot = 0; spot<regularAlphabet.length && spot<cipherAlphabet.length; spot++)
            {
                if(translateInput.substring(index, index+1).equalsIgnoreCase(regularAlphabet[spot]))
                {
                    output += cipherAlphabet[spot];
                }
            }
        }
        System.out.println("The decrypted version is \""+output+"\"");
        System.out.println();

    }
}