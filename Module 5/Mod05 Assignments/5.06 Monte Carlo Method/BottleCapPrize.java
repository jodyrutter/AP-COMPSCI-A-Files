/**
 * This program determines the average amount of caps a person would have to open to win a e-Boost prize using loops and an output file.
 * 
 * @author: Jody Rutter 
 * @version: 7/1/2015 v1.0
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;
import java.util.Scanner;
public class BottleCapPrize
{
    public static void main(String[] args) throws IOException
    {
        //Print writer decleration and new file decleration and declare new random and Scanner decleration
        PrintWriter outFile = new PrintWriter (new File("e-Boost.txt"));
        Random randNumList = new Random();
        Scanner in = new Scanner(System.in);
      
        //Random number and for loop to determine how many attemps it takes to win the e-boost prize once.
        System.out.print("Enter the number of trials to conduct: ");
        int totalBottleCapsOpened = 0;
        String numOfTrialsS = in.next();
        int numOfTrials = (int)Double.parseDouble(numOfTrialsS);
        for(int trials = 1;trials <=numOfTrials;trials++)
        {
            int win=0;
            int bottleCapsOpened = 0;            
            while(win==0)
            {
                bottleCapsOpened++;
                int randNum = randNumList.nextInt(5)+1;
                totalBottleCapsOpened++;
                if(randNum==1)
                {
                    win++;
                }
            }
            //Print to texxt file
            outFile.println("It took "+bottleCapsOpened+" bottle caps to win one time.");
        }
        double averageAmountToWin = totalBottleCapsOpened/(double)numOfTrials;    //Round to nearest tenth
        double averageAmountToWin10 =(int)((averageAmountToWin*10)+0.5);
        double averageAmountToWinToTenths = (averageAmountToWin10/10);
        System.out.println("The average amount of bottle caps it takes to win once out of "+numOfTrials+" wins is "+averageAmountToWinToTenths);
        outFile.println("The average amount of bottle caps it takes to win once out of "+numOfTrials+" wins is "+averageAmountToWinToTenths);
        System.out.println();
        
        //Close out file
        outFile.close ();
        
        //Read back e-boost.txt
        System.out.println("The data file reads: ");
        String token = "";
        Scanner inFile = new Scanner(new File("e-Boost.txt"));
        while (inFile.hasNext())
        {
            token = inFile.nextLine();
            System.out.println(token);
        }
        
        //Close in file
        inFile.close();
    }
}
