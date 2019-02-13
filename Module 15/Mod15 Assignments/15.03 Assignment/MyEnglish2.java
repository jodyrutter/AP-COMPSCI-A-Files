/**
 * @purpose Class to model homework assignments.
 * 
 * @author Jody Rutter
 * @version 8/13/2015
 */
public class MyEnglish2 extends Homework2
{
    /**
     * Constructor for objects of type MyEnglish.
     */
    public MyEnglish2()
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
        setTypeHomework("English");
    }
    
    /**
     * Method to subtract 4 pages from reading.
     */
    public void doReading()
    {
        setPagesRead(getPagesRead() - 1);
    }
    
    public String toString()
    {
        return getTypeHomework()+" - Must read "+getPagesRead()+" pages."; 
    }
}