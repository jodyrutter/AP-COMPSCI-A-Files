/**
 * @purpose Model the dimensions of shapes.
 * 
 * @author Jody Rutter
 * @version 7/3/2015 v1.0
 */
public class Triangle
{
    //Private instance variables of the triangle class.
    private double mySideA, mySideB, mySideC;
    
    /**
     * Constructor for objects of type Triangle.
     * @param sideA Side 1 of a triangle.
     * @param sideB Side 2 of a triangle.
     * @param sideC Side 3 of a triangle.
     */
    public Triangle(double sideA, double sideB, double sideC)
    {
        mySideA = sideA;
        mySideB = sideB;
        mySideC = sideC;
    }
    
    /**
     * Getter method to return mySideA.
     * @return mySideA side 1 of a triangle.
     */
    public double getSideA()
    {
        return mySideA;
    }
    
    /**
     * Getter method to return mySideB.
     * @return mySideB side 2 of a triangle.
     */
    public double getSideB()
    {
        return mySideB;
    }
    
    /**
     * Getter method to return mySideC.
     * @return mySideC side 3 of a triangle.
     */
    public double getSideC()
    {
        return mySideC;
    }
}