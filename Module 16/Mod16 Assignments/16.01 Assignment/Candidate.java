/**
 * @purpose Model a mock election.
 * 
 * @author Jody Rutter
 * @version 8/18/2015 v1.0
 */
public class Candidate
{
    //Instance variables
    String name;
    int numVotes;
    /**
     * Constructor for objects of Candidate.
     * @param name Name of candidate.
     * @param numVotes Number of votes for the candidate.
     */
    public Candidate(String name, int numVotes)
    {
        this.name = name;
        this.numVotes = numVotes;
    }
    
    /**
     * To string method.
     * @return A string listing the candidate and the number of votes they received.
     */
    public String toString()
    {
        return this.name+" received "+this.numVotes+" votes.";
    }
    
    /**
     * Method to get candidate name.
     * @return The name of the candidate.
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Method to get the number of votes a candidate has.
     * @return Number of votes a candidate has.
     */
    public int getNumVotes()
    {
        return this.numVotes;
    }
}