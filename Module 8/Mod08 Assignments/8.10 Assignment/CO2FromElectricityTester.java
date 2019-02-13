/**
 * @purpose: Calculate yearly CO2 emissions from electricity 8.10
 *
 * @author: Jody Rutter
 * @version: 7/22/2015
 */
import java.util.ArrayList;
public class CO2FromElectricityTester
{
   public static void main(String[] args)
   {
        //Declare object from CO2FromElectricity class.
       	CO2FromElectricity cO2 = new CO2FromElectricity();
     
       	//Declare array lists for monthly bill and montly price.
       	ArrayList<Double> monthlyBill = new ArrayList<Double>(3);
       	ArrayList<Double> monthlyPrice = new ArrayList<Double>(3);

       	//Values to add to the monthly bill.
       	monthlyBill.add(312.79); 
       	monthlyBill.add(349.68);
       	monthlyBill.add(322.06);

       	//Values to add to the monthly Price.
		monthlyPrice.add(0.08256);
		monthlyPrice.add(0.08921);
		monthlyPrice.add(0.08191);

        //Find avgBill, avgPrice, and CO2 emissions from electricity using the CO2 object.
       double avgBill = cO2.calcAverageBill(monthlyBill);
       double avgPrice = cO2.calcAveragePrice(monthlyPrice);
       double emissions = cO2.calcElectricityCO2(avgBill, avgPrice);

        //Print statements.
       System.out.printf("Average Monthly Electricity Bill: %6.2f%n", avgBill);
       System.out.printf("Average Monthly Electricity Price: %4.2f%n", avgPrice);
       System.out.printf("Annual CO2 Emissions from Electricity Usage:   %7.1f pounds", emissions);
   }
}

