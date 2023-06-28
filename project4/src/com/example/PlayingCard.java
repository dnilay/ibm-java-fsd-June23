package com.example;

public class PlayingCard {

	// class variables
	public static final int SUIT_SPADES = 0;
	public static final int SUIT_HEARTS = 1;
	public static final int SUIT_CLUBS = 2;
	public static final int SUIT_DIAMONDS = 3;
	// instance variables
	private Suit tempSuit;
	/*
	 * private int suit; private int rank;
	 */

	/*
	 * public PlayingCard(int suit, int rank) {
	 * 
	 * this.suit = suit; this.rank = rank; }
	 */
	
	

	public PlayingCard(Suit tempSuit) {
		super();
		this.tempSuit=tempSuit;
		
	}

	public Suit getTempSuit() {
		return tempSuit;
	}

	public void setTempSuit(Suit tempSuit) {
		this.tempSuit = tempSuit;
	}



	/*
	 * public int getSuit() { return suit; }
	 * 
	 * public void setSuit(int suit) { this.suit = suit; }
	 */

	/*
	 * public int getRank() { return rank; }
	 * 
	 * public void setRank(int rank) { this.rank = rank; }
	 */

	/*
	 * public String getSuitName() { String name = ""; switch (suit) { case
	 * SUIT_SPADES: name = "Spades"; break; case SUIT_HEARTS: name = "Hearts";
	 * break; case SUIT_CLUBS: name = "Clubs"; break; case SUIT_DIAMONDS: name =
	 * "Diamonds"; break; default: System.err.println("Invalid suit.");
	 * 
	 * } return name; }
	 */

}
