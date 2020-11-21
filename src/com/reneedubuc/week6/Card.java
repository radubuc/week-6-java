package com.reneedubuc.week6;

public class Card {

	public int value;
	public String suit;
	
	public Card(int value, String suit) {
		this.value = value;
		this.suit = suit;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public String describeCard() {
		String str = "";
			switch(value) {
			case 2:
				str = "Two";
				break;
			case 3:
				str = "Three";
				break;
			case 4:
				str = "Four";
				break;
			case 5:
				str = "Five";
				break;
			case 6:
				str = "Six";
				break;
			case 7:
				str = "Seven";
				break;
			case 8:
				str = "Eight";
				break;
			case 9:
				str = "Nine";
				break;
			case 10:
				str = "Ten";
				break;
			case 11:
				str = "Jack";
				break;
			case 12:
				str = "Queen";
				break;
			case 13:
				str = "King";
				break;
			case 14:
				str = "Ace";
				break;
			}
		return str + " of " + suit;
	}

}
