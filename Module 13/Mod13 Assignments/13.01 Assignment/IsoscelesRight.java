/**
 * @purpose Model the dimensions of shapes.
 * 
 * @author Jody Rutter
 * @version 7/3/2015 v1.0
 */
public class IsoscelesRight extends Triangle
{
    /**
     * Constructor for objects of type IsoscelesRight.
     * @param legs Variable indicating the size of the legs of an isosceles right triangle.
     */
    public IsoscelesRight(double legs)
    {
        super(legs,legs, (Math.pow((Math.pow(legs,2) + Math.pow(legs,2)),((double)1/2))));
    }
}