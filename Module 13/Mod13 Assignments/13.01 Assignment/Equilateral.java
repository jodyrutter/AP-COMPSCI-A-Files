/**
 * @purpose Model the dimensions of shapes.
 * 
 * @author Jody Rutter
 * @version 7/3/2015 v1.0
 */
public class Equilateral extends Triangle
{
    /**
     * Constructor for objects of type Equilateral.
     * @param sides Parameter indicating the sides of an equilateral triangle. The value is to be input into the Triangle class and held constant for all 3 sides.
     */
    public Equilateral(double sides)
    {
        super(sides,sides,sides);
    }
}