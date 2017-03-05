package application.controller;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import application.Main;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * Controller für das Hauptfenster
 * 
 * @author kerstin, helge, chris, holger
 *
 */
public final class MainWindowController {

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

	/**
	 * @author kerstin
	 * @param main
	 *            main
	 */
	public void setMain(Main main) {
		this.main = main;

		// Ueberschrift wird auf den Wert Archivierung (Version 1.0) gesetzt
		labelHeadline.setText("Archivierung (Version 1.0)");
	}

	/**
	 * Aufruf der manuellen Ablage
	 * 
	 * @author holger, helge
	 * @throws IOException
	 *             IOException
	 * @param event
	 *            event
	 */
	@FXML
	private void handleManualButtonAction(ActionEvent event) throws IOException {
		/*
		 * Auswählbare Buttons werden enabled, nicht auswählbare Buttons werden
		 * disabled. Aufruf der Folgeseite über die Zuweisung an pane.
		 * Ueberschrift wird auf den Wert "Manuelle Ablage" gesetzt
		 */
		manualStore.setDisable(true);
		search.setDisable(false);
		config.setDisable(false);
		AnchorPane pane = FXMLLoader.load(getClass().getResource("../fxml/ManualWindow.fxml"));

		anchorDetails.getChildren().setAll(pane);
		labelHeadline.setText("Manuelle Ablage");

	}

	/**
	 * Aufruf der Dokumentensuche
	 * 
	 * @author holger, helge
	 * @throws IOException
	 *             IOException
	 * @param event
	 *            event
	 */
	@FXML
	private void handleSearchButton(ActionEvent event) throws IOException {
		/*
		 * Auswählbare Buttons werden enabled, nicht auswählbare Buttons werden
		 * disabled. Aufruf der Folgeseite über die Zuweisung an pane.
		 * Ueberschrift wird auf den Wert "Dokument suchen" gesetzt
		 */
		manualStore.setDisable(false);
		search.setDisable(true);
		config.setDisable(false);
		AnchorPane pane = FXMLLoader.load(getClass().getResource("../fxml/SearchWindow.fxml"));
		anchorDetails.getChildren().setAll(pane);
		labelHeadline.setText("Dokument suchen");

	}

	/**
	 * Aufruf der Einstellungen
	 * 
	 * @author holger, helge
	 * @throws IOException
	 *             IOException
	 * @param event
	 *            event
	 */
	@FXML
	private void handleConfigButtonAction(ActionEvent event) throws IOException {
		/*
		 * Auswählbare Buttons werden enabled, nicht auswählbare Buttons werden
		 * disabled. Aufruf der Folgeseite über die Zuweisung an pane.
		 * Ueberschrift wird auf den Wert "Einstellungen" gesetzt
		 */
		// ConfigWindowController myController=new ConfigWindowController();
		manualStore.setDisable(false);
		search.setDisable(false);
		config.setDisable(true);
                try {
                      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/ConfigWindow.fxml"));
                              //root node auf das neue Fenster legen
			      Parent Elternknoten = (Parent) fxmlLoader.load();
                              // Bühne erstellen
			      Stage Buehne = new Stage();
			     //Eine Szenerie auf die Bühne stellen
                              Buehne.setScene(new Scene(Elternknoten));
			     //Fenstertitel setzten
                              Buehne.setTitle("Einstellungen");
                              //show() > die Bühne sichtbar machen.
			      Buehne.show();
                      } catch(Exception e) {
                         e.printStackTrace();
                        }

	}

	/**
	 * Beenden der Anwendung
	 * 
	 * @author kerstin
	 */
	@FXML
	private void stopProgram() {
		/*
		 * KK 170222 Programm wird beendet Lifecycle einer fx-Anwendung ist:
		 * init - start - (warten auf Platform.exit) - stop init und stop sind
		 * in Application bereits codiert (leer) und müssen nicht überschrieben
		 * werden start muss auscodiert werden Platform.exit() erlaubt noch das
		 * Aufrufen von stop System.exit() wäre eine Alternative !!es gibt dann
		 * aber keine Möglichkeit auf das Aufrufen von stop()!!
		 */
		Platform.exit();
	}

}
