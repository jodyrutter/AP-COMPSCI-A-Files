/**
 * The purpose of Mona is to calculate the money due for overdue books.
 * 
 * @Jody Rutter 
 * @6/21/2015
 */
import java.util.Scanner;
public class Mona
{
    public static void main(String[]args)
    {
        //Scanner declerations
        Scanner lastNameAndFirstName = new Scanner(System.in);           //Scanner for last and first name
        Scanner phoneNumber = new Scanner(System.in);                    //Scanner for phone number
        Scanner emailAddress = new Scanner(System.in);                   //Scanner for email address, as modeled by the expected output, but not in the instructions.
        Scanner nameOfOverdueBook = new Scanner(System.in);              //Scanner for overdue book
        Scanner dateOfCheckOut = new Scanner(System.in);                 //Scanner for day the book was checked out
        Scanner numberOfDaysTheBookIsOverdue = new Scanner(System.in);   //Scanner for number of days the book is overdue
        Scanner dailyFine = new Scanner(System.in);                      //Scanner for daily fine
        
        //First name and last name of renter
        System.out.print("Enter the name (Last, First): ");
        String lastNameWithComma = lastNameAndFirstName.next();
        String lastName = lastNameWithComma.replace(",","");
        String firstName = lastNameAndFirstName.next();
        System.out.println();
        
        //Phone number of renter
        System.out.print("Enter the phone number (###) ###-####: ");
        String firstThreeDigitsOfPhoneNumber = phoneNumber.next();
        String restOfPhoneNumber = phoneNumber.next();
        System.out.println();
        
        //Email address of renter
        System.out.print("Enter email address: ");
        String adressOfEmail = emailAddress.nextLine();
        System.out.println();
        
        //Book title
        System.out.print("Enter the title of the book: ");
        String bookTitle = nameOfOverdueBook.nextLine();
        System.out.println();
        
        //Date the book was checked out
        System.out.print("The date the book was checked out (mm/dd/yyyy): ");
        String bookChkOutDate = dateOfCheckOut.next();
        String bookChkOutDateWithoutDashes = bookChkOutDate.replace("/","-");
        System.out.println();
        
        //Days late
        System.out.print("Days late: ");
        String daysLate = numberOfDaysTheBookIsOverdue.next();
        
        //Daily fine
        System.out.print("Daily fine: ");
        String theDailyFine = dailyFine.next();
        System.out.println();
        
        //Total fine
        double totalFine = (int)Double.parseDouble(daysLate) * Double.parseDouble(theDailyFine);    //I made it parse double for daysLate incase the user enters an integer
        
        //Text for email message
        System.out.println("---------- Text for email message ----------");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("To: " + firstName + " " + lastName + " (" + adressOfEmail + ")");
        System.out.println();
        System.out.println("From: Mona (mona@csamediacenter.com)");
        System.out.println();
        System.out.println("Subject: Overdue Book Notice");
        System.out.println("******************************************************");
        System.out.println("Phone number: " + firstThreeDigitsOfPhoneNumber + restOfPhoneNumber);
        System.out.println(bookTitle + " was checked out on: " + bookChkOutDateWithoutDashes);
        System.out.println("This book is currently " + daysLate + " day(s) late.");
        System.out.println("Your fine has accumulated to: $" + totalFine + " dollar(s)");
        
        
        
        
        
    }
}
