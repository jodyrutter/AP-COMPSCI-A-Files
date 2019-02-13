/**
 * @purpose Model the dimensions of shapes.
 * 
 * @author Jody Rutter
 * @version 7/3/2015 v1.0
 */
public class Cube3 extends Box3
{
    /**
     * Public constructor for objects of type cube.
     * @param dimensions Parameter to indicate the length of one side of the cube. On a cube, width = height = length. There is only the need for one parameter.
     */
    public Cube3(int dimensions)
    {
        super(dimensions, dimensions, dimensions);
    }
    
    /**
     * Method to give class name.
     * @return Class name to string.
     */
    public String toString()
    {
        return "Cube - "+super.getLength()+" X "+super.getWidth()+" X "+super.getHeight();
    }
}