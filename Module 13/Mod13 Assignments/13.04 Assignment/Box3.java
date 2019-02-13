/**
 * Box2 demo.
 * 
 * FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Box3 extends Rectangle3
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class box
	 */
	public Box3(int l, int w, int h)
	{
		// call superclass
		super(l, w);
	    // initialise instance variables
		height = h;
	}

	// return the height
	public int getHeight()
	{
		return height;
	}
	
	public String toString()
	{
	    return "Box - "+super.getLength()+" X "+super.getWidth()+" X "+getHeight();
	}
	
	/**
     * Method to test whether two objects are equal.
     * @return boolean telling if two objects are equal.
     */
    public boolean equals(Object boxShape)
    {
        if(!(boxShape instanceof Box3))
        {
            return false;
        }
        Box3 test = (Box3)boxShape;
        return test.getHeight() == getHeight();
    }

}
