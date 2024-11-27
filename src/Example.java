public class Example {
    // This file is an example of using the negateDecimal methods.

    private static NegateDecimal negateDecimal = new NegateDecimal();

    public static void main(String[] args) {
        printHeading("DOUBLES");
        revealNegatedDouble(156.415);
        revealNegatedDouble(1);
        revealNegatedDouble(6.0);
        revealNegatedDouble(0);
        printHeading("FLOATS");
        revealNegatedFloat(345.4f);
        revealNegatedFloat(1f);
        revealNegatedFloat(8.0f);
        revealNegatedFloat(0f);
    }

    private static void revealNegatedDouble(double number) {
        System.out.println(String.format("Negated double of %s:", number));
        System.out.println(negateDecimal.negateDouble(number));
    }

    private static void revealNegatedFloat(float number) {
        System.out.println(String.format("Negated float of %sf:", number));
        System.out.println(negateDecimal.negateFloat(number));
    }

    private static void printHeading(String title) {
        System.out.println(String.format("---- %s ----", title));
    }
}
