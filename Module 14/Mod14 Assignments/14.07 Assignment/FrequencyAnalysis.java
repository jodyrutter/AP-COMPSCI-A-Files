import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
/**
 * @purpose Decrypt a secret message.
 * 
 * @author Jody Rutter
 * @version 8/10/2015 v1.0
 */
public class FrequencyAnalysis
{
    /**
     * Constructor for objects of type FrequencyAnalysis.
     */
    public FrequencyAnalysis()
    {
    }
    
    /**
     * Method to read in data to analyze letter frequency.
     */
    public void inputForAnalysis() throws IOException
    {
        ArrayList<String> words = new ArrayList<String>(0);
        
        File fileName = new File("ciphertext.txt");
        Scanner inFile = new Scanner(fileName);
        
        int index = 0;
        while(inFile.hasNext())
        {
            words.add(inFile.next());
            index++;
        }
        inFile.close();
        analyze(words);
    }
    
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
     * Method to count the occurences of letters.
     * @param words An array list containing data read in from file that will be used for analysis.
     */
    public void analyze(ArrayList<String> words) throws IOException
    {
        int[] letterOccurences = new int[regularAlphabet.length];
        double[] percentOccurence = new double[letterOccurences.length];
        int numberOfLetters = 0;
        
        //Loops to calculate number of occurences per letter.
        for(int wordCount = 0; wordCount<words.size(); wordCount++)
        {
            for(int letterCount = 0; letterCount<words.get(wordCount).length(); letterCount++)
            {
                for(int alphabetCharacter = 0; alphabetCharacter<regularAlphabet.length; alphabetCharacter++)
                {
                    if(regularAlphabet[alphabetCharacter].equalsIgnoreCase(words.get(wordCount).substring(letterCount, letterCount+1)))
                    {
                        letterOccurences[alphabetCharacter]++;
                        numberOfLetters++;
                    }
                }
            }
        }
        
        //Loop to calculate percent occurences of letters.
        for(int index = 0; index<percentOccurence.length; index++)
        {
            percentOccurence[index] = (letterOccurences[index]/(double)numberOfLetters)*100;
        }
        
        PrintWriter outFile = new PrintWriter (new File("ciphertextfreq.txt"));
        outFile.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        outFile.printf("|%6s   | %12s     | %11s|","Letter","Frequency","Percent");
        outFile.println();
        outFile.println("-------------------------------------------");
        System.out.printf("|%6s   | %12s     | %11s|\n","Letter","Frequency","Percent");
        System.out.println("-------------------------------------------");
        for(int printIndex = 0; printIndex<regularAlphabet.length; printIndex++)
        {
            outFile.printf("|\"%S\"      | %10d       | %10.1f%s|",regularAlphabet[printIndex],letterOccurences[printIndex],percentOccurence[printIndex],"%");
            System.out.printf("|\"%S\"      | %10d       | %10.1f%s|\n",regularAlphabet[printIndex],letterOccurences[printIndex],percentOccurence[printIndex],"%");
            outFile.println();
        outFile.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        }
        outFile.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        outFile.printf("|%5s    | %10d       | %10d%s|","Total",numberOfLetters,100,"%");
        System.out.printf("|%5s    | %10d       | %10d%s|\n","Total",numberOfLetters,100,"%");
        outFile.println();
        outFile.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        outFile.close();
    }
}