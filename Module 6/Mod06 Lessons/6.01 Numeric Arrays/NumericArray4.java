import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class NumericArray4
{
    public static void main(String[] args) throws IOException
    {
        int index = 0;
        File fileName = new File("doubles.txt");
        Scanner inFile = new Scanner(fileName);
        double[] d = new double[10000];        
        while(inFile.hasNext())
        {
            d[index] = Double.parseDouble(inFile.next());
            index++;
        }
        for(int n = 0; n<10000;n++)
        {
            System.out.println(" d["+n+"] = "+d[n]);
        }
        inFile.close();
        double sum = 0;
        for(int index1 = 0; index1<10000;index1++)
        {
            sum+=d[index1];
        }
        System.out.println("Sum =" + sum);
    
}
}
        