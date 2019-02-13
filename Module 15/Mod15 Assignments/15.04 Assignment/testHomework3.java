import java.util.*;
/**
 * @purpose Class to model homework assignments.
 * 
 * @author Jody Rutter
 * @version 8/13/2015
 */
public class testHomework3
{
    public static void main(String[] args)
    {
        List<Homework3> assignments = new ArrayList<Homework3>();
        int[] pages = {4,6,4,5};
        assignments.add(new MyMath3());
        assignments.add(new MyScience3());
        assignments.add(new MyEnglish3());
        assignments.add(new MyJava3());
        
        for(int index = 0; index<assignments.size();index++)
        {
            assignments.get(index).createAssignments(pages[index]);
            System.out.println(assignments.get(index));
        }
        
        for(int index = 0; index<assignments.size() ;index++)
        {
            for(int findMatch = index; findMatch<assignments.size(); findMatch++)
            {
                if(assignments.get(findMatch).compareTo(assignments.get(index)) == 0 && findMatch != index)
                {
                    System.out.println("The homework for "+assignments.get(findMatch).getTypeHomework()+" and "+assignments.get(index).getTypeHomework()+" are the same number of pages. ");
                }
            }
        }
    }
}