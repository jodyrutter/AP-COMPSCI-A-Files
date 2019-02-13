/**
 * Purpose of the program: Approximate pi and practice static methods.
 * 
 * @author: Jody Rutter
 * @version: 7/16/2015
 */
import java.util.Scanner;
public class DartsRedo
{
    //Get input for darts per trial.
    public static int dartsPerTrial()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many darts/trial? ");
        String dartsPerTrialUnparsed = in.next();
        int dartsPerTrial = (int)Double.parseDouble(dartsPerTrialUnparsed);
        return dartsPerTrial;
    }
    //Get input for number of trials.
    public static int numberOfTrials()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many trials? ");
        String numberOfTrialsUnparsed = input.next();
        int numberOfTrials = (int)Double.parseDouble(numberOfTrialsUnparsed);
        return numberOfTrials;
    }
    //Make random number for X.
    public static double[] randomNumberX(int DartsPerTrial)
    {
        double[] randomX = new double[DartsPerTrial];
        for(int index=0; index<randomX.length; index++)
        {
            randomX[index] = (2*Math.random())-1;
        }
        return randomX;
    }
    //Make random number for Y.
    public static double[] randomNumberY(int DartsPerTrial)
    {
        double[] randomY = new double[DartsPerTrial];
        for(int index=0; index<randomY.length; index++)
        {
            randomY[index] = (2*Math.random())-1;
        }
        return randomY;
    }
    //Calculate number of hits.
    public static int calculateHits(double[] xCoordinate, double[] yCoordinate)
    {
        int hits = 0;
        for(int index = 0; index<xCoordinate.length; index++)
        {
            if(Math.pow(xCoordinate[index],2)+Math.pow(yCoordinate[index],2)<= 1)
            {
                hits++;
            }
            else
            {
                //Do nothing.
            }
        }
        return hits;
    }
    //Approximamte PI.
    public static double approximatePI(int hits,int tries)
    {
        double approximatePI = 4*((double)hits/tries);
        return approximatePI;
    }
    //Estimate of Pi based on all trials
    public static double estimatePI(double[] findApproximatePI)
    {
        double sum = 0;
        for(double findSumApproximatePI : findApproximatePI)
        {
            sum += findSumApproximatePI;
        }
        double estimatePI = sum/(double)findApproximatePI.length;
        return estimatePI;
    }
    //Print
    public static void printApproximatePI(double[] findApproximatePI,double pIEstimate)
    {
        int index = 0;
        for(double printApproximatePI : findApproximatePI)
        {
            System.out.printf("Trial [ %1d]: pi = %9.6f\n",index,printApproximatePI);
            index++;
        }
        System.out.printf("Estimate of pi = %9.6f\n",pIEstimate);
    }
    //Main method.
    public static void main(String[] args)
    {
        int dartsPerTrial = dartsPerTrial();        
        int numberOfTrials = numberOfTrials();
        double[] findApproximatePI = new double[numberOfTrials];
        for(int index = 0; index<findApproximatePI.length;index++)
        {
            double[] xCoordinate = randomNumberX(dartsPerTrial);        
            double[] yCoordinate = randomNumberY(dartsPerTrial);
            int sum = calculateHits(xCoordinate,yCoordinate);
            findApproximatePI[index] = approximatePI(sum,dartsPerTrial);
        }
        double pIEstimate = estimatePI(findApproximatePI);
        printApproximatePI(findApproximatePI,pIEstimate);
        System.out.println("PI is "+Math.PI);
    }
}