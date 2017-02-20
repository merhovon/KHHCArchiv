package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainWindowController_old {
	public Main main;

	// Views
	@FXML private Label label;
	@FXML private TextField field;
	@FXML private Button changeText;
	@FXML private Button clear;

	public void setMain(Main main) {
		this.main = main;
	}

	@FXML
	public void handleChangeText() {
		String text = field.getText();
		label.setText(text);
	}

	@FXML
	public void handleClear() {
		field.clear();
	}
}
