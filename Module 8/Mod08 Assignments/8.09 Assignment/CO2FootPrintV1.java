/**
 * This class works to find the amount of CO2 a person emits yearly.
 * 
 * @author Jody Rutter
 * @version 7/21/2015
 */
class CO2FootPrintV1
{
    //declare private instance variables
    private double myGallonsUsed, myTonsCO2, myPoundsCO2;    //Variables for amount of gallons of gas used, tons of CO2 emited, and pounds of CO2 emited.    
    
    /**
     * Constructor for objects of type CO2FootPrintV1
     * @param myGallonsUsed Variable for gallons of gas used.
     */
    CO2FootPrintV1(double gals)
    {
        myGallonsUsed = gals;
        myTonsCO2 = 0;    //Will change later in the program.
        myPoundsCO2 = 0;
    }
    
    /**
     * Mutator method to calculate the amount of CO2 emitted in tons by myGallons (no parameters).
     */
    public void calcTonsCO2()
    {
        myTonsCO2 = myGallonsUsed * 8.78e-3;
    }
    
    /**
     * Mutator method to calculate the amount of CO2 emited in pounds given myTonsCO2 (no parameters).
     */
    public void convertTonsToPoundsCO2()
    {
        myPoundsCO2 = myTonsCO2 * 2204.62;
    }
    
    /**
     * Getter method to return the value of myTonsCO2 (no parameters).
     * @return Tons of CO2 emitted.
     */
    public double getTonsCO2()
    {
        return myTonsCO2;
    }
    
    /**
     * Getter method to return the value of myPoundsCO2 (no parameters).
     * @return Pounds of CO2 emitted.
     */
    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
}