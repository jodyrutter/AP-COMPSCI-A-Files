/**
 * This class works to find the amount of CO2 a person emits yearly.
 * 
 * @author Jody Rutter
 * @version 7/21/2015
 */
public class CO2FootPrintV1Tester
{
    public static void main(String[] args)
    {
        //decleration of variable
        double gallonsUsed = 1519.79;
        CO2FootPrintV1 cO2Emissions = new CO2FootPrintV1(gallonsUsed);
        cO2Emissions.calcTonsCO2();
        cO2Emissions.convertTonsToPoundsCO2();
        System.out.printf("%24s\n","CO2 Emissions");
        System.out.printf("%7s %9s %10s\n","Gallons","Pounds","Tons");
        System.out.printf("%6s %11s %11s\n","of Gas","from Gas","from Gas");
        System.out.println("******************************");
        System.out.printf("%6.1f %11.2f %11.3f\n",gallonsUsed,cO2Emissions.getPoundsCO2(),cO2Emissions.getTonsCO2());
    }
}