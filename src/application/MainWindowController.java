package application;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
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
    
    @FXML
    private Label labelHeadline;
    
    public void setMain(Main main) {
		this.main = main;
		labelHeadline.setText("Archivierung (Version 1.0)");
	}
    
    @FXML
    private void handleManualButtonAction(ActionEvent event) throws IOException {
    	
    	manualStore.setDisable(true);
    	search.setDisable(false);
    	config.setDisable(false);
    	AnchorPane pane = FXMLLoader.load(getClass().getResource("ManualWindow.fxml"));
    	anchorDetails.getChildren().setAll(pane);
    	labelHeadline.setText("Manuelle Ablage");

    }
    
    @FXML
    void handleSearchButton(ActionEvent event) throws IOException {
    	
    	manualStore.setDisable(false);
    	search.setDisable(true);
    	config.setDisable(false);
    	AnchorPane pane = FXMLLoader.load(getClass().getResource("SearchWindow.fxml"));
    	anchorDetails.getChildren().setAll(pane);    	
    	labelHeadline.setText("Dokument suchen");
    	
    }
    
    @FXML
    void handleConfigButtonAction(ActionEvent event) throws IOException {
    	
    	manualStore.setDisable(false);
    	search.setDisable(false);
    	config.setDisable(true);
    	AnchorPane pane = FXMLLoader.load(getClass().getResource("ConfigWindow.fxml"));
    	anchorDetails.getChildren().setAll(pane);
    	labelHeadline.setText("Einstellungen");

    }
    
    @FXML
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
