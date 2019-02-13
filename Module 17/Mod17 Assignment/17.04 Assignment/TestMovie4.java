/**
 * @purpose Sort movies.
 * 
 * @author Jody Rutter
 * @version 8/24/2015 v3.0
 */
public class TestMovie4
{
    /**
     * Print the movies array.
     * @param myMovies Array of movies.
     */
    public static void printMovies(Movie4[] myMovies)
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
     * @param low Lowest index on array.
     * @param high Highest index on array.
     */
    public static void sortTitles(Movie4[] myMovies, int order, int low, int high)
    {
        if(order == 1)
        {
            if(low == high)
            {
                return;
            }
            
            int mid = (low+high)/2;
            sortTitles(myMovies, 1, low, mid);
            sortTitles(myMovies, 1, mid+1, high);
            
            mergeTitlesAscending(myMovies, low, mid, high);
        }
        else if(order == 2)
        {
            if(low == high)
            {
                return;
            }
            
            int mid = (low+high)/2;
            sortTitles(myMovies, 2, low, mid);
            sortTitles(myMovies, 2, mid+1, high);
            
            mergeTitlesDescending(myMovies, low, mid, high);
        }
        else
        {
            System.out.println("I'm sorry, order must be set to either 1 for ascending, or 2 for descending.");
        }
    }
    
