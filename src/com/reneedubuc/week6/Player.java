package com.reneedubuc.week6;

import java.util.ArrayList;
import java.util.List;

public class Player {

//	Player name
//	hand
//	score
	
	String name;
	int score = 0;
	static List<Card> hand = new ArrayList<Card>();
	
	
//	public String hand() {
//		for(int i = 0; i < 26; i++) {
//			hand.draw();
//		} return hand.deck;	
//	} Not hand method needed?
	
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Prints out player name and describes each card in Hand List
	public String describePlayerAndEachCardInHand() {
		System.out.println(name);
		for(Card card : hand) {
			card.describeCard();
		}
		return hand.toString(); //?
	}
	
	List<Card> d = new ArrayList<Card>();
	Deck deck = new Deck(); 
	
	//Draws card from deck and adds it to hand
	public void draw(Deck deck) {
		hand.add(deck.draw());
		}
	
	//Flips top card from hand
	public Card flip() {
		return hand.remove(0); 
	}
	
	//Increments score
	public void incrementScore() {
		score++;
	}
	
}

