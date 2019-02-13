/**
 * @purpose Class to display student data.
 * 
 * @author Jody Rutter
 * @version 9/3/2015
 */
public class StudentData
{
    //Instance variables
    private String firstName, lastName;
    private double[] testScores;
    private char grade;
    /**
     * Constructor for objects of type StudentData.
     * @param firstName Student's first name. Can't be empty.
     * @param lastName Student's last name. Can't be empty.
     * @param testScores Student's test scores.
     * @param grade Student's grade.
     */
    public StudentData(String firstName, String lastName, double[] testScores)
    {
        this.firstName = firstName;
        if(this.firstName.length() <= 0)
        {
            throw new RuntimeException("Must assign a first name");
        }
        this.lastName = lastName;
        if(this.lastName.length() <= 0)
        {
            throw new RuntimeException("Must assign a last name");
        }
        this.testScores = testScores;
        this.grade = courseGrade(testScores);
    }
    
    /**
     * Method to set first name.
     * @param newFirstName New first name to replace old first name.
     */
    public void setFirstName(String newFirstName)
    {
        this.firstName = newFirstName;
    }
    
    /**
     * Method to set last name.
     * @param newLastName New last name to replace old last name.
     */
    public void setLastName(String newLastName)
    {
        this.lastName = newLastName;
    }
    
    /**
     * Method to set testScores.
     * @param newTestScores New test scores to replace old test scores.
     */
    public void setTestScores(double[] newTestScores)
    {
        this.testScores = newTestScores;
    }
    
    /**
     * Method to set grade.
     * @param newGrade New grade to replace old grade.
     */
    public void setGrade(char newGrade)
    {
        this.grade = newGrade;
    }
    
    /**
     * toString method.
     * @return A string containing student data.
     */
    public String toString()
    {
        String dataString = String.format("%-15s",this.firstName) + String.format("%-15s",this.lastName);
        for(int i = 0; i<this.testScores.length; i++)
        {
            dataString += "  "+String.format("%.2f",this.testScores[i]);
        }
        dataString += "  "+this.grade;
        return dataString;
    }
    
    /**
     * Assigns a student a grade basedon the average of their test scores contained in the list.
     * Throws an illegal argument exception if the list is empty.
     */
    public char courseGrade(double[] testGrades)
    {
        if(testGrades.length <= 0)
        {
            throw new IllegalArgumentException("Grade list can not be empty");
        }
        
        char grade = 'N';
        double sum = 0;
        int i = 0;
        for(i = 0;i<testGrades.length; i++)
        {
            sum += testGrades[i];
        }
        double average = sum/(double)i;
        if(average >= 90)
        {
            grade = 'A';
        }
        else if(average < 90 && average >= 80)
        {
            grade = 'B';
        }
        else if(average < 80 && average >= 70)
        {
            grade = 'C';
        }
        else if(average < 70 && average >= 60)
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }
        return grade;
    }
    
    /**
     * Method to get first name.
     * @return First name.
     */
    public String getFirstName()
    {
        return this.firstName;
    }
    
    /**
     * Method to get last name.
     * @return Last name.
     */
    public String getLastName()
    {
        return this.lastName;
    }
    
    /**
     * Method to get test scores.
     * @return Test scores.
     */
    public double[] getTestScores()
    {
        return this.testScores;
    }
    
    /**
     * Method to get grade.
     * @return Grade.
     */
    public char getGrade()
    {
        return this.grade;
    }
}