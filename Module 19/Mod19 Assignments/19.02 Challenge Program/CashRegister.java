/**
 * @purpose Model the cash register of a candy machine.
 * 
 * @author Jody Rutter
 * @version 9/4/2015
 */
public class CashRegister
{
    //Instance variable
    private int cashOnHand;
    /**
     * Default constructor for objects of type CashRegister.
     */
    public CashRegister()
    {
        this.cashOnHand = 500;
    }
    
    /**
     * One parameter constructor for objects of type CashRegister.
     * @param cashOnHand Amount of money in the cash register. Must be greater than zero.
     */
    public CashRegister(int cashOnHand)
    {
        this.cashOnHand = cashOnHand;
        if(cashOnHand <= 0)
        {
            throw new IllegalArgumentException("Cash on hand must be greater than 0");
        }
    }
    
    /**
     * Setter method to set cash on hand.
     * @param newCashOnHand New amount of money in the cash register. Must be greater than zero.
     */
    public void setCashOnHand(int newCashOnHand)
    {
        if(newCashOnHand <= 0)
        {
            throw new IllegalArgumentException("Cash on hand must be greater than 0");
        }
        this.cashOnHand = newCashOnHand;
    }
    
    /**
     * Method to add an amount to cash on hand.
     * @param amountAdded Amount to add to cash on hand.
     */
    public void acceptAmount(int amountAdded)
    {
        if(amountAdded <= 0)
        {
            throw new IllegalArgumentException("Amount added must be greater than 0");
        }
        this.cashOnHand += amountAdded;
    }
}