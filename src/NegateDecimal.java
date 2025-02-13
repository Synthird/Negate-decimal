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
	 * @param decimal
	 * @return Returns a negative version of a positive double and vice versa.
	 */
	public double negate(double decimal) {
		return negateDouble(decimal);
	}

	/**
	 * @param decimal
	 * @return Returns a negative version of a positive float and vice versa.
	 */
	public float negate(float decimal) {
		return negateFloat(decimal);
	}
}
