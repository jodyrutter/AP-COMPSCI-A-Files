/**
 * @purpose: Calculate yearly CO2 emissions from electricity (8.10)
 *
 * @author: Jody Rutter
 * @version: 7/22/2015
 */
import java.util.ArrayList;
public class CO2FromElectricity

{
   /**
    * Default constructor with no params. Used for objects of type CO2FromElectricity.
    */
    CO2FromElectricity()
   {
       //The model in the assignment instructs me not to put any instance variables or params in this constructor for this assignment.
   }

   /**
    * Method to calculate the average electrical bill.
    * @param monthlyBill Array list containing monthly electric bills.
    * @return Average electric bill.
    */
   public double calcAverageBill(ArrayList<Double> monthlyBill)
   {
       double sum = 0;
       for(double findAvgBill : monthlyBill)
       {
           sum+= findAvgBill;
       }
       double avgBill = sum/(double)monthlyBill.size();
       return avgBill;
   }

   /**
    * Method to calculate the average price per KWH of electric.
    * @param monthlyPrice Array list containing monthly price of electric.
    * @return Average price of electric.
    */
   public double calcAveragePrice (ArrayList<Double> monthlyPrice)
   {
        double sum = 0;
        for(double findAvgPrice : monthlyPrice)
        {
            sum+= findAvgPrice;
        }
        double avgPrice = sum/(double)monthlyPrice.size();
        return avgPrice;
   }

   /**
    * Method to calculate CO2 emissions by electricity.
    * @param avgBill Average electric bill.
    * @param avgPrice Average price of electricity.
    * @return Yearly CO2 Emissions by electricity.
    */
   public double calcElectricityCO2 (double avgBill, double avgPrice)
   {
       double emissions = (avgBill/avgPrice)*1.37*12;
       return emissions;
   }
}

