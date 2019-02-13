/**
 * @purpose Use search methods to find a song in a list of songs.
 * 
 * @author Jody Rutter
 * @version 8/27/2015
 */
public class Music2
{
    //Private instance variables.
    private String title, singer;
    private int year;
    /**
     * Constructor for objects of type Music2.
     * @param title Title of the song.
     * @param year Year the song was released.
     * @param singer Singer of the song.
     */
    public Music2(String title, int year, String singer)
    {
        this.title = title;
        this.year = year;
        this.singer = singer;
    }
    
    /**
     * Setter method to set title.
     * @param newTitle New title.
     */
    public void setTitle(String newTitle)
    {
        this.title = newTitle;
    }
    
    /**
     * Setter method to set year.
     * @param newYear New year.
     */
    public void setYear(int newYear)
    {
        this.year = newYear;
    }
    
    /**
     * Setter method to set singer.
     * @param newSinger New singer.
     */
    public void setSinger(String newSinger)
    {
        this.singer = newSinger;
    }
    
    /**
     * toString method that converts a music object into a string.
     * @return String consisting of a song's title, year, and singer.
     */
    public String toString()
    {
        return this.title+", "+this.year+", "+this.singer;
    }
    
    /**
     * Getter method to return a song title.
     * @return title.
     */
    public String getTitle()
    {
        return this.title;
    }
    
    /**
     * Getter method to return a song year.
     * @return year.
     */
    public int getYear()
    {
        return this.year;
    }
    
    /**
     * Getter method to return a song singer.
     * @return singer.
     */
    public String getSinger()
    {
        return this.singer;
    }
}