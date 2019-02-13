/**
 * @purpose Model the expected distance that a catapult will make an object go.
 * 
 * @author Jody Rutter
 * @version 8/7/2015 v2.0
 */
public class CatapultV2
{
    //Instance variables
    private double mPH, degrees, projectileDistance;
    
    /**
     * Constructor for objects of type Catapult.
     * @param mPH Velocity of object from catapult.
     * @param degrees Launch trajectory.
     */
    public CatapultV2(double mPH, double degrees)
    {
        this.mPH = mPH;
        this.degrees = degrees;
        this.projectileDistance = 0.0;
    }
    
    /**
     * Mutator method to calculate projectile distance(no parameters).
     */
    public void calcProjectileDistance()
    {
        this.projectileDistance = ((Math.pow(this.mPH,2)*Math.sin(Math.toRadians((2*this.degrees))))/9.8)*5280;    //Calculate miles traveled and convert to feet.
    }
    
    /**
     * Getter method to return value of myProjectileDistance(no parameters).
     * @return myProjectileDistance Feet traveled by an object that was catapulted at myMPH and myDegrees.
     */
    public double getProjectileDistance()
    {
        return this.projectileDistance;
    }
}