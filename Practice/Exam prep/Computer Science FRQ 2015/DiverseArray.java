public class DiverseArray
{
    public static int arraySum(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i<arr.length; i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    public static int[] rowSums(int[][] arr2D)
    {
        int[] k = new int[arr2D[0].length];
        int rowSum;
        for(int c=0; c<arr2D[0].length; c++)
        {
            rowSum = 0;
            for(int r=0; r<arr2D.length; r++)
            {
                rowSum+=arr2D[r][c];
            }
            k[c] = rowSum;
        }
        return k;
    }
    public static boolean isDiverse(int[][] arr2D)
    {
        int[] k = rowSums(arr2D);
        boolean found = false;
        for(int i = 0; i<k.length; i++)
        {
            for(int s = i + 1; s<k.length; s++)
            {
                if(k[i]==k[s])
                {
                    found=true;
                }
            }
        }
        return found;
    }
}