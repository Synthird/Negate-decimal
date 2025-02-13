public class NegateDecimal {
	/**
	 * @param decimalDouble
	 * @return Returns a negative version of a positive float and vice versa.
	 */
	public double negateDouble(double decimalDouble) {
		return decimalDouble * -1.0;
	}

	/**
	 * @param decimalFloat
	 * @return Returns a negative version of a positive double and vice versa.
	 */
	public float negateFloat(float decimalFloat) {
		return decimalFloat * -1.0f;
	}

	/**
	 * @param decimalDouble
	 * @return Returns a negative version of a positive double and vice versa.
	 */
	public double negate(double decimalDouble) {
		return negateDouble(decimalDouble);
	}

	/**
	 * @param decimalFloat
	 * @return Returns a negative version of a positive float and vice versa.
	 */
	public float negate(float decimalFloat) {
		return negateFloat(decimalFloat);
	}
}
