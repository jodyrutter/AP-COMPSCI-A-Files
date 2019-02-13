/**
 * @purpose Model the dimensions of shapes.
 * 
 * FLVS 2007
 * @author R. Enger
 * @editor Jody Rutter
 * @version 7/3/2015 v2.0
 */
public class Rectangle
{
	// instance variables 
	private int length;
	private int width;

	/**
	 * Constructor for objects of class rectangle
	 */
	public Rectangle(int l, int w)
	{
		// initialise instance variables
		length = l;
		width = w;
	}

	/**
	 * Getter method to return the length of a shape.
	 * @return length Variable for the length of a shape.
	 */
	public int getLength()
	{
		return length;
	}
	
	/**
	 * Getter method to return the width of a shape.
	 * @return width Variable for the width of a shape.
	 */
	public int getWidth()
	{
	    return width;
	}
	   
}
