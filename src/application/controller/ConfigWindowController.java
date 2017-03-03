package application.controller;



import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import persistence.ConfigTable;

/**
 * Controller für das Fenster der Einstellungen
 * 
 * @author kerstin, helge, chris, holger
 *
 */
public class ConfigWindowController {
	
	public Main main; //hs
	
	 @FXML
	    private Button searchDestinationLocation;

	    @FXML
	    private Label labelPathSourceLocation;

	    @FXML
	    private Label labelLocation;

	    @FXML
	    private Button searchSourceLocation;

	    @FXML
	    private Label labelPathDestinationLocation;

	    @FXML
	    private Label labelStoreType;

	    @FXML
	    private RadioButton radioButtonStoreManual;

	    @FXML
	    private RadioButton radioButtonStoreAuto;

	    @FXML
	    private Label labelScannerChoice;

	    @FXML
	    private ChoiceBox<?> listScanner;

	    @FXML
	    private Button abort;

	    @FXML
	    private Button takeChange;

	    @FXML
	    void handleSearchDestinationLocation(ActionEvent event) {

	    }

	    @FXML
	    void handleSearchSourceLocation(ActionEvent event) {

	    }

	

}
