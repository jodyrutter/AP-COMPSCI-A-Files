/**
 * @purpose Sort an inventory of items.
 * 
 * @author Jody Rutter.
 * @version 8/25/2015  v1.0
 */
public class TestItem
{
    /**
     * Print the hardware array.
     * @param hardware Array of hardware.
     */
    public static void printItems(Item[] hardware)
    {
        System.out.printf("%s %14s %13s %11s\n","itemID","itemName","inStore","price");
        System.out.println("-----------------------------------------------");
        for(int i = 0; i<hardware.length; i++)
        {
            System.out.printf("%-12s %-16s %-10d $ %.2f\n",hardware[i].getID(),hardware[i].getName(),hardware[i].getQuantity(),hardware[i].getPrice());
        }
    }
    
    /**
     * Method to sort items based on their IDs.
     * @param hardware Array of items.
     * @param order Number of either 1 or 2 that chooses whether to sort an item in ascending or decending order.
     * @param low Lowest index on array.
     * @param high Highest index on array.
     */
    public static void sortID(Item[] hardware, int order, int low, int high)
    {
        if(order == 1)
        {
            if(low == high)
            {
                return;
            }
            
            int mid = (low+high)/2;
            sortID(hardware, 1, low, mid);
            sortID(hardware, 1, mid+1, high);
            
            mergeHardwareIDAscending(hardware, low, mid, high);
        }
        else if(order == 2)
        {
            if(low == high)
            {
                return;
            }
            
            int mid = (low+high)/2;
            sortID(hardware, 2, low, mid);
            sortID(hardware, 2, mid+1, high);
            
            mergeHardwareIDDescending(hardware, low, mid, high);
        }
        else
        {
            System.out.println("I'm sorry, order must be set to either 1 for ascending, or 2 for descending.");
        }
    }
    
