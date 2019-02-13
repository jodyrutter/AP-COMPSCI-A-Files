/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		//Create 3 card objects
		Card king = new Card("king","diamonds",7);
		Card jack = new Card("jack","hearts",3);
		Card king2 = new Card("king","diamonds",7);
		System.out.println(king);
		System.out.println(jack);
		System.out.println(king2);
		if(king.matches(king2))
		{
		    System.out.println(king.toString()+" matches "+king2.toString());
		}
		else
		{
		    System.out.println(king.toString()+" doesn't match "+king2.toString());
		}
	}
}
