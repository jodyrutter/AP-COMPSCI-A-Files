/**
 * Program to calculate the Total Daily Energy Expenditure using booleans.
 *
 * @author : Jody Rutter
 * @version : 6/26/2015
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        // Input: Gather information from user
        System.out.print("Please enter your name: ");
        String name = in.nextLine();
        System.out.print("Please enter your BMR: ");
        String basalMRS = in.next();
        double basalMR = Double.parseDouble(basalMRS);
        System.out.print("Please enter your gender (M/F): ");
        String gender = in.next();
        System.out.println();

        // Activity Level Menu
        System.out.println("Select Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Minimal Movement)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athelete, Heavy Manual Labor)");
        System.out.println("[Q] quite");
        System.out.println();
        System.out.print("Enter the letter corresponding to your activity level: ");
        String choice = in.next();
        System.out.println();

        //Processing:

        // Activity Factor
        double activityFactor;
        if (choice.equalsIgnoreCase("A") && gender.equalsIgnoreCase("M"))
        {
            activityFactor = 1.0;
        }
        else if (choice.equalsIgnoreCase("A") && gender.equalsIgnoreCase("F"))
        {
            activityFactor = 1.0;
        }
        else if (choice.equalsIgnoreCase("B") && gender.equalsIgnoreCase("M"))
        {
            activityFactor = 1.3;
        }
        else if (choice.equalsIgnoreCase("B") && gender.equalsIgnoreCase("F"))
        {
            activityFactor = 1.3;
        }
        else if (choice.equalsIgnoreCase("C") && gender.equalsIgnoreCase("M"))
        {
            activityFactor = 1.6;
        }
        else if (choice.equalsIgnoreCase("C") && gender.equalsIgnoreCase("F"))
        {
            activityFactor = 1.5;
        }
        else if (choice.equalsIgnoreCase("D") && gender.equalsIgnoreCase("M"))
        {
            activityFactor = 1.7;
        }
        else if (choice.equalsIgnoreCase("D") && gender.equalsIgnoreCase("F"))
        {
            activityFactor = 1.6;
        }
        else if (choice.equalsIgnoreCase("E") && gender.equalsIgnoreCase("M"))
        {
            activityFactor = 2.1;
        }        
        else if (choice.equalsIgnoreCase("E") && gender.equalsIgnoreCase("F"))
        {
            activityFactor = 1.9;
        }
        else if (choice.equalsIgnoreCase("F") && gender.equalsIgnoreCase("M"))
        {
            activityFactor = 2.4;
        }        
        else if (choice.equalsIgnoreCase("F") && gender.equalsIgnoreCase("F"))
        {
            activityFactor = 2.2;
        }
        else if (choice.equalsIgnoreCase("Q"))
        {
            System.exit(0);
            activityFactor = 0;
        }
        else
        {
            System.out.println("I'm sorry. Choice: \""+choice+"\", or/and Gender: \""+gender+"\" (is)are not (an) option(s).");
            System.out.println("Activity factor set to 0.");
            System.out.println();
            activityFactor = 0;
        }
        
        // Calculate TDEE
        double tDEE = basalMR * activityFactor;

        // Output: Print Results
        System.out.println("Name: " + name + "\t\tGender: " + gender);
        System.out.println("BMR: " + basalMR + " calories "+ "\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories ");

    }
}

