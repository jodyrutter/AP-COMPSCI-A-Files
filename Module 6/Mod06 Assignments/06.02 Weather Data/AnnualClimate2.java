/**
 * Annual Climate description: Program to model the annual climate of a Florida city using printf statements to format the output and arrays to organize the data.
 *
 * @author: Jody Rutter
 * @version: 7/7/2015
 *
 */
import java.util.Scanner;
class AnnualClimate2
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
		/*
		double temperature [] ={52.7,55.3,60.7,66.8,74.1,80.0,81.9,81.7,79.1,70.2,62.0,55.2};    //Second set of data from Apalachicola, FL
		double precipitation [] ={4.9,3.8,5.0,3.0,2.6,4.3,7.3,7.3,7.1,4.2,3.6,3.5};
		 */
		String tempLabel = "F";   //initialize to F
		String precipLabel = "in"; //initialize to i


		//INPUT - ask user for temp and preciptation scale choice
		System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
		String tempChoice = in.next();
		System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
		String precipChoice = in.next();
		
		String tempChoice1 = tempChoice.substring(0,1);    //First letter recognition incase the user types in the full word.
		String precipChoice1 = precipChoice.substring(0,1);


		//PROCESSING - convert from F to C and in to cm based on user's choices
		// remember 5/9 = 0, 5.0/9 = .5555

		if(tempChoice1.equalsIgnoreCase("C"))
		{
			tempLabel="(C)";
			for( int index = 0; index < temperature.length; index++)
			{
				temperature[index] = (((double)5/9)*(temperature[index]-32));    //code for assigning new C values to the temperature array
			}

		}
		else if(tempChoice1.equalsIgnoreCase("F"))
		{
		    //Basically I'm saying, do nothing because the code is already in farenheit. No conversion.
		}
		else
		{
		    System.out.println();
		    System.out.println("I'm sorry, this application only reports the temperature in \"F\" and \"C\", not \""+tempChoice+"\". \nSetting temperature choice to F.");
		    System.out.println();
		}

		//Convert in values to cm; replace the current values in precipitation
		if(precipChoice1.equalsIgnoreCase("c"))
		{
			precipLabel="(cm)";
			for( int index = 0; index < precipitation.length; index++)
			{
			    precipitation[index] = precipitation[index]*2.54;    //Convert in to cm.
		    }
		}
		else if(precipChoice1.equalsIgnoreCase("i"))
		{
		    //Basically I'm saying, do nothing because the code is already in inches. No conversion.
		}
		else
		{
		    System.out.println();
		    System.out.println("I'm sorry, this application only reports precipitation in \"i\" and \"cm\", not \""+precipChoice1+"\". \nSetting precipitation choice to i.");
		    System.out.println();
		}

		//OUTPUT - print table using printf to format and align data

		System.out.println();
		System.out.printf("%25s","Climate Data");
		System.out.println();
		System.out.printf("%18s %1s %s %1s","Location:",city,", ",state);
		System.out.println();
		System.out.printf("%5s %18s %s %18s %s","Month","Temperature",tempLabel,"Precipitation",precipLabel);
		System.out.println();
		System.out.printf("***************************************************");
		System.out.println();
		double sumT = 0; //Find sum of temp for average
		double sumP = 0; //Find sum of precipitation
		for(int recall = 0;recall<temperature.length;recall++)
		{
		    System.out.printf("%5s %18.1f %18.1f\n",month[recall],temperature[recall],precipitation[recall]);
		    sumT+=temperature[recall];
		    sumP+=precipitation[recall];
		}
		double averageTemp = (double)sumT/temperature.length;
		System.out.printf("***************************************************");
		System.out.println();
		System.out.printf("%19s %4.1f %12s %5.1f ","Average:",averageTemp,"Annual:",sumP);
		System.out.println();
	}//end main
}//end Annual Climate
