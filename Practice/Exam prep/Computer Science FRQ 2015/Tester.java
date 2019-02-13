public class Tester
{
    public static void main(String[] args)
    {
        int[] arr1 = {1,3,2,7,3};
        System.out.println(DiverseArray.arraySum(arr1));
        
        int[][] mat1 = {{1,10,5,7},{3,10,3,6},{2,4,5,4},{7,6,9,2},{3,2,6,1}};
        int[][] mat2 = {{1,12,8,3},{1,7,11,2},{5,6,10,3},{3,1,2,0},{4,9,5,6}};
        int[] sums = DiverseArray.rowSums(mat1);
        for(int i = 0; i<sums.length; i++)
        {
            System.out.print(sums[i]+" ");
        }
        System.out.println();
        System.out.println(DiverseArray.isDiverse(mat1));
        System.out.println(DiverseArray.isDiverse(mat2));
    }
}