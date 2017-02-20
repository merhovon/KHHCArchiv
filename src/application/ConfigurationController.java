package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class ConfigurationController {
	
	@FXML private Button searchLocation;
	@FXML private Button abort;
	@FXML private Button takeChange;
	@FXML private Button close;
	
	@FXML private Label labelLocation;
	@FXML private Label labelPathLocation;
	@FXML private Label labelStoreType;
	@FXML private Label labelScannerChoice;
	
	@FXML private ChoiceBox listScanner;
	
	@FXML private RadioButton radioButtonStoreManual;
	@FXML private RadioButton radioButtonStoreAuto;

}
