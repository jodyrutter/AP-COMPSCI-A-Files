/**
 * @purpose Make piecewise functions into recursive methods.
 * 
 * @author Jody Rutter
 * @version 7/29/2015 v1.0
 */
public class piecewiseMethodsTester
{
    //Main method
    public static void main(String[] args)
    {
        //Declare new object.
        PiecewiseMethods y = new PiecewiseMethods();
        
        //Variables for y values of piecewise functions.
        int y1 = 25;
        int y2 = 30;
        int y3 = 500;
        
        //Print piecewise function answers.
        System.out.println("In the piecewise function:          { f(x-4)+2  if x > 10 ");
        System.out.println("                            f(x) =  {                   ");
        System.out.println("                                    { -7        if x <= 10");
        System.out.println("f("+y1+") = "+y.piecewiseFunction1(y1));
        System.out.println();
        System.out.println("In the piecewise function:          { f(x/12+5)-3  if x > 25 ");
        System.out.println("                            f(x) =  {                        ");
        System.out.println("                                    { 20           if x <= 25");
        System.out.println("f("+y2+") = "+y.piecewiseFunction2(y2));
        System.out.println();
        System.out.println("In the piecewise function:          { f(x*2)-4  if x <= 20 ");
        System.out.println("                            f(x) =  {                      ");
        System.out.println("                                    { -100      if x > 20  ");
        System.out.println("f("+y3+") = "+y.piecewiseFunction3(y3));
        System.out.println();
    }
}