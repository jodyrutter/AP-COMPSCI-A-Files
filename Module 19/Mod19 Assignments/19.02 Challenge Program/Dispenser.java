/**
 * @purpose Model the dispenser of a candy machine.
 * 
 * @author Jody Rutter
 * @version 9/4/2015
 */
public class Dispenser
{
    //Instance variables
    private int numberOfItems, cost;
    /**
     * Default constructor for objects of type Dispenser.
     */
    public Dispenser()
    {
        this.numberOfItems = 50;
        this.cost = 0;
    }
    
    /**
     * Two parameter constructor for objects of type Dispenser.
     * @param numberOfItems Number of items purchased. Cannot be negative or 0.
     * @param cost Cost of items. Cannot be negative or zero.
     */
    public Dispenser(int numberOfItems, int cost)
    {
        this.numberOfItems = numberOfItems;
        this.cost = cost;
        if(numberOfItems <= 0)
        {
            throw new IllegalArgumentException("Number of items cannot be negative or zero");
        }
        if(cost <= 0)
        {
            throw new IllegalArgumentException("Cost cannot be negative or zero");
        }
    }
    
    /**
     * Method to subtract 1 from numberOfItems.
     */
    public void makeSale()
    {
        this.numberOfItems -= 1;
    }
    
    /**
     * Getter method to return number of items.
     * @return Number of items.
     */
    public int getCount()
    {
        return this.numberOfItems;
    }
    
    /**
     * Getter method to return the cost of items.
     * @return Cost of items.
     */
    public int getProductCost()
    {
        return this.cost;
    }
}