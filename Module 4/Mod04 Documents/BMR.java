
/**
 * Determine somebody's basal metabolic rate using booleans and primative data types.
 * 
 * @author: Jody Rutter
 * @version: 6/24/2015 v1.0
 */
import java.util.Scanner;
public class BMR
{
    public static void main(String[]args)
    {
        //Scanner decleration
        Scanner in = new Scanner(System.in);
        
        //Scanner input
        System.out.print("Enter your first name: ");
        String fName = in.next();
        System.out.print("Gender (M or F, make sure to use caps): ");
        String sex = in.next();
        System.out.print("Enter your age: ");
        String age = in.next();
        System.out.print("Enter your height in inches: ");
        String height = in.next();
        System.out.print("Enter your weight in pounds: ");
        String weight = in.next();
        System.out.println();
        System.out.println();
        
        //Parsing scanner resulrts
        char wSex = sex.charAt(0);
        int intAge = (int)Double.parseDouble(age);                         //I'm parsing the value as a double instead of an int in order to prevent crashes.
        int intHeight = (int)Double.parseDouble(height);
        int intWeight = (int)Double.parseDouble(weight);
        
        //Calculate BMI
        double cmHeight = intHeight * 2.54;                                //2.54 is the amount of cm in 1 inch.
        double kgWeight = intWeight * 0.453592;                            //0.453592 is the amount of kgs in 1 lbs.
        double p;
        boolean m = wSex == 'M';
        if(m)
            p = ((13.397*kgWeight)+(4.799*cmHeight)-(5.677*intAge)+88.362);     //I didn't need to use parenthasis because order of operations.
        else
            p = ((9.247*kgWeight)+(3.098*cmHeight)-(4.330*intAge)+447.593);
            
        
        //Print statements
        System.out.println("Calculate Your Basal Metabolism");
        System.out.println();
        System.out.println("Name: "+fName);
        System.out.println("Gender: "+wSex);
        System.out.println("Age: "+intAge);
        System.out.println("Height (cm): "+cmHeight);
        System.out.println("Weight (cm): "+kgWeight);
        System.out.println("Basal Metabolic Rate: "+p+" calaries per day");
        
        
    }
}