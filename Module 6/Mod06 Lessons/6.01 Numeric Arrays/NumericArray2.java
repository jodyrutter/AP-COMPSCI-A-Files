public class NumericArray2
{
    public static void main(String[] args)
    {
        int b[] = new int[20];
        int n = 0;
        for(;n<=19;n++)
        {
            b[n]=(int)Math.random();
            System.out.println("b["+n+"] = "+b[n]);
        }
    }
}