    /**
     * Method to merge an array for the sortID method.
     * @param hardware Array of items.
     * @param low Lowest index on array.
     * @param mid Mid index on array.
     * @param high Highest index on array.
     */
    public static void mergeHardwareIDAscending(Item[] hardware, int low, int mid, int high)
    {
        Item[] temp = new Item[high - low + 1];
        int i = low, j = mid + 1, n = 0;
        while(i<=mid || j<= high)
        {
            if(i > mid)
            {
                temp[n] = hardware[j];
                j++;
            }
            else if( j > high)
            {
                temp[n] = hardware[i];
                i++;
            }
            else if( hardware[i].getID().compareTo(hardware[j].getID()) > 0)
            {
                temp[n] = hardware[i];
                i++;
            }
            else
            {
                temp[n] = hardware[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k <= high; k++)
        {
            hardware[k] = temp[k-low];
        }
    }
    
    /**
     * Method to merge an array for the sortID method.
     * @param hardware Array of items.
     * @param low Lowest index on array.
     * @param mid Mid index on array.
     * @param high Highest index on array.
     */
    public static void mergeHardwareIDDescending(Item[] hardware, int low, int mid, int high)
    {
        Item[] temp = new Item[high - low + 1];
        int i = low, j = mid + 1, n = 0;
        while(i<=mid || j<= high)
        {
            if(i > mid)
            {
                temp[n] = hardware[j];
                j++;
            }
            else if( j > high)
            {
                temp[n] = hardware[i];
                i++;
            }
            else if( hardware[i].getID().compareTo(hardware[j].getID()) < 0)
            {
                temp[n] = hardware[i];
                i++;
            }
            else
            {
                temp[n] = hardware[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k <= high; k++)
        {
            hardware[k] = temp[k-low];
        }
    }
    
    /**
     * Method to sort hardware based on name.
     * @param hardware Array of items.
     * @param order Number of either 1 or 2 that chooses whether to sort an item in ascending or decending order.
     */
    public static void sortName(Item[] hardware, int order)
    {
        Item[]  myHardwareSorted = new Item[hardware.length];
        if(order == 1)
        {
            for(int i = 0; i< hardware.length; i++)
            {
                Item next = hardware[i];
                int insertI = 0;
                int k = i;
                while(k > 0 && insertI == 0)
                {
                    if(next.getName().compareTo(myHardwareSorted[k-1].getName()) > 0)
                    {
                        insertI = k;
                    }
                    else
                    {
                        myHardwareSorted[k] = myHardwareSorted[k-1];
                    }
                    k--;
                }
                myHardwareSorted[insertI] = next;
            }
            //Activate printMoves method.
            printItems(myHardwareSorted);
        }
        else if(order == 2)
        {
            for(int i = 0; i< hardware.length; i++)
            {
                Item next = hardware[i];
                int insertI = 0;
                int k = i;
                while(k > 0 && insertI == 0)
                {
                    if(next.getName().compareTo(myHardwareSorted[k-1].getName()) < 0)
                    {
                        insertI = k;
                    }
                    else
                    {
                        myHardwareSorted[k] = myHardwareSorted[k-1];
                    }
                    k--;
                }
                myHardwareSorted[insertI] = next;
            }
            //Activate printMoves method.
            printItems(myHardwareSorted);
        }
        else
        {
            System.out.println("I'm sorry, order must be set to either 1 for ascending, or 2 for descending.");
        }
    }
    
    /**
     * Method to sort hardware based on item quantity.
     * @param hardware Array of items.
     * @param order Number of either 1 or 2 that chooses whether to sort an item in ascending or decending order.
     */
    public static void sortInStore(Item[] hardware, int order)
    {
        if(order == 1)
        {
            int posmax;
            
            for(int i = hardware.length - 1; i>0; i--)
            {
                posmax = 0;
                for(int k = 1; k<=i; k++)
                {
                    if(hardware[k].getQuantity() < hardware[posmax].getQuantity())
                    {
                        posmax = k;
                    }
                }
                Item temp = hardware[i];
                hardware[i] = hardware[posmax];
                hardware[posmax] = temp;
            }
            //Activate printMovies method.
            printItems(hardware);
        }
        else if(order == 2)
        {
            int posmin;
            
            for(int i = hardware.length - 1; i>0; i--)
            {
                posmin = 0;
                for(int k = 1; k<=i; k++)
                {
                    if(hardware[k].getQuantity() > hardware[posmin].getQuantity())
                    {
                        posmin = k;
                    }
                }
                Item temp = hardware[i];
                hardware[i] = hardware[posmin];
                hardware[posmin] = temp;
            }
            //Activate printMovies method.
            printItems(hardware);
        }
        else
        {
            System.out.println("I'm sorry, order must be set to either 1 for ascending, or 2 for descending.");
        }
    }
    
    /**
     * Method to sort items based on their price.
     * @param hardware Array of items.
     * @param order Number of either 1 or 2 that chooses whether to sort an item in ascending or decending order.
     * @param low Lowest index on array.
     * @param high Highest index on array.
     */
    public static void sortPrice(Item[] hardware, int order, int low, int high)
    {
        if(order == 1)
        {
            if(low == high)
            {
                return;
            }
            
            int mid = (low+high)/2;
            sortPrice(hardware, 1, low, mid);
            sortPrice(hardware, 1, mid+1, high);
            
            mergeHardwarePriceAscending(hardware, low, mid, high);
        }
        else if(order == 2)
        {
            if(low == high)
            {
                return;
            }
            
            int mid = (low+high)/2;
            sortPrice(hardware, 2, low, mid);
            sortPrice(hardware, 2, mid+1, high);
            
            mergeHardwarePriceDescending(hardware, low, mid, high);
        }
        else
        {
            System.out.println("I'm sorry, order must be set to either 1 for ascending, or 2 for descending.");
        }
    }
    
    /**
     * Method to merge an array for the sortPrice method.
     * @param hardware Array of items.
     * @param low Lowest index on array.
     * @param mid Mid index on array.
     * @param high Highest index on array.
     */
    public static void mergeHardwarePriceAscending(Item[] hardware, int low, int mid, int high)
    {
        Item[] temp = new Item[high - low + 1];
        int i = low, j = mid + 1, n = 0;
        while(i<=mid || j<= high)
        {
            if(i > mid)
            {
                temp[n] = hardware[j];
                j++;
            }
            else if( j > high)
            {
                temp[n] = hardware[i];
                i++;
            }
            else if( hardware[i].getPrice() > hardware[j].getPrice())
            {
                temp[n] = hardware[i];
                i++;
            }
            else
            {
                temp[n] = hardware[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k <= high; k++)
        {
            hardware[k] = temp[k-low];
        }
    }
    
    /**
     * Method to merge an array for the sortPrice method.
     * @param hardware Array of items.
     * @param low Lowest index on array.
     * @param mid Mid index on array.
     * @param high Highest index on array.
     */
    public static void mergeHardwarePriceDescending(Item[] hardware, int low, int mid, int high)
    {
        Item[] temp = new Item[high - low + 1];
        int i = low, j = mid + 1, n = 0;
        while(i<=mid || j<= high)
        {
            if(i > mid)
            {
                temp[n] = hardware[j];
                j++;
            }
            else if( j > high)
            {
                temp[n] = hardware[i];
                i++;
            }
            else if( hardware[i].getPrice() < hardware[j].getPrice())
            {
                temp[n] = hardware[i];
                i++;
            }
            else
            {
                temp[n] = hardware[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k <= high; k++)
        {
            hardware[k] = temp[k-low];
        }
    }
    
    /**
     * Main method.
     */
    public static void main(String[] args)
    {
        //Make an array of objects.
        Item[] hardware = new Item[6];
        hardware[0] = new Item("1011","Air Filters",200,10.5);
        hardware[1] = new Item("1034","Door Knobs",60,21.5);
        hardware[2] = new Item("1101","Hammers",90,9.99);
        hardware[3] = new Item("1600","Levels",80,19.99);
        hardware[4] = new Item("1500","Ceiling Fans",100,59);
        hardware[5] = new Item("1201","Wrench Sets",55,80);
        
        System.out.println("Original Array: ");
        System.out.println();
        printItems(hardware);
        System.out.println();
        System.out.println("Sorted by ID: ");
        System.out.println();
        sortID(hardware, 2, 0, hardware.length - 1);
        printItems(hardware);
        System.out.println();
        System.out.println("Sorted by Name: ");
        System.out.println();
        sortName(hardware, 2);
        System.out.println();
        System.out.println("Sorted by inStore: ");
        System.out.println();
        sortInStore(hardware, 2);
        System.out.println();
        System.out.println("Sorted by Price: ");
        System.out.println();
        sortPrice(hardware, 1, 0, hardware.length - 1);
        printItems(hardware);
    }
}