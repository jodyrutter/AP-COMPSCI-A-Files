/**
 * @purpose Make a textual model of terrain.
 * 
 * @author Jody Rutter
 * @version 7/4/2015 v1.0
 */
public class WinterMountain extends Mountain
{
    //Private instance variable
    private double myTemperature;
    
    /**
     * Constructor for objects of type WinterMountain.
     * @param length Parameter indicating the length of a game map.
     * @param width Parameter indicating the width of a game map.
     * @param mountains Parameter indicating the number of mountains on a game map
     * @param temp Parameter indicating the temperature in the map.
     */
    public WinterMountain(int length, int width, int mountains, double temp)
    {
        super(length, width, mountains);
        myTemperature = temp;
    }
    
    /**
     * Makes a string that contains the dimensions, number of mountains, and temperature of a game map.
     * @return Value containing dimensions, number of mountains, and temperature of a game map.
     */
    public String terrainDescription3()
    {
        return "Winter Mountain "+terrainSize()+ " and has a temperature of "+myTemperature+"ºF and has "+getMountains()+" mountains.";
    }
}