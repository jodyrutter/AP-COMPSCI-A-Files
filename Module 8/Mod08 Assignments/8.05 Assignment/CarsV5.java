/**
 * The purpose of this program is to calculate the fuel economy of a car for one fill-up.
 * 
 * @author: Jody Rutter
 * @version: 7/17/2015 v2.0
 */
public class CarsV5
{
    private String myCarType;
    private int myEMiles, mySMiles;
    private double myGals, myPricePerGallon;
    //Constructors
    CarsV5()
    {
    }
    public CarsV5(String carType, int eMiles, int sMiles, double gals, double pricePerGallon )
    {
        myCarType = carType;
        myEMiles = eMiles;
        mySMiles = sMiles;
        myGals = gals;
        myPricePerGallon = pricePerGallon;
    }
    //Calculate distance
    public int calcDistance()
    {
        int distance = myEMiles - mySMiles;
        return distance;
    }
    //Calculate miles per gallon
    public double calcMPG(int dist)
    {
        double milesPerGallon = (double)dist/myGals;
        return milesPerGallon;
    }
    //Calculate gallons per mile
    public double calcGPM(int dist)
    {
        double gallonsPerMile = myGals/(double)dist;
        return gallonsPerMile;
    }
    //Calculate total cost
    public double totalCost()
    {
        double totalCost = myGals * myPricePerGallon;
        return totalCost;
    }
    //Main method
    public static void main(String[] args)
    {
        //Initialize and declare variables
        int startMiles1 = 88333, endMiles1 = 88623, distance1;
        double gallons1 = 11.3;
        double milesPerGallon1, gallonsPerMile1,totalCost1;
        double pricePerGallon1 = 2.38;
        String car1 = "Kia";
        CarsV5 cars1 = new CarsV5(car1,endMiles1,startMiles1,gallons1,pricePerGallon1);
        distance1 = cars1.calcDistance();
        milesPerGallon1 = cars1.calcMPG(distance1);
        gallonsPerMile1 = cars1.calcGPM(distance1);
        totalCost1 = cars1.totalCost();
        //I wrote the print statements in the main method because the instructions specified that I should only make 2 methods besides the main. CalcDistance and calcMPG.
        System.out.printf("%73s\n","Gas Mileage Calculations");    
        System.out.printf("%13s %16s %13s %12s %11s %8s %8s %11s %13s\n","Type of Car","Start Miles","End Miles","Distance","Gallons","Price","Cost","Miles/Gal","Gal/Mile");
        System.out.println("=================================================================================================================");
        System.out.printf("%13s %16d %13d %12d %11.2f %8.2f %8.2f %11.1f %13.3f\n",car1,startMiles1,endMiles1,distance1,gallons1,pricePerGallon1,totalCost1,milesPerGallon1,gallonsPerMile1);
    }
}
