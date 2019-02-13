/**
 * @purpose Calculate annual CO2 production for a person.
 * 
 * @author Jody Rutter
 * @version 8/7/2015 v2.0
 */
import java.util.ArrayList;
public class CO2FootprintTesterV2
{
    public static void main(String[] args)
    {
        //Make array list of CO2 objects.
        ArrayList<CO2FootprintV2> cO2 = new ArrayList<CO2FootprintV2>();
        
        //Add objects to array
        cO2.add(new CO2FootprintV2(1519.7, 328.18, 0.08, 4, 20, true, false, false, true));
        cO2.add(new CO2FootprintV2(1008.1, 26.70, 0.11, 1, 5, true, false, false, true));
        cO2.add(new CO2FootprintV2(1241.3, 190.71, 0.13, 3, 15, true, true, true, true));
        cO2.add(new CO2FootprintV2(319, 26.83, 0.11, 1, 5, true, true, true, true));
        cO2.add(new CO2FootprintV2(2321, 419.13, 0.07, 5, 0, false, false, false ,false));
        
        //Print statements
        System.out.printf("%s %29s %20s %20s %10s %19s\n","|","Pounds of CO2","|","Pounds of CO2","|","|");
        System.out.printf("%s %29s %20s %19s %11s %19s\n","|","Emmitted from","|","Reduced from","|","|");
        System.out.printf("%s %7s %6s %15s %4s %8s %5s %12s %3s %10s %3s %16s %2s\n","|","Gas","|","Electricity","|","Waste","|","Recycling","|","New Bulbs","|","CO2 Footprint","|");
        System.out.println("========================================================================================================");
        
        for(int index = 0; index < cO2.size(); index++)
        {
            System.out.printf("%s %10.2f %3s %14.2f %5s %9.2f %4s %11.2f %4s %9.2f %4s %15.2f %3s\n","|",cO2.get(index).calcCO2FromGas(),"|",cO2.get(index).calcCO2FromElectric(),"|",cO2.get(index).calcCO2FromWaste(),"|",cO2.get(index).calcCO2ReductionFromRecycling(),"|",cO2.get(index).calcCO2ReductionFromBulbs(),"|",cO2.get(index).calcNetCO2Emissions(),"|");
        }
        System.out.println("========================================================================================================");
    }
}