/**
 * @purpose Model an inventory of items.
 * 
 * @author Jody Rutter
 * @version 8/15/2015
 */
public class Tool implements Product, Comparable<Tool>
{
    public String name;
    public double cost;
    
    /**
     * Constructor for objects of type Tool.
     */
    public Tool(String name, double cost)
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
    
    /**
     * Method to compare values in two objects.
     * @param tool Object to be compared to tool.
     * @return A value indicating which object of tool has a greater cost.
     */
    public int compareTo(Tool tool)
    {
        tool = (Tool)tool;
        
        if(new Double(getCost()).compareTo(new Double(tool.getCost())) > 0)
        {
            return 1;
        }
        else if(new Double(getCost()).compareTo(new Double(tool.getCost())) == 0)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
}
