/**
 * @purpose Sort an inventory of items.
 * 
 * @author Jody Rutter.
 * @version 8/25/2015  v1.0
 */
public class Item
{
    private String itemID, itemName;
    private int inStore;
    private double price;
    /**
     * Constructor for objects of type Item.
     * @param itemID The ID associated with an item.
     * @param itemName The name of an item.
     * @param inStore The quantity of an item in stock.
     * @param price The price of an item.
     */
    public Item(String itemID, String itemName, int inStore, double price)
    {
        this.itemID = itemID;
        this.itemName = itemName;
        this.inStore = inStore;
        this.price = price;
    }
    
    /**
     * Method to change an item's ID.
     * @param newID New ID for an item.
     */
    public void setID(String newID)
    {
        this.itemID = newID;
    }
    
    /**
     * Method to change an item's name.
     * @param newName New name for an item.
     */
    public void setName(String newName)
    {
        this.itemName = newName;
    }
    
    /**
     * Method to change an item's quantity.
     * @param newQuantity New quantity of an item.
     */
    public void setQuantity(int newQuantity)
    {
        this.inStore = newQuantity;
    }
    
    /**
     * Method to change an item's price.
     * @param newPrice New price of an item.
     */
    public void setPrice(double newPrice)
    {
        this.price = newPrice;
    }
    
    /**
     * To string method.
     * @return A string listing the itemID, itenName, inStore quantity, and price.
     */
    public String toString()
    {
        return this.itemID+" "+this.itemName+" "+this.inStore+" "+this.price;
    }
    
    /**
     * Getter method to return the item's ID.
     * @return ID of an item.
     */
    public String getID()
    {
        return this.itemID;
    }
    
    /**
     * Getter method to return an item's Name.
     * @return Name of an item.
     */
    public String getName()
    {
        return this.itemName;
    }
    
    /**
     * Getter method to return an item's in store quantity.
     * @return Item quantity.
     */
    public int getQuantity()
    {
        return this.inStore;
    }
    
    /**
     * Getter method to return an item's price.
     * @return Item price.
     */
    public double getPrice()
    {
        return this.price;
    }
}