/**
 * @purpose Model a mock election.
 * 
 * @author Jody Rutter
 * @version 8/18/2015 v3.0
 */
public class CandidateV3
{
    //Instance variables
    String name;
    int numVotes;
    /**
     * Constructor for objects of Candidate.
     * @param name Name of candidate.
     * @param numVotes Number of votes for the candidate.
     */
    public CandidateV3(String name, int numVotes)
    {
        this.name = name;
        this.numVotes = numVotes;
    }
    
    /**
     * Setter method to change the name.
     * @param replacement Name to replace the current name.
     */
    public void setName(String replacement)
    {
        this.name = replacement;
    }
    
    /**
     * Setter method to change the number of votes.
     * @param replacement Number of votes to replace the current number of votes.
     */
    public void setNumVotes(int replacement)
    {
        this.numVotes = replacement;
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