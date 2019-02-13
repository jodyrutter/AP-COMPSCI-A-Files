/**
 * This program models the ratio of males to females out of a random sample of the Japanese population using the random() method and while loops.
 * 
 * @author: Jody Rutter
 * @version: 6/28/2015
 */
import java.util.Scanner;
public class PopulationRatio
{
    public static void main(String[] args)
    {
        //Scanner decleration
        Scanner in = new Scanner(System.in);
        
        //Random setup
        int males = 0;
        int females = 0;
        int counter = 1;
        double ranNum = 0.0;
        System.out.println("This program is supposed to determine the number of males and females from a random sample of the Japanese populas");
        System.out.println();
        System.out.println("How many people will be in the random sample of the Japanese populas? ");
        String populas = in.next();
        int populasInt = (int)Double.parseDouble(populas);
        
        while(counter <= populasInt)
        {
            ranNum = Math.random();
            
            if(ranNum < 0.475)
            {
                males++;
                System.out.println("Male");
            }
            else
            {
                females++;
                System.out.println("Female");
            }
            counter++;
        }
        System.out.println();
        System.out.println("Number of females = "+females);
        System.out.println("Number of males = "+males);
    }
}
