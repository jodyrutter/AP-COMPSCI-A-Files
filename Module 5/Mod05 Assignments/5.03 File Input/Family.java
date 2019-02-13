/**
 * The purpose of this program is to find the percent oombinations of boys and girls in a sample size.
 * 
 * @author: Jody Rutter
 * @version: 6/29/2015 v1.0
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main(String[] args) throws IOException
    {
        //Accept input from text file.
        String token = "";
        Scanner inFile = new Scanner(new File("MaleFemaleInFamily.txt"));
        int boyBoy = 0;
        int girlBoy = 0;
        int girlGirl = 0;
        int sampleSize = 0;
        int sampleSizeFamily = 0;
        while (inFile.hasNext())
        {
            token = inFile.next( );
            if(token.equalsIgnoreCase("BB"))
            {
                boyBoy++;
                sampleSize+=2;
                sampleSizeFamily++;
            }
            else if((token.equalsIgnoreCase("GB"))||(token.equalsIgnoreCase("BG")))
            {
                girlBoy++;
                sampleSize+=2;
                sampleSizeFamily++;
            }
            else if(token.equalsIgnoreCase("GG"))
            {
                girlGirl++;
                sampleSize+=2;
                sampleSizeFamily++;
            }
            else
            {
                System.out.println("Found Unacceptable input");
            }
        }
        double percentBB = ((double)boyBoy/sampleSizeFamily)*100;
        double percentBB10 = (int)((percentBB*10)+0.5);                                                     //Round to tenth.
        double percentBBtp = (percentBB10/10);
        double percentGB = ((double)girlBoy/sampleSizeFamily)*100;
        double percentGB10 = (int)((percentGB*10)+0.5);                                                     //Round to tenth.
        double percentGBtp = (percentGB10/10);
        double percentGG = ((double)girlGirl/sampleSizeFamily)*100;
        double percentGG10 = (int)((percentGG*10)+0.5);                                                     //Round to tenth.
        double percentGGtp = (percentGG10/10);
        System.out.println("Sample Size: "+sampleSize+" people.");
        System.out.println("Sample size: "+sampleSizeFamily+" families.");
        System.out.println("Number of families with two boys: "+boyBoy);
        System.out.println("Percent of families with two boys: "+percentBBtp+"%");
        System.out.println("Number of families with one girl and one boy: "+girlBoy);
        System.out.println("Percent of families with one girl and one boy: "+percentGBtp+"%");
        System.out.println("Number of families with two girls: "+girlGirl);
        System.out.println("Percent of families with two girls: "+percentGGtp+"%");
        inFile.close();
    }
}