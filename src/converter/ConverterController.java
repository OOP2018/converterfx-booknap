package converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class ConverterController {

	@FXML
	private TextField textfield1;
	@FXML
	private TextField textfield2;
	@FXML
	private ComboBox<Length> combobox1;
	@FXML
	private ComboBox<Length> combobox2;

	/**
	 * Convert a distance from one unit to another.
	 */
	public void handleConvert(ActionEvent event) {
		double input;
		double answer;
		String output;
		try {
			if (textfield1.getText().trim().equals("")) {
				input = Double.parseDouble(textfield2.getText().trim());
				answer = input / 1.609344;
				textfield1.setText(String.format("%.5f", answer));
			} else {
				input = Double.parseDouble(textfield1.getText().trim());
				answer = input * 1.609344;
				textfield2.setText(String.format("%.5f", answer));
			}

		} catch (Exception e) {
			System.err.println("Invalid number");
		}
	}

	/**
	 * JavaFX calls the initialize() method of your controller when it creates the
	 * UI form, after the components have been created and @FXML annotated
	 * attributes have been set.
	 *
	 * This is a hook to initialize anything your controller or UI needs.
	 */
	@FXML
	public void initialize() {
		// This is for testing
		System.out.println("Running initialize");
		if (combobox1 != null) {
			combobox1.getItems().addAll(Length.values());
			combobox1.getSelectionModel().select(0); // select an item to show
		}
		if (combobox2 != null) {
			combobox2.getItems().addAll(Length.values());
			combobox2.getSelectionModel().select(1); // select an item to show
		}
	}

	public void handleClear() {
		textfield1.clear();
		textfield2.clear();
	}

}
