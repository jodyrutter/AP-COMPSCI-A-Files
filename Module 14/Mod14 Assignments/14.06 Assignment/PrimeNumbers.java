/**
 * @purpose Calculate prime numbers between 1 and a user specified number.
 * 
 * @author Jody Rutter
 * @version 8/9/2015
 */
public class PrimeNumbers
{
    private final int lowerLimit = 1;
    private int upperLimit;
    
    /**
     * Constructor for objects of type PrimeNumbers.
     * @param upperLimit Variable representing the upper limit of prime numbers.
     */
    public PrimeNumbers(int upperLimit)
    {
        this.upperLimit = upperLimit;
    }
    
    /**
     * Method to input values into a method that decides if those values are prime.
     */
    public void reachLimit()
    {
        for(int index = lowerLimit; this.upperLimit >= index; index++)
        {
            prime(index);
        }
    }
    
    /**
     * Method to determine of a number is prime.
     * @param number Variable to be tested to determine if it's prime or not.
     */
    public void prime(int number)
    {
        boolean isPrime = (number > 1);
        
        if(number % 2 == 0)
        {
            isPrime = (number == 2);
        }
        else
        {
            int m = number - 2;
            while(isPrime && m>1)
            {
                if(number%m == 0)
                {
                    isPrime = false;
                }
                m -= 2;
            }
        }
        
        if(isPrime)
        {
            System.out.println(number+" is prime");
        }
    }
}