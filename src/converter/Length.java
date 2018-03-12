package converter;

public enum Length {

	meter(1.0000),
	centimeter(0.0100),
	kilometer(1000.0),
	mile(1609.344),
	foot(0.30480),
	wa(2.00000),
	AU(149597870700L);
	
	// attributes of the enum members
	private final double value;

	// enum constructor must be private
	private Length(double value) {
		this.value = value;
	}

	// methods are just like in a class
	public double getValue() {
		return this.value;
	}

}
