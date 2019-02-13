import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
/**
 * Notecards is an abstract class designed provide a notecard study system for a variety of achademic classes.
 * 
 * @author Jody Rutter
 * @version Alpha
 */
public class NoteCards
{
    Scanner in = new Scanner(System.in);
    /**
     * Constructor for NoteCards abstract class.
     */
    public NoteCards() throws IOException
    {
        System.out.print("Please input class ID: "); 
        String classID = in.next();
        if(classID.equals("APEuro"))
        {
            APEuro();
        }
    }
    /**
     * AP European Route for constructor
     */
    public void APEuro() throws IOException
    {
        System.out.println("Welcome to AP European History.");
        System.out.println("Please select an option:");
    }
}