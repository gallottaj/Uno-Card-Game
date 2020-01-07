
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
			for (int t = 1; t < 10; t++) {
				cards[cardsInDeck++] = new UnoCard(color, UnoCard.Value.getValue(t));
				cards[cardsInDeck++] = new UnoCard(color, UnoCard.Value.getValue(t));
			}
			// create UnoCard.Value.Skip
			UnoCard.Value[] values = new UnoCard.Value[] { UnoCard.Value.DrawTwo, UnoCard.Value.Reverse };
			for (UnoCard.Value value : values) {
				cards[cardsInDeck++] = new UnoCard(color, value);
				cards[cardsInDeck++] = new UnoCard(color, value);
			}
			//create wildcards
			UnoCard.Value[] values = new UnoCard.Value[] { UnoCard.Value.Wild, UnoCard.Value.Wild_Four };

		}
	}
}
