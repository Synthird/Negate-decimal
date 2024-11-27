public class Example {
    // This file is an example of using the negateDecimal methods.

    private static NegateDecimal negateDecimal = new NegateDecimal();

    public static void main(String[] args) throws Exception {
        System.out.println("Negated double of 156.415:");
        System.out.println(negateDecimal.negateDouble(156.415));
        System.out.println("Negated float of 345.4f:");
        System.out.println(negateDecimal.negateFloat(345.4f));
    }
}
