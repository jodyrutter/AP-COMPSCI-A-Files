/**
 * Heat Index description: Program to model heat index data using for-each loops.
 *
 * @author: Jody Rutter
 * @version: 7/8/2015 v1.0
 *
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class HeatIndex
{
    public static void main(String[] args) throws IOException
    {
    	//initialize and declare vars

        String location = "Key West, Florida";
        File fileNameTemp = new File("KeyWestTemp.txt");
        File fileNameHumid = new File("KeyWestHumid.txt");

        Scanner inFileTemp = new Scanner(fileNameTemp);
        Scanner inFileHumid = new Scanner(fileNameHumid);

        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novermber", "December"};
        int length = month.length;
        double [] temperature = new double[length];
        int [] humidity = new int[length];
        double [] hI = new double[length];

		//INPUT - read in data for temp and humidity from files

		int n = 0; //index value for arrays
        while( inFileTemp.hasNextDouble() )
        {
            temperature[n] = inFileTemp.nextDouble( );
            n++;
        }
        inFileTemp.close();


        n = 0; //reset index to 0
        while (inFileHumid.hasNextDouble())
        {
                humidity[n] = inFileHumid.nextInt( );
                n++;
        }
        inFileHumid.close();

		//PROCESSING - calculate Heat Index if needed.

		double t = 0.0;
		int h = 0;

        for(n = 0; n < hI.length; n++)
        {
            if( temperature[n] >= 80.0 && humidity[n] >= 40 ) //Calculate hI
            {
            	t = temperature[n];
            	h = humidity[n];

                hI[n] = -42.379+(2.04901523*t)+(10.14333127*h)-(0.22475541*t*h)-(6.83783e-3*Math.pow(t,2))-(5.481717e-2*Math.pow(h,2))+(1.22874e-3*Math.pow(t,2)*h)+(8.5282e-4*t*Math.pow(h,2))-(1.99e-6*Math.pow(t,2)*Math.pow(h,2));
            }
            else  // HI is the temperature value
            {
                hI[n] = temperature[n];
            }
        }


        //calculate averages for temperature, humidity and HI

        double tempSum = 0.0;
        double humidSum = 0;
        double hISum = 0.0;

        for(double temp : temperature)
        {
        	tempSum += temp;
        }
        for(double humid : humidity)
        {
            humidSum += humid;
        }
        for(double heatIndex : hI)
        {
            hISum += heatIndex;
        }

        double tempAvg = tempSum/temperature.length;
        double humidAvg = humidSum/humidity.length;
        double hIAvg = hISum/hI.length;
        //OUTPUT - print table. Use enhanced for loops to print the months, temp, humidity and HI

        System.out.printf("     Heat Index: %15s \n ", location);
        System.out.println();
        System.out.println("          Months ");
        System.out.print("            ");
        
        for(String m : month)
        {
            System.out.printf("   %3.3s", m);
        }
        
        System.out.println("  Avg");
        System.out.println("******************************************************************************************");
        System.out.print("Temp (F)    ");
         //for:each loop to print temperature
        for(double tempPrint : temperature)
        {
            System.out.printf("  %4.1f",tempPrint);
        }
        System.out.printf("  %4.1f",tempAvg);

		//print average
        System.out.println();

        System.out.print("Humidity (%)");
        //for:each loop to print humidity
        for(double humidPrint : humidity)
        {
            System.out.printf("  %4.1f",humidPrint);
        }
        System.out.printf("  %4.1f",humidAvg);
        System.out.println();

        System.out.print("HI (F)      ");
        //for:each loop to print HI
        for(double hIPrint : hI)
        {
            System.out.printf("  %4.1f",hIPrint);
        }
        System.out.printf("  %4.1f",hIAvg);
        System.out.println();
    } //end main()
}//end HeatIndex
