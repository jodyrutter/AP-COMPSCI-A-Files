/**
 * @purpose Class to model homework assignments.
 * 
 * @author Jody Rutter
 * @version 8/13/2015
 */
public abstract class Homework
{
    //Instance variables
    private int pagesRead;
    private String typeHomework;
    /**
     * Constructor for objects of type Homework.
     */
    public Homework()
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
}