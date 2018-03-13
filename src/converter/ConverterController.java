package converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * This class use to control GUI of the program.
 * 
 * @author Napasai Sutthichutipong
 *
 */
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
		double x = combobox1.getValue().getValue();
		double y = combobox2.getValue().getValue();
		try {
			if (textfield1.getText().trim().equals("")) {
				input = Double.parseDouble(textfield2.getText().trim());
				answer = input / x;
				answer = answer * y;
				textfield1.setText(String.format("%.5f", answer));
			}

		} catch (NumberFormatException e) {
			textfield1.setText("Invalid number");
		}

		try {
			if (textfield2.getText().trim().equals("")) {
				input = Double.parseDouble(textfield1.getText().trim());
				answer = input / y;
				answer = answer * x;
				textfield2.setText(String.format("%.5f", answer));
			}
		} catch (NumberFormatException e) {
			textfield2.setText("Invalid number");
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
		if (combobox1 != null) {
			combobox1.getItems().addAll(Length.values());
			combobox1.getSelectionModel().select(0);
		}
		if (combobox2 != null) {
			combobox2.getItems().addAll(Length.values());
			combobox2.getSelectionModel().select(1);
		}
	}

	/**
	 * This method use to clear text in textfield.
	 */
	public void handleClear() {
		textfield1.clear();
		textfield2.clear();
	}

}
