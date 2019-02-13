import java.util.*;
/**
 * @purpose Model a mock election.
 * 
 * @author Jody Rutter
 * @version 8/18/2015 v1.0
 */
public class TestCandidate2
{
    /**
     * Method to print candidates and their number of votes.
     * @param election Array list of candidates and the number of votes they got.
     */
    public static void printVotes(List<Candidate> election)
    {
        System.out.println("Results per candidate:");
        System.out.println("_______________________");
        System.out.println();
        for(int i = 0; i<election.size(); i++)
        {
            System.out.println(election.get(i));
        }
        System.out.println();
    }
    
    /**
     * Method to find the total votes cast in an election.
     * @param election Array list of candidates and the numbet of votes they got.
     * @return Total number of votes cast in an election.
     */
    public static int getTotal(List<Candidate> election)
    {
        int count = 0;
        for(int i = 0; i<election.size(); i++)
        {
            count += election.get(i).getNumVotes();
        }
        return count;
    }
    
    /**
     * Method to print a table displaying the results of an election.
     * @param election Array list of candidates and the numbet of votes they got.
     */
    public static void printResults(List<Candidate> election)
    {
        //Activate printTotal method.
        int totalVotes = getTotal(election);
        System.out.printf("%s %20s %30s\n","Candidate","Votes Received","% of Total Votes");
        for(int i = 0; i<election.size(); i++)
        {
            System.out.printf("%-15s %d %26.0f\n",election.get(i).getName(),election.get(i).getNumVotes(),(election.get(i).getNumVotes()/(double)totalVotes)*100);
        }
        System.out.println();
        System.out.println("Total number of votes in election: "+totalVotes);
    }
    
    /**
     * Main Method.
     */
    public static void main(String[] args)
    {
        //Array of objects.
        List<Candidate> election = new ArrayList<Candidate>();
        election.add(new Candidate("John Smith",5000));
        election.add(new Candidate("Mary Miller",4000));
        election.add(new Candidate("Michael Duffy",6000));
        election.add(new Candidate("Tim Robinson",2500));
        election.add(new Candidate("Joe Ashtony",1800));
        
        //Activate printVotes method.
        printVotes(election);
        
        //Activate printResults method.
        printResults(election);
    }
}