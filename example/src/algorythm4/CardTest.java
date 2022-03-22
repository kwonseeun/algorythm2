package algorythm4;

public class CardTest {

	public static void main(String[] args) {
		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card("BC");
		
		System.out.println(card1.cardName + "카드번호: " + card1.getCardNum() );
		System.out.println(card2.cardName + "카드번호: " + card2.getCardNum() );
		System.out.println(card3.cardName + "카드번호: " + card3.getCardNum() );
	}

}
