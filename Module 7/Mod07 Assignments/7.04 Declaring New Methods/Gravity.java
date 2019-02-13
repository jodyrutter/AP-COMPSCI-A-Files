/**
 * Description for 7.03 Gravity: Program to find the surface gravity of every planet in the solar system.
 *
 * @author: Jody Rutter
 * @version: 7/14/2015
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
public class Gravity
{
	// calcGravity returns an array of doubles containing teh gravity value and takes two arrays of doubles as parameters for the radius values and mass
	public static double[] calcGravity(double[] radius, double[] mass)
	{
	    double[] surfaceGravity = new double[9];
	    for(int index = 0; index<surfaceGravity.length;index++)
	    {
	        surfaceGravity[index] = (6.67e-17 * mass[index])/(Math.pow(radius[index],2));
	    }
	    return surfaceGravity;
	}

	// printResults will print the table to output screen
	public static void printResults(String[] name, double[] radius, double[] mass, double gravity[])
	{
		System.out.printf("%38s\n","Planetary Data");
	    System.out.printf("%8s %20s %15s %15s\n","Planet","Diameter (km)","Mass (kg)","g (m/s^2)");
	    System.out.println("---------------------------------------------------------------");
	    for(int index = 0; index<name.length;index++)
	    {
	        System.out.printf("%8s %20.0f %15.2e %15.2f\n",name[index],(radius[index]*2),mass[index],gravity[index]);
	    }
	}

	//print the gravity values to text file
	public static void printToFile(double[] gravity)throws IOException
	{
		PrintWriter outFile = new PrintWriter (new File("gravity1.txt"));
		for(double printGravity : gravity)
		{
		    outFile.println(printGravity);
		}
		outFile.close();
	}

    public static void main(String[] args)throws IOException
    {
        // Initialize variables
		String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
		double[] radii = {2439.7, 6051.9, 6378, 3402.5, 71492, 60270, 25562, 24774, 1195};
		double[] masses = {3.3022 * Math.pow(10,23), 4.8685 * Math.pow(10,24), 5.9736 * Math.pow(10,24), 6.4185 * Math.pow(10,23), 1.8986 * Math.pow(10,27), 5.6846 * Math.pow(10,26), 8.6810 * Math.pow(10,25), 1.0243 * Math.pow(10,26), 1.312 * Math.pow(10,22)};

		// Processing
		double[] gravities = calcGravity(radii, masses);
		gravities[2] = 10.0; //Round earth's gravity, as instructed by assignment 7.04 instructions
		
		// Output
		printResults(names, radii, masses, gravities);
		printToFile(gravities);
    } //end main
}//end class