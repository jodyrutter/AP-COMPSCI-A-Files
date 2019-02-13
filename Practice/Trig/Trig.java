import java.util.Scanner;
/**
 * @purpose Do trigonometry.
 * 
 * @author Jody Rutter
 * @version 10/12/2015 v1.0
 */
public class Trig
{
    private Scanner in = new Scanner(System.in);
    public Trig()
    {
        
    }
    public void convertDegreesToRadians()
    {
        String degUnpar = in.next();
        boolean unableToBeParsed = false;
        int startCheck = 0;
        for(int i = startCheck; i<degUnpar.length(); i++)
        {
            if((degUnpar.substring(i,i+1).compareTo("0") >= 0) && (degUnpar.substring(i,i+1).compareTo("9") <= 0))
            {
                //Input can be parsed. Overflowing can still occur.
            }
        }
    }
}