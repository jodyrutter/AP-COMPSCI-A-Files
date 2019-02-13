import java.util.*;
/**
 * @purpose Model a mock election.
 * 
 * @author Jody Rutter
 * @version 8/18/2015 v2.0
 */
public class TestCandidate4
{   
    /**
     * Method to find the total votes cast in an election.
     * @param election Array list of candidates and the numbet of votes they got.
     * @return Total number of votes cast in an election.
     */
    public static int getTotal(List<CandidateV2> election)
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
    public static void printResults(List<CandidateV2> election)
    {
        //Activate printTotal method.
        int totalVotes = getTotal(election);
        System.out.printf("%s %20s %30s\n","Candidate","Votes Received","% of Total Votes");
        for(int i = 0; i<election.size(); i++)
        {
            System.out.printf("%-15s %-28d %.0f\n",election.get(i).getName(),election.get(i).getNumVotes(),(election.get(i).getNumVotes()/(double)totalVotes)*100);
        }
        System.out.println();
        System.out.println("Total number of votes in election: "+totalVotes);
    }

    /**
     * Method to replace the name of a candidate.
     * @param election Array list of candidates and the number of votes they got.
     * @param find Name to find.
     * @param replace Name to replace the old name.
     */
    public static void replaceName(List<CandidateV2> election, String find, String replace)
    {
        for(int i = 0; i<election.size(); i++)
        {
            if(election.get(i).getName().equals(find))
            {
                election.get(i).setName(replace);
            }
        }
        //Activate printResults method.
        printResults(election);
    }
    
    /**
     * Method to replace the name of a candidate.
     * @param election Array list of candidates and the number of votes they got.
     * @param find Name to find.
     * @param replace numVotes to replace the old numVotes.
     * @return Edited election.
     */
    public static void replaceVotes(List<CandidateV2> election, String find, int replace)
    {
        for(int i = 0; i<election.size(); i++)
        {
            if(election.get(i).getName().equals(find))
            {
                election.get(i).setNumVotes(replace);
            }
        }
        //Activate printResults method.
        printResults(election);
    }
    
    /**
     * Method to replace the name of a candidate.
     * @param election Array list of candidates and the number of votes they got.
     * @param find candidate name to find.
     * @param replaceName candidate name to replace the old candidate name.
     * @param replaceVotes candidate votes to replace the old candidate votes.
     * @return Edited Election.
     */
    public static void replaceCandidate(List<CandidateV2> election, String find, String replaceName, int replaceVotes)
    {
        for(int i = 0; i<election.size(); i++)
        {
            if(election.get(i).getName().equals(find))
            {
                election.get(i).setNumVotes(replaceVotes);
                election.get(i).setName(replaceName);
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
        List<CandidateV2> election = new ArrayList<CandidateV2>();
        election.add(new CandidateV2("John Smith",5000));
        election.add(new CandidateV2("Mary Miller",4000));
        election.add(new CandidateV2("Michael Duffy",6000));
        election.add(new CandidateV2("Tim Robinson",2500));
        election.add(new CandidateV2("Joe Ashtony",1800));
        election.add(new CandidateV2("Mickey Jones",3000));
        election.add(new CandidateV2("Rebecca Morgan",2000));
        election.add(new CandidateV2("Kathleen Turner",8000));
        election.add(new CandidateV2("Tony Parker",500));
        election.add(new CandidateV2("Ashton Davis",10000));
        
        //Activate printResults method.
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