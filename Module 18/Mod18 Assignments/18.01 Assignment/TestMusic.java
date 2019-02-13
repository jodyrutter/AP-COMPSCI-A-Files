/**
 * @purpose Use search methods to find a song in a list of songs.
 * 
 * @author Jody Rutter
 * @version 8/27/2015
 */
public class TestMusic
{
    /**
     * Method to print myMusic.
     * @param myMusic Array of songs.
     */
    public static void printMusic(Music[] myMusic)
    {
        System.out.println("Music library: ");
        System.out.println("--------------");
        for(Music i : myMusic)
        {
            System.out.println(i);
        }
    }
    
    /**
     * Method to find a song based on title.
     * @param myMusic Array of songs.
     * @param find Title to find.
     */
    public static void searchTitle(Music[] myMusic, String find)
    {
        int found = -1;
        for(int i = 0; i<myMusic.length; i++)
        {
            if(myMusic[i].getTitle().equals(find))
            {
                found = i;
                break;
            }
        }
        if(found == -1)
        {
            System.out.println(find+" is not in the library");
        }
        else
        {
            System.out.println("We found "+find+" in the library: ");
            System.out.println(myMusic[found]);
        }
    }
    
    /**
     * Method to find songs based on year.
     * @param myMusic Array of songs.
     * @param find year to find.
     */
    public static void searchYear(Music[] myMusic, int find)
    {
        int found = 0;
        System.out.println("Find results: ");
        for(int i = 0; i<myMusic.length; i++)
        {
            if(myMusic[i].getYear() == find)
            {
                System.out.println(myMusic[i]);
                found++;
            }
        }
        if(found == 0)
        {
            System.out.println("There are no listings for "+find);
        }
        else
        {
            System.out.println("There were "+found+" listings for "+find);
        }
    }
    
    /**
     * Method to find songs based on singer.
     * @param myMusic Array of songs.
     * @param find Song to find.
     */
    public static void searchSinger(Music[] myMusic, String find)
    {
        int found = 0;
        System.out.println("Find results: ");
        for(int i = 0; i<myMusic.length; i++)
        {
            if(myMusic[i].getSinger().equals(find))
            {
                System.out.println(myMusic[i]);
                found++;
            }
        }
        if(found == 0)
        {
            System.out.println("There are no listings for "+find);
        }
        else
        {
            System.out.println("There were "+found+" listings for "+find);
        }
    }
    
    /**
     * Main method.
     */
    public static void main(String[] args)
    {
        //Make an array of music objects.
        Music[] myMusic = new Music[10];
        myMusic[0] = new Music("Pieces of You",1994,"Jewel");
        myMusic[1] = new Music("Jagged Little Pill",1995,"Alanis Morissette");
        myMusic[2] = new Music("What If It's You",1995,"Reba McEntire");
        myMusic[3] = new Music("Misunderstood",2001,"Pink");
        myMusic[4] = new Music("Laundry Service",2001,"Shakira");
        myMusic[5] = new Music("Taking the Long Way",2006,"Dixie Chicks");
        myMusic[6] = new Music("Under My Skin",2004,"Avril Lavigne");
        myMusic[7] = new Music("Let Go",2002,"Avril Lavigne");
        myMusic[8] = new Music("Let It Go",2007,"Tim McGraw");
        myMusic[9] = new Music("White Flag",2004,"Dido");
        printMusic(myMusic);
        System.out.println();
        System.out.println();
        System.out.println("Search - Title - Let Go");
        searchTitle(myMusic,"Let Go");
        System.out.println();
        System.out.println();
        System.out.println("Search - Title - Some Day");
        searchTitle(myMusic,"Some Day");
        System.out.println();
        System.out.println();
        System.out.println("Search - Year - 2001");
        searchYear(myMusic, 2001);
        System.out.println();
        System.out.println();
        System.out.println("Search - Year - 2003");
        searchYear(myMusic, 2003);
        System.out.println();
        System.out.println();
        System.out.println("Search - Singer - Avril Lavigne");
        searchSinger(myMusic, "Avril Lavigne");
        System.out.println();
        System.out.println();
        System.out.println("Search - Singer - Tony Curtis");
        searchSinger(myMusic, "Tony Curtis");
    }
}