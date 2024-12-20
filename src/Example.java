// This file is an example of using the negateDecimal methods.

public class Example {
	private static NegateDecimal negateDecimal = new NegateDecimal();

	public static void main(String[] args) {
		printHeading("DOUBLES");
		revealNegatedDouble(156.415);
		revealNegatedDouble(1.0);
		revealNegatedDouble(6.0);
		revealNegatedDouble(0.0);
		revealNegatedDouble(-9.0);
		revealNegatedDouble(-16.5);
		printHeading("FLOATS");
		revealNegatedFloat(156.415f);
		revealNegatedFloat(1.0f);
		revealNegatedFloat(6.0f);
		revealNegatedFloat(0.0f);
		revealNegatedFloat(-9.0f);
		revealNegatedFloat(-16.5f);
	}

	private static void revealNegatedDouble(double number) {
		System.out.println(String.format("Negated double of %s:", number));
		System.out.println(negateDecimal.negateDouble(number));
	}

	private static void revealNegatedFloat(float number) {
		System.out.println(String.format("Negated float of %sf:", number));
		System.out.println(String.format("%ff", negateDecimal.negateFloat(number)));
	}

	private static void printHeading(String title) {
		System.out.println(String.format("---- %s ----", title));
	}
}
