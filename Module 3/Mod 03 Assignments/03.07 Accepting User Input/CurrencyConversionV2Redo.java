/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate.
 *
 *
 * CSA/FLVS 2011
 * @author Maria Vieta Jacquard
 * @version 09/01/11
 * Revised by Jody Rutter
 * Revision date 6/20/2015
 */
import java.util.Scanner;
public class CurrencyConversionV2Redo
{
    public static void main(String [ ] args)
    {
        //Construct a scanner object
        Scanner pesosSpentS = new Scanner(System.in);
        Scanner yenSpentS = new Scanner(System.in);
        Scanner eurosSpentS = new Scanner(System.in);
        Scanner startingUsDollarsS = new Scanner(System.in);
        Scanner budget1S = new Scanner(System.in);
        Scanner budget2S = new Scanner(System.in);
        
        //local variables
        double pesoExchangeRate = 14.64;                                  // local variable for exchange rate of US Dollars to Pesos
        double yenExchangeRate = 117.10;                                  // local variable for exchange rate of Us Dollars to Yen
        double euroExchangeRate = 0.84;                                   // local variable for exchange rate of US Dollars to Euros
        double dollarsSpentInMexico;                                      // local variable for dollars spent in Mexico
        double dollarsSpentInJapan;                                       // local variable for dollars spent in Japan
        double dollarsSpentInFrance;                                      // local variable for dollars spent in France
        
        //Use scanner methods to enter a value
        System.out.print("Please enter a decimal value for the starting amount in U.S. dollars: ");
        double remainingUsDollars = startingUsDollarsS.nextDouble();
        System.out.print("Please enter a decimal value for the amount of Pesos spent: ");
        double pesosSpent = pesosSpentS.nextDouble();  
        System.out.print("Please enter a decimal value for the amount of Yen spent: ");
        double yenSpent = yenSpentS.nextDouble();  
        System.out.print("Please enter a decimal value for the amount of Euros spent: ");
        double eurosSpent = eurosSpentS.nextDouble();
        System.out.print("Please enter a decimal value for the 1st souvenirs budget: ");
        double budget1 = budget1S.nextDouble();
        System.out.print("Please enter a decimal value for the 2nd souvenirs budget: ");
        double budget2 = budget2S.nextDouble();

        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("Starting US dollars: " + remainingUsDollars);

        // convertion for Mexican pesos
        // code goes below here
        dollarsSpentInMexico = pesosSpent/pesoExchangeRate;
        remainingUsDollars -= dollarsSpentInMexico;
        System.out.println("US dollars spent in Mexico: " + dollarsSpentInMexico);

        
        // convertion for Japanese yen
        // code goes below here
        dollarsSpentInJapan = yenSpent/yenExchangeRate;
        remainingUsDollars -= dollarsSpentInJapan;
        System.out.println("US dollars spent in Japan: " + dollarsSpentInJapan);

        // convertion for Euros
        // code goes below here
        dollarsSpentInFrance = eurosSpent/euroExchangeRate;
        remainingUsDollars -= dollarsSpentInFrance;
        System.out.println("US dollars spent in France: " + dollarsSpentInFrance);


        //print output to the screen
        // code goes below here
        System.out.println("==================================================");
        System.out.println("Remaining US dollars: " + remainingUsDollars); 
        System.out.println();
        System.out.println();


        // Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 4;  						     //cost per item of first souvenir
		int totalItem1 = (int)(budget1/costItem1);       //how many items can be purchased
		double fundsRemaining1 = (budget1%costItem1);    //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItem1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);

		//Calculations for Souvenir #2
		double costItem2 = 32.55;  						//cost per item of second souvenir
		int totalItem2 = (int)(budget2/costItem2); 	    //how many items can be purchased
		double fundsRemaining2 = (budget2%costItem2);  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItem2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

