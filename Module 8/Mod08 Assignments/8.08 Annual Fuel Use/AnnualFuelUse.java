/**
 * The purpose of this program is to calculate a car's annual fuel usage.
 * 
 * @author: Jody Rutter
 * @version: 7/21/2015 v1.0
 */
public class AnnualFuelUse
{
    //Declare private variables
    private int myDays, myStartMiles, myEndMiles, myDistance;
    private double myGallonsUsed, myPrice, myMilesPerGallon, myCost;
    
    //Constructor
    public AnnualFuelUse(int days, int startMiles, int endMiles, double gallonsUsed, double price)
    {
        myDays = days;
        myStartMiles = startMiles;
        myEndMiles = endMiles;
        myGallonsUsed = gallonsUsed;
        myPrice = price;
        myDistance = 0;    //This will be set to something else later in the code.
        myMilesPerGallon = 0.0;
        myCost = 0.0;
    }
    
    //Calculate distance
    public void calcDistance()
    {
        myDistance = myEndMiles - myStartMiles;    //Sets myDistance value.
    }
    
    //Calculate MPG
    public void calcMPG()
    {
        myMilesPerGallon = (double)myDistance/myGallonsUsed;
    }
    
    //Calculate cost
    public void calcCost()
    {
        myCost = myPrice * myGallonsUsed;
    }
    
    //Get variables
    public int getDays()
    {
        return myDays;
    }
    public int getStartMiles()
    {
        return myStartMiles;
    }
    public int getEndMiles()
    {
        return myEndMiles;
    }
    public double getGallonsUsed()
    {
        return myGallonsUsed;
    }
    public double getPrice()
    {
        return myPrice;
    }
    public int getDistance()
    {
        return myDistance;
    }
    public double getMPG()
    {
        return myMilesPerGallon;
    }
    public double getCost()
    {
        return myCost;
    }
}
