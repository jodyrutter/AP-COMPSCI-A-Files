/**
 * @purpose Sort movies.
 * 
 * @author Jody Rutter
 * @version 8/21/2015 v1.0
 */
public class TestMovie2
{
    /**
     * Print the movies array.
     * @param myMovies Array of movies.
     */
    public static void printMovies(Movie2[] myMovies)
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
    public static void sortTitles(Movie2[] myMovies, int order)
    {
        Movie2[]  myMoviesSorted = new Movie2[myMovies.length];
        if(order == 1)
        {
            for(int i = 0; i< myMovies.length; i++)
            {
                Movie2 next = myMovies[i];
                int insertI = 0;
                int k = i;
                while(k > 0 && insertI == 0)
                {
                    if(next.getTitle().compareTo(myMoviesSorted[k-1].getTitle()) > 0)
                    {
                        insertI = k;
                    }
                    else
                    {
                        myMoviesSorted[k] = myMoviesSorted[k-1];
                    }
                    k--;
                }
                myMoviesSorted[insertI] = next;
            }
            //Activate printMoves method.
            printMovies(myMoviesSorted);
        }
        else if(order == 2)
        {
            for(int i = 0; i< myMovies.length; i++)
            {
                Movie2 next = myMovies[i];
                int insertI = 0;
                int k = i;
                while(k > 0 && insertI == 0)
                {
                    if(next.getTitle().compareTo(myMoviesSorted[k-1].getTitle()) < 0)
                    {
                        insertI = k;
                    }
                    else
                    {
                        myMoviesSorted[k] = myMoviesSorted[k-1];
                    }
                    k--;
                }
                myMoviesSorted[insertI] = next;
            }
            //Activate printMoves method.
            printMovies(myMoviesSorted);
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
    public static void sortYears(Movie2[] myMovies, int order)
    {
        Movie2[]  myMoviesSorted = new Movie2[myMovies.length];
        if(order == 1)
        {
            for(int i = 0; i< myMovies.length; i++)
            {
                Movie2 next = myMovies[i];
                int insertI = 0;
                int k = i;
                while(k > 0 && insertI == 0)
                {
                    if((new Integer(next.getYear())).compareTo((new Integer(myMoviesSorted[k-1].getYear()))) > 0)
                    {
                        insertI = k;
                    }
                    else
                    {
                        myMoviesSorted[k] = myMoviesSorted[k-1];
                    }
                    k--;
                }
                myMoviesSorted[insertI] = next;
            }
            //Activate printMoves method.
            printMovies(myMoviesSorted);
        }
        else if(order == 2)
        {
            for(int i = 0; i< myMovies.length; i++)
            {
                Movie2 next = myMovies[i];
                int insertI = 0;
                int k = i;
                while(k > 0 && insertI == 0)
                {
                    if((new Integer(next.getYear())).compareTo((new Integer(myMoviesSorted[k-1].getYear()))) < 0)
                    {
                        insertI = k;
                    }
                    else
                    {
                        myMoviesSorted[k] = myMoviesSorted[k-1];
                    }
                    k--;
                }
                myMoviesSorted[insertI] = next;
            }
            //Activate printMoves method.
            printMovies(myMoviesSorted);
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
    public static void sortStudios(Movie2[] myMovies, int order)
    {
        Movie2[]  myMoviesSorted = new Movie2[myMovies.length];
        if(order == 1)
        {
            for(int i = 0; i< myMovies.length; i++)
            {
                Movie2 next = myMovies[i];
                int insertI = 0;
                int k = i;
                while(k > 0 && insertI == 0)
                {
                    if(next.getStudio().compareTo(myMoviesSorted[k-1].getStudio()) > 0)
                    {
                        insertI = k;
                    }
                    else
                    {
                        myMoviesSorted[k] = myMoviesSorted[k-1];
                    }
                    k--;
                }
                myMoviesSorted[insertI] = next;
            }
            //Activate printMoves method.
            printMovies(myMoviesSorted);
        }
        else if(order == 2)
        {
            for(int i = 0; i< myMovies.length; i++)
            {
                Movie2 next = myMovies[i];
                int insertI = 0;
                int k = i;
                while(k > 0 && insertI == 0)
                {
                    if(next.getStudio().compareTo(myMoviesSorted[k-1].getStudio()) < 0)
                    {
                        insertI = k;
                    }
                    else
                    {
                        myMoviesSorted[k] = myMoviesSorted[k-1];
                    }
                    k--;
                }
                myMoviesSorted[insertI] = next;
            }
            //Activate printMoves method.
            printMovies(myMoviesSorted);
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
        Movie2[] myMovies = new Movie2[10];
        myMovies[0] = new Movie2("The Muppets Take Manhattan",2001,"Columbia Tristar");
        myMovies[1] = new Movie2("Mulan Special Edition",2004,"Disney");
        myMovies[2] = new Movie2("Shrek 2",2004,"Dreamworks");
        myMovies[3] = new Movie2("The Incredibles",2004,"Pixar");
        myMovies[4] = new Movie2("Nanny McPhee",2006,"Universal");
        myMovies[5] = new Movie2("The Curse of the Were-Rabbit",2006,"Aardman");
        myMovies[6] = new Movie2("Ice Age",2002,"20th Century Fox");
        myMovies[7] = new Movie2("Lilo & Stitch",2002,"Disney");
        myMovies[8] = new Movie2("Robots",2005,"20th Century Fox");
        myMovies[9] = new Movie2("Monsters Inc.",2001,"Pixar");
        
        System.out.println("Before Sorting: ");
        //Activate printMovies.
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sort by Title - ascending: ");
        sortTitles(myMovies, 1);
        System.out.println();
        System.out.println("Sort by Year - descending: ");
        sortYears(myMovies, 2);
        System.out.println();
        System.out.println("Sort by Title - ascending: ");
        sortStudios(myMovies, 1);
    }
}