/**
 * @purpose Calculate annual CO2 production for a person.
 * 
 * @author Jody Rutter
 * @version 7/23/2015
 */
public class CO2Footprint
{
    //Private instance variables
    private int myNumPeople, myBulbs;
    private double myGas, myElectricBill, myElectricPrice, myGasEmissions, myElectricEmissions, myWasteEmissions, myReductionFromRecycling, myReductionFromBulbs, myNetCO2Emissions;
    private boolean myPaper, myPlastic, myGlass, myCans;
    
    /**
     * Constructor for objects of type CO2Footprint.
     * @param gas Annual estimate of gallons of gas used.
     * @param electricBill Average electric bill.
     * @param electricPrice Average electric price per KWH.
     * @param people Number of people living in the household.
     * @param bulbs Number of incandescent bulbs in the house.
     * @param paper Whether or not paper is being recycled.
     * @param plastic Whether or not plastic is being recycled.
     * @param glass Whether or not glass is being recycled.
     * @param cans Whether or not cans are being recycled.
     */
    CO2Footprint(double gas, double electricBill, double electricPrice, int people, int bulbs, boolean paper, boolean plastic, boolean glass, boolean cans)
    {
        myGas = gas;
        myElectricBill = electricBill;
        myElectricPrice = electricPrice;
        myNumPeople = people;
        myBulbs = bulbs;
        myPaper = paper;
        myPlastic = plastic;
        myGlass = glass;
        myCans = cans;
        myGasEmissions = 0.0;    //Values will change later in the program.
        myElectricEmissions = 0.0;
        myWasteEmissions = 0.0;
        myReductionFromRecycling = 0.0;
        myReductionFromBulbs = 0.0;
        myNetCO2Emissions = 0.0;
    }
    
    /**
     * Method to calculate and return total CO2 emissions by gas (no parameters).
     * @return myGasEmissions Total CO2 emissions, in pounds, by gas.
     */
    public double calcCO2FromGas()
    {
        myGasEmissions = myGas * 8.78e-3 * 2204.62;
        return myGasEmissions;
    }
    
    /**
     * Method to calculate and return total CO2 emissions by electric (no parameters).
     * @return myElectricEmissions Total CO2 emissions, in pounds, by electric.
     */
    public double calcCO2FromElectric()
    {
        myElectricEmissions = (myElectricBill/myElectricPrice) * 1.37 * 12;
        return myElectricEmissions;
    }
    
    /**
     * Method to calculate and return total CO2 emissions by waste (no parameters).
     * @return myWasteEmissions Total CO2 emissions, in pounds, from waste(without accounting for recycling).
     */
    public double calcCO2FromWaste()
    {
        myWasteEmissions = 1018.0 * myNumPeople;
        return myWasteEmissions;
    }
    
    /**
     * Method to calculate and return total emission reduction from recycling (no parameters).
     * @return myReductionFromRecycling Total CO2 emissions, in pounds, reduced by recycling.
     */
    public double calcCO2ReductionFromRecycling()
    {
        if(myPaper)
        {
            myReductionFromRecycling += (184.0 * myNumPeople);
        }
        if(myPlastic)
        {
            myReductionFromRecycling += (25.6 * myNumPeople);
        }
        if(myGlass)
        {
            myReductionFromRecycling += (46.6 * myNumPeople);
        }
        if(myCans)
        {
            myReductionFromRecycling += (165.8 * myNumPeople);
        }
        return myReductionFromRecycling;
    }
    
    /**
     * Method to calculate and return total emission reduction from using incandescent bulbs (no parameters).
     * @return myReductionFromBulbs Total CO2 emissions, in pounds, reduced by using incandescent bulbs.
     */
    public double calcCO2ReductionFromBulbs()
    {
        myReductionFromBulbs = myBulbs * 1.37 * 73;
        return myReductionFromBulbs;
    }
    
    /**
     * Method to calculate and return total net emissions (no parameters).
     * @return myNetCO2Emissions Total net CO2 emissions in pounds.
     */
    public double calcNetCO2Emissions()
    {
        myNetCO2Emissions = myGasEmissions + myElectricEmissions + myWasteEmissions - (myReductionFromRecycling + myReductionFromBulbs);
        return myNetCO2Emissions;
    }
}