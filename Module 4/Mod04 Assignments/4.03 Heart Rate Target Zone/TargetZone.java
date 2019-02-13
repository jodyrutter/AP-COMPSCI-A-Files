/**
 * Calculate the heart rate target zone using booleans and primative data types and decide if a person's heart rate is within that target zone.
 * 
 * @Jody Rutter 
 * @6/24/2015
 */
import java.util.Scanner;
public class TargetZone
{
    public static void main(String[]args)
    {
        //Scanner decleration
        Scanner in = new Scanner(System.in);
        
        //State purpose in string
        System.out.println("Determine Your Target Heart Rate Zone for Cardiovascular Exercise (50% = 85%)");
        System.out.println();
        
        //Prompt heart rate
        System.out.print("Please enter your age: ");
        String age = in.next();
        System.out.print("Please enter your resting heart rate: ");
        String rHeartRate = in.next();
        System.out.print("Please enter your heart rate after exercising: ");
        String eHeartRate = in.next();
        int intAge = (int)Double.parseDouble(age);
        int rIntHeartRate = (int)Double.parseDouble(rHeartRate);
        int eIntHeartRate = (int)Double.parseDouble(eHeartRate);
        
        //Calculate heart rate target zone min and max
        int mHeartRate = 220 - intAge;
        int hRR = (int)mHeartRate - (int)rIntHeartRate;
        int uTZ = (int)((hRR*0.85)+rIntHeartRate);
        int lTZ = (int)((hRR*0.50)+rIntHeartRate);
        System.out.println("Your heart rate target zone is between "+lTZ+" and "+uTZ);
        
        //Is the heart rate above or below target?
        String met = "within";
        boolean belowTZ = eIntHeartRate <= lTZ;
        if(belowTZ)
            met = "below";
        boolean aboveTZ = eIntHeartRate >= uTZ;
        if(aboveTZ)
            met = "above";
        
        //Print result
        System.out.println("After just exercising, your heart rate is "+met+" your target zone.");
        
    }
}

