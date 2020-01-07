
public class UnoCardDeck {
	private UnoCard[] cards;
	private int cardsInDeck;

	public UnoCardDeck() {
		cards = new UnoCard[108];
	}

	public void reset() {
		UnoCard.Color[] colors = UnoCard.Color.values();
		cardsInDeck = 0;

		for (int i = 0; i < colors.length - 1; i++) {
			UnoCard.Color color = colors[i];

			cards[cardsInDeck++] = new UnoCard(color, UnoCard.Value.getValue(0));
			for (int j = 1; j < 10; j++) {
				cards[cardsInDeck++] = new UnoCard(color, UnoCard.Value.getValue(j));
				cards[cardsInDeck++] = new UnoCard(color, UnoCard.Value.getValue(j));
			}

		}
	}
}
