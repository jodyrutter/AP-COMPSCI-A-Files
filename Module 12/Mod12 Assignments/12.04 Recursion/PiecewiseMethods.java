/**
 * @purpose Make piecewise functions into recursive methods.
 * 
 * @author Jody Rutter
 * @version 7/29/2015 v1.0
 */
public class PiecewiseMethods
{
    /**
     * Default constructor for objects of type PiecewiseMethods (no parameters).
     */
    public PiecewiseMethods()
    {
    }
    
    /**
     * 1st piecewise function of the class.
     * @param x Parameter that decides the value of y in the 1st piecewise function.
     */
    public int piecewiseFunction1(int x)
    {
        int y;
        if(x<=10)
        {
            y = -7;
        }
        else
        {
            y = piecewiseFunction1(x - 4)+2;
        }
        return y;
    }
    
    /**
     * 2nd piecewise function of the class.
     * @param x Parameter that desides the value of y in the 2nd piecewise function.
     */
    public int piecewiseFunction2(int x)
    {
        int y;
        if(x<=25)
        {
            y = 20;
        }
        else
        {
            y = piecewiseFunction2(x/12+5)-3;
        }
        return y;
    }
    
    /**
     * 3rd piecewise function of the class.
     * @param x Parameter that decides the value of y in the 3rd piecewise function.
     */
    public int piecewiseFunction3(int x)
    {
        int y;
        if(x>20)
        {
            y = -100;
        }
        else
        {
            y = piecewiseFunction3(x*2)-4;
        }
        return y;
    }
}