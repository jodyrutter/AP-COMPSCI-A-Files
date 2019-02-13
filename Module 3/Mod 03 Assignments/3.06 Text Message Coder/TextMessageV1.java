/**
 * The purpose of this program is to automatically abreviate text.
 * 
 * @author Jody Rutter 
 * @version 6/18/2015
 */
public class TextMessageV1
{
    public static void main(String[]args)
    {
        //local variable declerations
        String originalMessage = "This Minecraft server is so laggy. I might go onto Youtube or Nico Nico Douga because this lag is so annoying. See you.";
        String newMessage = originalMessage.replace("Minecraft","MC");
        newMessage = newMessage.replace("Youtube","YT");
        newMessage = newMessage.replace("Nico Nico Douga", "Nicovid");
        newMessage = newMessage.replace("because", "cuz");
        newMessage = newMessage.replace("See you", "C'ya");
        int positionOfN = newMessage.indexOf('N');
        int positionOfI = newMessage.indexOf('I');
        int positionOfO = newMessage.indexOf('o');
        int positionOfM = newMessage.indexOf('M');
        int positionOfC = newMessage.indexOf('C');
        int stringLengthOfOM = originalMessage.length();
        int stringLengthOfNM = newMessage.length();
        int oneSeventhPoint = stringLengthOfNM / 7;
        String firstSeventh = newMessage.substring(0,oneSeventhPoint);
        String lastSeventh = newMessage.substring(stringLengthOfNM - oneSeventhPoint,stringLengthOfNM);
        String beforeI = newMessage.substring(0,positionOfI);
        String characterReplacements = newMessage.replaceAll("[amto]","¥");
        
        //Original Message
        System.out.println("Original Message: " + originalMessage);
        System.out.println();
        
        //new Message
        System.out.println("New Message: " + newMessage);
        System.out.println();
        
        //Index
        System.out.println("Index of \"N\": " + positionOfN);
        System.out.println("Index of \"I\": " + positionOfI);
        System.out.println("Index of \"O\": " + positionOfO);
        System.out.println("Index of \"M\": " + positionOfM);
        System.out.println("Index of \"C\": " + positionOfC);
        System.out.println();
        
        //String Lenth
        System.out.println("String length of old message : " + stringLengthOfOM);
        System.out.println("String length of new message : " + stringLengthOfNM);
        System.out.println();
        
        //substrings
        System.out.println("Substring first-seventh : " + firstSeventh);
        System.out.println("Substring last-seventh : " + lastSeventh);
        System.out.println("Substring before \"I\" : " + beforeI);
        System.out.println();
        
        //Character replacement
        System.out.println("Replacement of all a's,m's,t's, and o's with the yen symbol : " + characterReplacements);
        System.out.println();

    }
}
