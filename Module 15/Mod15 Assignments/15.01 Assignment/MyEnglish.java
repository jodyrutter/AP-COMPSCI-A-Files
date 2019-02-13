/**
 * @purpose Class to model homework assignments.
 * 
 * @author Jody Rutter
 * @version 8/13/2015
 */
public class MyEnglish extends Homework
{
    /**
     * Constructor for objects of type MyEnglish.
     */
    public MyEnglish()
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
    
    public String toString()
    {
        return getTypeHomework()+" - Must read "+getPagesRead()+" pages."; 
    }
}