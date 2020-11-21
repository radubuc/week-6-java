package com.reneedubuc.week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> deck = new ArrayList<Card>();
	
	String[] suit = {"Hearts", "Diamonds", "Spades", "Clubs"};

	public Deck() {
		for(int i = 0; i < 4; i++) {
			for(int j = 2; j <= 14; j++) {
				Card fullCard = new Card(j, suit[i]); 
				deck.add(fullCard);
//				System.out.println(fullCard.describe()); //Make counter to check how many cards are printing out. It's printing deck out 3 times?
			}
		}
	}

	public void shuffle(){
		Collections.shuffle(deck);
//		for(Card c : deck) {
//			System.out.println(c.getSuit()); //Gets j and suit from line 16 for whole deck
//		}
	}
	public Card draw() {
		return deck.remove(0);
//		System.out.println(deck.remove(0).describe());
	}
	
	
	
	
}
