/**
 * @purpose Model the expected distance that a catapult will make an object go.
 * 
 * @author Jody Rutter
 * @version 7/25/2015 v1.0
 */
public class Catapult
{
    //Instance variables
    private double myMPH, myDegrees, myProjectileDistance;
    
    /**
     * Constructor for objects of type Catapult.
     * @param mPH Velocity of object from catapult.
     * @param degrees Launch trajectory.
     */
    public Catapult(double mPH, double degrees)
    {
        myMPH = mPH;
        myDegrees = degrees;
        myProjectileDistance = 0.0;
    }
    
    /**
     * Mutator method to calculate projectile distance(no parameters).
     */
    public void calcProjectileDistance()
    {
        myProjectileDistance = ((Math.pow(myMPH,2)*Math.sin(Math.toRadians((2*myDegrees))))/9.8)*5280;    //Calculate miles traveled and convert to feet.
    }
    
    /**
     * Getter method to return value of myProjectileDistance(no parameters).
     * @return myProjectileDistance Feet traveled by an object that was catapulted at myMPH and myDegrees.
     */
    public double getProjectileDistance()
    {
        return myProjectileDistance;
    }
}