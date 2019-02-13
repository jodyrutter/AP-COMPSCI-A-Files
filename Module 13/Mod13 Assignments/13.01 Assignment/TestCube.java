/**
 * @purpose Model the dimensions of shapes.
 * 
 * @author Jody Rutter
 * @version 7/3/2015 v1.0
 */
public class TestCube
{
    public static void main(String[] args)
    {
        //Declare new objects
        Rectangle shapes = new Rectangle(2,4);
        Cube shapes2 = new Cube(4);
        
        //Print statements
        System.out.println("One's dimensions are "+shapes.getLength()+" x "+shapes.getWidth());
        System.out.println("Cube's dimensions are "+shapes2.getLength()+" x "+shapes2.getWidth()+" x "+shapes2.getHeight());
    }
}