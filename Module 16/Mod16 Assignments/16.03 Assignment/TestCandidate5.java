/**
 * @purpose Model a mock election.
 * 
 * @author Jody Rutter
 * @version 8/19/2015 v3.0
 */
public class TestCandidate5
{   
    /**
     * Method to find the total votes cast in an election.
     * @param election Array of candidates and the numbet of votes they got.
     * @return Total number of votes cast in an election.
     */
    public static int getTotal(CandidateV3[] election)
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
     * @param election Array of candidates and the numbet of votes they got.
     */
    public static void printResults(CandidateV3[] election)
    {
        //Activate printTotal method.
        int totalVotes = getTotal(election);
        System.out.printf("%s %20s %30s\n","Candidate","Votes Received","% of Total Votes");
        for(int i = 0; i<election.length; i++)
        {
            System.out.printf("%-15s %-28d %.0f\n",election[i].getName(),election[i].getNumVotes(),(election[i].getNumVotes()/(double)totalVotes)*100);
        }
        System.out.println();
        System.out.println("Total number of votes in election: "+totalVotes);
    }
    
    /**
     * Method to insert a candidate in a position.
     * @param election Array of candidates and the number of votes they got.
     * @param position Position to insert the new candidate.
     * @param name Name of new candidate.
     * @param numVotes votes to insert.
     */
    public static void insertPosition(CandidateV3[] election, int position, String name, int numVotes)
    {
        for(int i = election.length-1; i > position; i--)
        {
            election[i] = election[i-1];
        }
        election[position] = new CandidateV3(name, numVotes);
        //Activate printResults method.
        printResults(election);
    }
    
    /**
     * Method to insert a candidate in a position.
     * @param election Array of candidates and the number of votes they got.
     * @param find Name to find as position to insert the new candidate.
     * @param name Name of new candidate.
     * @param numVotes votes to insert.
     */
    public static void insertCandidate(CandidateV3[] election, String find, String name, int numVotes)
    {
        int position = 0;
        for(int i = 0; i<election.length; i++)
        {
            if(election[i].getName().equals(find))
            {
                position = i;
            }
        }
        
        for(int i = election.length-1; i > position; i--)
        {
            election[i] = election[i-1];
        }
        election[position] = new CandidateV3(name, numVotes);
        //Activate printResults method.
        printResults(election);
    }
    
    /**
     * Main Method.
     */
    public static void main(String[] args)
    {
        //Array of objects.
        CandidateV3[] election = {new CandidateV3("John Smith",5000), new CandidateV3("Mary Miller",4000), new CandidateV3("Michael Duffy",6000), new CandidateV3("Tim Robinson",2500), new CandidateV3("Joe Ashtony", 1800), new CandidateV3("Mickey Jones",3000), new CandidateV3("Rebecca Morgan",2000), new CandidateV3("Kathleen Turner",8000), new CandidateV3("Tony Parker",500), new CandidateV3("Ashton Davis",10000)};
        
        System.out.println("Original Results: ");
        System.out.println();
        
        //Activate printResults method.
        printResults(election);
        System.out.println();
        System.out.println("Added Mickey Duck, 14000 votes: ");
        System.out.println();
        insertPosition(election, 5, "Mickey Duck", 14000);
        System.out.println();
        System.out.println("Added Donald Mouse, 100: ");
        System.out.println();
        insertCandidate(election, "Kathleen Turner", "Donald Mouse", 100);
    }
}