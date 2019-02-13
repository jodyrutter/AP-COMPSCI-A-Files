/**
 * @purpose Model a gradebook.
 * 
 * @author Jody Rutter
 * @version 8/20/2015 v1.0
 */
public class Student
{
    //Instance variables.
    String name;
    int qz1, qz2, qz3, qz4, qz5;
    /**
     * Constructor for objects of type Student.
     * @param name Name of the student.
     * @param qz1 Grade of quiz 1.
     * @param qz2 Grade of quiz 2.
     * @param qz3 Grade of quiz 3.
     * @param qz4 Grade of quiz 4.
     * @param qz5 Grade of quiz 5.
     */
    public Student(String name, int qz1, int qz2, int qz3, int qz4, int qz5)
    {
        this.name = name;
        this.qz1 = qz1;
        this.qz2 = qz2;
        this.qz3 = qz3;
        this.qz4 = qz4;
        this.qz5 = qz5;
    }
    
    /**
     * Method to set the student name.
     * @param newName New value for the student name.
     */
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    /**
     * Method to set Qz1 to a new value.
     * @param newQz1 New value for the first quiz.
     */
    public void setQz1(int newQz1)
    {
        this.qz1 = newQz1;
    }

    /**
     * Method to set Qz2 to a new value.
     * @param newQz2 New value for the first quiz.
     */
    public void setQz2(int newQz2)
    {
        this.qz2 = newQz2;
    }
    
    /**
     * Method to set Qz3 to a new value.
     * @param newQz3 New value for the first quiz.
     */
    public void setQz3(int newQz3)
    {
        this.qz3 = newQz3;
    }
    
    /**
     * Method to set Qz4 to a new value.
     * @param newQz4 New value for the first quiz.
     */
    public void setQz4(int newQz4)
    {
        this.qz4 = newQz4;
    }
    
    /**
     * Method to set Qz5 to a new value.
     * @param newQz5 New value for the first quiz.
     */
    public void setQz5(int newQz5)
    {
        this.qz5 = newQz5;
    }
    
    /**
     * To string method.
     * @return A string listing the student's name and their quiz grades.
     */
    public String toString()
    {
        return this.name+": qz1: "+this.qz1+" qz2: "+this.qz2+" qz3: "+this.qz3+" qz4: "+this.qz4+" qz5: "+this.qz5;
    }
    
    /**
     * Method to get the student name.
     * @return Student name.
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Method to get qz1 grade.
     * @return qz1 grade.
     */
    public int getQz1()
    {
        return this.qz1;
    }
    
    /**
     * Method to get qz2 grade.
     * @return qz2 grade.
     */
    public int getQz2()
    {
        return this.qz2;
    }
    
    /**
     * Method to get qz3 grade.
     * @return qz3 grade.
     */
    public int getQz3()
    {
        return this.qz3;
    }
    
    /**
     * Method to get qz4 grade.
     * @return qz4 grade.
     */
    public int getQz4()
    {
        return this.qz4;
    }
    
    /**
     * Method to get qz5 grade.
     * @return qz5 grade.
     */
    public int getQz5()
    {
        return this.qz5;
    }
}