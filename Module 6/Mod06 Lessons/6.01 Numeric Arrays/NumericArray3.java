public class NumericArray3
{
    public static void main(String[] args)
    {
        int[] c = new int[5];
        int n = 0;
        for(;n<5;n++)
        {
            c[n] = (int)(20*Math.random());
            System.out.println("c["+n+"] = "+c[n]);
        }
    }
}