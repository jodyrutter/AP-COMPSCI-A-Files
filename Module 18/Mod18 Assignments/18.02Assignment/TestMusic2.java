/**
 * @purpose Use search methods to find a song in a list of songs.
 * 
 * @author Jody Rutter
 * @version 8/27/2015
 */
public class TestMusic2
{
    /**
     * Method to print myMusic.
     * @param myMusic Array of songs.
     */
    public static void printMusic(Music2[] myMusic)
    {
        System.out.println("Music library: ");
        System.out.println("--------------");
        for(Music2 i : myMusic)
        {
            System.out.println(i);
        }
    }
    
    /**
     * Method to sort myMusic by title.
     * @param myMusic Array to be sorted.
     * @param low Lowest index on array.
     * @param high Highest index on array.
     */
    public static void mergeSortTitles(Music2[] myMusic, int low, int high)
    {
            if(low == high)
            {
                return;
            }
            
            int mid = (low+high)/2;
            mergeSortTitles(myMusic, low, mid);
            mergeSortTitles(myMusic, mid+1, high);
            
            mergeTitlesAscending(myMusic, low, mid, high);
    }
    
    /**
     * Method to merge an array for the mergeSortTitles method.
     * @param myMusic Array of some music.
     * @param low Lowest index on array.
     * @param mid Mid index on array.
     * @param high Highest index on array.
     */
    public static void mergeTitlesAscending(Music2[] myMusic, int low, int mid, int high)
    {
        Music2[] temp = new Music2[high - low + 1];
        int i = low, j = mid + 1, n = 0;
        while(i<=mid || j<= high)
        {
            if(i > mid)
            {
                temp[n] = myMusic[j];
                j++;
            }
            else if( j > high)
            {
                temp[n] = myMusic[i];
                i++;
            }
            else if( myMusic[i].getTitle().compareTo(myMusic[j].getTitle()) < 0)
            {
                temp[n] = myMusic[i];
                i++;
            }
            else
            {
                temp[n] = myMusic[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k <= high; k++)
        {
            myMusic[k] = temp[k-low];
        }
    }
      
    /**
     * Method to sort myMusic by year.
     * @param myMusic Array to be sorted.
     * @param low Lowest index on array.
     * @param high Highest index on array.
     */
    public static void mergeSortYears(Music2[] myMusic, int low, int high)
    {
            if(low == high)
            {
                return;
            }
            
            int mid = (low+high)/2;
            mergeSortYears(myMusic, low, mid);
            mergeSortYears(myMusic, mid+1, high);
            
            mergeYearsAscending(myMusic, low, mid, high);
    }    
    
    /**
     * Method to merge an array for the mergeSortYears method.
     * @param myMusic Array of some music.
     * @param low Lowest index on array.
     * @param mid Mid index on array.
     * @param high Highest index on array.
     */
    public static void mergeYearsAscending(Music2[] myMusic, int low, int mid, int high)
    {
        Music2[] temp = new Music2[high - low + 1];
        int i = low, j = mid + 1, n = 0;
        while(i<=mid || j<= high)
        {
            if(i > mid)
            {
                temp[n] = myMusic[j];
                j++;
            }
            else if( j > high)
            {
                temp[n] = myMusic[i];
                i++;
            }
            else if(myMusic[i].getYear() < myMusic[j].getYear())
            {
                temp[n] = myMusic[i];
                i++;
            }
            else
            {
                temp[n] = myMusic[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k <= high; k++)
        {
            myMusic[k] = temp[k-low];
        }
    }
    
    /**
     * Method to sort myMusic by singer.
     * @param myMusic Array to be sorted.
     * @param low Lowest index on array.
     * @param high Highest index on array.
     */
    public static void mergeSortSingers(Music2[] myMusic, int low, int high)
    {
            if(low == high)
            {
                return;
            }
            
            int mid = (low+high)/2;
            mergeSortSingers(myMusic, low, mid);
            mergeSortSingers(myMusic, mid+1, high);
            
            mergeSingersAscending(myMusic, low, mid, high);
    }
    
    /**
     * Method to merge an array for the mergeSortSingers method.
     * @param myMusic Array of some music.
     * @param low Lowest index on array.
     * @param mid Mid index on array.
     * @param high Highest index on array.
     */
    public static void mergeSingersAscending(Music2[] myMusic, int low, int mid, int high)
    {
        Music2[] temp = new Music2[high - low + 1];
        int i = low, j = mid + 1, n = 0;
        while(i<=mid || j<= high)
        {
            if(i > mid)
            {
                temp[n] = myMusic[j];
                j++;
            }
            else if( j > high)
            {
                temp[n] = myMusic[i];
                i++;
            }
            else if( myMusic[i].getSinger().compareTo(myMusic[j].getSinger()) < 0)
            {
                temp[n] = myMusic[i];
                i++;
            }
            else
            {
                temp[n] = myMusic[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k <= high; k++)
        {
            myMusic[k] = temp[k-low];
        }
    } 
    /**
     * Method to find a song based on title.
     * @param myMusic Array of songs.
     * @param find Title to find.
     */
    public static void searchTitle(Music2[] myMusic, String find)
    {
        int high = myMusic.length;
        int low = -1;
        int probe;
        while(high - low > 1)
        {
            probe = (high+low)/2;
            if(myMusic[probe].getTitle().compareTo(find) > 0)
            {
                high = probe;
            }
            else
            {
                low = probe;
                if(myMusic[probe].getTitle().compareTo(find) == 0)
                {
                    break;
                }
            }
        }
        if((low >= 0) && (myMusic[low].getTitle().compareTo(find) == 0))
        {
            findMoreTitles(myMusic, low, find);
        }
        else
        {
            System.out.println("Not found.");
        }
    }
    
    /**
     * Method to find more of a title in an array of songs.
     * @param low Index where a title was found.
     * @param find Title to find.
     */
    public static void findMoreTitles(Music2[] myMusic, int low, String find)
    {
        int i = low;
        int start = -1;
        int end = -1;
        while((i >= 0) && (myMusic[i].getTitle().compareTo(find) == 0))
        {
            start = i;
            i--;
        }
        
        i = low;
        while((i<myMusic.length) && (myMusic[i].getTitle().compareTo(find) == 0))
        {
            end = i;
            i++;
        }
        
        for(i = start; i <= end; i++)
        {
            System.out.println("Found: "+myMusic[i]);
        }
    }
    
    /**
     * Method to find songs based on year.
     * @param myMusic Array of songs.
     * @param find year to find.
     */
    public static void searchYear(Music2[] myMusic, int find)
    {
        int high = myMusic.length;
        int low = -1;
        int probe;
        while(high - low > 1)
        {
            probe = (high+low)/2;
            if(myMusic[probe].getYear() > find)
            {
                high = probe;
            }
            else
            {
                low = probe;
                if(myMusic[probe].getYear() == find)
                {
                    break;
                }
            }
        }
        if((low >= 0) && (myMusic[low].getYear() == find))
        {
            findMoreYears(myMusic, low, find);
        }
        else
        {
            System.out.println("Not found.");
        }
    }
    
    /**
     * Method to find more of a year in an array of songs.
     * @param low Index where a year was found.
     * @param find year to find.
     */
    public static void findMoreYears(Music2[] myMusic, int low, int find)
    {
        int i = low;
        int start = -1;
        int end = -1;
        while((i >= 0) && (myMusic[i].getYear() == find))
        {
            start = i;
            i--;
        }
        
        i = low;
        while((i<myMusic.length) && (myMusic[i].getYear() == find))
        {
            end = i;
            i++;
        }
        
        for(i = start; i <= end; i++)
        {
            System.out.println("Found: "+myMusic[i]);
        }
    }
    
    /**
     * Method to find songs based on singer.
     * @param myMusic Array of songs.
     * @param find Song to find.
     */
    public static void searchSinger(Music2[] myMusic, String find)
    {
        int high = myMusic.length;
        int low = -1;
        int probe;
        while(high - low > 1)
        {
            probe = (high+low)/2;
            if(myMusic[probe].getSinger().compareTo(find) > 0)
            {
                high = probe;
            }
            else
            {
                low = probe;
                if(myMusic[probe].getSinger().compareTo(find) == 0)
                {
                    break;
                }
            }
        }
        if((low >= 0) && (myMusic[low].getSinger().compareTo(find) == 0))
        {
            findMoreSingers(myMusic, low, find);
        }
        else
        {
            System.out.println("Not found.");
        }
    }
    
    /**
     * Method to find more of a singer in an array of songs.
     * @param low Index where a singer was found.
     * @param find Singer to find.
     */
    public static void findMoreSingers(Music2[] myMusic, int low, String find)
    {
        int i = low;
        int start = -1;
        int end = -1;
        while((i >= 0) && (myMusic[i].getSinger().compareTo(find) == 0))
        {
            start = i;
            i--;
        }
        
        i = low;
        while((i<myMusic.length) && (myMusic[i].getSinger().compareTo(find) == 0))
        {
            end = i;
            i++;
        }
        
        for(i = start; i <= end; i++)
        {
            System.out.println("Found: "+myMusic[i]);
        }
    }
    
    /**
     * Main method.
     */
    public static void main(String[] args)
    {
        //Make an array of music objects.
        Music2[] myMusic = new Music2[10];
        myMusic[0] = new Music2("Pieces of You",1994,"Jewel");
        myMusic[1] = new Music2("Jagged Little Pill",1995,"Alanis Morissette");
        myMusic[2] = new Music2("What If It's You",1995,"Reba McEntire");
        myMusic[3] = new Music2("Misunderstood",2001,"Pink");
        myMusic[4] = new Music2("Laundry Service",2001,"Shakira");
        myMusic[5] = new Music2("Taking the Long Way",2006,"Dixie Chicks");
        myMusic[6] = new Music2("Under My Skin",2004,"Avril Lavigne");
        myMusic[7] = new Music2("Let Go",2002,"Avril Lavigne");
        myMusic[8] = new Music2("Let It Go",2007,"Tim McGraw");
        myMusic[9] = new Music2("White Flag",2004,"Dido");
        printMusic(myMusic);
        System.out.println();
        System.out.println();
        System.out.println("Search - Title - Misunderstood");
        mergeSortTitles(myMusic, 0, myMusic.length - 1);
        searchTitle(myMusic,"Misunderstood");
        System.out.println();
        System.out.println();
        System.out.println("Search - Title - Under Paid");
        searchTitle(myMusic,"Under Paid");
        System.out.println();
        System.out.println();
        System.out.println("Search - Year - 2005");
        mergeSortYears(myMusic, 0, myMusic.length - 1);
        searchYear(myMusic, 2005);
        System.out.println();
        System.out.println();
        System.out.println("Search - Year - 2006");
        searchYear(myMusic, 2006);
        System.out.println();
        System.out.println();
        System.out.println("Search - Singer - Darth Maul");
        mergeSortSingers(myMusic, 0, myMusic.length - 1);
        searchSinger(myMusic, "Darth Maul");
        System.out.println();
        System.out.println();
        System.out.println("Search - Singer - Dido");
        searchSinger(myMusic, "Dido");
    }
}