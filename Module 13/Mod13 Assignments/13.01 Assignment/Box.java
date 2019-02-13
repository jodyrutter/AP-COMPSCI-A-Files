/**
 * @purpose Model the dimensions of shapes.
 * 
 * FLVS 2007
 * @author R. Enger
 * @editor Jody Rutter
 * @version 7/3/2015 v2.0
 */
public class Box extends Rectangle
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class box
	 */
	public Box(int l, int w, int h)
	{
		// call superclass
		super(l, w);
	    // initialise instance variables
		height = h;
	}

	/**
	 * Getter method to return the height of a shape.
	 * @return height Variable for the height of a shape.
	 */
	public int getHeight()
	{
		return height;
	}

}
