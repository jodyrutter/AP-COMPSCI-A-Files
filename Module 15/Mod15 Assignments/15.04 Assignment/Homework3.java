/**
 * @purpose Class to model homework assignments.
 * 
 * @author Jody Rutter
 * @version 8/13/2015
 */
public abstract class Homework3 implements Comparable<Homework3>
{
    //Instance variables
    private int pagesRead;
    private String typeHomework;
    /**
     * Constructor for objects of type Homework.
     */
    public Homework3()
    {
        pagesRead = 0;
        typeHomework = "None";
    }

    /**
     * Method to create assignments.
     * @param p Number of pages to read as homework.
     */
    public abstract void createAssignments(int p);    
    
    /**
     * Setter method to set pages read.
     * @param pages Pages read.
     */
    public void setPagesRead(int pages)
    {
        pagesRead = pages;
    }
    
    /**
     * Getter method to return typeOfHomework.
     * @return Type of homework.
     */
    public void setTypeHomework(String subject)
    {
        typeHomework = subject;
    }    
    
    /**
     * Getter method to return pagesRead.
     * @return Number of pages to read.
     */
    public int getPagesRead()
    {
        return pagesRead;
    }
    
    /**
     * Getter method to return typeOfHomework.
     * @return Type of homework.
     */
    public String getTypeHomework()
    {
        return typeHomework;
    }
    
    
    /**
     * Method to compare number of pages to read.
     * @param science Object indicating an object to be cast to MyScience3 and then compared to another 
     * @return Value indicating the difference in pages read.
     */
    public int compareTo(Homework3 homework)
    {
        if(getPagesRead() == homework.getPagesRead())
        {
            return 0;
        }
        
        return (new Integer(getPagesRead())).compareTo(new Integer(homework.getPagesRead()));
    }
}