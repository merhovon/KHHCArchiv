package application;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class MainWindowController {
	
	public Main main;
	
	@FXML
    private AnchorPane anchorMain;

    @FXML
    private Button manualStore;

    @FXML
    private Button autoStore;

    @FXML
    private Button config;

    @FXML
    private Button stop;

    @FXML
    private Button search;

    @FXML
    private AnchorPane anchorDetails;
    
    public void setMain(Main main) {
		this.main = main;
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
