/**
 * @purpose Make a textual model of terrain.
 * 
 * @author Jody Rutter
 * @version 7/4/2015 v1.0
 */
public class Mountain extends Terrain
{
    //Private instance variable
    private int myNumberOfMountains;
    /**
     * Constructor for objects of type Mountain.
     * @param length Parameter indicating the length of a game map.
     * @param width Parameter indicating the width of a game map.
     */
    public Mountain(int length, int width, int numberOfMountains)
    {
        super(length, width);
        myNumberOfMountains = numberOfMountains;
    }
    
    /**
     * Method to extend the terrain size string.
     * @return String containing the dimensions of a game map and the number of mountains on that map.
     */
    public String terrainDescription2()
    {
        return "Mountain "+terrainSize()+" and has "+myNumberOfMountains+" mountains.";
    }
    
    /**
     * Getter method to return the number of mountains.
     * @return Number of mountains.
     */
    public int getMountains()
    {
        return myNumberOfMountains;
    }
}