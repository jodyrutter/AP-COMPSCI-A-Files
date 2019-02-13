public class InitializingStringArray 
{ 
    public static void main(String [] args) 
    { 
        String [] names; 
        names = new String[10]; 
        for(int n = 0; n <= 9; n++) 
        { 
            System.out.println("index position " + n + " = " + names[n]); 
        } 
    } 
}
