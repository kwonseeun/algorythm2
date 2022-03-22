package algorythm4;

public class Card {
	private static int serialNum = 100;
	String cardName;
    int cardNum;

	public Card() {
		serialNum++;
		cardNum = serialNum;
	}

	public Card(String card) {
        serialNum++;
		cardNum = serialNum;
        this.cardName = card;
	}

	public int getCardNum() {
		return cardNum;
	}

}
