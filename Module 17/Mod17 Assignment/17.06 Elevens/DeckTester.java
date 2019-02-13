/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"jack", "queen", "king"};
        String[] suits = {"blue", "red"};
        String[] ranks2 = { "two", "three", "four", "five"};
        String[] suits2 = {"green", "orange", "tan"};
        String[] ranks3 = {"two","three","four","five","six","seven","eight","nine","ten","jack","king","queen","ace"};
        String[] suits3 = {"spades","hearts","diamonds","clubs"};
        int[] pointValues = {11, 12, 13};
        int[] pointValues2 = {2,3,4,5};
        int[] pointValues3 = {2,3,4,5,6,7,8,9,10,10,10,10,11};
        Deck d = new Deck(ranks, suits, pointValues);
        Deck e = new Deck(ranks2, suits2, pointValues2);
        Deck f = new Deck(ranks3, suits3, pointValues3);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        f.deal();
        System.out.println(f);
	}
}
