package com.example;

public class PlayingCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * PlayingCard playingCard=new PlayingCard(PlayingCard.SUIT_CLUBS, 100);
		 * System.out.println(playingCard.getSuitName());
		 * System.out.println(playingCard.getRank()); playingCard=new PlayingCard(900,
		 * 0);
		 */
		Suit s=Suit.SUIT_CLUBS;
		PlayingCard pCard=new PlayingCard(s);
		System.out.println(pCard.getTempSuit().getName());
		System.out.println(pCard.getTempSuit().getRank());

	}

}