    /**
     * Method to merge an array for the sortTitles method.
     * @param myMoviesPart Array of some movies.
     * @param low Lowest index on array.
     * @param mid Mid index on array.
     * @param high Highest index on array.
     */
    public static void mergeTitlesAscending(Movie4[] myMovies, int low, int mid, int high)
    {
        Movie4[] temp = new Movie4[high - low + 1];
        int i = low, j = mid + 1, n = 0;
        while(i<=mid || j<= high)
        {
            if(i > mid)
            {
                temp[n] = myMovies[j];
                j++;
            }
            else if( j > high)
            {
                temp[n] = myMovies[i];
                i++;
            }
            else if( myMovies[i].getTitle().compareTo(myMovies[j].getTitle()) < 0)
            {
                temp[n] = myMovies[i];
                i++;
            }
            else
            {
                temp[n] = myMovies[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k <= high; k++)
        {
            myMovies[k] = temp[k-low];
        }
    }
    
    /**
     * Method to merge an array for the sortTitles method.
     * @param myMoviesPart Array of some movies.
     * @param low Lowest index on array.
     * @param mid Mid index on array.
     * @param high Highest index on array.
     */
    public static void mergeTitlesDescending(Movie4[] myMovies, int low, int mid, int high)
    {
        Movie4[] temp = new Movie4[high - low + 1];
        int i = low, j = mid + 1, n = 0;
        while(i<=mid || j<= high)
        {
            if(i > mid)
            {
                temp[n] = myMovies[j];
                j++;
            }
            else if( j > high)
            {
                temp[n] = myMovies[i];
                i++;
            }
            else if( myMovies[i].getTitle().compareTo(myMovies[j].getTitle()) > 0)
            {
                temp[n] = myMovies[i];
                i++;
            }
            else
            {
                temp[n] = myMovies[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k <= high; k++)
        {
            myMovies[k] = temp[k-low];
        }
    }
    
    /**
     * Method to sort movies based on year.
     * @param myMovies Array of movies.
     * @param order Number of either 1 or 2 that chooses whether to sort an item in ascending or decending order.
     * @param low Lowest index on array.
     * @param high Highest index on array.
     */
    public static void sortYears(Movie4[] myMovies, int order, int low, int high)
    {
        if(order == 1)
        {
            if(low == high)
            {
                return;
            }
            
            int mid = (low+high)/2;
            sortYears(myMovies, 1, low, mid);
            sortYears(myMovies, 1, mid+1, high);
            
            mergeYearsAscending(myMovies, low, mid, high);
        }
        else if(order == 2)
        {
            if(low == high)
            {
                return;
            }
            
            int mid = (low+high)/2;
            sortYears(myMovies, 2, low, mid);
            sortYears(myMovies, 2, mid+1, high);
            
            mergeYearsDescending(myMovies, low, mid, high);
        }
        else
        {
            System.out.println("I'm sorry, order must be set to either 1 for ascending, or 2 for descending.");
        }
    }
    
    /**
     * Method to merge an array for the sortYears method.
     * @param myMoviesPart Array of some movies.
     * @param low Lowest index on array.
     * @param mid Mid index on array.
     * @param high Highest index on array.
     */
    public static void mergeYearsAscending(Movie4[] myMovies, int low, int mid, int high)
    {
        Movie4[] temp = new Movie4[high - low + 1];
        int i = low, j = mid + 1, n = 0;
        while(i<=mid || j<= high)
        {
            if(i > mid)
            {
                temp[n] = myMovies[j];
                j++;
            }
            else if( j > high)
            {
                temp[n] = myMovies[i];
                i++;
            }
            else if( myMovies[i].getYear() < myMovies[j].getYear())
            {
                temp[n] = myMovies[i];
                i++;
            }
            else
            {
                temp[n] = myMovies[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k <= high; k++)
        {
            myMovies[k] = temp[k-low];
        }
    }
    
    /**
     * Method to merge an array for the sortYears method.
     * @param myMoviesPart Array of some movies.
     * @param low Lowest index on array.
     * @param mid Mid index on array.
     * @param high Highest index on array.
     */
    public static void mergeYearsDescending(Movie4[] myMovies, int low, int mid, int high)
    {
        Movie4[] temp = new Movie4[high - low + 1];
        int i = low, j = mid + 1, n = 0;
        while(i<=mid || j<= high)
        {
            if(i > mid)
            {
                temp[n] = myMovies[j];
                j++;
            }
            else if( j > high)
            {
                temp[n] = myMovies[i];
                i++;
            }
            else if( myMovies[i].getYear() > myMovies[j].getYear())
            {
                temp[n] = myMovies[i];
                i++;
            }
            else
            {
                temp[n] = myMovies[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k <= high; k++)
        {
            myMovies[k] = temp[k-low];
        }
    }
    
    /**
     * Method to sort movies based on studio.
     * @param myMovies Array of movies.
     * @param order Number of either 1 or 2 that chooses whether to sort an item in ascending or decending order.
     * @param low Lowest index on array.
     * @param high Highest index on array.
     */
    public static void sortStudios(Movie4[] myMovies, int order, int low, int high)
    {
        if(order == 1)
        {
            if(low == high)
            {
                return;
            }
            
            int mid = (low+high)/2;
            sortStudios(myMovies, 1, low, mid);
            sortStudios(myMovies, 1, mid+1, high);
            
            mergeStudiosAscending(myMovies, low, mid, high);
        }
        else if(order == 2)
        {
            if(low == high)
            {
                return;
            }
            
            int mid = (low+high)/2;
            sortStudios(myMovies, 2, low, mid);
            sortStudios(myMovies, 2, mid+1, high);
            
            mergeStudiosDescending(myMovies, low, mid, high);
        }
        else
        {
            System.out.println("I'm sorry, order must be set to either 1 for ascending, or 2 for descending.");
        }
    }
    
    /**
     * Method to merge an array for the sortStudios method.
     * @param myMoviesPart Array of some movies.
     * @param low Lowest index on array.
     * @param mid Mid index on array.
     * @param high Highest index on array.
     */
    public static void mergeStudiosAscending(Movie4[] myMovies, int low, int mid, int high)
    {
        Movie4[] temp = new Movie4[high - low + 1];
        int i = low, j = mid + 1, n = 0;
        while(i<=mid || j<= high)
        {
            if(i > mid)
            {
                temp[n] = myMovies[j];
                j++;
            }
            else if( j > high)
            {
                temp[n] = myMovies[i];
                i++;
            }
            else if( myMovies[i].getStudio().compareTo(myMovies[j].getStudio()) < 0)
            {
                temp[n] = myMovies[i];
                i++;
            }
            else
            {
                temp[n] = myMovies[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k <= high; k++)
        {
            myMovies[k] = temp[k-low];
        }
    }
    
    /**
     * Method to merge an array for the sortStudios method.
     * @param myMoviesPart Array of some movies.
     * @param low Lowest index on array.
     * @param mid Mid index on array.
     * @param high Highest index on array.
     */
    public static void mergeStudiosDescending(Movie4[] myMovies, int low, int mid, int high)
    {
        Movie4[] temp = new Movie4[high - low + 1];
        int i = low, j = mid + 1, n = 0;
        while(i<=mid || j<= high)
        {
            if(i > mid)
            {
                temp[n] = myMovies[j];
                j++;
            }
            else if( j > high)
            {
                temp[n] = myMovies[i];
                i++;
            }
            else if( myMovies[i].getStudio().compareTo(myMovies[j].getStudio()) > 0)
            {
                temp[n] = myMovies[i];
                i++;
            }
            else
            {
                temp[n] = myMovies[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k <= high; k++)
        {
            myMovies[k] = temp[k-low];
        }
    }
    
    /**
     * Main method.
     */
    public static void main(String[] args)
    {
        Movie4[] myMovies = new Movie4[10];
        myMovies[0] = new Movie4("The Muppets Take Manhattan",2001,"Columbia Tristar");
        myMovies[1] = new Movie4("Mulan Special Edition",2004,"Disney");
        myMovies[2] = new Movie4("Shrek 2",2004,"Dreamworks");
        myMovies[3] = new Movie4("The Incredibles",2004,"Pixar");
        myMovies[4] = new Movie4("Nanny McPhee",2006,"Universal");
        myMovies[5] = new Movie4("The Curse of the Were-Rabbit",2006,"Aardman");
        myMovies[6] = new Movie4("Ice Age",2002,"20th Century Fox");
        myMovies[7] = new Movie4("Lilo & Stitch",2002,"Disney");
        myMovies[8] = new Movie4("Robots",2005,"20th Century Fox");
        myMovies[9] = new Movie4("Monsters Inc.",2001,"Pixar");
        
        System.out.println("Before Sorting: ");
        //Activate printMovies.
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sort by Title - ascending: ");
        sortTitles(myMovies, 1, 0, myMovies.length - 1);
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sort by Year - descending: ");
        sortYears(myMovies, 2, 0, myMovies.length - 1);
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sort by Studio - ascending: ");
        sortStudios(myMovies, 1, 0, myMovies.length - 1);
        printMovies(myMovies);
    }
}