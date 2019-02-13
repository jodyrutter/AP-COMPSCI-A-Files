import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * @purpose Translate English to Morse code.
 * 
 * @author Jody Rutter
 * @version 7/6/2015
 */
public class MorseCode
{
    //Declare Scanner
    Scanner in = new Scanner(System.in);
    /**
     * Static method to accept user input and print a morse code message to screen.
     */
    public static void acceptInput(MorseCode a) throws IOException
    {
        System.out.println("Please enter an English sentence without punctuation: ");
        String input = a.in.nextLine();
        input = input.toLowerCase();
        System.out.println(findMorseCode(input));
    }
    
    /**
     * Static method that returns an English sentence in morse code.
     * @param English string that will be converted to morse code.
     * @return An English sentence in morse code.
     */
    public static String findMorseCode(String morseCode) throws IOException
    {
        String[] lettersAndNumbers = new String[36];
        String[] assignLettersAndNumbers = new String[37];
        File fileName = new File("MorseCodeAlphabet.txt");
        Scanner inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext())
        {
            lettersAndNumbers[index] = inFile.next() + " ";
            index++;
        }
        for(int alphabet = 0; alphabet<=26; alphabet++)
        {
            assignLettersAndNumbers[alphabet] = ""+(char)(alphabet+97);
        }
        for(int numbers = 1; numbers<=10; numbers++)
        {
            assignLettersAndNumbers[numbers+25] = ""+numbers;
        }
        assignLettersAndNumbers[35] = "0";
        String morseCodeOutput = "";
        for(int position = 0; position<morseCode.length(); position++)
        {
            for(int spot = 0; spot<assignLettersAndNumbers.length && spot<lettersAndNumbers.length; spot++)
            {
                if(morseCode.substring(position, position+1).equals(assignLettersAndNumbers[spot]))
                {
                    morseCodeOutput += lettersAndNumbers[spot];
                }
                if(spot == lettersAndNumbers.length - 1 && morseCode.substring(position, position+1).equals(" "))
                {
                    morseCodeOutput += "/ ";
                }
            }
        }
        return morseCodeOutput;
    }
}