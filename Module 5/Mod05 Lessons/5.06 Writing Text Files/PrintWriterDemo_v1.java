import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
class PrintWriterDemo_v1
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter outFile = new PrintWriter (new File("Hello.txt"));

        
        for (int loop = 1; loop<=20000;loop++)
        {
            double randNum = (Math.random()*1000)+1;
            outFile.print(loop+ " Did you hear the silent one? ");
            outFile.println(randNum);
            System.out.print(loop+" Did you hear the silent one? ");
            System.out.println(randNum);
        }
        outFile.close( );
    }
}