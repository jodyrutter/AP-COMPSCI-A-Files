/**
 * Hurricane description: Program to display hurricane data and find the average strength of hurricanes in the atlantic between 1980 and 2006.
 *
 * @author: Jody Rutter
 * @version: 7/9/2015
 *
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
public class Hurricanes2
{
    public static void main(String[] args)throws IOException
    {
    	//declare and initialize variables
		int arrayLength = 59;
        int [] year = new int[arrayLength];
        String [] month = new String[arrayLength];
        int pressure[] = new int[arrayLength];
        int windSpeed[] = new int[arrayLength];
        String name[] = new String[arrayLength];
        int category[] = new int[arrayLength];
        
        File fileName = new File("hurcdata2.txt");
        Scanner inFile = new Scanner(fileName);

        //INPUT  - read data in from the file
        int index = 0;
        while (inFile.hasNext())
        {
            year[index] = inFile.nextInt();
            month[index] = inFile.next();
            pressure[index] = inFile.nextInt();
            windSpeed[index] = inFile.nextInt();
            name[index] = inFile.next();
            index++;
        }
        inFile.close();
        
		//PROCESSING - calculate and convert values
		// convert windspeed from knots to MPH
		index = 0;
		for(double knotsWindSpeed : windSpeed)
		{
		    
		    windSpeed[index] = (int)((knotsWindSpeed*1.15078)+0.5);    //Round wind speed
		    index++;
		}
		// determine category
		index = 0;
		for(double categoryWind : windSpeed)
		{
		    if((categoryWind >= 74) && (categoryWind < 96))
		    {
		        category[index] = 1;
		    }
		    else if((categoryWind >= 96) && (categoryWind < 111))
		    {
		        category[index] = 2;
		    }
		    else if((categoryWind >= 111) && (categoryWind < 130))
		    {
		        category[index] = 3;
		    }
		    else if((categoryWind >= 130) && (categoryWind < 157))
		    {
		        category[index] = 4;
		    }
		    else if(categoryWind >= 157)
		    {
		        category[index] = 5;
		    }
		    else
		    {
		        category[index] = 0;    //If the wind is less then 74, there isn't a hurricane.
		    }
		    index++;
		}
		// count number of each category
        int category1 = 0;    //Count number of category 1 hurricanes
        int category2 = 0;
        int category3 = 0;
        int category4 = 0;
        int category5 = 0;
		for(int categoryCount : category)
		{
		    if(categoryCount == 1)
		    {
		        category1++;
		    }
		    else if(categoryCount == 2)
		    {
		        category2++;
		    }
		    else if(categoryCount == 3)
		    {
		        category3++;
		    }
		    else if(categoryCount == 4)
		    {
		        category4++;
		    }
		    else if(categoryCount == 5)
		    {
		        category5++;
		    }
		    else
		    {
		        System.out.println("Found 1 storm entered that isn't a hurricane.");
		    }
		}
        //Find min, max and average for category, windspeed and pressure
        
        int max = Integer.MIN_VALUE;
        for(int findMaxCategory : category)
        {
            if(max<=findMaxCategory)
            {
                max=findMaxCategory;
            }
        }
        int maxCategory = max;
        max = Integer.MIN_VALUE;        
        for(int findMaxWindSpeed : windSpeed)
        {
            if(max<=findMaxWindSpeed)
            {
                max=findMaxWindSpeed;
            }
        }
        int maxWindSpeed = max;
        max = Integer.MIN_VALUE;        
        for(int findMaxPressure : pressure)
        {
            if(max<=findMaxPressure)
            {
                max=findMaxPressure;
            }
        }        
        int maxPressure = max;
        int min = Integer.MAX_VALUE;
        for(int findMinCategory : category)
        {
            if(min>=findMinCategory)
            {
                min=findMinCategory;
            }
        }
        int minCategory = min;
        min = Integer.MAX_VALUE;        
        for(int findMinWindSpeed : windSpeed)
        {
            if(min>=findMinWindSpeed)
            {
                min=findMinWindSpeed;
            }
        }        
        int minWindSpeed = min;
        min = Integer.MAX_VALUE;        
        for(int findMinPressure : pressure)
        {
            if(min>=findMinPressure)
            {
                min=findMinPressure;
            }
        }        
        int minPressure = min;
        
        int sumCategory = 0;
        for(int findSumCategory : category)
        {
            sumCategory+=findSumCategory;
        }
        double averageCategory = sumCategory/(double)arrayLength;
        int sumPressure = 0;
        for(int findSumPressure : pressure)
        {
            sumPressure+=findSumPressure;
        }
        double averagePressure = sumPressure/(double)arrayLength;        
        int sumWindSpeed = 0;
        for(int findSumWindSpeed : windSpeed)
        {
            sumWindSpeed+=findSumWindSpeed;
        }      
        double averageWindSpeed = sumWindSpeed/(double)arrayLength;        
        //Output - print table using printf to format the columns
        
        System.out.println("                      Hurricanes 1980 - 2006");
        System.out.println();
        System.out.println("Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
        System.out.println("=====================================================================");
        for(int n=0; n<arrayLength;n++)
        {
            System.out.printf("%4d %14s %8d %13d %20d\n",year[n],name[n],category[n],pressure[n],windSpeed[n]);
        }
        System.out.println("=====================================================================");
        System.out.printf("Average %20.0f %13.0f %20.0f\n",averageCategory,averagePressure,averageWindSpeed);        
        System.out.printf("Maximum %20d %13d %20d\n",maxCategory,maxPressure,maxWindSpeed);
        System.out.printf("Minimum %20d %13d %20d\n",minCategory,minPressure,minWindSpeed);
        System.out.println();
        System.out.println("Numbeter of category 1: "+category1);
        System.out.println("Numbeter of category 2: "+category2);
        System.out.println("Numbeter of category 3: "+category3);
        System.out.println("Numbeter of category 4: "+category4);        
        System.out.println("Numbeter of category 5: "+category5);    
        
        //Make Output file
        PrintWriter outFile = new PrintWriter (new File("Summary.txt"));
        outFile.printf("Average %20.0f %13.0f %20.0f",averageCategory,averagePressure,averageWindSpeed);
        outFile.println();
        outFile.printf("Maximum %20d %13d %20d",maxCategory,maxPressure,maxWindSpeed);
        outFile.println();
        outFile.printf("Minimum %20d %13d %20d",minCategory,minPressure,minWindSpeed);
        outFile.println();
        outFile.println();
        outFile.println("Numbeter of category 1: "+category1);
        outFile.println("Numbeter of category 2: "+category2);
        outFile.println("Numbeter of category 3: "+category3);
        outFile.println("Numbeter of category 4: "+category4);        
        outFile.println("Numbeter of category 5: "+category5);   
        outFile.close();
    
    }//end main()
}//end Hurricanes2
