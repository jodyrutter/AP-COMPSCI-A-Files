/**
 * The purpose of this program is to calculate the fuel economy of a car for one fill-up.
 * 
 * @author: Jody Rutter
 * @version: 7/20/2015 v3.0
 */
public class CarsV7Tester
{
    //Main method
    public static void main(String[] args)
    {
        //Initialize and declare variables
        int startMiles1 = 88333, endMiles1 = 88623, distance1;    //Some values are kept constant for comparison purposes, as suggested in the assignment instructions.
        int startMiles2 = 88333, endMiles2 = 88623, distance2;
        int startMiles3 = 88333, endMiles3 = 88623, distance3;
        double milesPerGallon1, gallonsPerMile1,totalCost1,gallons1 = 11.3,pricePerGallon1 = 2.38;
        double milesPerGallon2, gallonsPerMile2,totalCost2,gallons2 = 5.81,pricePerGallon2 = 2.38;
        double milesPerGallon3, gallonsPerMile3,totalCost3,gallons3 = 19.4,pricePerGallon3 = 2.38;
        String car1 = "Kia";
        String car2 = "Toyota Prius";
        String car3 = "Hummer H3";
        CarsV7 cars1 = new CarsV7(car1,endMiles1,startMiles1,gallons1,pricePerGallon1);    //Object 1
        CarsV7 cars2 = new CarsV7(car2,endMiles2,startMiles2,gallons2,pricePerGallon2);    //Object 2
        CarsV7 cars3 = new CarsV7(car3,endMiles3,startMiles3,gallons3,pricePerGallon3);    //Object 3
        distance1 = cars1.calcDistance();
        distance2 = cars2.calcDistance();
        distance3 = cars3.calcDistance();
        milesPerGallon1 = cars1.calcMPG(distance1);
        milesPerGallon2 = cars2.calcMPG(distance2);
        milesPerGallon3 = cars3.calcMPG(distance3);
        gallonsPerMile1 = cars1.calcGPM(distance1);
        gallonsPerMile2 = cars2.calcGPM(distance2);
        gallonsPerMile3 = cars3.calcGPM(distance3);
        totalCost1 = cars1.totalCost();
        totalCost2 = cars2.totalCost();
        totalCost3 = cars3.totalCost();
        //I wrote the print statements in the main method because the instructions specified that I should only make 2 methods besides the main. CalcDistance and calcMPG.
        System.out.printf("%73s\n","Gas Mileage Calculations");    
        System.out.printf("%13s %16s %13s %12s %11s %8s %8s %11s %13s\n","Type of Car","Start Miles","End Miles","Distance","Gallons","Price","Cost","Miles/Gal","Gal/Mile");
        System.out.println("=================================================================================================================");
        System.out.printf("%13s %16d %13d %12d %11.2f %8.2f %8.2f %11.1f %13.3f\n",car1,startMiles1,endMiles1,distance1,gallons1,pricePerGallon1,totalCost1,milesPerGallon1,gallonsPerMile1);
        System.out.printf("%13s %16d %13d %12d %11.2f %8.2f %8.2f %11.1f %13.3f\n",car2,startMiles2,endMiles2,distance2,gallons2,pricePerGallon2,totalCost2,milesPerGallon2,gallonsPerMile2);
        System.out.printf("%13s %16d %13d %12d %11.2f %8.2f %8.2f %11.1f %13.3f\n",car3,startMiles3,endMiles3,distance3,gallons3,pricePerGallon3,totalCost3,milesPerGallon3,gallonsPerMile3);        
    }
}