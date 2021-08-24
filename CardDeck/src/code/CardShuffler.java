package code;

import java.util.ArrayList;
import java.util.Collections;


public class CardShuffler {

	final static int deckSize = 52;
	final static int handSize = 5;
	
	static String[] suit = {"Spades","Diamonds","Clubs","Hearts"};
	static String[] value = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	
	static ArrayList<String> deck = new ArrayList<String>();
	static ArrayList<String> hand1 = new ArrayList<String>();
	static ArrayList<String> hand2 = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		cards();
		
		

	}

	public static void cards() {
		
		for(int i =0;i<deckSize;i++) {
			deck.add(value[i%13]+ " of " + suit[i/value.length]);
		}
		
		Collections.shuffle(deck);
		deal();
		
	}
	
	public static void show(ArrayList<String> deck) {
		
		for(int i = 0;i<deck.size();i++) {
			System.out.println(deck.get(i));
		}
		
	}
	
	public static void deal() {
		
		for(int i = 0;i<handSize;i++) {
			hand1.add(deck.remove(0));
			hand2.add(deck.remove(0));
		}
		
		System.out.println("\n -------- HAND 1 -------- \n");
		show(hand1);
		System.out.println("\n -------- HAND 2 -------- \n");
		show(hand2);
		System.out.println("\n -------- DECK -------- \n");
		show(deck);
		
	}
}
