package application;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class MainWindowController {
	
	public Main main;
	
	@FXML
    private AnchorPane anchorMainMain;

    @FXML
    private JFXButton manualStore;

    @FXML
    private JFXButton autoStore;

    @FXML
    private JFXButton search;

    @FXML
    private JFXButton config;

    @FXML
    private JFXButton stop;

    @FXML
    private AnchorPane anchorDetails;
    
    public void setMain(Main main) {
		this.main = main;
	}
    
    @FXML
    private void handleManualButtonAction(ActionEvent event) throws IOException {
    	
    	manualStore.setDisable(true);

    }
	
	public void stopProgram() {
		/**
		 * KK 170222 Programm wird beendet Lifecycle einer fx-Anwendung ist:
		 * init - start - (warten auf Platform.exit) - stop init und stop sind
		 * in Application bereits codiert (leer) und müssen nicht überschrieben
		 * werden start muss auscodiert werden Platform.exit() erlaubt noch das
		 * Aufrufen von stop System.exit() wäre eine Alternative !!es gibt dann
		 * aber keine Möglichkeit auf das Aufrufen von stop()!!
		 *
		 */
		Platform.exit();
	}

}
