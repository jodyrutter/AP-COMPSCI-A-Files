/**
 * @purpose Model the dimensions of shapes.
 * 
 * @author Jody Rutter
 * @version 7/5/2015
 */
public class testNew
{
    public static void showEffectBoth(Rectangle3 r)
    {
        System.out.println(r);
    }
    public static void main(String[] args)
    {
        //Initialize objects
        Rectangle3 one = new Rectangle3(5,20);
        Box3 two = new Box3(4,4,4);
        Box3 three = new Box3(4,10,5);
        Cube3 four = new Cube3(4);
        
        //Send objects to be printed on showEffectBoth method.
        showEffectBoth(one);
        showEffectBoth(two);
        showEffectBoth(three);
        showEffectBoth(four);
        
        //Print equities
        if(two.equals(four))
        {
            System.out.println(two.toString()+" is the same size as "+four.toString());
        }
        else
        {
            System.out.println(two.toString()+" is not the same size as "+four.toString());
        }
        
        if(three.equals(four))
        {
            System.out.println(three.toString()+" is the same size as "+four.toString());
        }
        else
        {
            System.out.println(three.toString()+" is not the same size as "+four.toString());
        }
        
    }
}