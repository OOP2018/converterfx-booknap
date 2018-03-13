package converter;

/**
 * Test class for Length class.
 * @author Napasai Sutthichutipong
 *
 */
public class TestLength {

	/**
	 * Print value of all units. 
	 * @param args not used
	 */
	public static void main(String[] args) {
		// example how to get the values
		Length[] lengths = Length.values();
		// use the values
		for (Length x : lengths)
			System.out.println(x.toString() + " = " + x.getValue());
	}
}
