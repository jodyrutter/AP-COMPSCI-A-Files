/**
 * @purpose Model a mock election.
 * 
 * @author Jody Rutter
 * @version 8/18/2015 v2.0
 */
public class TestCandidate3
{   
    /**
     * Method to find the total votes cast in an election.
     * @param election Array of candidates and the numbet of votes they got.
     * @return Total number of votes cast in an election.
     */
    public static int getTotal(CandidateV2[] election)
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
    public static void printResults(CandidateV2[] election)
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
     * Method to replace the name of a candidate.
     * @param election Array of candidates and the number of votes they got.
     * @param find Name to find.
     * @param replace Name to replace the old name.
     */
    public static void replaceName(CandidateV2[] election, String find, String replace)
    {
        for(int i = 0; i<election.length; i++)
        {
            if(election[i].getName().equals(find))
            {
                election[i].setName(replace);
            }
        }
        //Activate printResults method.
        printResults(election);
    }
    
    /**
     * Method to replace the name of a candidate.
     * @param election Array of candidates and the number of votes they got.
     * @param find Name to find.
     * @param replace numVotes to replace the old numVotes.
     * @return Edited election.
     */
    public static void replaceVotes(CandidateV2[] election, String find, int replace)
    {
        for(int i = 0; i<election.length; i++)
        {
            if(election[i].getName().equals(find))
            {
                election[i].setNumVotes(replace);
            }
        }
        //Activate printResults method.
        printResults(election);
    }
    
    /**
     * Method to replace the name of a candidate.
     * @param election Array of candidates and the number of votes they got.
     * @param find candidate name to find.
     * @param replaceName candidate name to replace the old candidate name.
     * @param replaceVotes candidate votes to replace the old candidate votes.
     * @return Edited Election.
     */
    public static void replaceCandidate(CandidateV2[] election, String find, String replaceName, int replaceVotes)
    {
        for(int i = 0; i<election.length; i++)
        {
            if(election[i].getName().equals(find))
            {
                election[i].setNumVotes(replaceVotes);
                election[i].setName(replaceName);
            }
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
        CandidateV2[] election = {new CandidateV2("John Smith",5000), new CandidateV2("Mary Miller",4000), new CandidateV2("Michael Duffy",6000), new CandidateV2("Tim Robinson",2500), new CandidateV2("Joe Ashtony", 1800), new CandidateV2("Mickey Jones",3000), new CandidateV2("Rebecca Morgan",2000), new CandidateV2("Kathleen Turner",8000), new CandidateV2("Tony Parker",500), new CandidateV2("Ashton Davis",10000)};
        
        System.out.println("Original Results: ");
        System.out.println();
        
        //Activate printResults method.
        printResults(election);
        System.out.println();
        System.out.println("Changing Michael Duffy to John Elmos: ");
        System.out.println();
        replaceName(election, "Michael Duffy", "John Elmos");
        System.out.println();
        System.out.println("Changing Mickey Jones votes to 2500: ");
        System.out.println();
        replaceVotes(election, "Mickey Jones", 2500);
        System.out.println();
        System.out.println("Replacing Kathleen Turner with John Kennedy: ");
        System.out.println();
        replaceCandidate(election, "Kathleen Turner", "John Kennedy", 8500);
    }
}