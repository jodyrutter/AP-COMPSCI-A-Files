/**
 * @purpose Sort movies.
 * 
 * @author Jody Rutter
 * @version 8/22/2015 v2.0
 */
public class TestMovie3
{
    /**
     * Print the movies array.
     * @param myMovies Array of movies.
     */
    public static void printMovies(Movie3[] myMovies)
    {
        for(int i = 0; i<myMovies.length; i++)
        {
            System.out.println(myMovies[i]);
        }
    }
    
    /**
     * Method to sort movies based on title.
     * @param myMovies Array of movies.
     * @param order Number of either 1 or 2 that chooses whether to sort an item in ascending or decending order.
     */
    public static void sortTitles(Movie3[] myMovies, int order)
    {
        if(order == 1)
        {
            int posmax;
            
            for(int i = myMovies.length - 1; i>0; i--)
            {
                posmax = 0;
                for(int k = 1; k<=i; k++)
                {
                    if(myMovies[k].getTitle().compareTo(myMovies[posmax].getTitle()) > 0)
                    {
                        posmax = k;
                    }
                }
                Movie3 temp = myMovies[i];
                myMovies[i] = myMovies[posmax];
                myMovies[posmax] = temp;
            }
            //Activate printMovies method.
            printMovies(myMovies);
        }
        else if(order == 2)
        {
            int posmin;
            
            for(int i = myMovies.length - 1; i>0; i--)
            {
                posmin = 0;
                for(int k = 1; k<=i; k++)
                {
                    if(myMovies[k].getTitle().compareTo(myMovies[posmin].getTitle()) < 0)
                    {
                        posmin = k;
                    }
                }
                Movie3 temp = myMovies[i];
                myMovies[i] = myMovies[posmin];
                myMovies[posmin] = temp;
            }
            //Activate printMovies method.
            printMovies(myMovies);
        }
        else
        {
            System.out.println("I'm sorry, order must be set to either 1 for ascending, or 2 for descending.");
        }
    }
    
    /**
     * Method to sort movies based on year.
     * @param myMovies Array of movies.
     * @param order Number of either 1 or 2 that chooses whether to sort an item in ascending or decending order.
     */
    public static void sortYears(Movie3[] myMovies, int order)
    {
        if(order == 1)
        {
            int posmax;
            
            for(int i = myMovies.length - 1; i>0; i--)
            {
                posmax = 0;
                for(int k = 1; k<=i; k++)
                {
                    if(myMovies[k].getYear() > myMovies[posmax].getYear())
                    {
                        posmax = k;
                    }
                }
                Movie3 temp = myMovies[i];
                myMovies[i] = myMovies[posmax];
                myMovies[posmax] = temp;
            }
            //Activate printMovies method.
            printMovies(myMovies);
        }
        else if(order == 2)
        {
            int posmin;
            
            for(int i = myMovies.length - 1; i>0; i--)
            {
                posmin = 0;
                for(int k = 1; k<=i; k++)
                {
                    if(myMovies[k].getYear() < myMovies[posmin].getYear())
                    {
                        posmin = k;
                    }
                }
                Movie3 temp = myMovies[i];
                myMovies[i] = myMovies[posmin];
                myMovies[posmin] = temp;
            }
            //Activate printMovies method.
            printMovies(myMovies);
        }
        else
        {
            System.out.println("I'm sorry, order must be set to either 1 for ascending, or 2 for descending.");
        }
    }
    
    /**
     * Method to sort movies based on studio.
     * @param myMovies Array of movies.
     * @param order Number of either 1 or 2 that chooses whether to sort an item in ascending or decending order.
     */
    public static void sortStudios(Movie3[] myMovies, int order)
    {
        if(order == 1)
        {
            int posmax;
            
            for(int i = myMovies.length - 1; i>0; i--)
            {
                posmax = 0;
                for(int k = 1; k<=i; k++)
                {
                    if(myMovies[k].getStudio().compareTo(myMovies[posmax].getStudio()) > 0)
                    {
                        posmax = k;
                    }
                }
                Movie3 temp = myMovies[i];
                myMovies[i] = myMovies[posmax];
                myMovies[posmax] = temp;
            }
            //Activate printMovies method.
            printMovies(myMovies);
        }
        else if(order == 2)
        {
            int posmin;
            
            for(int i = myMovies.length - 1; i>0; i--)
            {
                posmin = 0;
                for(int k = 1; k<=i; k++)
                {
                    if(myMovies[k].getStudio().compareTo(myMovies[posmin].getStudio()) < 0)
                    {
                        posmin = k;
                    }
                }
                Movie3 temp = myMovies[i];
                myMovies[i] = myMovies[posmin];
                myMovies[posmin] = temp;
            }
            //Activate printMovies method.
            printMovies(myMovies);
        }
        else
        {
            System.out.println("I'm sorry, order must be set to either 1 for ascending, or 2 for descending.");
        }
    }
    
    /**
     * Main method.
     */
    public static void main(String[] args)
    {
        Movie3[] myMovies = new Movie3[10];
        myMovies[0] = new Movie3("The Muppets Take Manhattan",2001,"Columbia Tristar");
        myMovies[1] = new Movie3("Mulan Special Edition",2004,"Disney");
        myMovies[2] = new Movie3("Shrek 2",2004,"Dreamworks");
        myMovies[3] = new Movie3("The Incredibles",2004,"Pixar");
        myMovies[4] = new Movie3("Nanny McPhee",2006,"Universal");
        myMovies[5] = new Movie3("The Curse of the Were-Rabbit",2006,"Aardman");
        myMovies[6] = new Movie3("Ice Age",2002,"20th Century Fox");
        myMovies[7] = new Movie3("Lilo & Stitch",2002,"Disney");
        myMovies[8] = new Movie3("Robots",2005,"20th Century Fox");
        myMovies[9] = new Movie3("Monsters Inc.",2001,"Pixar");
        
        System.out.println("Before Sorting: ");
        //Activate printMovies.
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sort by Title - decending: ");
        sortTitles(myMovies, 2);
        System.out.println();
        System.out.println("Sort by Year - descending: ");
        sortYears(myMovies, 2);
        System.out.println();
        System.out.println("Sort by Title - ascending: ");
        sortStudios(myMovies, 1);
    }
}