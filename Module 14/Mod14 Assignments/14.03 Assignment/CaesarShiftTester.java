import java.util.Scanner;
/**
 * @purpose Encrypt or decrypt a message using a Caeser Shift algorithm.
 * 
 * @author Jody Rutter
 * @version 7/7/2015
 */
public class CaesarShiftTester
{
    //Declare scanner.
    public static Scanner in = new Scanner(System.in);
    
    /**
     * Method to print the menu and activate takeInput method.
     */
    public static void printMenu()
    {
        System.out.println("The purpose of this program is to encrypt or decrypt a message using Caesar Shift.");
        System.out.println();
        System.out.println("To encrypt a message, input \"e\".");
        System.out.println("decrypt a message, input \"d\".");
        System.out.println("To quit, input \"q\": ");
        System.out.print("Input choice: ");
        takeInputChoice();
    }
    
    /**
     * Method to take and process input choice.
     */
    public static void takeInputChoice()
    {
        String choice = in.next();
        if(choice.equalsIgnoreCase("q"))
        {
            System.exit(0);
        }
        else if(choice.equalsIgnoreCase("e"))
        {
            CaesarShiftEncryption.encryptedMessage();
        }
        else if(choice.equalsIgnoreCase("d"))
        {
            CaesarShiftDecryption.decryptMessage();
        }
        else
        {
            System.out.println();
            System.out.println("You have entered an invalid option. Try again.");
            System.out.println("To encrypt a message, input \"e\".");
            System.out.println("decrypt a message, input \"d\".");
            System.out.println("To quit, input \"q\": ");
            System.out.print("Input choice: ");
            takeInputChoice();
        }
        
    }
    
    public static void main(String[] args)
    {
        printMenu();
    }
}