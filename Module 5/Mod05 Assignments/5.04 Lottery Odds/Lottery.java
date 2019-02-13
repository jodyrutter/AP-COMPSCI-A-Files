/**
 * The purpose of this program is to model the lottery using for loops.
 * 
 * @author: Jody Rutter
 * @version: 6/30/2015
 */
import java.util.Scanner;
public class Lottery
{
    public static void main(String[] args)
    {
        //declare and initialized variables and objects
        Scanner in = new Scanner(System.in);
        String lotteryNum = "";
        String userGuess = "";
        
        //Generate a 3-digit "lottery" number composed of random numbers and concatenate it to the lotteryNum string using for loop structure.
        for(int n=1;n<=3;n++)
        {
            double digit = 10*Math.random();
            lotteryNum += (int)digit;
        }
        //Input: Ask user to guess 3 digit number
        System.out.print("Please enter your three numbers (e.g. 123): ");
        userGuess = in.next();
        System.out.println("Winning number: "+lotteryNum);
        //Compare the user's guess to the lottery number and report results
        String digit1 = lotteryNum.substring(0,1);
        String digit2 = lotteryNum.substring(1,2);
        String digit3 = lotteryNum.substring(2,3);
        String userGuessD1 = userGuess.substring(0,1);
        String userGuessD2 = userGuess.substring(1,2);
        String userGuessD3 = userGuess.substring(2,3);
        if((digit1.equals(userGuessD1))&&(digit2.equals(userGuessD2))&&(digit3.equals(userGuessD3)))
        {
            System.out.println("Congradulations, you won both pairs");
        }
        else if((digit1.equals(userGuessD1))&&(digit2.equals(userGuessD2)))
        {
            System.out.println("Congradulations, you won the front pair");
        }
        else if((digit2.equals(userGuessD2))&&(digit3.equals(userGuessD3)))
        {
            System.out.println("Congradulations, you won the back pair");
        }
        else
        {
            System.out.println("I'm sorry, but you have lost");
        }
    } //end main
}//end class Lottery