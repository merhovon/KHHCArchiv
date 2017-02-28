package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	private Stage primarayStage; //ist das klassische "Fenster" unsere Bühne
	
	public Stage getPrimarayStage(){
		return primarayStage;
	}
	@Override
	public void start(Stage primaryStage) {
		this.primarayStage = primaryStage;
		mainWindow();
	}
	
	public void mainWindow(){		
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("MainWindow.fxml"));
			//es muss hier der äußerste Container geladen werden hier SplitPane
			AnchorPane pane = loader.load(); //der Container in dem alle Elemente liegen
			
			//Standardgröße des Fensters - kann hier  raus
			//da die Werte in der fxml festgelegt sind
			primarayStage.setMinHeight(600.00); 
			primarayStage.setMinWidth(1400.00);
			
			//Was wird hier gespielt - die erste Szene = das Fenster im Urzustand
			Scene scene = new Scene(pane);
			
			//kopplung des Fensters (Bühne) mit der Szene
			primarayStage.setScene(scene);
			//der Vorgang geht auf
			
			
			//und hier steht das Drehbuch
			MainWindowController mainWindowController = loader.getController();
			//dem Drehbuch mitteilen zu welchem St�ck es gehört
			mainWindowController.setMain(this);
			primarayStage.show();
		} catch (IOException e) {
			// TODO Automatisch generierter Erfassungsblock
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
