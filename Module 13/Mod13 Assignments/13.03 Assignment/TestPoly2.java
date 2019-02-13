/**
 * @purpose Find the center of a shape.
 * 
 * @author Jody Rutter
 * @version 7/4/2015 v1.0
 */
import java.util.ArrayList;
public class TestPoly2
{
    public static void showCenter(ArrayList<Circle2> shapes)
    {
        for(int index = 0; index < shapes.size();index++)
        {
            System.out.println("For "+shapes.get(index)+" "+shapes.get(index).center());
        }
    }
    
    public static void main(String[] args)
    {
        //Create an Arraylist of objects.
        ArrayList<Circle2> shapes = new ArrayList<Circle2>();
        shapes.add(new Circle2(2,4,5));
        shapes.add(new Cylinder2(10,15,59,21));
        shapes.add(new Oval2(25,10,9,12));
        shapes.add(new OvalCylinder2(40,10,1920,1930,50));
        
        showCenter(shapes);
    }
}