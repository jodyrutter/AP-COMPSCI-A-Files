/**
 * @purpose Model the expected distance that a catapult will make an object go.
 * 
 * @author Jody Rutter
 * @version 8/7/2015 v2.0
 */
public class CatapultTesterV2
{
    public static void main(String[] args)
    {
        //Declare 1D array containing values for object.
        double[] mPH = {1,10,20,50,100,500,1000};
        double[] degrees = {1,10,40,45,50,60};
        
        //Declare a 2D array to hold Catapult objects
        CatapultV2[][] launch = new CatapultV2[7][6];
        double[][] projectileDistances = new double[7][6]; 
        for(int row = 0; row < launch.length; row++)
        {
            for(int column = 0; column < launch[0].length; column++)
            {
                launch[row][column] = new CatapultV2(mPH[row],degrees[column]);
                launch[row][column].calcProjectileDistance();
                projectileDistances[row][column] = launch[row][column].getProjectileDistance();
            }
        }
        
        //Print statement for table header.
        System.out.printf("%58s\n","Projectile Distance (feet)");
        System.out.printf("%5s %8.0f %4s %8.0f %4s %8.0f %4s %8.0f %4s %8.0f %4s %8.0f %4s\n","MPH",degrees[0],"deg",degrees[1],"deg",degrees[2],"deg",degrees[3],"deg",degrees[4],"deg",degrees[5],"deg");
        System.out.print("=========================================================================================");
        
        for(int row = 0; row < projectileDistances.length; row++)
        {
            System.out.printf("\n%5.0f",mPH[row]);
            for(int column = 0; column < projectileDistances[0].length; column++)
            {
                System.out.printf("%14.2f",projectileDistances[row][column]);
            }
        }
    }
}
