/**
 * The purpose of this program is to use the math class to determine the x and y coordinates of points on the unit circle.
 * 
 * @author: Jody Rutter
 * @version: 7/10/2015
 */
public class PointsOnACircleV1
{
    public static void main(String[] args)
    {
        //Declare arrays
        double[] x1Value = new double[21];
        double[] y1Value = new double[21];
        double[] y2Value = new double[21];
        
        //Declare first value for x1
        x1Value[0] = 1.00;
        
        //Find x1Values
        int index = 1;
        while(index<x1Value.length)
        {
            x1Value[index] = x1Value[index-1] - 0.1;
            index++;
        }
        
        //Find y1Values
        index = 0;
        for(double findY1Value : x1Value)
        {
            y1Value[index] = Math.sqrt(1.0-(Math.pow(findY1Value,2)));
            index++;
        }
        
        //Find y2 Values
        index = 0;
        for(double findY2Value : y1Value) 
        {
            y2Value[index] = -findY2Value;
            index++;
        }
        
        //Print output table
        System.out.printf("%34s","Points on a circle of Radius 1.0\n");
        System.out.printf("%3s %7s %12s %7s\n","x1","y1","x1","y2");
        System.out.println("----------------------------------");
        System.out.println();
        index = 0;
        while(index<x1Value.length)
        {
            System.out.printf("%5.2f %7.2f %12.2f %7.2f\n",x1Value[index],y1Value[index],x1Value[index],y2Value[index]);
            index++;
        }
    }
}