package converter;

/**
 * This class contain value of all units for convert to another unit. 
 * @author Napasai Sutthichutipong
 *
 */
public enum Length {

	meter(1.0000),
	centimeter(0.0100),
	kilometer(1000.0),
	mile(1609.344),
	foot(0.30480),
	wa(2.00000),
	AU(149597870700L);
	
	/**
	 * value of unit.
	 */
	private final double value;

	/**
	 * Constructor to initialize value of unit.
	 * @param value of unit
	 */
	private Length(double value) {
		this.value = value;
	}

	/**
	 * Get the value of unit.
	 * @return value of unit
	 */
	public double getValue() {
		return this.value;
	}

}
