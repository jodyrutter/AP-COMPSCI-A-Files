/**
 * The purpose of this program is to calculate the fuel economy of a car for one fill-up.
 * 
 * @author: Jody Rutter
 * @version: 7/20/2015 v3.0
 */
public class CarsV7
{
    private String myCarType;
    private int myEMiles, mySMiles;
    private double myGals, myPricePerGallon;
    //Constructors
    CarsV7()
    {
    }
    public CarsV7(String carType, int eMiles, int sMiles, double gals, double pricePerGallon )
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
}
