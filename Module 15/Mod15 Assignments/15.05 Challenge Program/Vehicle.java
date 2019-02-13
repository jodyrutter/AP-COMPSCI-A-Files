/**
 * @purpose Model an inventory of items.
 * 
 * @author Jody Rutter
 * @version 8/15/2015
 */
public abstract class Vehicle implements Product
{
    public String name;
    public double cost;
    /**
     * Constructor for objects of type Vehicle.
     */
    public Vehicle(String name, double cost)
    {
        this.name = name;
        this.cost = cost;
    }
    
    /**
     * Method to get product name.
     * @return Product name.
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Method to get product cost.
     * @return Product cost.
     */
    public double getCost()
    {
        return this.cost;
    }
}