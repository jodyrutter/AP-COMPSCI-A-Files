/**
 * The purpose of this program is to calculate somebody's body mass index using primative data types and booleans.
 * 
 * @author: Jody Rutter
 * @version: 6/25/2015 v2.0
 */
import java.util.Scanner;
public class BMIrevised
{
    public static void main(String[] args)
    {
        //Scanner decleration
        Scanner in = new Scanner(System.in);
        
        //Data input
        System.out.print("Enter your name (first last): ");
        String firstName = in.next();
        String lastName = in.next();
        System.out.print("Enter your weight in pounds (e.g. 175): ");
        String weightLBS = in.next();
        System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
        String heightF = in.next();
        String heightI = in.next();
        System.out.println();
        
        //BMI calculations
        double weightLBSD = Double.parseDouble(weightLBS);
        double weightKG = weightLBSD*0.453592;                           //0.453592 is the amount of kilograms in 1 pound.
        double weight10KG = (int)((weightKG*10)+0.5);                    //Rounding to first decimal place
        double weightKG1D = weight10KG/10;
        double heightFD = Double.parseDouble(heightF);
        double heightID = Double.parseDouble(heightI);
        double heightM = heightFD/3.28084+heightID/39.3701;              //3.28084 is the amount of feet in 1 meter. 39.3701 is the amount of inches in 1 meter.
        double height10M = (int)((heightM*10)+0.5);                      //Rounding to first decimal place
        double heightM1D = height10M/10;
        double bmi = weightKG/(Math.pow(heightM,2));                     //BMI formula. Math.pow(b,c) makes b to the power of c. I can't use b^c.
        double bmi10Int = (int)((bmi*10)+0.5);                           //I'm rounding to the first decimal place.
        double bmi1D = bmi10Int/10;
        String status;
        //If BMI is under 18.5, underweight status is given. If BMI is above 18.5 but below 24.9, healthy weight status is given. If BMI is above 24.9 but below 29.9, overweight status is given. If anything else, obese status is given.
        if (bmi1D <= 18.5)
            status = "Underweight";
        else if (bmi1D <= 24.9)
            status = "Healthy weight";
        else if (bmi1D <= 29.9)
            status = "Overweight";
        else
            status = "Obese";
        
        //Print statements
        System.out.println("Body Mass Index Calculator");
        System.out.println("==============================");
        System.out.println("Name: "+firstName+" "+lastName);
        System.out.println("Weight (kg): "+weightKG1D);
        System.out.println("Height (m): "+heightM1D);
        System.out.println("BMI: "+bmi1D);
        System.out.println("Category: "+status);
        
    }
}