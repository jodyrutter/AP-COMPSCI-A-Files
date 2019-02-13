/**
 * @purpose Make a textual model of terrain.
 * 
 * @author Jody Rutter
 * @version 7/4/2015 v1.0
 */
public class Forest extends Terrain
{
    //Private instance variables.
    private int myTrees;
    
    /**
     * Constructor for objects of type Forest.
     * @param length Parameter indicating the length of a game map.
     * @param width Parameter indicating the width of a game map.
     * @param trees Parameter indicating the number of trees on a game map.
     */
    public Forest(int length, int width, int trees)
    {
        super(length, width);
        myTrees = trees;
    }
    
    /**
     * Method to make a string containing the dimensions and amount of trees on a game map.
     * @return String containing the dimensions and amount of trees on a game map.
     */
    public String terrainDescription1()
    {
        return "Forest "+terrainSize()+" and has "+myTrees+" trees.";
    }
}