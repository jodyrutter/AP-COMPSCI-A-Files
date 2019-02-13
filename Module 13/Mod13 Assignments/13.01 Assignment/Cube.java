/**
 * @purpose Model the dimensions of shapes.
 * 
 * @author Jody Rutter
 * @version 7/3/2015 v1.0
 */
public class Cube extends Box
{
    /**
     * Public constructor for objects of type cube.
     * @param dimensions Parameter to indicate the length of one side of the cube. On a cube, width = height = length. There is only the need for one parameter.
     */
    public Cube(int dimensions)
    {
        super(dimensions, dimensions, dimensions);
    }
}