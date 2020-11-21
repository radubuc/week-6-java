package com.reneedubuc.week6;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player1 = new Player("Rhett");
		Player player2 = new Player("Link");
		
		Deck deck = new Deck();
		deck.shuffle();
		deck.draw();
		
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
		player1.draw(deck);
		player2.draw(deck);
		Card c = player1.flip();
		Card d = player2.flip();
		System.out.println(c.describeCard() + " " + d.describeCard());
		System.out.println(c.getValue() > d.getValue());		
		
		for(int i = 0; i < 26; i++){
			int p1 = player1.flip().getValue();
			int p2 = player2.flip().getValue();
			if (p1 > p2) {
				player1.incrementScore();
			}else if (p2 > p1) {
				player2.incrementScore();
			}else {
				System.out.println("Tie");
			}
		}
			
		System.out.println("Rhett's score is: " + player1.score + "Link's score is: " + player2.score);
		if(player1.score > player2.score) {
			System.out.println("Rhett wins again!");
		} else if (player2.score > player1.score) {
			System.out.println("Link finally wins!");
		} else {
			System.out.println("Rhett and Link tie!");
		}

		

	

}
}

	