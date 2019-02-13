/**
 * Description for 7.04 Weight project: Calculate the weight of an object on another planet.
 *
 * @author: Jody Rutter
 * @version: 7/14/2015
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Weight
{
    //Read in surface gravity from file
    public static double[] getGravity() throws IOException
    {
        File fileName = new File("gravity1.txt");
        Scanner inFile = new Scanner(fileName);
        double[] gravity = new double[9];
        int index = 0;
        while(inFile.hasNext())
        {
            gravity[index] = (inFile.nextDouble()/10);
            index++;
        }
        inFile.close();
        return gravity;
    }
    //Calculate weight
    public static double[] calcWeight(double earthWeight, double[] gravity)
    {
        double[] weight = new double[9];
        for(int index = 0; index<weight.length;index++)
        {
            weight[index] = ((earthWeight*433.59237)*gravity[index])/433.59237;
        }
        return weight;
    }
    //Print results
    public static void printResults(String[] names, double[] gravity, double[] weight)
    {
        System.out.printf("%33s\n","My Weight on the Planets");
        System.out.printf("%9s %15s %17s\n","Planet","Gravity","Weight(lbs)");
        System.out.println("-----------------------------------------");
        for(int index = 0; index<names.length; index++)
        {
            System.out.printf("%9s %15.2f %17.2f\n",names[index],gravity[index],weight[index]);
        }
    }
    //Main method
    public static void main(String[] args)throws IOException
	{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your weight on Earth: ");
        String unparsedEarthWeight = in.next();
		double earthWeight = Double.parseDouble(unparsedEarthWeight); 

		String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
		double[] gravity = getGravity(); 
		double[] weight = calcWeight(earthWeight, gravity);
		printResults(names, gravity, weight); 

    } //end main
}//end class