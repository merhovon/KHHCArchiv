package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

/**
 * Controller für das Fenster der Einstellungen
 * 
 * @author kerstin, helge, chris, holger
 *
 */
public class ConfigWindowController {
	
	@FXML
    private Button searchStartLocation;

    @FXML
    private Label labelPathLocationScannedDocs;

    @FXML
    private Label labelLocation;

    @FXML
    private Button searchStoreLocation;

    @FXML
    private Label labelPathLocation;

    @FXML
    private Label labelStoreType;

    @FXML
    private RadioButton radioButtonStoreManual;

    @FXML
    private RadioButton radioButtonStoreAuto;

    @FXML
    private Label labelScannerChoice;

    @FXML
    private ChoiceBox<String> listScanner;

    @FXML
    private Button abort;

    @FXML
    private Button takeChange;

}
