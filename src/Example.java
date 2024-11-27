public class Example {
    // This file is an example of using the negateDecimal methods.

    private static NegateDecimal negateDecimal = new NegateDecimal();

    public static void main(String[] args) throws Exception {
        System.out.println("---- DOUBLES ----");
        revealNegatedDouble(156.415);
        revealNegatedDouble(1);
        revealNegatedDouble(0);
        System.out.println("---- FLOAT ----");
        revealNegatedFloat(345.4f);
        revealNegatedFloat(1);
        revealNegatedFloat(0);
    }

    private static void revealNegatedDouble(double number) {
        System.out.println(String.format("Negated double of %s:", number));
        System.out.println(negateDecimal.negateDouble(number));
    }

    private static void revealNegatedFloat(float number) {
        System.out.println(String.format("Negated float of %sf:", number));
        System.out.println(negateDecimal.negateFloat(number));
    }
}
