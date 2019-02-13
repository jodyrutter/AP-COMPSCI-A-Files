/**
 * @purpose Model a mock election.
 * 
 * @author Jody Rutter
 * @version 8/20/2015 v4.0
 */
public class TestCandidate7
{   
    /**
     * Method to find the total votes cast in an election.
     * @param election Array of candidates and the numbet of votes they got.
     * @return Total number of votes cast in an election.
     */
    public static int getTotal(CandidateV4[] election)
    {
        int count = 0;
        for(int i = 0; i<election.length ; i++)
        {
            if(election[i] != null)
            {
                count += election[i].getNumVotes();
            }
        }
        return count;
    }
    
    /**
     * Method to print a table displaying the results of an election.
     * @param election Array of candidates and the numbet of votes they got.
     */
    public static void printResults(CandidateV4[] election)
    {
        //Activate printTotal method.
        int totalVotes = getTotal(election);
        System.out.printf("%s %20s %30s\n","Candidate","Votes Received","% of Total Votes");
        for(int i = 0; i<election.length; i++)
        {
            if(election[i] != null)
            {
                System.out.printf("%-15s %-28d %.0f\n",election[i].getName(),election[i].getNumVotes(),(election[i].getNumVotes()/(double)totalVotes)*100);
            }
        }
        System.out.println();
        System.out.println("Total number of votes in election: "+totalVotes);
    }
    
    /**
     * Method to find and delete part of an array.
     * @param election Array of candidates and the number of votes they got.
     * @param location Location of object to delete.
     */
    public static void deleteByLoc(CandidateV4[] election, int location)
    {
        if((location >= 0) && (location<election.length))
        {
            for(int i = location; i<election.length-1; i++)
            {
                election[i] = election[i+1];
            }
            election[election.length-1] = null;
        }
        //Activate printResults method.
        printResults(election);
    }
    
    /**
     * Method to find and delete part of an array.
     * @param election Array of candidates and the number of votes they got.
     * @param name Name of candidate to delete.
     */
    public static void deleteByName(CandidateV4[] election, String name)
    {
        int location = 0;
        int i;
        for(i = 0; i < election.length; i++)
        {
            if((election[i] != null) && (election[i].getName().equals(name)))
            {
                location = i;
                break;
            }
            else if(election[i] == null)
            {
                location = -1;
                break;
            }
            else
            {
                //Do nothing.
            }
        }
        
        if((i != election.length) && (location>=0))
        {
            for(i = location; i<election.length - 1; i++)
            {
                election[i] = election[i+1];
            }
            election[election.length-1] = null;
        }
        //Activate printResults method.
        printResults(election);
    }
    
    /**
     * Main Method.
     */
    public static void main(String[] args)
    {
        //Array of objects.
        CandidateV4[] election = {new CandidateV4("John Smith",5000), new CandidateV4("Mary Miller",4000), new CandidateV4("Michael Duffy",6000), new CandidateV4("Tim Robinson",2500), new CandidateV4("Joe Ashtony", 1800), new CandidateV4("Mickey Jones",3000), new CandidateV4("Rebecca Morgan",2000), new CandidateV4("Kathleen Turner",8000), new CandidateV4("Tony Parker",500), new CandidateV4("Ashton Davis",10000)};
        
        System.out.println("Original Results: ");
        System.out.println();
        
        //Activate printResults method.
        printResults(election);
        System.out.println();
        System.out.println("Deleted location 6: ");
        System.out.println();
        deleteByLoc(election, 6);
        System.out.println();
        System.out.println("Deleted Kathleen Turner: ");
        System.out.println();
        deleteByName(election, "Kathleen Turner");
    }
}