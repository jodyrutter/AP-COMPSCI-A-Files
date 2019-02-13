/**
 * The purpose of this program is to calculate the fuel economy of a car for one fill-up.
 * 
 * @author: Jody Rutter
 * @version: 7/17/2015 v1.0
 */
public class CarsV3
{
    //Constructor
    public CarsV3()
    {
    }
    //Calculate distance
    public int calcDistance(int sMiles, int eMiles)
    {
        int distance = eMiles - sMiles;
        return distance;
    }
    //Calculate miles per gallon
    public double calcMPG(int dist, double gals)
    {
        double milesPerGallon = (double)dist/gals;
        return milesPerGallon;
    }
    //Main method
    public static void main(String[] args)
    {
        //Initialize and declare variables
        int startMiles1 = 88333, endMiles1 = 88623, distance1;
        double gallons1 = 11.3;
        double milesPerGallon1;
        String car1 = "Kia";
        CarsV3 cars1 = new CarsV3();
        distance1 = cars1.calcDistance(startMiles1,endMiles1);
        milesPerGallon1 = cars1.calcMPG(distance1,gallons1);
        //I wrote the print statements in the main method because the instructions specified that I should only make 2 methods besides the main. CalcDistance and calcMPG.
        System.out.printf("%52s\n","Gas Mileage Calculations");    
        System.out.printf("%13s %16s %13s %12s %11s %13s\n","Type of Car","Start Miles","End Miles","Distance","Gallons","Miles/Gal");
        System.out.println("===================================================================================");
        System.out.printf("%13s %16d %13d %12d %11.1f %13.1f",car1,startMiles1,endMiles1,distance1,gallons1,milesPerGallon1);
    }
}
