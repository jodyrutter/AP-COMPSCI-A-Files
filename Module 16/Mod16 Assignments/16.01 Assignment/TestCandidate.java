/**
 * @purpose Model a mock election.
 * 
 * @author Jody Rutter
 * @version 8/18/2015 v1.0
 */
public class TestCandidate
{
    /**
     * Method to print candidates and their number of votes.
     * @param election Array list of candidates and the number of votes they got.
     */
    public static void printVotes(Candidate[] election)
    {
        System.out.println("Results per candidate:");
        System.out.println("_______________________");
        System.out.println();
        for(int i = 0; i<election.length; i++)
        {
            System.out.println(election[i]);
        }
        System.out.println();
    }
    
    /**
     * Method to find the total votes cast in an election.
     * @param election Array list of candidates and the numbet of votes they got.
     * @return Total number of votes cast in an election.
     */
    public static int getTotal(Candidate[] election)
    {
        int count = 0;
        for(int i = 0; i<election.length; i++)
        {
            count += election[i].getNumVotes();
        }
        return count;
    }
    
    /**
     * Method to print a table displaying the results of an election.
     * @param election Array list of candidates and the numbet of votes they got.
     */
    public static void printResults(Candidate[] election)
    {
        //Activate printTotal method.
        int totalVotes = getTotal(election);
        System.out.printf("%s %20s %30s\n","Candidate","Votes Received","% of Total Votes");
        for(int i = 0; i<election.length; i++)
        {
            System.out.printf("%-15s %d %26.0f\n",election[i].getName(),election[i].getNumVotes(),(election[i].getNumVotes()/(double)totalVotes)*100);
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
        Candidate[] election = {new Candidate("John Smith",5000), new Candidate("Mary Miller",4000), new Candidate("Michael Duffy",6000), new Candidate("Tim Robinson",2500), new Candidate("Joe Ashtony", 1800)};
        
        //Activate printVotes method.
        printVotes(election);
        
        //Activate printResults method.
        printResults(election);
    }
}