
public class UnoCard {
	enum Color {
		Red, Blue, Green, Yellow, Wild;

		private static final Color[] colors = Color.values();

		public static Color getColor(int i) {
			return Color.colors[i];
		}
	}
}

enum Value {
	Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Wild, Reverse, DrawTwo, DrawFour;

	private static final Value[] values = Value.values();

	public static Value getValue(int i) {
		return Value.values[i];
	}
}
