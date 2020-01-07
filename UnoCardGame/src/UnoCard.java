
public class UnoCard {
	enum Color {
		Red, Blue, Green, Yellow, Wild;

		private static final Color[] colors = Color.values();

		public static Color getColor(int i) {
			return Color.colors[i];
		}
	}

	enum Value {
		Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Wild, Wild_Four, Skip, Reverse, DrawTwo, DrawFour;

		private static final Value[] values = Value.values();

		public static Value getValue(int i) {
			return Value.values[i];
		}
	}

// declare private and final so it can't be accessed by another class and can't be changed

	private static Color color;
	private static Value value;

	public UnoCard(final Color color, final Value value) {
		this.color = color;
		this.value = value;
	}

	public Color getColor() {
		return this.color;

	}

	public Value getValue() {
		return this.value;

	}

// for testing 
	public String toString() {
		return color + " " + value;
	}
}
