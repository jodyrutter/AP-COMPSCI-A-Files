/**
 * @purpose Calculate annual CO2 production for a person.
 * 
 * @author Jody Rutter
 * @version 8/7/2015 v2.0
 */
public class CO2FootprintV2
{
    //Private instance variables
    private int people, bulbs;
    private double gas, electricBill, electricPrice, gasEmissions, electricEmissions, wasteEmissions, reductionFromRecycling, reductionFromBulbs, netCO2Emissions;
    private boolean paper, plastic, glass, cans;
    
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
    CO2FootprintV2(double gas, double electricBill, double electricPrice, int people, int bulbs, boolean paper, boolean plastic, boolean glass, boolean cans)
    {
        this.gas = gas;
        this.electricBill = electricBill;
        this.electricPrice = electricPrice;
        this.people = people;
        this.bulbs = bulbs;
        this.paper = paper;
        this.plastic = plastic;
        this.glass = glass;
        this.cans = cans;
        this.gasEmissions = 0.0;    //Values will change later in the program.
        this.electricEmissions = 0.0;
        this.wasteEmissions = 0.0;
        this.reductionFromRecycling = 0.0;
        this.reductionFromBulbs = 0.0;
        this.netCO2Emissions = 0.0;
    }
    
    /**
     * Method to calculate and return total CO2 emissions by gas (no parameters).
     * @return Total CO2 emissions, in pounds, by gas.
     */
    public double calcCO2FromGas()
    {
        this.gasEmissions = this.gas * 8.78e-3 * 2204.62;
        return this.gasEmissions;
    }
    
    /**
     * Method to calculate and return total CO2 emissions by electric (no parameters).
     * @return Total CO2 emissions, in pounds, by electric.
     */
    public double calcCO2FromElectric()
    {
        this.electricEmissions = (this.electricBill/this.electricPrice) * 1.37 * 12;
        return this.electricEmissions;
    }
    
    /**
     * Method to calculate and return total CO2 emissions by waste (no parameters).
     * @return Total CO2 emissions, in pounds, from waste(without accounting for recycling).
     */
    public double calcCO2FromWaste()
    {
        this.wasteEmissions = 1018.0 * this.people;
        return this.wasteEmissions;
    }
    
    /**
     * Method to calculate and return total emission reduction from recycling (no parameters).
     * @return Total CO2 emissions, in pounds, reduced by recycling.
     */
    public double calcCO2ReductionFromRecycling()
    {
        if(this.paper)
        {
            this.reductionFromRecycling += (184.0 * this.people);
        }
        if(this.plastic)
        {
            this.reductionFromRecycling += (25.6 * this.people);
        }
        if(this.glass)
        {
            this.reductionFromRecycling += (46.6 * this.people);
        }
        if(this.cans)
        {
            this.reductionFromRecycling += (165.8 * this.people);
        }
        return this.reductionFromRecycling;
    }
    
    /**
     * Method to calculate and return total emission reduction from using incandescent bulbs (no parameters).
     * @return Total CO2 emissions, in pounds, reduced by using incandescent bulbs.
     */
    public double calcCO2ReductionFromBulbs()
    {
        this.reductionFromBulbs = this.bulbs * 1.37 * 73;
        return this.reductionFromBulbs;
    }
    
    /**
     * Method to calculate and return total net emissions (no parameters).
     * @return Total net CO2 emissions in pounds.
     */
    public double calcNetCO2Emissions()
    {
        this.netCO2Emissions = this.gasEmissions + this.electricEmissions + this.wasteEmissions - (this.reductionFromRecycling + this.reductionFromBulbs);
        return this.netCO2Emissions;
    }
}