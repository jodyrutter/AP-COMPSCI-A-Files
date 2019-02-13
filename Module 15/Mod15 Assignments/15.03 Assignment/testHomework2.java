import java.util.*;
/**
 * @purpose Class to model homework assignments.
 * 
 * @author Jody Rutter
 * @version 8/13/2015
 */
public class testHomework2
{
    public static void main(String[] args)
    {
        List<Homework2> assignments = new ArrayList<Homework2>();
        int[] pages = {4,6,10,5};
        assignments.add(new MyMath2());
        assignments.add(new MyScience2());
        assignments.add(new MyEnglish2());
        assignments.add(new MyJava2());
        
        for(int index = 0; index<assignments.size();index++)
        {
            System.out.println("Before reading: ");
            assignments.get(index).createAssignments(pages[index]);
            System.out.println(assignments.get(index));
            
            System.out.println("After reading: ");
            assignments.get(index).doReading();
            System.out.println(assignments.get(index));
        }
    }
}