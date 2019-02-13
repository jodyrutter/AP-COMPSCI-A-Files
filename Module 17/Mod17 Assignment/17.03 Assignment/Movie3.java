/**
 * @purpose Sort movies.
 * 
 * @author Jody Rutter
 * @version 8/22/2015 v2.0
 */
public class Movie3
{
    //Instance variables.
    private String title, studio;
    private int year;
    /**
     * Constructor for objects of type Movie2.
     * @param title Title of a movie.
     * @param year Year a movie was made.
     * @param studio Studio that produced the movie.
     */
    public Movie3(String title, int year, String studio)
    {
        this.title = title;
        this.year = year;
        this.studio = studio;
    }
    
    /**
     * Method to set a movie title.
     * @param newTitle new title for the movie.
     */
    public void setTitle(String newTitle)
    {
        this.title = newTitle;
    }
    
    /**
     * Method to set a movie year.
     * @param newYear new year the movie was made in.
     */
    public void setYear(int newYear)
    {
        this.year = newYear;
    }
    
    /**
     * Method to set the movie studio.
     * @param newStudio new studio the movie was produced by.
     */
    public void setStudio(String newStudio)
    {
        this.studio = newStudio;
    }
    
    /**
     * To string method.
     * @return A string listing the movies, the years the movies were made in, and the studio the movies were produced by.
     */
    public String toString()
    {
        return this.title+", "+this.year+", "+this.studio;
    }
    
    /**
     * Getter method to return the movie title.
     * @return Movie title.
     */
    public String getTitle()
    {
        return this.title;
    }
    
    /**
     * Getter method to return the year the movie was made in.
     * @return Movie year.
     */
    public int getYear()
    {
        return this.year;
    }
    
    /**
     * Getter method to return the studio that produced the movie.
     * @return Movie studio.
     */
    public String getStudio()
    {
        return this.studio;
    }
}