/**
 * @purpose Model the dispenser of a candy machine.
 * 
 * @author Jody Rutter
 * @version 9/4/2015
 */
public class CandyMachine
{
    /**
     * Method to sell a product from a candy machine.
     */
    public static void sellProduct()
    {
        Dispenser sale1 = new Dispenser(100,50);
        sale1.makeSale();
        CashRegister finalizeSale1 = new CashRegister(75);
        finalizeSale1.acceptAmount(sale1.getProductCost());
        System.out.println("Collect your items at the bottom and enjoy.");
    }
    
    /**
     * Main method.
     */
    public static void main(String[] args)
    {
        sellProduct();
    }
}