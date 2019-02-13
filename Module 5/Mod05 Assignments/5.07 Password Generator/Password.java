/**
 * The purpose of this program is to generate secure passwords using loops.
 * 
 * author: Jody Rutter
 * version: 7/2/2015
 */
import java.util.Scanner;
import java.util.Random;
public class Password
{
    public static void main(String[] args)
    {
        //Scanner decleration
        Scanner in = new Scanner(System.in);
        
        //Print menu
        System.out.println("\t\tPassword Generation Menu");
        System.out.println("**********************************************************************");
        System.out.println("*    [1] Lowercase Letters                                           *");
        System.out.println("*    [2] Lowercase & Uppercase Letters                               *");
        System.out.println("*    [3] Lowercase, Uppercase, and Numbers                           *");
        System.out.println("*    [4] Lowercase, Uppercase, Numbers, and Punctuation              *");
        System.out.println("*    [5] Quite                                                       *");
        System.out.println("**********************************************************************");
        System.out.print("Enter Selection (1-5): ");
        String choice = in.next();
        String choice1 = choice.substring(0,1);    //Shorten any long choices into the first letter
        System.out.println();
        System.out.print("Enter Password Length: ");
        String length = in.next();
        System.out.println();
        int lengthP = (int)Double.parseDouble(length);    //Parse and make integer.
        String password = "";
        
        //Loops and conditional statements to generate the password.
        int randNum = 0;
        Random randNumList = new Random();
        if(choice1.equals("1"))
        {
            for(int currentLength = 1;currentLength<=lengthP;currentLength++)
            {
                randNum = randNumList.nextInt(26)+97;
                password+=(char)randNum;
            }
            System.out.println("Password: "+password);
        }
        else if(choice1.equals("2"))
        {
            for(int currentLength = 1;currentLength<=lengthP;currentLength++)
            {
                randNum = 0;
                while( !((randNum>=65) && (randNum<=90))&& !((randNum>=97) && (randNum<=122)))
                {
                    randNum = randNumList.nextInt(58)+65;
                }
                password+=(char)randNum;
            }
            System.out.println("Password: "+password);
        }
        else if(choice1.equals("3"))
        {
            for(int currentLength = 1;currentLength<=lengthP;currentLength++)
            {
                randNum = 0;
                while( !((randNum>=48) && (randNum<=57)) && !((randNum>=65) && (randNum<=90)) && !((randNum>=97) && (randNum<=122)))
                {
                    randNum = randNumList.nextInt(75)+48;
                }
                password+=(char)randNum;
            }
            System.out.println("Password: "+password);
        }
        else if(choice1.equals("4"))
        {
            for(int currentLength = 1;currentLength<=lengthP;currentLength++)
            {
                randNum = randNumList.nextInt(75)+48;
                password+=(char)randNum;
            }
            System.out.println("Password: "+password);
        }
        
        else if(choice1.equals("5"))
        {
            System.exit(0);
        }
        else
        {
            System.out.println("I'm sorry "+choice1+" is not an option.");
        }
    }
}