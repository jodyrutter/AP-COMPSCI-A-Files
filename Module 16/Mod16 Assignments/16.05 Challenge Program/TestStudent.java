import java.util.*;
/**
 * @purpose Model a gradebook.
 * 
 * @author Jody Rutter
 * @version 8/20/2015 v1.0
 */
public class TestStudent
{
    /**
     * Mthod to print the grade book.
     * @param myClass Array list containing the names and grades of students.
     */
    public static void printBook(List<Student> myClass)
    {
        System.out.printf("%s %5s %8s %8s %8s %8s\n","Student name ","Q1","Q2","Q3","Q4","Q5");
        System.out.println("---------------------------------------------------------");
        for(int i = 0; i<myClass.size(); i++)
        {
            System.out.printf("%-16s %-8d %-8d %-8d %-8d %d\n",myClass.get(i).getName()+":", myClass.get(i).getQz1(), myClass.get(i).getQz2(), myClass.get(i).getQz3(), myClass.get(i).getQz4(), myClass.get(i).getQz5());
        }
    }
    
    /**
     * Method to replace a student's name with a new one.
     * @param myClass Array list containing the names and grades of students.
     * @param find Name to find.
     * @param replace Name to replace the old student name.
     */
    public static void replaceName(List<Student> myClass, String find, String replace)
    {
        for(int i = 0; i<myClass.size(); i++)
        {
            if(myClass.get(i).getName().equals(find))
            {
                myClass.get(i).setName(replace);
            }
        }
        //Activates printBook method.
        printBook(myClass);
    }
    
    /**
     * Method to replace a student's quiz grade with a new one.
     * @param myClass Array list containing the names and grades of students.
     * @param find Name to find.
     * @param quizNum The quiz number that contains the grade to replace.
     * @param quizValue value to replace the old quiz grade.
     */
    public static void replaceQuiz(List<Student> myClass, String find, int quizNum, int quizValue)
    {
        int position = -1;    //Holding value.
        for(int i = 0; i<myClass.size(); i++)
        {
            if(myClass.get(i).getName().equals(find))
            {
                position = i; 
            }
        }
        
        if((quizNum == 1) && (position >= 0))
        {
            myClass.get(position).setQz1(quizValue);
        }
        else if((quizNum == 2) && (position >= 0))
        {
            myClass.get(position).setQz2(quizValue);
        }
        else if((quizNum == 3) && (position >= 0))
        {
            myClass.get(position).setQz3(quizValue);
        }
        else if((quizNum == 4) && (position >= 0))
        {
            myClass.get(position).setQz4(quizValue);
        }
        else if((quizNum == 5) && (position >= 0))
        {
            myClass.get(position).setQz5(quizValue);
        }
        else
        {
            System.out.println("There is no quiz "+quizNum+", there are only quizes 1-5");
            System.out.println();
        }
        //Activate printBook method.
        printBook(myClass);
    }
    
    /**
     * Method to replace a student with another student.
     * @param myClass Array list containing the names and grades of students.
     * @param find Name of student to replace.
     * @param replaceName Name to replace the old student's name.
     * @param replaceQz1 Quiz1 grade to replace the old student's Quiz1 grade.
     * @param replaceQz2 Quiz2 grade to replace the old student's Quiz2 grade.
     * @param replaceQz3 Quiz3 grade to replace the old student's Quiz3 grade.
     * @param replaceQz4 Quiz4 grade to replace the old student's Quiz4 grade.
     * @param replaceQz5 Quiz5 grade to replace the old student's Quiz5 grade.
     */
    public static void replaceStudent(List<Student> myClass, String find, String replaceName, int replaceQz1, int replaceQz2, int replaceQz3, int replaceQz4, int replaceQz5)
    {
        for(int i = 0; i<myClass.size(); i++)
        {
            if(myClass.get(i).getName().equals(find))
            {
                myClass.get(i).setName(replaceName);
                myClass.get(i).setQz1(replaceQz1);
                myClass.get(i).setQz2(replaceQz2);
                myClass.get(i).setQz3(replaceQz3);
                myClass.get(i).setQz4(replaceQz4);
                myClass.get(i).setQz5(replaceQz5);
            }
        }
        //Activate printBook method.
        printBook(myClass);
    }
    
    /**
     * Method to insert a student.
     * @param myClass Array list containing the names and grades of students.
     * @param find Name to insert the new student at.
     * @param name Name of student to add.
     * @param qz1 Quiz 1 grade for the new student.
     * @param qz2 Quiz 2 grade for the new student.
     * @param qz3 Quiz 3 grade for the new student.
     * @param qz4 Quiz 4 grade for the new student.
     * @param qz5 Quiz 5 grade for the new student.
     */
    public static void insertStudent(List<Student> myClass, String find, String name, int qz1, int qz2, int qz3, int qz4, int qz5)
    {
        int position = 0;
        for(int i = 0; i<myClass.size(); i++)
        {
            if(myClass.get(i).getName().equals(find))
            {
                position = i; 
            }
        }
        myClass.add(position, new Student(name, qz1, qz2, qz3, qz4, qz5));
        //Activate printBook method.
        printBook(myClass);
    }
    
    /**
     * Method to delete a student.
     * @param myClass Array list containing the names and grades of students.
     * @param find Name of student to delete.
     */
    public static void deleteStudent(List<Student> myClass, String find)
    {
        int position = 0;
        for(int i = 0; i<myClass.size(); i++)
        {
            if(myClass.get(i).getName().equals(find))
            {
                position = i; 
            }
        }
        myClass.remove(position);
        //Activate printBook method.
        printBook(myClass);
    }
    
    /**
     * Main method.
     */
    public static void main(String[] args)
    {
        //Create an ArrayList of students.
        List<Student> myClass = new ArrayList<Student>();
        myClass.add(new Student("Mark Kennedy", 70, 80, 90, 100, 90));
        myClass.add(new Student("Max Gerard", 80, 85, 90, 85, 80));
        myClass.add(new Student("Jean Smith", 50, 79, 89, 99, 100));
        myClass.add(new Student("Betty Farm", 85, 80, 85, 88, 89));
        myClass.add(new Student("Dilbert Gamma", 70, 70, 90, 70, 80));
        
        System.out.println("Starting Gradebook: ");
        System.out.println();
        //Activate printBook method.
        printBook(myClass);
        System.out.println();
        System.out.println("Changing Betty's name to Betty Boop: ");
        System.out.println();
        replaceName(myClass, "Betty Farm", "Betty Boop");
        System.out.println();
        System.out.println("Changing Jean's quiz 1 score to 80: ");
        System.out.println();
        replaceQuiz(myClass, "Jean Smith", 1, 80);
        System.out.println();
        System.out.println("Replacing Dilbert with Mike Kappa: 80, 80, 80, 90, 90: ");
        System.out.println();
        replaceStudent(myClass, "Dilbert Gamma", "Mike Kappa", 80, 80, 80, 90, 90);
        System.out.println();
        System.out.println("Insert Lily Mu: 85, 95, 70, 0, 100 before Betty: ");
        System.out.println();
        insertStudent(myClass, "Betty Boop", "Lily Mu", 85, 95, 70, 0, 100);
        System.out.println();
        System.out.println("Deleting Max Gerard: ");
        System.out.println();
        deleteStudent(myClass, "Max Gerard");
    }
}