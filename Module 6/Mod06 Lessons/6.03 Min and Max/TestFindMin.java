 public class TestFindMin
{
    public static void main(String[] args)
    {
        Integer[] numbers = {3, 99, -1, 5, -10};
        Integer max = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i ++)
        {
            if (numbers[i] > max)
                max = numbers[i];
        }
        System.out.println("Maximum value is " + max);
    }  
} 