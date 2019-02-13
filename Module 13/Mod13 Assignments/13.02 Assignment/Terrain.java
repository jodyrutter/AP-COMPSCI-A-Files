/**
 * @purpose Make a textual model of terrain.
 * 
 * FLVS 2007
 * @author R. Enger
 * @editor Jody Rutter
 * @version 7/4/2015 v2.0
 */
public class Terrain
{
	// instance variables 
	private int length, width;

	/**
	 * Constructor for objects of class terrain.
	 * @param l Parameter indicating the length of a game map.
	 * @param w Parameter indicating the width of a game map.
	 */
	public Terrain(int l, int w)
	{
		// initialise instance variables
		length = l;
		width = w;
	}

	/**
	 * Makes a string that contains the dimensions of a game map.
	 * @return String containing dimensions of a game map.
	 */
	public String terrainSize()
	{
		return "Land has dimensions " + length + " X " + width;
	}
}
