import java.util.ArrayList;
/**
 * @purpose Class to model homework assignments.
 * 
 * @author Jody Rutter
 * @version 8/13/2015
 */
public class testHomework
{
    public static void main(String[] args)
    {
        ArrayList<Homework> assignments = new ArrayList<Homework>();
        int[] pages = {4,6,10,5};
        assignments.add(new MyMath());
        assignments.add(new MyScience());
        assignments.add(new MyEnglish());
        assignments.add(new MyJava());
        
        for(int index = 0; index<assignments.size();index++)
        {
            assignments.get(index).createAssignments(pages[index]);
            System.out.println(assignments.get(index));
        }
    }
}