/**
 * The purpose of this program is to calculate a car's annual fuel usage.
 * 
 * @author: Jody Rutter
 * @version: 7/21/2015 v1.0
 */
public class AnnualFuelTester
{
    //Main method
    public static void main(String[] args)
    {
        AnnualFuelUse[] fillUpData = {new AnnualFuelUse(6, 88333, 88623, 11.3, 2.38), new AnnualFuelUse(8, 88623, 88720, 3.8, 3.04), new AnnualFuelUse(16, 88720, 89020, 11.5, 2.45) } ;
        
        //Print object data
        System.out.printf("%7s %7s %14s %12s %11s %14s %7s %8s %8s\n","Fill Up","Days","Start Miles","End Miles","Distance","Gallons Used","MPG","Price","Cost");
        for(int index = 0; index<fillUpData.length; index++)
        {
            fillUpData[index].calcDistance();
            fillUpData[index].calcMPG();
            fillUpData[index].calcCost();
            System.out.printf("%4d %9d %12d %13d %11d %14.2f %9.1f %8.2f %8.2f\n",index+1,fillUpData[index].getDays(),fillUpData[index].getStartMiles(),fillUpData[index].getEndMiles(),fillUpData[index].getDistance(),fillUpData[index].getGallonsUsed(),fillUpData[index].getMPG(),fillUpData[index].getPrice(),fillUpData[index].getCost());
        }
        
        //Calculate Max and min distance.
        int maxDistance = Integer.MIN_VALUE;
        int minDistance = Integer.MAX_VALUE;
        for(int index = 0; index<fillUpData.length; index++)
        {
            if(fillUpData[index].getDistance() > maxDistance)
            {
                maxDistance = fillUpData[index].getDistance();
            }
            if(fillUpData[index].getDistance() < minDistance)
            {
                minDistance = fillUpData[index].getDistance();
            }
        }
        
        //Calculate max and min MPG.
        double maxMPG = Double.MIN_VALUE;
        double minMPG = Double.MAX_VALUE;
        for(int index = 0; index<fillUpData.length; index++)
        {
            if(fillUpData[index].getMPG() > maxMPG)
            {
                maxMPG = fillUpData[index].getMPG();
            }
            if(fillUpData[index].getMPG() < minMPG)
            {
                minMPG = fillUpData[index].getMPG();
            }
        }  
        
        //Calculate max and min Price and print.
        double maxPrice = Double.MIN_VALUE;
        double minPrice = Double.MAX_VALUE;
        for(int index = 0; index<fillUpData.length; index++)
        {
            if(fillUpData[index].getPrice() > maxPrice)
            {
                maxPrice = fillUpData[index].getPrice();
            }
            if(fillUpData[index].getPrice() < minPrice)
            {
                minPrice = fillUpData[index].getPrice();
            }
        }            
        System.out.println();
        System.out.printf("%8s %44d %24.1f %8.2f\n","Minimum:",minDistance,minMPG,minPrice);
        System.out.printf("%8s %44d %24.1f %8.2f\n","Minimum:",maxDistance,maxMPG,maxPrice);
        
        //Find totals and print.
        int totalDistance = 0;
        double totalGallonsUsed = 0;
        double totalCost = 0;
        double totalMPG = 0;    //To find the average of MPG.
        for(int index = 0; index<fillUpData.length; index++)
        {
            totalDistance += fillUpData[index].getDistance();
            totalGallonsUsed += fillUpData[index].getGallonsUsed();
            totalCost += fillUpData[index].getCost();
            totalMPG += fillUpData[index].getMPG();
        }
        System.out.println();
        System.out.printf("%7s %45d %14.2f %27.2f\n","Totals:",totalDistance,totalGallonsUsed,totalCost);
        
        //Find annual projection and print.
        double averageMPG = totalMPG/(double)fillUpData.length;
        double nthOfYear = (double)365/fillUpData[fillUpData.length-1].getDays();
        double annualDistance = nthOfYear * totalDistance;
        double annualGallonsUsed = nthOfYear * totalGallonsUsed;
        double annualCost = nthOfYear * totalCost;
        System.out.printf("%18s %34.0f %14.2f %9.2f %17.2f\n","Annual Projection:",annualDistance,annualGallonsUsed,averageMPG,annualCost);
        
    }
}