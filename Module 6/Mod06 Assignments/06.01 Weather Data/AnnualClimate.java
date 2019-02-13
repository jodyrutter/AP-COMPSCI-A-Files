/**
 * Annual Climate description: Program to model the annual climate of a Florida city.
 *
 * @author: Jody Rutter
 * @version: 7/7/2015
 *
 */

import java.util.Scanner;
class AnnualClimate
{

   	public static void main (String [ ] args)
	{

		//Declare and intialize variables - programmer to provide initial values
		Scanner in = new Scanner(System.in);
		String city = "Daytona Beach";
		String state = "FL";

		String month [] ={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		double temperature [] ={58.4,60.0,64.7,68.9,74.8,79.7,81.7,81.5,79.9,74.0,67.0,60.8}; 		//initialize with Fahrenheit values
		double precipitation [] ={3.1,2.7,3.8,2.5,3.3,5.7,5.2,6.1,6.6,4.5,3.0,2.}; 	//initialize with inches values

		String tempLabel = "F";   //initialize to F
		String precipLabel = "cm"; //initialize to cm


		//INPUT - ask user for temp and preciptation scale choice
		System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
		String tempChoice = in.next();
		System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
		String precipChoice = in.next();


		//PROCESSING - convert from F to C and in to cm based on user's choices
		// remember 5/9 = 0, 5.0/9 = .5555

		if(tempChoice.equalsIgnoreCase("C"))
		{
			tempLabel="(C)";
			for( int index = 0; index < temperature.length; index++)
			{
				//code for assigning new C values to the temperature array
			}

		}

		//Convert in values to cm; replace the current values in precipitation
		if(precipChoice.equalsIgnoreCase("c"))
		{
			precipLabel="(cm)";


		}

		//OUTPUT - print table using printf to format and align data

		System.out.println();
		System.out.println("Climate Data");
		System.out.println("Location: " + city +", " + state);
		System.out.printf("%5s %18s %s %18s %s","Month","Temperature",tempLabel,"Precipitation",precipLabel);
		System.out.println();
		System.out.printf("***************************************************");
		System.out.println();
		double sumT = 0; //Find sum of temp for average
		double sumP = 0; //Find sum of precipitation
		for(int recall = 0;recall<temperature.length;recall++)
		{
		    System.out.println(month[recall]+". \t"+temperature[recall]+". \t"+precipitation[recall]+". \t");
		    sumT+=temperature[recall];
		    sumP+=precipitation[recall];
		}
		double averageTemp = (double)sumT/temperature.length;
		
		System.out.println("Average temp: "+averageTemp+"\t Annual precipitation: "+sumP);




	}//end main
}//end Annual Climate
