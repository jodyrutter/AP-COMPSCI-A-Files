/**
 * @purpose Class to model homework assignments.
 * 
 * @author Jody Rutter
 * @version 8/13/2015
 */
public class MyMath2 extends Homework2
{
    /**
     * Constructor for objects of type MyMath.
     */
    public MyMath2()
    {
        super();
    }
    
    /**
     * Method to create assignments.
     * @param p Number of pages to read as homework.
     */
    public void createAssignments(int p)
    {
        setPagesRead(p);
        setTypeHomework("Math");
    }
    
    /**
     * Method to subtract 2 pages from reading.
     */
    public void doReading()
    {
        setPagesRead(getPagesRead() - 2);
    }
    
    public String toString()
    {
        return getTypeHomework()+" - Must read "+getPagesRead()+" pages."; 
    }
}