import java.util.*;
/**
 * @purpose Class to display student data.
 * 
 * @author Jody Rutter
 * @version 9/3/2015
 */
public class TestProgStudentData
{
    /**
     * Method to print myStudents.
     * @param myStudents Array list of students.
     */
    public static void printStudents(List<StudentData> myStudents)
    {
        for(int i = 0; i<myStudents.size(); i++)
        {
            System.out.println(myStudents.get(i).toString());
        }
    }
    
    /**
     * Main method.
     */
    public static void main(String[] args)
    {
        //Array of testScores
        double[] testScores1 = {89,78,95,63,94};
        double[] testScores2 = {88,90,100,88,90,100};
        double[] testScoresTest = new double[0];
        //Array list of StudentData
        List<StudentData> myStudents = new ArrayList<StudentData>();
        myStudents.add(new StudentData("John","Doe",testScores1));
        myStudents.add(new StudentData("Lindsay","Green",testScores2));
        printStudents(myStudents);
    }
}