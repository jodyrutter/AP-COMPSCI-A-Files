/**
 * GradesV2 is a program that simulates the process of grades being put into a gradebook.
 * 
 * @author Jody Rutter
 * @version 6/15/2015
 */
public class GradesV2
{
    public static void main(String [] args)
    {
        //local variables
        int numTests = 0;    //counts number of tests
        int testGrade = 0;    //individual test grade
        int totalPoints = 0;    //total points for all tests
        double average = 0.0;    //average grade
        
        //test 1
        testGrade = 97;
        totalPoints += testGrade;
        numTests ++;
        average = (totalPoints/(double)numTests);
        System.out.print(" n = " + numTests);
        System.out.print(" New Test Grade: " + testGrade);
        System.out.print("  Total Points: " + totalPoints);
        System.out.println("    Average Score: " + average);
        
        //test 2
        testGrade = 79;
        totalPoints += testGrade;
        numTests ++;
        average = (totalPoints/(double)numTests);
        System.out.print(" n = " + numTests);
        System.out.print(" New Test Grade: " + testGrade);
        System.out.print("  Total Points: " + totalPoints);
        System.out.println("    Average Score: " + average);
        
        //test 3
        testGrade = 83;
        totalPoints += testGrade;
        numTests ++;
        average = (totalPoints/(double)numTests);
        System.out.print(" n = " + numTests);
        System.out.print(" New Test Grade: " + testGrade);
        System.out.print("  Total Points: " + totalPoints);
        System.out.println("    Average Score: " + average);
        
        //test 4
        testGrade = 88;
        totalPoints += testGrade;
        numTests ++;
        average = (totalPoints/(double)numTests);
        System.out.print(" n = " + numTests);
        System.out.print(" New Test Grade: " + testGrade);
        System.out.print("  Total Points: " + totalPoints);
        System.out.println("    Average Score: " + average);
        
        //test 5
        testGrade = 110;
        totalPoints += testGrade;
        numTests ++;
        average = (totalPoints/(double)numTests);
        System.out.print(" n = " + numTests);
        System.out.print(" New Test Grade: " + testGrade);
        System.out.print("  Total Points: " + totalPoints);
        System.out.println("    Average Score: " + average);
        
        //test 6
        testGrade = 0;
        totalPoints += testGrade;
        numTests ++;
        average = (totalPoints/(double)numTests);
        System.out.print(" n = " + numTests);
        System.out.print(" New Test Grade: " + testGrade);
        System.out.print("  Total Points: " + totalPoints);
        System.out.println("    Average Score: " + average);
        
        //test 7
        testGrade = 100;
        totalPoints += testGrade;
        numTests ++;
        average = (totalPoints/(double)numTests);
        System.out.print(" n = " + numTests);
        System.out.print(" New Test Grade: " + testGrade);
        System.out.print("  Total Points: " + totalPoints);
        System.out.println("    Average Score: " + average);
        
        //test 8
        testGrade = 98;
        totalPoints += testGrade;
        numTests ++;
        average = (totalPoints/(double)numTests);
        System.out.print(" n = " + numTests);
        System.out.print(" New Test Grade: " + testGrade);
        System.out.print("  Total Points: " + totalPoints);
        System.out.println("    Average Score: " + average);
    }      
}
