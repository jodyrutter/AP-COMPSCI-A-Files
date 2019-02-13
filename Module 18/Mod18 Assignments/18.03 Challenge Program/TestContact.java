/**
 * @purpose Make a list of people that can be searched.
 * 
 * @author Jody Rutter
 * @version 8/30/2015
 */
public class TestContact
{
    /**
     * Method to print contacts.
     * @param myContacts An array of contacts.
     */
    public static void printContacts(Contact[] myContacts)
    {
        System.out.printf("%45s\n","Contact List");
        System.out.println();
        System.out.println();
        System.out.printf("%-24s %-24s %-24s %-24s %s\n","Name","Relation","Birthday","Phone","Email");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i<myContacts.length; i++)
        {
            System.out.println(myContacts[i]);
        }
    }
    
    /**
     * Method to merge sort names.
     * @param myContacts Array of contacts.
     * @param low Lowest index on an array.
     * @param high Highest index on an array.
     */
    public static void mergeSortNames(Contact[] myContacts, int low, int high)
    {
        if(low == high)
        {
            return;
        }
        
        int mid = (low+high)/2;
        mergeSortNames(myContacts, low, mid);
        mergeSortNames(myContacts, mid+1, high);
        
        mergeNames(myContacts, low, mid, high);
    }
    
    /**
     * Method to merge an array for the mergeSortNames method.
     * @param myContacts Array of contacts.
     * @param low Lowest index on array.
     * @param mid Mid index on array.
     * @param high Highest index on array.
     */
    public static void mergeNames(Contact[] myContacts, int low, int mid, int high)
    {
        Contact[] temp = new Contact[high-low+1];
        int i = low, j = mid+1, n = 0;
        while(i<= mid || j<= high)
        {
            if(i > mid)
            {
                temp[n] = myContacts[j];
                j++;
            }
            else if(j > high)
            {
                temp[n] = myContacts[i];
                i++;
            }
            else if(myContacts[i].getName().compareTo(myContacts[j].getName()) < 0)
            {
                temp[n] = myContacts[i];
                i++;
            }
            else
            {
                temp[n] = myContacts[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k<=high; k++)
        {
            myContacts[k] = temp[k-low];
        }
    }
    
    /**
     * Method to find a contact based on name.
     * @param myContacts Array of contacts.
     * @param find Name to find.
     */
    public static void searchName(Contact[] myContacts, String find)
    {
        int high = myContacts.length;
        int low = -1;
        int probe;
        while(high - low > 1)
        {
            probe = (high+low)/2;
            if(myContacts[probe].getName().compareTo(find) > 0)
            {
                high = probe;
            }
            else
            {
                low = probe;
                if(myContacts[probe].getName().compareTo(find) == 0)
                {
                    break;
                }
            }
        }
        System.out.println("Find results: ");
        if((low>=0)&&(myContacts[low].getName().compareTo(find) == 0))
        {
            findMoreNames(myContacts, low, find);
        }
        else
        {
            System.out.println("There are no listings for "+find);
        }
    }
    
    /**
     * Method to find more of a name in an array of contacts.
     * @param low Index where a name was found.
     * @param find Title to find.
     */
    public static void findMoreNames(Contact[] myContacts, int low, String find)
    {
        int i = low;
        int start = -1;
        int end = -1;
        int counter = -1;
        while((i >= 0)&&(myContacts[i].getName().compareTo(find) == 0))
        {
            start = i;
            i--;
            counter++;
        }
        
        i = low;
        while((i<myContacts.length)&&(myContacts[i].getName().compareTo(find) == 0))
        {
            end = i;
            i++;
            counter++;
        }
        
        for(i = start; i<= end; i++)
        {
            System.out.println(myContacts[i]);
        }
        
        if(counter > 1)
        {
            System.out.println("There were "+counter+" listings for "+find);
        }
        else
        {
            System.out.println("There was "+counter+" listing for "+find);
        }
    }
    
    /**
     * Method to find relations.
     * @param myContacts Array of contacts.
     * @param find Relation to find.
     */
    public static void searchRelation(Contact[] myContacts, String find)
    {
        int counter = 0;
        System.out.println("Find results: ");
        for(int i = 0; i<myContacts.length; i++)
        {
            if(myContacts[i].getRelation().equals(find))
            {
                System.out.println(myContacts[i]);
                counter++;
            }
        }
        if(counter == 0)
        {
            System.out.println("There are no listings for "+find);
        }
        else if(counter == 1)
        {
            System.out.println("There was "+counter+" listing for "+find);
        }
        else
        {
            System.out.println("There were "+counter+" listings for "+find);
        }
    }
    
    /**
     * Method to find phone numbers.
     * @param myContacts Array of contacts.
     * @param find Phone number to find.
     */
    public static void searchPhone(Contact[] myContacts, String find)
    {
        int counter = 0;
        System.out.println("Find results: ");
        for(int i = 0; i<myContacts.length; i++)
        {
            if(myContacts[i].getPhone().equals(find))
            {
                System.out.println(myContacts[i]);
                counter++;
            }
        }
        if(counter == 0)
        {
            System.out.println("There are no listings for "+find);
        }
        else if(counter == 1)
        {
            System.out.println("There was "+counter+" listing for "+find);
        }
        else
        {
            System.out.println("There were "+counter+" listings for "+find);
        }
    }
    
    /**
     * Method to find birthmonth.
     * @param myContacts Array of contacts.
     * @param find Birthmonth to find.
     */
    public static void searchBMonth(Contact[] myContacts, String find)
    {
        int counter = 0;
        System.out.println("Find results: ");
        for(int i = 0; i<myContacts.length; i++)
        {
            if(myContacts[i].getBirthday().substring(0,3).equals(find))
            {
                System.out.println(myContacts[i]);
                counter++;
            }
        }
        if(counter == 0)
        {
            System.out.println("There are no listings for "+find);
        }
        else if(counter == 1)
        {
            System.out.println("There was "+counter+" listing for "+find);
        }
        else
        {
            System.out.println("There were "+counter+" listings for "+find);
        }
    }
    
    /**
     * Method to merge sort emails.
     * @param myContacts Array of contacts.
     * @param low Lowest index on an array.
     * @param high Highest index on an array.
     */
    public static void mergeSortEmails(Contact[] myContacts, int low, int high)
    {
        if(low == high)
        {
            return;
        }
        
        int mid = (low+high)/2;
        mergeSortEmails(myContacts, low, mid);
        mergeSortEmails(myContacts, mid+1, high);
        
        mergeEmails(myContacts, low, mid, high);
    }
    
    /**
     * Method to merge an array for the mergeSortEmails method.
     * @param myContacts Array of contacts.
     * @param low Lowest index on array.
     * @param mid Mid index on array.
     * @param high Highest index on array.
     */
    public static void mergeEmails(Contact[] myContacts, int low, int mid, int high)
    {
        Contact[] temp = new Contact[high-low+1];
        int i = low, j = mid+1, n = 0;
        while(i<= mid || j<= high)
        {
            if(i > mid)
            {
                temp[n] = myContacts[j];
                j++;
            }
            else if(j > high)
            {
                temp[n] = myContacts[i];
                i++;
            }
            else if(myContacts[i].getEmail().compareTo(myContacts[j].getEmail()) < 0)
            {
                temp[n] = myContacts[i];
                i++;
            }
            else
            {
                temp[n] = myContacts[j];
                j++;
            }
            n++;
        }
        
        for(int k = low; k<=high; k++)
        {
            myContacts[k] = temp[k-low];
        }
    }
    
    /**
     * Method to find a contact based on email.
     * @param myContacts Array of contacts.
     * @param find Email to find.
     */
    public static void searchEmail(Contact[] myContacts, String find)
    {
        int high = myContacts.length;
        int low = -1;
        int probe;
        while(high - low > 1)
        {
            probe = (high+low)/2;
            if(myContacts[probe].getEmail().compareTo(find) > 0)
            {
                high = probe;
            }
            else
            {
                low = probe;
                if(myContacts[probe].getEmail().compareTo(find) == 0)
                {
                    break;
                }
            }
        }
        System.out.println("Find results: ");
        if((low>=0)&&(myContacts[low].getEmail().compareTo(find) == 0))
        {
            findMoreEmails(myContacts, low, find);
        }
        else
        {
            System.out.println("There are no listings for "+find);
        }
    }
    
    /**
     * Method to find more of an email in an array of contacts.
     * @param low Index where an email was found.
     * @param find Title to find.
     */
    public static void findMoreEmails(Contact[] myContacts, int low, String find)
    {
        int i = low;
        int start = -1;
        int end = -1;
        int counter = -1;
        while((i >= 0)&&(myContacts[i].getEmail().compareTo(find) == 0))
        {
            start = i;
            i--;
            counter++;
        }
        
        i = low;
        while((i<myContacts.length)&&(myContacts[i].getEmail().compareTo(find) == 0))
        {
            end = i;
            i++;
            counter++;
        }
        
        for(i = start; i<= end; i++)
        {
            System.out.println(myContacts[i]);
        }
        
        if(counter > 1)
        {
            System.out.println("There were "+counter+" listings for "+find);
        }
        else
        {
            System.out.println("There was "+counter+" listing for "+find);
        }
    }
    
    /**
     * Main method.
     */
    public static void main(String[] args)
    {
        //Make an array of Contacts.
        Contact[] myContacts = new Contact[6];
        myContacts[0] = new Contact("John Carter","brother","Mar 3","(342)555-7069","jcarter@carter.com");
        myContacts[1] = new Contact("Elise Carter","mom","Apr 19","(342)555-7011","carterMom@carter.com");
        myContacts[2] = new Contact("Ellie Carter","me","Jun 10","(342)555-8102","ecarter@carter.com");
        myContacts[3] = new Contact("Sue Ellen","friend","Mar 9","(341)555-9182","susieE@hotmail.com");
        myContacts[4] = new Contact("Frank Carter","dad","Dec 1","(342)555-7011","carterDad@carter.com");
        myContacts[5] = new Contact("Johnnie","friend","Jan 21","(341)555-7789","jDawg5555@yahoo.com");
        printContacts(myContacts);
        System.out.println();
        System.out.println();
        System.out.println("Find Name - Johnnie");
        mergeSortNames(myContacts, 0, myContacts.length - 1);
        searchName(myContacts, "Johnnie");
        System.out.println();
        System.out.println();
        System.out.println("Find Name - Sam Parker");
        searchName(myContacts, "Sam Parker");
        System.out.println();
        System.out.println();
        System.out.println("Find Relation - friend");
        searchRelation(myContacts, "friend");
        System.out.println();
        System.out.println();
        System.out.println("Find Relation - aunt");
        searchRelation(myContacts, "aunt");
        System.out.println();
        System.out.println();
        System.out.println("Find Phone - (333)555-8989");
        searchPhone(myContacts, "(333)555-8989");
        System.out.println();
        System.out.println();
        System.out.println("Find Phone - (342)555-7011");
        searchPhone(myContacts, "(342)555-7011");
        System.out.println();
        System.out.println();
        System.out.println("Find Bday - May");
        searchBMonth(myContacts, "May");
        System.out.println();
        System.out.println();
        System.out.println("Find Bday - Mar");
        searchBMonth(myContacts, "Mar");
        System.out.println();
        System.out.println();
        System.out.println("Find Email - rgoodman@hotmail.com");
        searchEmail(myContacts, "rgoodman@hotmail.com");;
        System.out.println();
        System.out.println();
        System.out.println("Find Email - susieE@hotmail.com");
        searchEmail(myContacts, "susieE@hotmail.com");
    }
}