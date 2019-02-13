/**
 * @purpose Class to model homework assignments.
 * 
 * @author Jody Rutter
 * @version 8/13/2015
 */
public class MyJava2 extends Homework2
{
    /**
     * Constructor for objects of type MyJava.
     */
    public MyJava2()
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
        setTypeHomework("Java");
    }
    
    /**
     * Method to subtract 2 pages from reading.
     */
    public void doReading()
    {
        setPagesRead(getPagesRead() - 4);
    }
    
    public String toString()
    {
        return getTypeHomework()+" - Must read "+getPagesRead()+" pages."; 
    }
}