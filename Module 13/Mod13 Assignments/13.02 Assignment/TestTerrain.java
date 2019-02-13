/**
 * @purpose Make a textual model of terrain.
 * 
 * @author Jody Rutter
 * @version 7/4/2015 v1.0
 */
public class TestTerrain
{
    public static void main(String[] args)
    {
        //Make objects
        Forest description1 = new Forest(100,200,100);
        Mountain description2 = new Mountain(300,400,25);
        WinterMountain description3 = new WinterMountain(500,600,15,10.0);
        
        //Print statements
        System.out.println(description1.terrainDescription1());
        System.out.println(description2.terrainDescription2());
        System.out.println(description3.terrainDescription3());
    }
}